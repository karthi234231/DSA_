package solutions.Foundation;

public class Fibonacci {
    public static void Fibonacci_(int n) {
        // Time complexity = O(n); Space complexity = O(1)
        System.out.print("Fibonacci series up to " + n + ": ");
        int a = 0;
        int b = 1;
        while (a <= n) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }

    public static int FibonacciRecursive(int n) {
        // Time complexity = O(2^n); Space complexity = O(n) due to recursion stack
        if (n <= 1) {
            return n;
        }
        return FibonacciRecursive(n - 1) + FibonacciRecursive(n - 2);
    }

    public static void main(String[] args) {
        int n = 10; // Example number
        Fibonacci_(n);
        System.out.println("\nFibonacci of " + n + " (using recursion) is: " + FibonacciRecursive(n));
    }
}
