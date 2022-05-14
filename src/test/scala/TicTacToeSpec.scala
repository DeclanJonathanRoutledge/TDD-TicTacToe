
import org.scalatest.flatspec.AnyFlatSpec



class TicTacToeSpec extends AnyFlatSpec{
    val emptyRow: Array[String] = Array("_",  "_", "_")
    val testBoardContinuous: playBoard = playBoard()

    "A board" should  "return an empty starting board" in  {
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

    def winGame(playXorO:String): board ={
        val win  = playBoard()
        win.play(0,0,"O")
        win.play(0,1,"O")
        win.play(0,2,"O")
    }
    def drawGame(): playBoard = {
        val drawRow0 = Array("O",  "X", "O")
        val drawRow1and2 = Array("X",  "O", "X")
        playBoard(board(drawRow0,drawRow1and2,drawRow1and2))
    }
}
