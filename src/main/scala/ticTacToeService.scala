import akka.actor.typed.ActorSystem
import akka.actor.typed.scaladsl.Behaviors
import akka.http.scaladsl.Http
import akka.http.scaladsl.model._
import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route

import scala.concurrent.ExecutionContextExecutor
import scala.io.StdIn


object ticTacToeService {

  def main(args: Array[String]): Unit = {

    implicit val system: ActorSystem[Nothing] = ActorSystem(Behaviors.empty, "my-system")
    // needed for the future flatMap/onComplete in the end
    implicit val executionContext: ExecutionContextExecutor = system.executionContext
    val game= board()
    val x: String = display(game).htmlViewBoard
    val y: String = gameState(game).state
    val route: Route = 
      path("tictactoe"/"board") {
        get {
          complete(HttpEntity(ContentTypes.`text/html(UTF-8)`, s"<h1>$x</h1>"))
        }
      } ~ path("tictactoe"/"gameState"){
        get{
          complete(HttpEntity(ContentTypes.`text/html(UTF-8)`, s"<h1>$y</h1>"))
        }
      } ~ path("tictactoe"/"jsonboard"){
      get{
        complete(HttpEntity(ContentTypes.`application/json`, s"<h1>$y</h1>"))
      }
    }


    val bindingFuture = Http().newServerAt("localhost", 8080).bind(route)

    print(s"Server now online.\n Please navigate to http://localhost:8080/tictactoe/board or \n")
    print(s"navigate to http://localhost:8080/tictactoe/jsonboard or \n")
    print(s"navigate to http://localhost:8080/tictactoe/gameState\nPress RETURN to stop...")
    StdIn.readLine() // let it run until user presses return
    bindingFuture
      .flatMap(_.unbind()) // trigger unbinding from the port
      .onComplete(_ => system.terminate()) // and shutdown when done
  }
}