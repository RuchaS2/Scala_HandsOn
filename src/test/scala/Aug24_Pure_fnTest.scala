import org.scalatest.FunSuite

class Aug24_Pure_fnTest extends  FunSuite {
  test("Aug24_Pure_fns.mulby2"){
    assert(Aug24_Pure_fns.multiplyByTwo(3)  === 6)
  }
  test("Pure_fns.square"){
    assert(Aug24_Pure_fns.square(4)  === 4)
  }
  // Calculating same value but changing the position of the functions
  test("Aug24_Pure_fns.syntax1"){
    assert(Aug24_Pure_fns.add(1, 2) * Aug24_Pure_fns.multiply(3, 4) === 36)
    assert(Aug24_Pure_fns.multiply(4,3) * Aug24_Pure_fns.add(1,2)  === 36)
  }
}
