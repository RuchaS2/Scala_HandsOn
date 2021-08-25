object Anonymous_fns {
  //Anonymous Function
  def doubler(i: Int) = { i * 2 } //general
  (i: Int) => { i * 2 }  //lambda - uses =>

  //with parameters
  var syntax1= (str1:String ,str2:String ) => str1 + str2
  var syntax2= (_:String ) + (_:String)

  //without parameters
  var syntax3 = () => {"Welcome.."}

  //fn as parameter
  def AsParam(fun:(String , String)=>String)= {
    fun("dog","cat")
  }

  def getOps(c: Int) = {
    if (c > 0) (i: Int) => i * 2 //fn1
    else (i: Int) => i * 3       //fn2
  }
}
