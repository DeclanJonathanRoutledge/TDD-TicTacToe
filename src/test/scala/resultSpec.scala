import org.scalatest.flatspec.AnyFlatSpec
class resultSpec extends AnyFlatSpec {
  behavior of "A Game"
   it should "result in a win given three in a row" in {
  val winningGame = StockGames.horizontalWinGame()
  assert(Result.winChecker(winningGame) ==="Winner: O")}

  it should "not result in draw if the game is not finished" in{
    assert(Result.drawChecker(board())=== "Game not finished yet")
  }

  it should "result in draw if the game finished, but no one has won" in{
    assert(Result.drawChecker(StockGames.drawGame())=== "Draw!")
  }

  it should "result in a win given three in a Xs in a row (horizontal)" in {
    val winningGame = StockGames.horizontalWinGame(0,"X")
    assert(Result.winChecker(winningGame) ==="Winner: X")}

  it should "result in a win given three in a Xs in a column (vertical)" in {
    val winningGame = StockGames.verticalWinGame(0,"X")
    assert(Result.winChecker(winningGame) ==="Winner: X")
  }

  it should "diagonalWin" in {
    val winningGame = StockGames.diagonalWinGame()
    assert(Result.winChecker(winningGame) ==="Winner: O")
  }
}

