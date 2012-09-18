package controllers

// import play.api._
// import play.api.mvc._
// import play.api.data._
// import play.api.data.Forms._

import play.api.data.Form
import play.api.data.Forms.{single, nonEmptyText}
import play.api.mvc.{Action, Controller}
import anorm.NotAssigned
import play.api.data.format.Formats._

import com.codahale.jerkson.Json

import scala.xml._

import models.Thing


object Studio extends Controller {
 
   val thingForm = Form(
      single("label" -> nonEmptyText)
   )
   
   def index = Action {
      Ok(views.html.studio(thingForm))
   }
   
   def make = Action {
      Ok(views.html.make(thingForm))
   }
   
   def keep() = Action { implicit request =>
      thingForm.bindFromRequest.fold(
         errors => BadRequest, 
         {
            case (label) =>
               Thing.create(Thing(NotAssigned, label))
               Redirect(routes.Studio.index())
         }   
      )  
   }
 
   def list() = Action {
      val things = Thing.findAll()
      val json = Json.generate(things)
 
      Ok(json).as("application/json")
   }

}











