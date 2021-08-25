/*
Currying function -
Currying in Scala is simply a technique or a process of transforming a function
that takes multiple arguments into a function that takes single argument.

Partially Applied functions -
while invoking a function, we can supply some of the arguments and the left arguments are supplied when required.
These arguments which are not passed to function we use hyphen( _ ) as placeholder.

*/

object Currying_Function extends  App{

  //Normal function
    def add(x:Int , y:Int) = x + y

  /*
   Transforming this add function into a Curried function
   def function_name(argument1) = (argument2) => operation
   add2 - function which takes only one argument x
   return a second function which will have the value of add2
   second function will also take an argument y
   */
    def add2(x:Int) = (y:Int) => x + y

  //Currying Function Using Partial Application on Add2
  def partial(x:Int , y:Int):Int ={
    val sum1 = add2(x)
     return sum1(y)
  }

  //Another representation
  //def function_name(argument1)(argument2) = operation
  def add3(x:Int) (y:Int) = x+y

  //Currying Function Using Partial Application on Add3
  //Pass second arg as _
  def partial1(x:Int , y:Int):Int ={
    val sum2 = add3(x)_
    return sum2(y)
  }
}
