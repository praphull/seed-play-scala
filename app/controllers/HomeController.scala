package controllers

import com.google.inject.{Inject, Singleton}
import play.api.mvc._

@Singleton
class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def index() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index(
      //      routes.UserController.showLoginForm(),
    ))
  }
}

