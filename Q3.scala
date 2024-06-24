object money {
  def normalhour(h1: Int): Int = {
    h1 * 250
  }

  def OThour(h2: Int): Int = {
    h2 * 85
  }

  def tax(h1: Int, h2: Int): Double = {
    (normalhour(h1) + OThour(h2)) * 0.12
  }

  def takehomesalary(h1: Int, h2: Int): Double = {
    (normalhour(h1) + OThour(h2)) - tax(h1, h2)
  }

  def main(args: Array[String]): Unit = {
    println(s"The amount of money that take home : ${takehomesalary(40, 30)}")
  }
}
