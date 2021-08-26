/*
Closures - A Function that uses one or more free variables is known as a Closure
return value of this function is dependent of these variable.

Free variable - kind of variable which is not defined within the function
and not passed as the parameter of the function.
The Scala compiler looks into the so-called nearest local lexical environment,
in which that function was defined and tries to find a binding.
 */
object Closures extends App{

  // Free variable(p) used in a Function
  var p = 10
  def getHike(salary: Double) = salary * p / 100
  getHike(5000)

  //Impure closures -
  // If a closure modifies the free variable, the changes are visible outside the closure.
  var r = 10
  def getHike1(salary: Double) = {
    r = r * 2
    salary * r / 100
  }
  println(r)
  getHike(5000)
  println(r)

  //sum is a closure function. var a = 4 is impure closure. the value of a is same and values of b is different.
  def checkClosure(b:Int):Int = {
    val a = 5
    val sum = (b:Int) => b + a
    return sum(a)
  }
}
