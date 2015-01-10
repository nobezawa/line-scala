package controllers.generate


import play.api._
import play.api.mvc._
import scala.slick.driver.MySQLDriver.simple._

object MysqlGenerate extends Controller{

  def slickgen = Action { implicit request =>

    val slickDriver = "scala.slick.driver.MySQLDriver"
    val jdbcDriver = "com.mysql.jdbc.Driver"
    val url = "jdbc:mysql://localhost/line_stamp_db"
    val outputFolder = "app/model/"
    val pkg = "model"
    val user = "root"
    val password = ""
    import scala.slick.model.codegen.SourceCodeGenerator
    scala.slick.model.codegen.SourceCodeGenerator.main(
      Array(slickDriver, jdbcDriver, url, outputFolder, pkg, user, password)
    )
  }

}