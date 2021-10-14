sealed trait Vehicle {
  protected val registration:String
}
class Car(val registration:String,private val model:String) extends Vehicle
class motorcycle(val registration:String,private val model:String) extends Vehicle
class boat(val registration:String,private val model:String) extends Vehicle
