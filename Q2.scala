object EvaluateExpressions {
  
  var a: Int = 2
  var b: Int = 3
  var c: Int = 4
  var d: Int = 5
  var k: Float = 4.3f

  def evaluateExpressions(): Unit = {
    // a)
    // Scala does not have a unary increment (++) or decrement (--) operator.
    // Instead, we must use the addition or subtraction assignment operators.
    // Also, --b is equivalent to -(-b) in Scala.
    println( (-(-b) * a + c * d) )

    // b) 
    println(a)
    a += 1 // Equivalent to a++

    // c)
    val g = 1.0 // Assume some value for g as it is not defined in the prompt
    println( -2 * (g - k) + c )

    // d)
    println(c)
    c += 1 // Equivalent to c++

    // e)
    c = c + 1 // Equivalent to ++c in Scala
    val result = c * a
    a += 1 // Equivalent to a++
    println(result)
  }

  def main(args: Array[String]): Unit = {
    evaluateExpressions()
  }
}


