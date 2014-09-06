package controllers

import com.google.api.client.http.GenericUrl
import com.google.api.client.http.HttpRequest
import com.google.api.client.http.UrlEncodedContent
import com.google.api.client.http.javanet.NetHttpTransport
import com.google.api.client.util.GenericData

import play.api.mvc.Action
import play.api.mvc.Controller

object Posts extends Controller {
  val RequestFactory = new NetHttpTransport().createRequestFactory();
  val ClientId = "O-2T7gCja9g";
  val GrantType = "authorization_code";
  val ClientSecret = "1f276bef0ec2d8d3720530a9a39062be3953499f";
  val ExchangeTokenUrl = "https://jawbone.com/auth/oauth2/token?client_id=" + ClientId + "&client_secret=" + ClientSecret + "&grant_type=" + GrantType + "&code=";
  
  
  def login(code: String) = Action {
//    val generic = new GenericData();
//    generic.put("client_id", ClientId);
//    generic.put("grant_type", GrantType);
//    generic.put("client_secret", ClientSecret);
//    generic.put("code", code);
//    val content = new UrlEncodedContent();
//    content.setData(generic);
    val request: HttpRequest = RequestFactory.buildGetRequest(new GenericUrl(ExchangeTokenUrl + code));
    println(request.getUrl().toString());
    val response = request.execute();
    println(response.parseAsString());
    //save to database
  Ok("")
  }

}