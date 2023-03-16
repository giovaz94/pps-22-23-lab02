package task4


import scala.annotation.tailrec


enum Shape :
  case Rectangle(p1: Point2D, p2: Point2D)
  case Circle(p: Point2D, r: Double)
  case Square(p: Point2D, s: Double)


object Shape extends App:
  def perimeter(s: Shape): Double = s match
    case Rectangle(Point2D(x1,y1), Point2D(x2, y2)) => 2*(x2-x1) + 2*(y2-y1)
    case Circle(Point2D(_,_), r) => 2*r*Math.PI
    case Square(Point2D(_,_), l) => 4*l

  @tailrec
  def contains(p: Point2D, s: Shape): Boolean = (p,s) match
    case (Point2D(x,y), Rectangle(Point2D(x1,y1), Point2D(x2, y2))) => (x >= x1 && y >= y1 && x <= x2 && y <= y2)
    case (a, Circle(e, r)) => distance(a, e) <= r
    case (e, Square(Point2D(x1,y1), l)) => contains(e, Rectangle(Point2D(x1,y1),Point2D(x1+l, y1+l)))


  def distance(p1: Point2D, p2: Point2D): Double = (p1, p2) match
    case (Point2D(x1, y1), Point2D(x2, y2)) if x1 == x2 => Math.abs(y2 - y1)
    case (Point2D(x1, y1), Point2D(x2, y2)) if y1 == y2 => Math.abs(x2 - x1)
    case (Point2D(x1, y1), Point2D(x2, y2)) => Math.sqrt(Math.pow(2, x2 - x1) + Math.pow(2, y2 - y1))






