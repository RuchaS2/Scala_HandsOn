import org.scalatest.FunSuite

class Aug24_HigherOrderFnsTest extends FunSuite {
    /*
    Testing genericOps function :
    First arg - operation that you want to perform (Add , mul,sub)
    Second , third args - 2 int operands
    */
    test("HigherOrderFns.genericOps"){
      assert(Aug24_HigherOrderFns.genericops(Aug24_HigherOrderFns.Add,6 , 3 )  === 9)
      assert(Aug24_HigherOrderFns.genericops(Aug24_HigherOrderFns.Mul,4 , 3 )  === 12)
      assert(Aug24_HigherOrderFns.genericops(Aug24_HigherOrderFns.Sub,6 , 3 )  === 3)
    }

    /*
    Testing getOps function :
    calling the getOps function and assign the returned value to f1,f2. The variables f1,f2 holds a function that we call
    depending upon value of input parameter
    */
    test("HigherOrderFns.getOps"){
      val f1 = Aug24_HigherOrderFns.getOps(3)
      val f2 = Aug24_HigherOrderFns.getOps(-3)
      assert( f1(3) === 6)
      assert( f2(-3)  === -9)
    }
}
