package task2a

object Negative extends App:
  /*def neg[A](in: A => Boolean): A => Boolean = _ match
    case x if in(x) => false
    case _ => true */

  def neg[A](in: A => Boolean): A => Boolean = !in(_)
  //val neg: (String => Boolean) => (String => Boolean) = p => !p(_)
