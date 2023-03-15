package task3

enum Shape :
  case Rectangle(p1: Point2D, p2: Point2D)
  case Circle(p: Point2D, r: Double)
  case Square(p: Point2D, s: Double)


object Shape extends App:
  def perimeter(s: Shape): Double = s match
    case Rectangle(Point2D(x1,y1), Point2D(x2, y2)) => 2*(x2-x1) + 2*(y2-y1)
    case Circle(Point2D(_,_), r) => 2 * r * Math.PI
    case Square(Point2D(_,_), l) => 4*l






