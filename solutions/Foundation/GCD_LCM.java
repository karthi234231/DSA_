package solutions.Foundation;

public class GCD_LCM {
    public static int gcd(int a, int b) {

        // Time complexity = O(log(min(a, b))); Space complexity = O(1)
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;

        // trace the steps of the algorithm
        // in detail with condition and iteration
        // Step 1: a = 12, b = 18
        // Step 2: a = 18, b = 12 (temp = 18, b = 12)
        // Step 3: a = 12, b = 6 (temp = 12, b = 6)
        // Step 4: a = 6, b = 0 (temp = 6, b = 0)
        // Step 5: return a = 6

    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static int gcd_recursive(int a, int b) {
        // Time complexity = O(log(min(a, b))); Space complexity = O(1)
        if (b == 0) {
            return a;
        }
        return gcd_recursive(b, a % b);
    }

    public static int lcm_recursive(int a, int b) {
        return (a * b) / gcd_recursive(a, b);
    }

    public static void main(String[] args) {
        int a = 12, b = 18; // Example numbers
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd(a, b));
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm(a, b));
    }

}
