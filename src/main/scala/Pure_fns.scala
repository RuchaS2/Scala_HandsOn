object Pure_fns extends App{
  def multiplyByTwo(i : Int): Int = { i * 2 }

  def square(a:Int):Int = {
    var b:Int = a * a;
    println("Square of the number is " + b);
    println("Number is " + a);
    return a;
  }
  def add(a:Int, b:Int):Int = {
    var c:Int = a + b;
    return c;
  }
  def multiply(a:Int, b:Int):Int = {
    var c:Int = a * b;
    return c;
  }
}
