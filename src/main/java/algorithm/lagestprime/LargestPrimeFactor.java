package algorithm.lagestprime;

/**
 * The prime factors of 455 are 5, 7 and 13.
 * Write a method that calculates the largest prime factor of a given
 * number.
 */
public class LargestPrimeFactor {
    public static void main(String[] args) {
        int num = largestPrime(455);
        if (num == 0) {
            System.out.println("No prime number found");
        } else {
            System.out.println(num);
        }
    }

    public static int largestPrime(int n) {
        for (int i = n / 2; i > 2; i--) {
            if (n % i == 0) {
                if (isPrime(i)) {
                    return i;
                }
            }
        }
        return 0;
    }

    public static boolean isPrime(int n) {
        if (n == 4) {
            return false;
        }
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
