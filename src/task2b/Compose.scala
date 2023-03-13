package task2b

object Compose extends App:

  // a is an integer input that is firstly passed to g then to f
  def compose[A,B,C](f: B => C, g: A => B): A => C = a => f(g(a))

  println(compose[Double, Double, Double](_ + 1, _ * 3)(2.06))