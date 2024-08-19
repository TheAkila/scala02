object NameFormatter {
  
  def toUpper(str: String): String = str.toUpperCase
  def toLower(str: String): String = str.toLowerCase
  def formatNames(name: String)(formatFunc: String => String): String = {
    formatFunc(name)
  }
  def main(args: Array[String]): Unit = {

    val name1 = "Benny"
    val name2 = "Niroshan"
    val name3 = "Saman"
    val name4 = "Kumara"


    println(formatNames(name1)(toUpper)) 
    println(formatNames(name2)(name => name.substring(0, 2).toUpperCase + name.substring(2).toLowerCase)) // NIroshan
    println(formatNames(name3)(toLower)) 
    println(formatNames(name4)(name => name.substring(0, 1).toUpperCase + name.substring(1, 5).toLowerCase + name.substring(5).toUpperCase)) // KumarA
  }
}
