package entities

;

class Line(var user_balls: List[String], var user_pins: List[String]) {
  private val _balls = user_balls
  private val _pins = user_pins

  // Getters
  def balls: List[String] = _balls

  def pins: List[String] = _pins
}
