object Result {
  def winChecker(currentGame:board):String= "Winner!"
  def drawChecker(currentGame:board):String= {
    if (currentGame.topRow.contains("_") | currentGame.middleRow.contains("_")| currentGame.bottomRow.contains("_")) "Game not finished yet"
    else "Draw!"
  }
}
