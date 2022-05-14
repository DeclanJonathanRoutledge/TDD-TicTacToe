object StockGames {
  def winGame(playXorO: String): board = {
    val win = playBoard()
    win.play(0, 0, "O")
    win.play(0, 1, "O")
    win.play(0, 2, "O")
  }

  def drawGame(): board = {
    val drawRow0 = Array("O", "X", "O")
    val drawRow1and2 = Array("X", "O", "X")
    board(drawRow0, drawRow1and2, drawRow1and2)
  }
}
