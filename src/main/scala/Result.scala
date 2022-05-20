object Result {
  def drawChecker(currentGame:board):String= {
    if (currentGame.topRow.contains("_") | currentGame.middleRow.contains("_")| currentGame.bottomRow.contains("_")) "Game not finished yet"
    else "Draw!"
  }
  def winChecker(currentGame:board):String= {
    val topRow = currentGame.topRow
    val middleRow = currentGame.middleRow
    val bottomRow = currentGame.bottomRow
    "Winner: " + horizontalWin(topRow, middleRow, bottomRow)
  }
  def horizontalWin(topRow: Array[String], middleRow: Array[String], bottomRow: Array[String]):String ={

    if (topRow(0)==topRow(1) && topRow(1)==topRow(2)) topRow(0)
    else if(middleRow(0)==middleRow(1) && middleRow(1)==middleRow(2)) middleRow(0)
    else if(bottomRow(0)==bottomRow(1) && bottomRow(1)==bottomRow(2)) bottomRow(0)
    else verticalWin(topRow, middleRow, bottomRow)
  }
  def verticalWin(topRow: Array[String], middleRow: Array[String], bottomRow: Array[String]):String ={
    if(topRow(0)==middleRow(0) && middleRow(0)==bottomRow(0)) topRow(0)
    else if(topRow(1)==middleRow(1) && middleRow(1)==bottomRow(1)) topRow(1)
    else if(topRow(2)==middleRow(2) && middleRow(2)==bottomRow(2)) topRow(2)
    else diagonalWin(topRow, middleRow, bottomRow)
  }
  def diagonalWin(topRow: Array[String], middleRow: Array[String], bottomRow: Array[String]):String ={
    if(topRow(0)==middleRow(1) && middleRow(1)==bottomRow(2)) topRow(0)
    else if(topRow(2)==middleRow(1) && middleRow(1)==bottomRow(0)) topRow(2)
    else "None"

  }
}
