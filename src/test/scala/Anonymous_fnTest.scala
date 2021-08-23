import Anonymous_fns.AsParam
import org.scalatest.FunSuite

class Anonymous_fnTest extends FunSuite{
    test("Anonymous_fns.syntax1"){
      assert(Anonymous_fns.syntax1("Hello","World")  === "HelloWorld")
    }
    test("Anonymous_fns.syntax2"){
      assert(Anonymous_fns.syntax2("Hello","Scala")  === "HelloScala")
    }
    test("Anonymous_fns.syntax3"){
      assert(Anonymous_fns.syntax3()  === "Welcome..")
    }
    test("Anonymous_fns.AsParam"){
      val f1 = AsParam((str1:String,str2:String)=>str1+str2)
      val f2 = AsParam(_ + _)
      assert(f1  === "dogcat")
      assert(f2  === "dogcat")
    }
    test("Anonymous_fns.getOps"){
      var fn1 = Anonymous_fns.getOps(-1)
      var fn2 = Anonymous_fns.getOps(1)
      assert(fn1(-1)=== -3)
      assert(fn2(1)=== 2)
    }
}
