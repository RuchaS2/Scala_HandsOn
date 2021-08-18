//INTRO-----------------------------------------------------
//A Scala source file can contain multiple classes, and all of them have public visibility
class Counter {
  private var value = 0 // You must initialize the field
  def increment() { value += 1 } // Methods are public by default
  def current() = value
}
val myCounter = new Counter // Or new Counter()
myCounter.increment()        // Use () with mutator
println(myCounter.current)   // Don’t use () with accessor
//myCounter.current same as myCounter.current()


//GETTERS AND SETTERS -------------------------------------------
//Scala provides getter and setter methods for every field.
//Scala generates a class for the JVM with a private age field and getter and setter
//methods. These methods are public because we did not declare age as private.
//If the field is private, the getter and setter are private.
//If the field is a val, only a getter is generated.
//If you don’t want any getter or setter, declare the field as private[this]
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



//SUMMARY***************************************
//1. var foo: Scala synthesizes a getter and a setter.
//2. val foo: Scala synthesizes a getter.
//3. You define methods foo and foo_=.
//4. You define a method foo.
//*********************************************



//Object-private field-----------------------------------------------
//In Scala (as well as in Java or C++), a method can access the private fields of all
//objects of its class
class Counter {
  private var value = 0
  def increment() { value += 1 }
  def isLess(other : Counter) = value < other.value
  // Can access private field of other object
}
//Accessing other.value is legal because other is also a Counter object.
//the methods of the Counter class can only access the value field of the
//current object, not of other objects of type Counter.
// This access is sometimes called object-private
//With a class-private field, Scala generates private getter and setter methods.
//However, for an object-private field, no getters and setters are generated at all.




//Bean Properties ------------------------------------------
//When you annotate a Scala field with @BeanProperty, then methods are
//automatically generated
//import scala.reflect.BeanProperty
//class Person {
//  @BeanProperty var name: String = _
//}
//generates four methods:
// 1. name: String
//2. name_=(newValue: String): Unit
//3. getName(): String
//4. setName(newValue: String): Unit



//Auxiliary Constructors ---------------------------------------------
//Scala class has one constructor that is more important than all the
//others, called the primary constructor. In addition, a class may have any number
//of auxiliary constructors.
//similar to constructors in Java or C++ with just 2 differences -
//1. The auxiliary constructors are called this. (In Java or C++, constructors have
//  the same name as the class—which is not so convenient if you rename the
//class.)
//2. Each auxiliary constructor must start with a call to a previously defined
//  auxiliary constructor or the primary constructor.
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



//Primary Constructors ------------------------------------------------------
//In Scala, every class has a primary constructor.
//In Scala, classes take parameters, just like methods do.

//1.The parameters of the primary constructor are placed immediately after the
//class name.Parameters of the primary constructor turn into fields that are initialized with
//the construction parameters.
class Person(val name: String, val age: Int) {
  // Parameters of primary constructor in (...)
  //...
}
var person1 = new Person("Fred", 42)

//2.The primary constructor executes all statements in the class definition.
//This is useful when you need to configure a field during construction.
class Person(val name: String, val age: Int) {

  def description = name + " is " + age + " years old"
  println("Just constructed another person - "+description)
}
var person2 = new Person("Fred", 42)

//3.If there are no parameters after the class name, then the class has a
//primary constructor with no parameters. That constructor simply executes all
//statements in the body of the class.

class Person(val name: String, private var age: Int)
//declares and initializes fields  - val name: String  , private var age: Int
//Construction parameters can also be regular method parameters, without val or var.
//If a parameter without val or var is used inside at least one method, it becomes
//  a field. For example,
class Person(name: String, age: Int) {
  def description = name + " is " + age + " years old"
}
//declares and initializes immutable fields name and age that are object-private.

//NESTED CLASSES ----------------------------------------------------------
//You can define functions
//inside other functions, and classes inside other classes.
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
//In Scala, each instance has its own class Member, just like each instance has its own
//field members. That is, chatter.Member and myFace.Member are different classes.
//to make a new inner object, you simply use new with the type name: new chatter.Member.

val fred = net1.join("Fred")  //net1.member
val wilma = net1.join("Wilma")  //net1.member
fred.contacts += wilma // OK

val barney = net2.join("Barney") // Has type net2.Member
//fred.contacts += barney
// No—can’t add a net2.Member to a buffer of net1.Member elements







