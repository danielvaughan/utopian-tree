import org.scalatest.FlatSpec

class SolutionSpec extends FlatSpec {

  "Solution" should "return 1 for initial height of 1 and 0 cycles" in {
    assert(Solution.calculateHeight(1,0)==1);
  }

  "Solution" should "return 2 for initial height of 1 and 1 cycle" in {
    assert(Solution.calculateHeight(1,1)==2);
  }

  "Solution" should "return 7 for initial height of 1 and 4 cycle" in {
    assert(Solution.calculateHeight(1,4)==7);
  }
}
