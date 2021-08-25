/*
  Pattern Matching
  Scala pattern matching gives you a convenient alternative which looks like Java's switch statement.
  Scala's pattern matching binds the value on a pattern match.
  Each match keyword must have at least one case clause.
  The last “_“, is a “catch-all” case, will be executed if none of the cases matches. Cases are also called alternatives.
  Pattern matching does not have any break statement.
  Pattern matching always returns some value.
  Match blocks are expressions, not statements. This means that they evaluate the body of whichever case matches.
  Multiple values can be tested in a single line by using “|“
 */
object Aug24_PatternMatching {

  //Typed pattern match
  /*
  when the object x matches with an Integer type, Scala binds it to i.
  If it matches with a String type, Scala ties it to s.
  This automatic binding saves you from casting the x to a matching type.
  case_ => is the default case
   */
  def checkType(x: Any) = {
    x match {
      case i: Integer => "Int = " + i
      case s: String  => "String = " + s
      case d: Double  => "Double = " + d
      case _          => "Oops! Something Else"
    }
  }

  // method containing match keyword
  def usingMatch(x:Int): String = x match {
    case 0 => "zero"
    case 1 => "one"
    case _ => "Other"
  }

  /*
  Extractors-
  Extractors are defined as an object which has a method named unapply as one of its part.
  The unapply method will be executed spontaneously, While comparing the Object of an Extractor in Pattern Matching.
   */

  // Defining apply method
  def apply(x: Double) = x / 5

  // Defining unapply method
  def unapply(z: Double): Option[Double] =
    if (z % 5 == 0) {Some(z/5)}
    else None

  def main(args: Array[String])
  {

    // Assigning value to the object
    val x = Aug24_PatternMatching(25)

    // Displays output of the Apply method
    println(x)

    // Applying pattern matching
    x match
    {
      // unapply method is called
      case Aug24_PatternMatching(y) => println("The value is: "+y)
      case _ => println("Can't be evaluated")

    }
  }
}
