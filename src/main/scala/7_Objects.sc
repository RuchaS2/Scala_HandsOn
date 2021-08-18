import Account.lastNumber

//Singletons
//object construct. - object defines a single instance of a class with the features that you want
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