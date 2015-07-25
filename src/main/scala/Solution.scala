import java.util.Scanner

object Solution {

  def main(args: Array[String]) {
    val s: Scanner = new Scanner(System.in)
    val startingHeight: Int = 1
    val numTestCases: Int = s.nextInt
    var testCase: Int = numTestCases
    while (({
      testCase -= 1; testCase + 1
    }) > 0) {
      val cycles: Int = s.nextInt
      System.out.println(Solution.calculateHeight(startingHeight, cycles))
    }
  }

  def calculateHeight(height: Int, cycles: Int): Int = {
    def calculateCycleHeight(height: Int, cycle: Int, cycles: Int): Int = {
      if (cycle > cycles) height
      else calculateCycleHeight(if (((cycle % 2) == 0)) (height + 1) else (height * 2), cycle+1, cycles)
    }
    calculateCycleHeight(height, 1, cycles)
  }
}