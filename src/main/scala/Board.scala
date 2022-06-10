case class board(topRow: Array[String]= Array("_",  "_", "_"),
                  middleRow: Array[String] = Array("_",  "_", "_"),
                  bottomRow : Array[String]= Array("_",  "_", "_")
                )
case class display(gameBoard :board ) {
  val viewBoard: String = boardFormatter()

  def boardFormatter(): String= {
    val boardDivider = "="*3 + "||"+"="*3+ "||"+"="*3 +"\n"
      rowFormatter(gameBoard.topRow) + boardDivider +
      rowFormatter(gameBoard.middleRow) + boardDivider +
        rowFormatter(gameBoard.bottomRow)
  }

  def rowFormatter(row: Array[String]): String ={
   " " + row(0) + " ||" + " " + row(1) + " ||" + " " + row(0)+ " \n"
  }

}

sealed trait boardPieces
case object X extends boardPieces
case object O extends boardPieces
case object notFilled extends boardPieces
