package entities

import scala.util.Random.{nextInt => randomVal}

class Board() {
  private val _code: List[String] = List(
    Color(randomVal(Color.maxId - 1) + 1).toString,
    Color(randomVal(Color.maxId - 1) + 1).toString,
    Color(randomVal(Color.maxId - 1) + 1).toString,
    Color(randomVal(Color.maxId - 1) + 1).toString)

  private var _lineboard = new Array[Line](9)

  def set_line(line: Line, idx: Int): Unit = {
    _lineboard(idx) = line
  }

  // Getters
  def code: List[String] = _code

  def lineboard: Array[Line] = _lineboard
}
