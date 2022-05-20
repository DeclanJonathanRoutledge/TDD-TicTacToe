
import org.scalatest.flatspec.AnyFlatSpec



class TicTacToeSpec extends AnyFlatSpec{
    val emptyRow: Array[String] = Array("_",  "_", "_")
    val testBoardContinuous: playBoard = playBoard()

    behavior of "A board"
    it should  "return an empty starting board" in  {
        val testBoard = board()
        val topRowTest = emptyRow
        assert(testBoard.topRow === topRowTest)

    }
it should "take a board-piece play"in{

    testBoardContinuous.play(0,0,"X")
    val topRowTest = Array("X",  "_", "_")
    assert(testBoardContinuous.nwGame.topRow === topRowTest)
}
    it should "take a \"O\" as a Board piece" in{

        testBoardContinuous.play(0,1,"O")
        val topRowTest = Array("X",  "O", "_")
        assert(testBoardContinuous.nwGame.topRow === topRowTest)
    }

}
