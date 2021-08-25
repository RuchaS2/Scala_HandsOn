import org.scalatest.FunSuite

class Aug24_PatternMatchingTest extends FunSuite {
  test("Aug24_PatternMatching.checkType"){
    assert(Aug24_PatternMatching.checkType(3) === "Int = 3")
    assert(Aug24_PatternMatching.checkType("Hello") === "String = Hello")
    assert(Aug24_PatternMatching.checkType(3.0) === "Double = 3.0")
  }

  test("Aug24_PatternMatching.usingMatch"){
    assert(Aug24_PatternMatching.usingMatch(0) === "zero")
    assert(Aug24_PatternMatching.usingMatch(1) === "one")
    assert(Aug24_PatternMatching.usingMatch(2) === "Other")
  }

}
