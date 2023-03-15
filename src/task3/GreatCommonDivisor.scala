package task3

import scala.annotation.tailrec

object GreatCommonDivisor extends App:
  @tailrec
  def gcd(a: Int, b: Int): Int = b match
    case 0 => a
    case n if n < a => gcd(n, a % n)
    case _ => 1

