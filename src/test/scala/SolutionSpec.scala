import org.scalatest.FlatSpec

class SolutionSpec extends FlatSpec {

  "Solution" should "return 1 for initial height of 1 and 0 cycles" in {
    assert(Solution.calculateHeight(1,0)==1);
  }

}
