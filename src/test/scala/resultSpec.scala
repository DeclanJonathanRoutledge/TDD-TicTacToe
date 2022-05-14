import org.scalatest.flatspec.AnyFlatSpec

class resultSpec extends AnyFlatSpec {
"Game" should "Result a win given three in a row" in {
  val winningGame = winGame("X")
  assert(Result.winChecker(winningGame) ==="Winner!")

}
  def winGame(playXorO:String): board ={
    val win  = playBoard()
    win.play(0,0,"O")
    win.play(0,1,"O")
    win.play(0,2,"O")
  }
}
