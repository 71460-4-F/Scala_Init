
object Initial {
  def main(args: Array[String]) = {
    var url = "www.scala-lang.org"
    println(url + addInt("17", "02","2022"))
  }

  def addInt(a: String, b: String, c: String): String = {
    var date = " " + a + "/" + b + "/" + c

    return date
  }
}
