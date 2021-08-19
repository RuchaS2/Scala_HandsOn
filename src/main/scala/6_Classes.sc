class Counter {
  private var value = 0 // You must initialize the field
  def increment() { value += 1 } // Methods are public by default
  def current() = value
}
val myCounter = new Counter // Or new Counter()
myCounter.increment()        // Use () with mutator
println(myCounter.current)   // Don’t use () with accessor

//GETTERS AND SETTERS -------------------------------------------
class Person {
var age = 0
}
val fred = new Person
println(fred.age) // Calls the method fred.age() - getter
fred.age = 21 // Calls fred.age_=(21) - setter

//redefine the getter and setter methods yourself.
class Person {
  private var privateAge = 0 // Make private and rename
  def age = privateAge
  def age_=(newValue: Int) {
    if (newValue > privateAge) privateAge = newValue; // Can’t get younger
  }
}
val fred = new Person
fred.age = 30
fred.age = 21 //Fred can’t get younger
println(fred.age)

//ONLY getters
//example - private field and a property getter
class Counter {
  private var value = 0
  def increment() { value += 1 }
  def current = value // No () in declaration
}

val n = myCounter.current // Calling myCounter.current() is a syntax error

//Object-private field-----------------------------------------------
class Counter {
  private var value = 0
  def increment() { value += 1 }
  def isLess(other : Counter) = value < other.value
  // Can access private field of other object
}

class Person {
  private var name = ""
  private var age = 0
  def this(name: String) { // An auxiliary constructor
    this() // Calls primary constructor
    this.name = name
  }
  def this(name: String, age: Int) { // Another auxiliary constructor
    this(name) // Calls previous auxiliary constructor
    this.age = age
  }
}
val p1 = new Person // Primary constructor
val p2 = new Person("Fred") // First auxiliary constructor
val p3 = new Person("Fred", 42) // Second auxiliary constructor

class Person(val name: String, val age: Int) {

}
var person1 = new Person("Fred", 42)

class Person(val name: String, val age: Int) {

  def description = name + " is " + age + " years old"
  println("Just constructed another person - "+description)
}
var person2 = new Person("Fred", 42)

class Person(val name: String, private var age: Int)

class Person(name: String, age: Int) {
  def description = name + " is " + age + " years old"
}

//NESTED CLASSES ----------------------------------------------------------
import scala.collection.mutable.ArrayBuffer
class Network {
  class Member(val name: String) {
    val contacts = new ArrayBuffer[Member]
  }
  private val members = new ArrayBuffer[Member]
  def join(name: String) = {
    val m = new Member(name)
    members += m
    m
  }
}
//Creating 2 networks
val net1 = new Network
val net2 = new Network
val fred = net1.join("Fred")  //net1.member
val wilma = net1.join("Wilma")  //net1.member
fred.contacts += wilma // OK

val barney = net2.join("Barney") // Has type net2.Member

//Singletons
object Accounts {
  private var lastNumber = 0
  def newUniqueNumber() = { lastNumber += 1; lastNumber }
}
//for new account no, call Accounts.newUniqueNumber()

//COMPANION objs - class with both instance methods and static methods
class Account {
  val id = Account.newUniqueNumber()
  private var balance = 0.0
  def deposit(amount: Double) { balance += amount }
}
object Account { // The companion object
  private var lastNumber = 0
  private def newUniqueNumber() = { lastNumber += 1; lastNumber }
}

//Application Objs
//Each Scala program must start with an object’s main method of type Array[String]
//=> Unit:
object Hello {
  def main(args: Array[String]) {
    println("Hello, World!")
  }
}



