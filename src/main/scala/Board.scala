case class board(topRow: Array[String]= Array("_",  "_", "_"),
                  middleRow: Array[String] = Array("_",  "_", "_"),
                  bottomRow : Array[String]= Array("_",  "_", "_")
                )
case class display(gameBoard :board ) {
  val viewBoard: String = boardFormatter()
  val htmlViewBoard: String = htmlBoardFormatter()

  def boardFormatter(): String= {
    val boardDivider = "="*3 + "||"+"="*3+ "||"+"="*3 +"\n"
      rowFormatter(gameBoard.topRow) + boardDivider +
      rowFormatter(gameBoard.middleRow) + boardDivider +
        rowFormatter(gameBoard.bottomRow)
  }

  def rowFormatter(row: Array[String]): String ={
   " " + row(0) + " ||" + " " + row(1) + " ||" + " " + row(0)+ " \n"
  }

  def htmlBoardFormatter(): String= {
    val boardDivider = "-"*3 + "||"+"-"*3+ "||"+"-"*3 +"<br>"
    htmlRowFormatter(gameBoard.topRow) + boardDivider +
      htmlRowFormatter(gameBoard.middleRow) + boardDivider +
      htmlRowFormatter(gameBoard.bottomRow)
  }
  def htmlRowFormatter(row: Array[String]): String ={
    "&nbsp;" + row(0) + " ||" + " " + row(1) + " ||" + " " + row(0)+ " <br>"
  }

}

sealed trait boardPieces
case object X extends boardPieces
case object O extends boardPieces
case object notFilled extends boardPieces
