import org.scalatest.FunSuite

class Pure_fnsTest extends FunSuite {
  test("Anonymous_fns.mulby2"){
    assert(Pure_fns.multiplyByTwo(3)  === 6)
  }
  test("Pure_fns.square"){
    assert(Pure_fns.square(4)  === 4)
  }
  test("Anonymous_fns.syntax1"){
    assert(Pure_fns.add(1, 2) * Pure_fns.multiply(3, 4) === 36)
    assert(Pure_fns.multiply(4,3) * Pure_fns.add(1,2)  === 36)
  }
}
