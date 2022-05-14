import org.scalatest.flatspec.AnyFlatSpec
class resultSpec extends AnyFlatSpec {
"A Game" should
  "result in a win given three in a row" in {
  val winningGame = StockGames.winGame("X")
  assert(Result.winChecker(winningGame) ==="Winner!")}

  it should "not result in draw if the game is not finished" in{
    assert(Result.drawChecker(board())=== "Game not finished yet")
  }

  it should "result in draw if the game finished, but no one has won" in{
    assert(Result.drawChecker(StockGames.drawGame())=== "Draw!")
  }

}
