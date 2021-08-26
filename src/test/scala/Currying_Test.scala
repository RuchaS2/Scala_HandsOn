import org.scalatest.FunSuite
class Currying_Test extends FunSuite {
    test("Currying_Function.add"){
      assert(Currying_Function.add2(8)(10) === 18)
      assert(Currying_Function.add3(18)(10) === 28)
    }

  //partial application
  test("Currying_Function.partial"){
    assert(Currying_Function.partial(10,20) === 30)
    assert(Currying_Function.partial1(20,20) === 40)
  }
}
