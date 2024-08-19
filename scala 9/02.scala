object NumberPatternMatching {
  def main(args: Array[String]): Unit = {
    
    if (args.length > 0) {
      val input = args(0).toInt
      
      
      val checkNumber: Int => String = {
        case x if x <= 0 => "Negative/Zero is input"
        case x if x % 2 == 0 => "Even number is given"
        case _ => "Odd number is given"
      }
      
      
      val result = checkNumber(input)
      println(result)
    } else {
      println("Please provide an integer input.")
    }
  }
}
