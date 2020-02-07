package entities

class Game {
  private var _finished: Boolean = false
  private var _turn: Int = 0
  private var _board: Board = new Board()
  private var _winner: Boolean = false

  //Getters and setters
  def turn: Int = _turn

  def turn_=(actual_turn: Int): Unit = _turn = actual_turn

  def finished: Boolean = _finished

  def finished_=(end: Boolean): Unit = _finished = end

  def board: Board = _board

  def board_=(actual_board: Board): Unit = _board = actual_board

  def winner: Boolean = _winner

  def winner_=(win: Boolean): Unit = _winner = win
}
