val integers = List(4, 8, 6, 7, 3, 4, 2, 10)

def evenSum(integers: List[Int]): Int = {
  val evens = integers.filter(_ % 2 == 0)
  evens.sum
}

def main(args: Array[String]):Unit = {
  val sumOfEvens = evenSum(integers)
  println(s"The sum of evens is $sumOfEvens")
}