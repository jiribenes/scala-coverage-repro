package math

object Add {
  def sum1(array: Array[Int]): Int = {
    var sum = 0
    for (i <- array) {
      sum += i
    }
    sum
  }

  def sum2(array: Array[Int]): Int = {
    var sum = 0
    for (i <- 0 until array.length) {
      sum += array(i)
    }
    sum
  }
}
