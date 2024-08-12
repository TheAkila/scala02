

  def encrypt(text: String, shift: Int): String = {
    text.map {
      case c if c.isLetter =>
        val base = if (c.isUpper) 'A' else 'a'
        ((c - base + shift) % 26 + base).toChar
      case c => c
    }.mkString
  }

  def decrypt(text: String, shift: Int): String = {
    encrypt(text, -shift)
  }

  def cipher(text: String, shift: Int, operation: (String, Int) => String): String = {
    operation(text, shift)
  }

  def main(args: Array[String]): Unit = {
    val text = "Hello, World!"
    val shift = 3

    val encryptedText = cipher(text, shift, encrypt)
    println(s"Encrypted: $encryptedText")

    val decryptedText = cipher(encryptedText, shift, decrypt)
    println(s"Decrypted: $decryptedText")
  }

