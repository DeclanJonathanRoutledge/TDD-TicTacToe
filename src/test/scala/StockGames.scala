object StockGames {
  def horizontalWinGame(row : Int = 0, playXorO: String= "O"): board = {
    val win = gameState(board())
    win.play(row, 0, playXorO )
    win.play(row, 1, playXorO)
    win.play(row, 2, playXorO)
  }
  def verticalWinGame(column : Int = 0, playXorO: String= "O"): board = {
    val win = gameState(board())
    win.play(0, column, playXorO )
    win.play(1, column, playXorO)
    win.play(2, column, playXorO)
  }
  def diagonalWinGame(playXorO: String= "O"): board = {
    val win = gameState(board())
    win.play(0, 0, playXorO )
    win.play(1, 1, playXorO)
    win.play(2, 2, playXorO)
  }

  def drawGame(): board = {
    val drawRow0 = Array("O", "X", "O")
    val drawRow1and2 = Array("X", "O", "X")
    board(drawRow0, drawRow1and2, drawRow1and2)
  }
}
