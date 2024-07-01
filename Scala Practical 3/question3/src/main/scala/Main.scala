def average(number1: Int, number2: Int): Float = {
  val trueAverage: Float = (number1 + number2) / 2.0f
  (Math.round(trueAverage * 100) / 100.0f).toFloat
}

def main(args: Array[String]): Unit = {
  val value = average(5, 6)
  println(s"The average of 5 and 6 is $value.")
}