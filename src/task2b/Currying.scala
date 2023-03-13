package task2b

object Currying extends App:

  val p1: Double => Double => Boolean => Boolean = x => y => z => x <= y == z
  val p2: (Double, Double, Boolean) => Boolean = (x, y, z) => x <= y == z
  def p3(x:Double)(y:Double)(z:Boolean): Boolean = x <= y == z
  def p4(x:Double, y:Double, z:Boolean): Boolean = x <= y == z

