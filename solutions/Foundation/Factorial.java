package solutions.Foundation;

public class Factorial {
    public static long factorial(int n) {
        // Time complexity = O(n); Space complexity = O(1)
        int result = 1;
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Time complexity = O(n); Space complexity = O(n)
    public static long factorialRecursive(int n) {
        // Time complexity = O(n); Space complexity = O(n)
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }

    public static void main(String[] args) {
        int n = 5; // Example number
        long fact = factorial(n);
        System.out.println("Factorial of " + n + " is: " + fact);
        long factRecursive = factorialRecursive(n);
        System.out.println("Factorial of " + n + " (using recursion) is: " + factRecursive);
    }
}
