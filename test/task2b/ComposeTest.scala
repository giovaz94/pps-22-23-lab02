package task2b

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import Compose.*

class ComposeTest :

  @Test def testFunctionComposition() =
    assertEquals(11, compose[Int, Int, Int](_ + 1, _ * 2)(5))
    assertEquals(7, compose[Int, Int, Int](_ / 2, _ * 3)(5))
    assertEquals("Hello, World!", compose[String, String, String](_ + "World!", _ + ", ")("Hello"))


