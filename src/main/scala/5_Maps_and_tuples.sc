//MAPS
var groceries = Map(1 -> "milk", 2 -> "bread", 3 -> "juice", 4 ->"eggs")
groceries = groceries+(5->"hashbrowns")
groceries.get(3)
groceries(3)
groceries.getOrElse(6,"No Match")
var z = for((k,v)<-groceries) yield (v,k)
groceries.foreach(println)

//TUPLES
val v = (1, 1.4, "Hello")
var x = v._3
val(first, second, third) = v

val symbols = Array("<", "-", ">")
val counts = Array(2,10,2)
val pairs = symbols.zip(counts)
for((s,n)<- pairs)print(s*n)
println
def divide10(n:Int):Tuple2[Int, Int] =
  (n/10,n%10)
val(tens,ones) = divide10(9)


//SETS
val fruit = Set("apple", "orange", "banana")
var moreFruit = Set("kiwi", "pineapple")
var nums = Set(1,2,3,4,5)
var moreNums = Set(6, 7, 8, 9)
nums.contains(5)
nums(3)
var mixed = fruit ++ nums
nums -= 5
println(nums)
nums & moreNums
moreFruit.head
moreFruit.tail
moreNums.isEmpty

//LIST

var l = List(3.0, 5, 'a')
var l2 = 1::2::3::4::5::Nil
var l3 = List.range(10, 20)
var l4 = l:::l2

var sum = 0
l3.foreach(sum+=_)
println(sum)
val list = List((1,2), (3,4), (5,6))
for((a,b)<-list) yield a+b

