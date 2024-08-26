object InventoryManagement {

  // inventories
  val inventory1: Map[Int, (String, Int, Double)] = Map(
    101 -> ("Widget", 10, 25.50),
    102 -> ("Gadget", 5, 15.75),
    103 -> ("Thingamajig", 20, 30.00)
  )

  val inventory2: Map[Int, (String, Int, Double)] = Map(
    102 -> ("Gadget", 7, 17.50), 
    104 -> ("Doodad", 3, 22.00)
  )

  def main(args: Array[String]): Unit = {
    // get all product names from inventory1
    val productNames: Set[String] = inventory1.values.map(_._1).toSet
    println(s"Product names in inventory1: ${productNames.mkString(", ")}")

    //  Calculate the total value of all products in inventory1
    val totalValue: Double = inventory1.values.map { case (_, quantity, price) => quantity * price }.sum
    println(f"Total value of all products in inventory1: $$${totalValue}%.2f")

    //  Check if inventory1 is empty
    val isEmpty: Boolean = inventory1.isEmpty
    println(s"Is inventory1 empty? $isEmpty")

    // Merge inventory1 and inventory2, updating quantities and retaining the highest price
    val mergedInventory: Map[Int, (String, Int, Double)] = (inventory1 ++ inventory2).toSeq
      .groupBy(_._1)
      .map { case (id, products) =>
        val (name, totalQuantity, maxPrice) = products.map { case (_, (name, quantity, price)) => (name, quantity, price) }
          .reduce { case ((name1, qty1, price1), (_, qty2, price2)) =>
            (name1, qty1 + qty2, Math.max(price1, price2))
          }
        id -> (name, totalQuantity, maxPrice)
      }
    println(s"Merged Inventory: ${mergedInventory.mkString(", ")}")

    //  Check if a product with a specific ID exists and print its details
    val productIdToCheck = 102
    inventory1.get(productIdToCheck) match {
      case Some((name, quantity, price)) =>
        println(s"Product ID $productIdToCheck exists in inventory1. Name: $name, Quantity: $quantity, Price: $price")
      case None =>
        println(s"Product ID $productIdToCheck does not exist in inventory1.")
    }
  }
}
