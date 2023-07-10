import java.util.ArrayList;

/**
 * A = { 2, 1, 6, 3, 5, 10 }
 * B = 2^A[0] + 2^A[1] + 2^A[2] + .....
 * Find which all positions have a set bit in B.
 *
 * How to solve if A contains number > 30, which means value of B is a very huge number
 * Hint: think BigInteger ?
 */

public class BitShiftProblem2 {

  public static void main(String[] args) {
    int[] nums = { 2, 1, 0, 3 };

    int sum = 0;

    for (int i = 0; i < nums.length; i++) {
      sum += 1 << nums[i]; // 1 << x = 2^x
    }
    // System.out.println(sum);
    ArrayList<Integer> pos = new ArrayList<>();

    int i = 0;

    while (sum > 0) {
      // System.out.println(sum & 1);
      if ((sum & 1) == 1) {
        pos.add(i);
      }
      sum = sum >> 1;
      i++;
    }

    System.out.println("Set positions are: " + pos);
  }
}
/**
 *
 * After running multiple test cases we can conclude that set positions
 * in B will always be array elements of A. (to prove this use BigInteger)
 *
 * */
