package controllers

import com.google.api.client.http.GenericUrl
import com.google.api.client.http.HttpRequest
import com.google.api.client.http.UrlEncodedContent
import com.google.api.client.http.javanet.NetHttpTransport
import com.google.api.client.util.GenericData
import play.api.mvc.Action
import play.api.mvc.Controller
import dto.moves.Moves
import com.google.api.client.http.HttpHeaders
import com.google.gson.Gson

object Gets extends Controller {
  val RequestFactory = new NetHttpTransport().createRequestFactory();
  val MyMovesUrl = "https://jawbone.com/nudge/api/v.1.1/users/@me/moves?";
  
  
  def moves(startTime: Long, endTime: Long): Option[Moves] = {
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
    request.setHeaders(headers);
    headers.put("Authorization,","Bearer Je5CDuGC9OQ9urzY88Dow33sj6Zc8gyg7w41k9n8ZKgwDHRMyyO4-gGvOtQk8c0J25XGojRIo2GGKC0n7I2ocFECdgRlo_GULMgGZS0EumxrKbZFiOmnmAPChBPDZ5JP");
    headers.put("Accept","application/json");
    val moves = request.execute().parseAs(classOf[Moves]);
    Option(moves);
  }

}