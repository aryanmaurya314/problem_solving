// import java.util.Arrays;

public class FindMissingNumber {

  public static void main(String[] args) {
    int[] nums = { 3, 2, 4, 1, 6 };

    if (nums.length == 0) {
      System.out.println("Array is empty!");
      return;
    }
    /** Brute force **
    Arrays.sort(nums);

    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i + 1] - nums[i] != 1) {
        System.out.println("Missing Number: " + (nums[i + 1] + nums[i]) / 2);
      }
    }
    */
    int ans = 0;

    for (int i = 0; i < nums.length; i++) {
      // XOR of array elements
      ans = ans ^ nums[i];
    }

    for (int i = 1; i <= nums.length + 1; i++) {
      // XOR of 1 --> N
      ans = ans ^ i;
    }

    /** Single Loop Approach **
    for (int i = 0; i < nums.length; i++) {
      // XOR of array elements
      ans = ans ^ nums[i];
      ans = ans ^ i + 1;
    }
    ans = ans ^ nums.length + 1;
     */
    System.out.println("Missing Number: " + ans);
  }
}
