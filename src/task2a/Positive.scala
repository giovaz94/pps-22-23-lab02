package task2a

object Positive extends App:

  def checkIfPositive(n: Int) : String = n match
    case x if x >= 0 => "positive"
    case _ => "negative"


  println(s"Number 5 is ${checkIfPositive(5)}")

  val checkIfPositive2: Int => String = (n: Int) => n match
    case x if x >= 0 => "positive"
    case _ => "negative"


  println(s"checkIfPositive(5) == checkIfPositive2(5)? ${checkIfPositive(5) == checkIfPositive2(5)}")

