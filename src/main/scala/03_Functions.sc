//Methods are part of a class
//A function is an object and can be assigned to a variable
//method performs on obj, function doesnt
//Syntax - def fnmame (parameters):return type = { ... }
//Anonymous fn = lambda fn
//Unit fn do not have = sign
//first order fn takes only data as params
def abs(x:Int) = if(x<0) -x else x
abs(-5)

def fac(n:Int)= {
  var r=1
  for(i <- 1 to n ) r*=i
  r //return
}
fac(5)

//Recursive fn - mandatory to write return type
def fec(n:Int):Int = if(n<=0) 1 else n * fec(n-1)
fec(5)

def printname(firstname: String , lastname: String)={
  println(firstname + " " + lastname)
}
printname("RUCHA","SHINDE")
printname(firstname= "RUCHA",lastname= "SHINDE")
printname(lastname= "SHINDE",firstname= "RUCHA")

//Default args
def printname(left :String="[", f: String , l: String,right :String="]")={
  println(left + f + " " + l+ right)
}
printname(l= "SHINDE",f= "RUCHA")

//Multiple no of params (Not knowing exact no of args)
def sum(args:Int*) = {
  var ans= 0
  for(arg <- args) ans+=arg
  ans
}
sum(1,2,3,4,5)

//Higher Order functions -----------------------------------------
/*take fn as parameters*/
val double = (i:Int) => i * 2 //fn that double the val
def higherOrder(x:Int , y:Int=>Int) = y(x)
// param is y and fn is also y
higherOrder(6,double)

val triple = (i:Int) => i * 3
higherOrder(6,triple)

def sayHello = (name:String) => {"Hello" + " " + name}
sayHello("Rucha")
var msg = sayHello("Hello")

//Closure fn
var y = 5
val multi = (x:Int) => x * y
multi(10)




