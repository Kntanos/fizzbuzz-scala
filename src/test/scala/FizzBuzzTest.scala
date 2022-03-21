import org.scalatest.funsuite.AnyFunSuite
class FizzBuzzTest extends AnyFunSuite {
  test("lists the numbers up to one") {
    assert(FizzBuzz.generate(1) === "1")
  }

  test("lists the numbers up to two") {
    assert(FizzBuzz.generate(2) === "1, 2")
  }

  test("lists the numbers up to two, then Fizz") {
    assert(FizzBuzz.generate(3) === "1, 2, Fizz")
  }

  test("lists the numbers up to 20 and substitutes accordingly") {
    assert(FizzBuzz.generate(20) === "1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz, 16, 17, Fizz, 19, Buzz")
  }

  test("substitutes 3 with Fizz") {
    assert(FizzBuzz.substituteNumbers(3) === "Fizz")
  }

  test("substitutes 5 with Buzz") {
    assert(FizzBuzz.substituteNumbers(5) === "Buzz")
  }

  test("substitutes 15 with FizzBuzz") {
    assert(FizzBuzz.substituteNumbers(15) === "FizzBuzz")
  }
}