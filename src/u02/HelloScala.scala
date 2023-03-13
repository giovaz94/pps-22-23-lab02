package u02

object HelloScala extends App:

  def hello(name: String): String =
    println(s"Hello, ${name}!")
    name

  hello("giovanni")

