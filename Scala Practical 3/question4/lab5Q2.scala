import scala.collection.mutable

object lab5Q2 {

  case class Book(
      title: String,
      author: String,
      ISBN: String
  )

  def main(args: Array[String]): Unit = {
    val book1 = Book("ABC", "John", "S001")
    val book2 = Book("DFG", "Sam", "S002")
    val book3 = Book("PQR", "Lisa", "S003")
    val book4 = Book("XYZ", "David", "S004")

    val shelf: mutable.Set[Book] = mutable.Set(book1, book2, book3)
    println("Books on the shelf:")
    shelf.foreach(book => println(s"${book.title} by ${book.author}, ISBN: ${book.ISBN}"))

    
    addBooks(book4, shelf)
    println(".....................................Books on the shelf:After Adding .................................")
    shelf.foreach(book => println(s"${book.title} by ${book.author}, ISBN: ${book.ISBN}"))
    
    removeBooks(shelf,"S001")
    println("......................................Books on the shelf:After removing................................")
    shelf.foreach(book => println(s"${book.title} by ${book.author}, ISBN: ${book.ISBN}"))

    checkAvailbyisbn(shelf,"S003")
    checkAvailbyisbn(shelf,"S001")
    checkAvailbytitle(shelf,"XYZ")
    checkAvailbytitle(shelf,"LOL")
    checkAvailbyauthor(shelf,"Lisa")
    checkAvailbyauthor(shelf,"Nimal")

  }

  def addBooks(book: Book, shelf: mutable.Set[Book]): Unit = {
    shelf += book
  }

  def removeBooks(shelf:mutable.Set[Book],isbn:String):Unit={
    shelf.retain(book=>book.ISBN!=isbn)
  }

  def checkAvail(shelf:mutable.Set[Book],isbn:String):Unit={
    var count=0
    shelf.foreach(book=>if(book.ISBN==isbn){println("its available");count+=1})
    if(count==0){
        println("Not found")
    }
  }
  def checkAvailbyisbn(shelf:mutable.Set[Book],isbn:String):Unit={
    var count=0
    shelf.foreach(book=>if(book.ISBN==isbn){println("its available");count+=1})
    if(count==0){
        println("Not found")
    }
  }

   def checkAvailbytitle(shelf:mutable.Set[Book],title:String):Unit={
    var count=0
    shelf.foreach(book=>if(book.title==title){println("its available");println(s"${book.title} by ${book.author}, ISBN: ${book.ISBN}");count+=1})
    if(count==0){
        println("Not found")
    }
  }

   def checkAvailbyauthor(shelf:mutable.Set[Book],author:String):Unit={
    var count=0
    shelf.foreach(book=>if(book.author==author){println("its available");println(s"${book.title}");count+=1})
    if(count==0){
        println("Not found")
    }
  }
  
}
