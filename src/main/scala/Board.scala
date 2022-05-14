case class playBoard(nwGame:board= board()){
  def play(row: Int, column: Int, playXorO: String): board ={
    row match{
      case 0 => nwGame.topRow(column) = playXorO
      case 1 => nwGame.middleRow(column) = playXorO
      case 2 => nwGame.bottomRow(column) = playXorO
    }
    nwGame
  }
}
case class board(topRow: Array[String]= Array("_",  "_", "_"),
                  middleRow: Array[String] = Array("_",  "_", "_"),
                  bottomRow : Array[String]= Array("_",  "_", "_")
                )

sealed trait boardPieces
case object X extends boardPieces
case object O extends boardPieces
case object notFilled extends boardPieces
