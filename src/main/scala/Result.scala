import Result.nonBoardPiecePlayed

object Result {

  def drawChecker(currentGame:board):String = {
    if (currentGame.topRow.contains("_") | currentGame.middleRow.contains("_")| currentGame.bottomRow.contains("_")) "Game not finished yet"
    else "Draw!"
  }

  def nonBoardPiecePlayed(piece : String):Boolean = piece != "_"

  def winChecker(currentGame:board):String= {
    diagonalWin(currentGame.topRow, currentGame.middleRow, currentGame.bottomRow) match {
      case "None" => "No winner yet"
      case  winner => "Winner: " + winner
    }
  }

  def diagonalWin(topRow: Array[String], middleRow: Array[String], bottomRow: Array[String]):String ={
    if(topRow(0)==middleRow(1) && middleRow(1)==bottomRow(2) && nonBoardPiecePlayed(topRow(0))) topRow(0)
    else if(topRow(2)==middleRow(1) && middleRow(1)==bottomRow(0) && nonBoardPiecePlayed(topRow(2))) topRow(2)
    else horizontalWin(topRow,middleRow,bottomRow)
  }

  def horizontalWin(topRow: Array[String], middleRow: Array[String], bottomRow: Array[String]):String ={
    if (topRow(0)==topRow(1) && topRow(1)==topRow(2) && nonBoardPiecePlayed(topRow(0)))topRow(0)
    else if(middleRow(0)==middleRow(1) && middleRow(1)==middleRow(2) && nonBoardPiecePlayed(middleRow(0))) middleRow(0)
    else if(bottomRow(0)==bottomRow(1) && bottomRow(1)==bottomRow(2) && nonBoardPiecePlayed(bottomRow(0))) bottomRow(0)
    else verticalWin(topRow,middleRow,bottomRow)
  }

  def verticalWin(topRow: Array[String], middleRow: Array[String], bottomRow: Array[String]):String ={
    if(topRow(0)==middleRow(0) && middleRow(0)==bottomRow(0) && nonBoardPiecePlayed(topRow(0))) topRow(0)
    else if(topRow(1)==middleRow(1) && middleRow(1)==bottomRow(1) && nonBoardPiecePlayed(topRow(1))) topRow(1)
    else if(topRow(2)==middleRow(2) && middleRow(2)==bottomRow(2) && nonBoardPiecePlayed(topRow(2))) topRow(2)
    else "None"
  }

}
