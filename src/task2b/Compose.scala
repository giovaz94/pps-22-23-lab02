package task2b

object Compose extends App:

  def compose(f: Int => Int, g: Int => Int): Int => Int =
    (a: Int) => f(g(a))       // a is an integer input that is firstly passed to g then to f

