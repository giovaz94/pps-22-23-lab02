package task4

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import task3.Point2D
import task3.Shape.*

class ShapeTest:

  @Test def testPerimeter() =
    assertEquals(10, perimeter(Rectangle(Point2D(3,0), Point2D(6,2))))
    assertEquals(2*Math.PI*3.2, perimeter(Circle(Point2D(0,0), 3.2)))
    assertEquals(8, perimeter(Square(Point2D(0,0), 2)))
