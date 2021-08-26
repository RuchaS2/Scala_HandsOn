/*
The strict means, evaluate the expression now and the lazy means, evaluate it for the first use.
strict, lazy behavior in three different scenarios.
1.Variable assignment
2.Function parameters
3.Function values in Higher Order functions

Benefits of Lazy eval :
The laziness is mostly used to create data structures to handle large data volumes efficiently.(eg.Apache Spark)
Spark RDD - implement all transformations as lazy operations.
*/
object LazyEval extends App{

  //Strict behaviour
  //Immediate evaluation

  //Sample tail recursion factorial program
  def factorial(i: Int): Int = {
    println(s"Starting Factorial for $i")
    def tFactorial(n: Int, f: Int): Int = {
      if (n <= 0) f
      else tFactorial(n - 1, n * f)
    }
    return tFactorial(i, 1)
  }

  /*
  1. Strict variable assignment -
  value for s is evaluated immediately.
  When we use the s later in a println statement, Scala does not evaluate it again.
   */
  val s = factorial(15) / factorial(11)
  println(s)

  /*
  2. Strict Function Parameter -
  Scala evaluates the expression before it can pass the result to the function parameter.
   */
  def twice1(i: Int) = {
    println("We have not used i yet")
    i + i
  }
  twice1(factorial(15) / factorial(11))

  /*
  3. Strict function values in Higher Order functions
  Pass the whole expression ( factorial(15)/factorial(11) ) as a function without evaluating it.
  Execute the body of the function twice. Evaluate f two times as we used it two times in the body.
   */
  def twice2(f: => Int) = {
    println("We have not used f yet")
    f + f
  }
  twice2(factorial(15) / factorial(11))

  //lazy behaviour
  //Instead of immediate evaluation, the function value is evaluated once at the time of its first use.

  /*
  1. Lazy variable assignment -
   Scala does not evaluate the value of l until we use the l.
   when we print the l, it evaluates the expression
  */
  lazy val l = factorial(15) / factorial(11)
  println(l)

  /*
  2. Lazy Function Parameter - There is no way to make a parameter value lazy
  */

  /*
  3. Lazy function values in Higher Order functions
   Uses a lazy val to cache the function value. This simple technique makes the function value lazy,
   and instead of immediate evaluation, the function value is evaluated once at the time of its first use.
   */
  //define the function
  def twice3(f: => Int) = {
    lazy val i = f
    println("We did not use i yet")
    i + i
  }
  //call the function
  twice3(factorial(15) / factorial(11))

}
