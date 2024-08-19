object InterestCalculator extends App {

  val calculateInterest: Double => Double = deposit => 
    if (deposit <= 20000) deposit * 0.02
    else if (deposit <= 200000) deposit * 0.04
    else if (deposit <= 2000000) deposit * 0.035
    else deposit * 0.065


  val depositAmount = 50000
  val interest = calculateInterest(depositAmount)
  println(f"The interest earned for a deposit of Rs. $depositAmount%.2f is Rs. $interest%.2f")
}
