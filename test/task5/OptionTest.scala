package task5

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import Option.*


class OptionTest:

  @Test def testFilter =
    assertEquals(Some(5), filter(Some(5))(_ > 2))
    assertEquals(None(), filter(Some(5))(_ > 8))
    assertEquals(None(), filter(None[Int]())(_ > 2))

  @Test def testMap =
    assertEquals(Some(true), map(Some(5))(_ > 2))
    assertEquals(Some(false), map(Some(5))(_ > 8))
    assertEquals(None(), map(None[Int]())(_ > 2))

  @Test def testFold =
    assertEquals(6, fold(Some(5))(1)(_ + 1))
    assertEquals(1, fold(None[Int]())(1)(_ + 1))