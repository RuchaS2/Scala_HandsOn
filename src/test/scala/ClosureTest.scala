import org.scalatest.FunSuite
class ClosureTest extends  FunSuite {
  test("ClosureTest.checkClosure"){
    assert(Closures.checkClosure(5) === 10)
  }
}
