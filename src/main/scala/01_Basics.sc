import scala.math.{pow, sqrt}

val num = 5
val decimal = 5.2567
var x = 1 + 2 * 3.5
List(1, 2, 4.5)
List(1, true)
List(1, true, "one")
def addOne(x:Int) = x + 1
def function1(x:Int) = if(x>0) 1 else "negative"
var greeting, message:String = null
val list1 = List(1, 2, 3)
val list2 = List(1, 2, 3.0)
val list3 = List(1, 2, true)
val list4 = List(1, 2, true, "one")
var a = 10.toString()
var b = 10.to(20)
var c = 10.+(11)
var d = 10 to 20
0 until 10
var e = 10 + 11
var f = 97.toChar
var g = 85.97.toInt
a += " ten"
println(a)

//Arithmetic operations
var x = 3
var y = 9
var sum = x + y
var b1 = x&y
var b2 = x|y
var b3 = x^y
var b4 = x<<2
val nums = 1::3::5::Nil
if(x>0 || y >0) "Both values are positive"

//Control Sturctures
var today = "Tuesday"
if(today == "Monday") println("It might rain")
else println("It is not Monday, so it will not rain")
var b = 4
var a = if(b < 0) -1 else 1
println(a)
println(if(b<0) "-" else if (b==0) "0" else "+")

//LOOPS
var x = 10 //> x  : Int = 10
while (x >= 0) {
  println(x)
  x -= 1 //same as x = x-1
}
do {
  println(x)
  x -= 1
} while (x >= 0)
for (x <- 10 to 0 by -1) {
  println(x)
}
println("BlastOff!");
var y = for(num <- 1 to 10) yield num + 1
var word = "Monday"
for(x <- 0 until word.length)
  println(word(x))

//Scala_impatient exercise
//Q1.
sqrt(3)*sqrt(3)

//Q2
2+3
// res16=2 - not allowed - res values are val

//Q3
"crazy"*3

//Q4
10 max 2

//Q5
var i:BigInt = pow(2,1024)
print(i)






