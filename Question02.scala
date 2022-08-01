object Question02 {

  def main(args:Array[String]): Unit ={
    println("Please Enter the Number= ")
    val input= scala.io.StdIn.readInt()
    patternMatch(input)
  }

  def patternMatch(a:Int)= a match{
    case a if a<0    => println("Negative is input")
    case a if a==0   => println("Zero is input")
    case a if a%2==0 => println("Input is even")
    case a if a%2==1 => println("Input is odd")
  }

}


