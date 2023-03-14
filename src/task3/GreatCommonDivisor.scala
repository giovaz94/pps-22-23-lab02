package task3

import scala.annotation.tailrec

object GreatCommonDivisor extends App:

  @tailrec
  def gdc(a: Int, b: Int): Int = b match
    case 0 => a
    case n if n < a => gdc(n, a % n)
    case _ => 1


  println(gdc(12,8) == 4)
  println(gdc(14,7) == 7)
  println(gdc(1,2) == 1)


