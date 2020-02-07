package entities

object Color extends Enumeration {
  type Color = Value

  val empty = Value(0)
  val yellow = Value(1)
  val red = Value(2)
}
