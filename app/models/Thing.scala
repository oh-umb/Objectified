package models

import play.api.db._
import play.api.Play.current

import anorm._
import anorm.SqlParser._

case class Thing(id: Pk[Long], label: String)

object Thing {
  
  val simple = {
    get[Pk[Long]]("id") ~
    get[String]("label") map {
      case id~label => Thing(id, label)
    }
  }

  def findAll(): Seq[Thing] = {
    DB.withConnection { implicit connection =>
      SQL("select * from thing").as(Thing.simple *)
    }
  }

  def create(thing: Thing): Unit = {
    DB.withConnection { implicit connection =>
      SQL("insert into thing(label) values ({label})").on(
        'label -> thing.label
      ).executeUpdate()
    }
  }
}






