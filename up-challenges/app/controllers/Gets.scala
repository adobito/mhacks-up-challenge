package controllers

import java.util.Date
import scala.collection.JavaConversions.asScalaBuffer
import com.google.api.client.http.GenericUrl
import com.google.api.client.http.HttpHeaders
import com.google.api.client.http.javanet.NetHttpTransport
import com.google.gson.Gson
import dto.moves.Moves
import play.api.mvc.Action
import play.api.mvc.Controller
import dto.user.UpUser

object Gets extends Controller {
	val RequestFactory = new NetHttpTransport().createRequestFactory();
	val MyMovesUrl = "https://jawbone.com/nudge/api/v.1.1/users/@me/moves?";


	def moves(startTime: Long, endTime: Long, token: String) = Action {
		val headers = new HttpHeaders();
		var string = "";
		if(startTime > 0)
			string += "start_time=" + startTime;
		if(endTime > 0 && endTime > startTime) {
			if(!string.isEmpty()) {
				string += "&"
			}
			string += "end_time=" + endTime;
		}
		val request = RequestFactory.buildGetRequest(new GenericUrl(MyMovesUrl + string));

		//    headers.put("Accept",);
		headers.setAccept("application/json")
		headers.setAuthorization("Bearer " + token);
		//    headers.put("Authorization","Bearer " + token);
		request.setHeaders(headers);
		val response = request.execute();
		val str = response.parseAsString();
		println(str);
		val moves = new Gson().fromJson(str,classOf[Moves]);
		var totalSteps = 0;
		moves.getData().getItems().toList.foreach(item => item.getDetails().getHourlyTotals().foreach(hourly => if(hourly.getDate().before(new Date(endTime))) {totalSteps += hourly.getSteps()}));
		Ok("{\"steps\":"+totalSteps+"}");


	}
	def getJawboneUserFromToken(token: String) : Option[UpUser] = {
	  val headers = new HttpHeaders();
		headers.setAccept("application/json");
		headers.setAuthorization("Bearer " + token);
		val request = RequestFactory.buildGetRequest(new GenericUrl("https://jawbone.com/nudge/api/v.1.1/users/@me"));
		request.setHeaders(headers);
		val response = request.execute();
		val str = response.parseAsString();
		val upUser = new Gson().fromJson(str, classOf[UpUser]);
		Option(upUser);
	}
//	def getFriends(token: String): User = {
//	  val headers = new HttpHeaders();
//	  headers.setAccept("application/json");
//		headers.setAuthorization("Bearer " + token);
//		val request = RequestFactory.buildGetRequest(new GenericUrl("https://jawbone.com/nudge/api/v.1.1/users/@me/friends"));
//		val request.setHeaders(headers);
//		val response = request.execute();
//		val str  = response.parseAsString();
//		
//	  
//	}

}