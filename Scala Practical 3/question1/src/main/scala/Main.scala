val inputString: String = "Hello";

def reverseString(inputString: String): String = {
  if (inputString.length == 0) {
    "";
  } else {
    val lastChar = inputString(inputString.length() - 1);
    lastChar + reverseString(inputString.substring(0, inputString.length - 1));
  }
}

def main(args: Array[String]): Unit = {
  println(reverseString(inputString));
}