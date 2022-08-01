object Question03 {

  def main(args: Array[String]): Unit = {

    println(formatNames("Benny")(toUpper(_)))
    val s1="Niroshan"
    val s2= s1.substring(0,2)
    val s3="Kumara"
    val s4=s3.substring(5)
    println(formatNames(s2)(toUpper(_))+"roshan")
    println(formatNames("Saman")(toLower(_)))
    println("Kumar"+formatNames(s4)(toUpper(_)))

  }

  def toUpper(s: String): String = {
    s.toUpperCase()
  }

  def toLower(s: String): String = {
    s.toLowerCase()
  }

  def formatNames(name: String)(f: String => String): String = {
      f(name)
  }
}