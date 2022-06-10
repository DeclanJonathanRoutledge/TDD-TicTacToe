import org.scalatest.flatspec.AnyFlatSpec
import StockGames.drawGame

class displayTest extends AnyFlatSpec {

  behavior of "Display"
  it should "format an empty board" in {
    print(display(board()).viewBoard)
      //assert(display(board()).viewBoard == " ")
  }

  it should "format a full board" in {
    assert(display(drawGame()).viewBoard ==
        " O || X || O \n" +
        "===||===||===\n" +
        " X || O || X \n" +
        "===||===||===\n" +
        " X || O || X \n")
  }

  it should "rowFormatter" in {

  }

}
