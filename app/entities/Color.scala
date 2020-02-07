package entities

object Color extends Enumeration {
  type Color = Value
  // Assigning values
  val empty: entities.Color.Value = Value(0)
  val yellow: entities.Color.Value = Value(1)
  val red: entities.Color.Value = Value(2)
  val green: entities.Color.Value = Value(3)
  val orange: entities.Color.Value = Value(4)
  val white: entities.Color.Value = Value(5)
  val blue: entities.Color.Value = Value(6)
}
