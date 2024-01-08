import math.*

class AddTests extends munit.FunSuite {
  test("sum1: empty") {
    assertEquals(Add.sum1(Array[Int]()), 0)
  }
  test("sum1: singleton") {
    assertEquals(Add.sum1(Array[Int](42)), 42)
  }
  test("sum1: many") {
    assertEquals(Add.sum1(Array[Int](1, 2, 3)), 6)
  }

  test("sum2: empty") {
    assertEquals(Add.sum2(Array[Int]()), 0)
  }
  test("sum2: singleton") {
    assertEquals(Add.sum2(Array[Int](42)), 42)
  }
  test("sum2: many") {
    assertEquals(Add.sum2(Array[Int](1, 2, 3)), 6)
  }
}