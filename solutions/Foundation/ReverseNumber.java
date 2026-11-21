package solutions.Foundation;

public class ReverseNumber {
    public static int reverse(int n) {
        int reversed = 0;
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return reversed;
    }

    public static int DigitSum(int n) {
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }
        return sum;
    }

    // Fast exponentiation (x^n in O(log n))
    // Explanation before code :
    // Fast exponentiation is an efficient algorithm to compute x raised to the
    // power n (x^n) in logarithmic time complexity O(log n).
    // The basic idea is to use the property of exponents that allows us to break
    // down the exponentiation process into smaller parts.
    // If n is even, we can express x^n as (x^(n/2))^2, which means we can compute
    // x^(n/2) and then square the result.
    // If n is odd, we can express x^n as x * (x^(n-1)), which means we can compute
    // x^(n-1) and then multiply the result by x.
    public static int fastExponentiation(int x, int n) {
        int result = 1;
        while (n > 0) {
            if (n % 2 == 0) {
                x = x * x;
                n = n / 2;
            } else {
                result = result * x;
                n = n - 1;
            }
        }
        return result;
    }

    public static int FindNthDigit(int n, int digitPosition) {
        int length = Integer.toString(n).length();
        int index = (digitPosition) % length;
        return Integer.parseInt(Integer.toString(n).charAt(index) + "");
    }

    // another way to find the nth digit of a number -> using recursion
    public static int FindNthDigitRecursion(int n, int index) {
        if (index == 0) {
            return n % 10;
        }
        return FindNthDigitRecursion(n / 10, index - 1);
    }

    // another way to find the nth digit of a number -> is using iteration
    public static int FindNthDigitIteration(int n, int index) {
        for (int i = 0; i < index; i++) {
            n /= 10;
        }
        return n % 10;
    }

    public static void main(String[] args) {
        int n = 12345;
        System.out.println("Reversed number: " + reverse(n));
        System.out.println("Digit sum: " + DigitSum(n));
        System.out.println("Fast exponentiation (2^10): " + fastExponentiation(2, 10));
        System.out.println("Find 3rd digit of " + n + ": " + FindNthDigit(n, 2));
        System.out.println("Find 3rd digit of " + n + " using recursion: " + FindNthDigitRecursion(n, 2));
        System.out.println("Find 3rd digit of " + n + " using iteration: " + FindNthDigitIteration(n, 2));
    }
}
