import scala.io.StdIn.readLine

object StudentRecords {

  // Function to validate user input
  def validateInput(name: String, marks: Int, totalMarks: Int): (Boolean, Option[String]) = {
    if (name.trim.isEmpty) {
      (false, Some("Name cannot be empty."))
    } else if (marks < 0 || marks > totalMarks) {
      (false, Some(s"Marks must be between 0 and $totalMarks."))
    } else if (totalMarks <= 0) {
      (false, Some("Total marks must be a positive integer."))
    } else {
      (true, None)
    }
  }

  // Function to calculate percentage and grade
  def getStudentInfo(name: String, marks: Int, totalMarks: Int): (String, Int, Int, Double, Char) = {
    val percentage = (marks.toDouble / totalMarks) * 100
    val grade = percentage match {
      case p if p >= 90 => 'A'
      case p if p >= 75 => 'B'
      case p if p >= 50 => 'C'
      case _ => 'D'
    }
    (name, marks, totalMarks, percentage, grade)
  }

  // Function to print student record
  def printStudentRecord(record: (String, Int, Int, Double, Char)): Unit = {
    val (name, marks, totalMarks, percentage, grade) = record
    println(s"Student Name: $name")
    println(s"Marks Obtained: $marks")
    println(s"Total Marks: $totalMarks")
    println(f"Percentage: $percentage%.2f%%")
    println(s"Grade: $grade")
  }

  // Function to get student info with retry mechanism
  def getStudentInfoWithRetry: (String, Int, Int, Double, Char) = {
    var validInput = false
    var studentRecord: (String, Int, Int, Double, Char) = null

    while (!validInput) {
      println("Enter student's name:")
      val name = readLine().trim

      println("Enter marks obtained:")
      val marks = readLine().trim.toInt

      println("Enter total possible marks:")
      val totalMarks = readLine().trim.toInt

      val (isValid, errorMessage) = validateInput(name, marks, totalMarks)

      if (isValid) {
        studentRecord = getStudentInfo(name, marks, totalMarks)
        validInput = true
      } else {
        println(errorMessage.getOrElse("Invalid input. Please try again."))
      }
    }

    studentRecord
  }

  // Main method to run the application
  def main(args: Array[String]): Unit = {
    val studentRecord = getStudentInfoWithRetry
    printStudentRecord(studentRecord)
  }
}
