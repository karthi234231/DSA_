package solutions.Foundation;

public class HappyNumber {
    // A happy number is a number which eventually reaches 1 when replaced by the
    // sum of the square of each digit. If it loops endlessly in a cycle that does
    // not include 1, then it is not a happy number.
    public static int sumOfSquares(int n) {
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }

    public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do {
            slow = sumOfSquares(slow); // Move slow pointer by 1 step
            fast = sumOfSquares(sumOfSquares(fast)); // Move fast pointer by 2 steps
        } while (slow != fast);
        return slow == 1; // If they meet at 1, it's a happy number
    }

    public static void main(String[] args) {
        int number = 19; // Example number
        if (isHappy(number)) {
            System.out.println(number + " is a happy number.");
        } else {
            System.out.println(number + " is not a happy number.");
        }
    }
}
