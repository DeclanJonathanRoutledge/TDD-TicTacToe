case class board(topRow: Array[String]= Array("_",  "_", "_"),
                  middleRow: Array[String] = Array("_",  "_", "_"),
                  bottomRow : Array[String]= Array("_",  "_", "_")
                )

sealed trait boardPieces
case object X extends boardPieces
case object O extends boardPieces
case object notFilled extends boardPieces
