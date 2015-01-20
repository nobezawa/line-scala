package controllers.generate


import play.api._
import play.api.mvc._
import scala.slick.driver.MySQLDriver.simple._
import scala.slick.codegen.SourceCodeGenerator

object MysqlGenerate extends Controller{

  def slickgen = Action { implicit request =>

    val slickDriver = "scala.slick.driver.MySQLDriver"
    val jdbcDriver = "com.mysql.jdbc.Driver"
    val url = "jdbc:mysql://localhost/line_stamp_db"
    val outputFolder = "app/model/"
    val pkg = "model"
    val user = "root"
    val password = ""
    SourceCodeGenerator.main(
      Array(slickDriver, jdbcDriver, url, outputFolder, pkg, user, password)
    )
    Redirect("localhost:9000")
  }

}