package task2a


import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import Negate.*

class NegateTest:

  @Test def testNegative() =
    val empty: String => Boolean = _ == ""
    val notEmpty = neg(empty);
    assertTrue(notEmpty("test"))
    assertFalse(notEmpty(""))


