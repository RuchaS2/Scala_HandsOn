import scala.io.Source._
object read_files extends App{
  val filename = "src/rainbow1.txt"
  for(ine <- fromFile(filename).getLines()){
    println(ine.toUpperCase())
  }
  val poemlines = fromFile(filename).getLines().toList
  println(poemlines)
}
