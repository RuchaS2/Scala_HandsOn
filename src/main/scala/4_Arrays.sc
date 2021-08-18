//Fixed length Arrays
val nums = new Array[Int](10)
val a = new Array[String](10)
var z1:Array[String] = new Array[String](3)

val s = Array("Hello", "World")
s(0) = "Goodbye"

//Variable length arrays - Array Buffers
import scala.collection.mutable.ArrayBuffer
val b = ArrayBuffer[Int]()

b += 1
b += (1, 2, 3, 5)
b ++= Array(8, 13, 21)
b.trimEnd(5)

//:+	append 1 item	old_array :+ e
//++	append N item	old_array ++ new_array
//+:	prepend 1 item	e +: old_array
//++:	prepend N items	new_array ++: old_array

//Insert/remove elements at arbitrary location
//first param is index
b.insert(2, 6)
b.insert(2, 7, 8, 9)
b.remove(2)
b.remove(2, 3)

//Traversing
var myList = Array(1.9, 2.9, 3.4, 3.5)
for (i <- 0 until myList.length)
  println(i + ": " + myList(i))
for ( i <- 0 to (myList.length - 1))
  println(i + ": " + myList(i))
for ( x <- myList ) //enhanced for
  println( x )

//Until
var ab = Array (1,2,3,4,5,6,7,8,9,10)
0 until 10
0 until (ab.length, 2)
(0 until ab.length).reverse

//Create Array with Range
import Array._
var myList1 = range(10, 20, 2)
var myList2 = range(10,20)

//Transforming Arrays
val a = Array(2, 3, 5, 7, 11)
//val result = for (elem <- a) yield 2 * elem


//Array Methods
Array(1, 7, 2, 9).sum
ArrayBuffer("Mary", "had", "a", "little", "lamb").max

var myList1 = Array(1.9, 2.9, 3.4, 3.5)
var myList2 = Array(8.9, 7.9, 0.4, 1.5)
var myList3 =  concat( myList1, myList2)

val a = Array(1, 7, 2, 9)
scala.util.Sorting.quickSort(a)
//for(x2 <- a) println(x2)

a.mkString(" and ")
a.mkString("<", ",", ">")

//Other fns - count, append , += , copyToArray, max, fill ,iterate

///Multi Dimensional Array
//1. using Array.ofDim
val mymultiarr= Array.ofDim[Int](2, 2)
mymultiarr(0)(0) = 2
mymultiarr(0)(1) = 7
mymultiarr(1)(0) = 3
mymultiarr(1)(1) = 4

for(i<-0 to 1; j<-0 until 2) {
  print(i, j)
  println("=" + mymultiarr(i)(j))
}

//2. by using Array of Array
var arr= Array(Array(0, 2, 4, 6, 8), Array(1, 3, 5, 7, 9))
for(i<-0 to 1) {
  for(j<- 0 to 4) {
    print(" "+arr(i)(j))
  }
  println()
}