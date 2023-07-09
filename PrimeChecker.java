import java.util.Scanner;

public class PrimeChecker {

  public static boolean isPrime(int num) {
    if (num <= 1) {
      return false;
    }

    for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        return false;
      }
    }

    return true;
  }

  public static void main(String[] args) {
    System.out.println("Check whether number is prime or not.");
    System.out.print("Enter any positive integer: ");
    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();

    if (isPrime(num)) {
      System.out.println(num + " is a prime number.");
    } else {
      System.out.println(num + " is not a prime number.");
    }

    sc.close();
  }
}
