package exercise

import scala.annotation.tailrec


object Exercise:

  /*
   *  TASK 2A:
   *    - positive
   *    - neg
   *
   *  Svoglimento -> Da solo
   */
  def positive(n: Int): String = n match
    case x if x >= 0 => "positive"
    case _ => "negative"

  def neg[A](in: A => Boolean): A => Boolean = !in(_)
  // Alternative version
  // val neg: (String => Boolean) => (String => Boolean) = p => !p(_)


   /*
    *  TASK 2B:
    *    - currying
    *    - compose
    *
    *  Svoglimento -> Da solo
    */
  val p1: Double => Double => Boolean => Boolean = x => y => z => x <= y == z
  val p2: (Double, Double, Boolean) => Boolean = (x, y, z) => x <= y == z
  def p3(x: Double)(y: Double)(z: Boolean): Boolean = x <= y == z
  def p4(x: Double, y: Double, z: Boolean): Boolean = x <= y == z

  def compose[A,B,C](f: B => C, g: A => B): A => C = a => f(g(a))

  /*
   *  TASK 3:
   *    - gcd
   *
   *  Svoglimento -> Da solo
   */
  @tailrec
  def gcd(a: Int, b: Int): Int = b match
    case 0 => a
    case n if n < a => gcd(n, a % n)
    case _ => 1


  /*
   *  TASK 4:
   *    - perimeter
   *    - contains
   *
   *  Svoglimento -> Da solo
   */

  case class Point2D(x: Double, y: Double)
  enum Shape:
    case Rectangle(p1: Point2D, p2: Point2D)
    case Circle(p: Point2D, r: Double)
    case Square(p: Point2D, s: Double)

  import Shape.*

  def perimeter(s: Shape): Double = s match
    case Rectangle(Point2D(x1, y1), Point2D(x2, y2)) => 2 * (x2 - x1) + 2 * (y2 - y1)
    case Circle(Point2D(_, _), r) => 2 * r * Math.PI
    case Square(Point2D(_, _), l) => 4 * l

  @tailrec
  def contains(p: Point2D, s: Shape): Boolean = (p, s) match
    case (Point2D(x, y), Rectangle(Point2D(x1, y1), Point2D(x2, y2))) => (x >= x1 && y >= y1 && x <= x2 && y <= y2)
    case (a, Circle(e, r)) => distance(a, e) <= r
    case (e, Square(Point2D(x1, y1), l)) => contains(e, Rectangle(Point2D(x1, y1), Point2D(x1 + l, y1 + l)))


  def distance(p1: Point2D, p2: Point2D): Double = (p1, p2) match
    case (Point2D(x1, y1), Point2D(x2, y2)) if x1 == x2 => Math.abs(y2 - y1)
    case (Point2D(x1, y1), Point2D(x2, y2)) if y1 == y2 => Math.abs(x2 - x1)
    case (Point2D(x1, y1), Point2D(x2, y2)) => Math.sqrt(Math.pow(2, x2 - x1) + Math.pow(2, y2 - y1))

  /*
   *  TASK 5:
   *    - filter
   *    - map
   *    - fold
   *
   *  Svoglimento -> Da solo
   */
  import u02.Optionals.*
  import u02.Optionals.Option.*

  def filter[A](opt: Option[A])(f: A => Boolean): Option[A] = opt match
    case Some(a) if f(a) => Some(a)
    case _ => None()

  def map[A, B](opt: Option[A])(f: A => B): Option[B] = opt match
    case Some(a) => Some(f(a))
    case _ => None()

  def fold[A](opt: Option[A])(d: A)(f: A => A): A = opt match
    case Some(a) => f(a)
    case _ => d



