object Expressionevaluate {
  def main(args: Array[String]): Unit = {
    // Declare and initialize variables
    var i, j, k = 2
    val m, n = 5
    val f = 12.0f
    val g = 4.0f
    val c = 'X'

    // Evaluate the expressions
    val a = k + 12 * m
    val b = m / j
    val h = n % j
    val d = m / j * j
    val e = f + 10 * 5 + g
    i += 1 // Increment i before the expression
    val f1 = i * n

    
    println(s" k + 12 * m = $a")
    println(s" m / j = $b")
    println(s" n % j = $h")
    println(s" m / j * j = $d")
    println(s" f + 10 * 5 + g = $e")
    println(s" ++i * n = $f1")
  }
}