package task3

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import GreatCommonDivisor.*

class GreatCommonDivisorTest :

  @Test def testGreatCommonDivisor() =
    assertEquals(4,gcd(12,8))
    assertEquals(7,gcd(14,7))
    assertEquals(1,gcd(1,2))
    assertEquals(1,gcd(3,2))


