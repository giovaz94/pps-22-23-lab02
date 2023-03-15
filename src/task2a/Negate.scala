package task2a

object Negate extends App:
  /*def neg[A](in: A => Boolean): A => Boolean = _ match
    case x if in(x) => false
    case _ => true */

  //val neg: (String => Boolean) => (String => Boolean) = p => !p(_)

  def neg[A](in: A => Boolean): A => Boolean = !in(_)

