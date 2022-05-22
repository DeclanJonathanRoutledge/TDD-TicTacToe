import Result.{drawChecker, winChecker}

case class gameState(Game: board) {
val state: String = {
  winChecker(Game) match {
    case "No winner yet" => drawChecker(Game)
    case winner => winner
  }
}
  def play(row: Int, column: Int, playXorO: String): board ={
    row match{
      case 0 => Game.topRow(column) = playXorO
      case 1 => Game.middleRow(column) = playXorO
      case 2 => Game.bottomRow(column) = playXorO
    }
    Game
  }
}
