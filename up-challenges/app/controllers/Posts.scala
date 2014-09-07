package controllers

import com.google.api.client.http.GenericUrl
import com.google.api.client.http.HttpRequest
import com.google.api.client.http.javanet.NetHttpTransport
import dto.database.User
import play.api.mvc.Action
import play.api.mvc.Controller
import org.hibernate.Session
import com.google.gson.Gson
import logins.Token

object Posts extends Controller {
	val RequestFactory = new NetHttpTransport().createRequestFactory();
	val ClientId = "O-2T7gCja9g";
	val GrantType = "authorization_code";
	val ClientSecret = "1f276bef0ec2d8d3720530a9a39062be3953499f";
	val ExchangeTokenUrl = "https://jawbone.com/auth/oauth2/token?client_id=" + ClientId + "&client_secret=" + ClientSecret + "&grant_type=" + GrantType + "&code=";


	def login(code: String) = Action {

		val request: HttpRequest = RequestFactory.buildGetRequest(new GenericUrl(ExchangeTokenUrl + code));
	println(request.getUrl().toString());
	val response = request.execute();
	//	println(response.parseAsString());
	val responseString = response.parseAsString();
	println(responseString);
	val token = new Gson().fromJson(responseString,classOf[Token]).getAccessToken();
	val upUser = Gets.getJawboneUserFromToken(token);
	val user = new User();
	user.setJawboneHash(token);
	user.setUserEmail(upUser.get.getData().getFirst());
	val session: Session = Database.HibernateService.getCurrentSession(true);
	val txn = session.beginTransaction();
	session.saveOrUpdate(user);	  
	txn.commit();
	Database.HibernateService.closeSessionIfNecessary(session);
	Ok("");
	}
	//	def challengeUser(token: String) = Action {
	//	  val user = Database.
	//	
	//	}

}