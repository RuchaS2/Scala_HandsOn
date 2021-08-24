/*
Pure Function Rules
	• The Function input solely determines the Function output.
	• The Function does not change its input.
	• The Function does not have any side effects.
Benefits of Pure Functions -
	• Pure functions encourage safe ways of programming
	• Pure functions are more composable or modular
	• Pure functions are easy to test and refactor
 */
object Aug24_Pure_fns extends App{
    //pure function that doubles the input value it’s given
    def multiplyByTwo(i : Int): Int = { i * 2 }

    /*
    Square fn - Calculates square of input number
    Pure function don’t change the input variable implicitly
     */
    def square(a:Int):Int = {
      var b:Int = a * a;
      println("Square of the number is " + b);
      println("Number is " + a);
      return a;
    }

    //Addition
    def add(a:Int, b:Int):Int = {
      var c:Int = a + b;
      return c;
    }

    //Multiplication
    def multiply(a:Int, b:Int):Int = {
      var c: Int = a * b;
      return c;
    }
}
