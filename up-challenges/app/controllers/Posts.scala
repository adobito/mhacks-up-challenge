package controllers

import com.google.api.client.http.GenericUrl
import com.google.api.client.http.HttpRequest
import com.google.api.client.http.javanet.NetHttpTransport
import dto.database.User
import play.api.mvc.Action
import play.api.mvc.Controller
import org.hibernate.Session

object Posts extends Controller {
	val RequestFactory = new NetHttpTransport().createRequestFactory();
	val ClientId = "O-2T7gCja9g";
	val GrantType = "authorization_code";
	val ClientSecret = "1f276bef0ec2d8d3720530a9a39062be3953499f";
	val ExchangeTokenUrl = "https://jawbone.com/auth/oauth2/token?client_id=" + ClientId + "&client_secret=" + ClientSecret + "&grant_type=" + GrantType + "code=";


	def login(code: String) = Action {
	  
		val request: HttpRequest = RequestFactory.buildGetRequest(new GenericUrl(ExchangeTokenUrl + code));
	println(request.getUrl().toString());
	val response = request.execute();
	println(response.parseAsString());
	val token = response.parseAsString();
	val upUser = Gets.getJawboneUserFromToken(token)
	if(!Database.userExists(upUser.get.getData().getXid())) {
	  val user = new User();
	  user.setJawboneHash(token);
	  user.setUserEmail(upUser.get.getData().getFirst());
	  val session: Session = Database.HibernateService.getCurrentSession(true);
	  val txn = session.beginTransaction();
	  session.save(user);	  
	  txn.commit();
	  Database.HibernateService.closeSessionIfNecessary(session);
	}
	Ok("")
	}

}