var today = "Tuesday"
if(today == "Monday") println("It might rain")
else println("It is not Monday, so it will not rain")

var b = 4
var a = if(b < 0) -1 else 1
println(a)

println(if(b<0) "-" else if (b==0) "0" else "+")

//Payroll challenge
object payrollSolution {
  var rate = 10.5
  def earnings(s:String, h:Double):String = {
    if(s=="h") {
      if(h<=40) "Weekly paycheck is $"+h*rate
      else "Weekly paycheck is $" + (40*rate + (h-40)*rate*1.5)
    }
    else "This is a salaried employee"
  }

  println(earnings("h", 20))
  println(earnings("h", 40))
  println(earnings("h", 50))
  println(earnings("s", 0))

  //LOOPS
  var x = 10
  while(x >= 0) {
    print(x)
    x -= 1 //same as x = x-1
  }

  do {
    println(x+" ")
    x -= 1
  } while(x >=0 )

  for(x <- 10 to 0 by -1) {
    print(x+" ")
  }

  var y = for(num <- 1 to 10) yield num + 1
  var word = "Monday"
  for(x <- 0 until word.length) { print(word(x)+" ")}
