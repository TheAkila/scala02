object lab5Q1 {

  def main(args: Array[String]): Unit = {
    val productList = getProductList()
    printProductList(productList)
    println(s"Product count is ${getTotalProducts(productList)}")
  }

  var products: List[String] = List.empty[String]
//Question 1
  def getProductList(): List[String] = {
    val product = scala.io.StdIn.readLine("Enter the product name or type 'done' to exit: ")
    if (product == "done") {
      products 
    } else {
      products = products :+ product 
      getProductList() 
    }
  }

  def printProductList(products: List[String]): Unit = {
    var id = 1 
    for (x <- products) {
      println(s"Item $id is $x")
      id = id + 1 
    }
  }

  def getTotalProducts(products: List[String]): Int={
    var count=products.length
    count

  }
  
  //Question 2

}
