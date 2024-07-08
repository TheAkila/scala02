import scala.io.StdIn
object activity4_2 {

  def main(args: Array[String]): Unit = {

    println("enter the number which you like : ")
    var num=StdIn.readLine().toInt

    if(num==0)
      {
        println("number is zero")
      }

    else if(num<0)
      {
        println("negative number")
      }
    else if(num%2 == 0)
    {
      println("Even number")
    }
    else
      {
        println("odd number")
      }

  }

}
