package controllers

import play.api._
import play.api.mvc._
import scala.xml._


object WarRoom extends Controller {
  
  val dir = "http://localhost:9000/assets/content/"
  
  def index = Action {
    Ok(views.html.index(xml.XML.load(dir + "fishing.html") ) ).as(HTML)
  }

}











