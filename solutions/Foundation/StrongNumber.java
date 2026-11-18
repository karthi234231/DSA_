package solutions.Foundation;

public class StrongNumber {
    // A strong number is a number such that the sum of the factorials of its digits
    // is equal to the number itself.
    public static boolean isStrongNumber(int n) {
        int originalNumber = n;
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            sum += Factorial.factorial(digit);
            n /= 10;
        }
        return sum == originalNumber;
    }

    public static void main(String[] args) {
        int number = 145; // Example number
        if (isStrongNumber(number)) {
            System.out.println(number + " is a strong number.");
        } else {
            System.out.println(number + " is not a strong number.");
        }
    }
}
