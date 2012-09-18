package controllers

import play.api._
import play.api.mvc._
import scala.xml._

object ObjMf extends Controller {
 
  val dir = "http://localhost:9000/assets/content/"

  def index = Action {
    Ok(views.html.index(xml.XML.load(dir + "pitch.html") ) ).as(HTML)
  }
  
  def rip = Action {
    Ok(views.html.index(xml.XML.load(dir + "rip.html") ) ).as(HTML)
  }

  def render = Action {
    Ok(views.html.index(xml.XML.load(dir + "render.html") ) ).as(HTML)
  }

  def tweak = Action {
    Ok(views.html.index(xml.XML.load(dir + "tweak.html") ) ).as(HTML) 
  }

  def sculpt = Action {
    Ok(views.html.index(xml.XML.load(dir + "sculpt.html"))).as(HTML)
  }

  def blathe = Action {
    Ok(views.html.index(xml.XML.load(dir + "lab.html") ) ).as(HTML)
  }
  



}
