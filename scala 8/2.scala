
  def main(args: Array[String]): Unit = {

    if (args.length != 1) {
      println("Please provide exactly one integer input.")
      return
    }

    val input = try {
      args(0).toInt
    } catch {
      case e: NumberFormatException =>
        println("The input must be an integer.")
        return
    }

    val isMultipleOfThree: Int => Boolean = _ % 3 == 0
    val isMultipleOfFive: Int => Boolean = _ % 5 == 0

    val result = input match {
      case _ if isMultipleOfThree(input) && isMultipleOfFive(input) => "Multiple of Both Three and Five"
      case _ if isMultipleOfThree(input) => "Multiple of Three"
      case _ if isMultipleOfFive(input) => "Multiple of Five"
      case _ => "Not a Multiple of Three or Five"
    }

    println(result)
  }
