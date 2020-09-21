package lectures

import javax.naming.spi.DirStateFactory.Result

import scala.annotation.tailrec
// import org.scalatest._

object Functions extends App {

  def aGreetingFunction(name: String, age: Int) = {
    "Hi, my name is " + name + " and I am " + age + " years old."
  }

  println(aGreetingFunction("Greg", 46))

  def factorial(n: Int): Int = {
    if (n == 0) 1
    else n * factorial(n-1)
  }

  println(factorial(5))

  def factorialTailRecursion(n: Int): Int = {
    @tailrec
    def iter(x: Int, result: Int): Int = {
      if (x == 0) result
      else iter(x - 1, result * x)
    }

    iter(n, 1)
  }

  println(factorialTailRecursion(4))

  //factorialTailRecursion(4) shouldBe 24

  def fibonacci(n: Int): Int = {
    if (n == 1 || n == 2) 1
    else fibonacci(n - 1) + fibonacci(n - 2)
  }

  println(fibonacci(6))

  def fib1(n: Int): Int = n match {
    case 0 | 1 => n
    case _ => fib1(n -1) + fib1(n - 2)
  }

  println(fib1(11))

  def fibonacciTailRecursion(n: Int): Int = {
    def fib_tail(n: Int, a: Int, b: Int): Int = n match {
      case 0 => a
      case _ => fib_tail(n-1, b, a+b)
    }
    return fib_tail(n, 0, 1)
  }

  println(fibonacciTailRecursion(11))
}
