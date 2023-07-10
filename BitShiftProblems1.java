import java.util.Scanner;

// Given a number N and position i, check if ith bit of N is 1 or 0.
public class BitShiftProblems1 {

  private static int findBitValue(int N, int i) {
    // right shift N to i times
    int newN = N >> i;
    // newN & 1 will return 0th bit which is ith bit after right shifting
    return newN & 1;
    // 2nd Aproach
    /*
    if ((N & (1 << i)) == 0) {
      return 0;
    } else {
      return 1;
    }
     */
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Number: ");
    int num = sc.nextInt();
    System.out.print("Enter ith position: ");
    int po = sc.nextInt();

    int bitValue = findBitValue(num, po);

    System.out.println(
      "Bit at " + po + "th position of " + num + " is " + bitValue
    );

    sc.close();
  }
}
