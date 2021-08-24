/*
Higher Order Functions
  A function that does at least one of the following is a Higher Order Function.
  Functions are first-class values in Scala.
  1. Takes one or more functions as arguments
  2. Returns a function as its result
 */
object Aug24_HigherOrderFns extends App{
  def Add(a:Int , b:Int):Int = a + b
  def Mul(a:Int , b:Int):Int = a * b
  def Sub(a:Int , b:Int):Int = a - b

  /*
  Higher order function that takes another function as argument
  First arg : function 'f'-> takes 2 input params , returns Int
  Second , Third arg : 2 int operands
   */
  def genericops( f:(Int,Int)=>Int , op1:Int , op2:Int) : Int = f(op1,op2)

  /*
  Scala function that returns another function
  doubler fn(doubles input value) ,tripler fn(triples input value)
  if expression returns an appropriate local function depending on the value of c
   */
  def getOps(c: Int) = {
    def doubler(x: Int) = x * 2
    def tripler(x: Int) = x * 3
    if (c > 0)
      doubler _
    else
      tripler _
  }
}
