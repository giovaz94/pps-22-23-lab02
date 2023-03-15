package task2a

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

import Positive.*

class PositiveTest:

  @Test def testPositive() =
    assertEquals("positive", checkIfPositive(5))
    assertEquals("negative", checkIfPositive(-5))
