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

  @Test def testContains() =
    assertTrue(contains(Point2D(2,0), Rectangle(Point2D(0,0), Point2D(5,3))))
    assertFalse(contains(Point2D(7,4), Rectangle(Point2D(0,0), Point2D(5,3))))
    assertTrue(contains(Point2D(0,3), Circle(Point2D(0,0), 8)))
    assertTrue(contains(Point2D(1,3), Square(Point2D(0,0), 4)))
    assertFalse(contains(Point2D(7,7), Square(Point2D(0,0), 4)))


