object Question01 {
  def main(args:Array[String]): Unit ={
    println("Rs: "+interest(20000))
  }

  def interest(deposit:Int)= deposit match {
    case x if x>2000000 => x*0.065
    case x if x>200000   => x*0.035
    case x if x>20000    => x*0.04
    case x if x>0        => x*0.02
  }
}
