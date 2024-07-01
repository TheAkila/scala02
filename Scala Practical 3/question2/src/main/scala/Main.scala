val strings = List("kiwi", "apple", "pineapple", "watermelon")

def longStrings(strings: List[String]): List[String] = {
  val longerThan5: List[String] = strings.filter(_.length >= 5)
  longerThan5
}

def main(args: Array[String]): Unit = {
  val longerThan5 = longStrings(strings);
  println(longerThan5.mkString(", "));
}