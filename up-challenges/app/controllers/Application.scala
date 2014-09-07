package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def index = Action {
//    val statement = Database.Connection.prepareStatement("SELECT * FROM users");
//    val resultSet = statement.executeQuery();
//    while(resultSet.next()) {
//      println(resultSet.getString("jawbonehash"));
//    }
    Ok(views.html.index("Your new application is ready."));
  }

}