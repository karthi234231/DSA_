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
}
