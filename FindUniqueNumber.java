public class FindUniqueNumber {

  public static void main(String[] args) {
    int[] nums = { 4, 2, 1, 2, 1, 4, 5, 3, 5 };

    if (nums.length == 0) {
      System.out.println("Array is empty!");
      return;
    }
    /** Brute force 
    for (int i = 0; i < nums.length; i++) {
      boolean isUnique = true;
      for (int j = 0; j < nums.length; j++) {
        if (j != i && nums[i] == nums[j]) {
          isUnique = false;
        }
      }

      if (isUnique) {
        System.out.println("Unique Number: " + nums[i]);
      }
    }
    */
    int ans = nums[0];

    for (int i = 1; i < nums.length; i++) {
      ans = ans ^ nums[i];
    }

    System.out.println("Unique Number: " + ans);
  }
}
