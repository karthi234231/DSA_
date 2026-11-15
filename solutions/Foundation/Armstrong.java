package solutions.Foundation;

import java.util.Scanner;

public class Armstrong {
    // Function to check if a number is an Armstrong number
    // What is an Armstrong number? an Armstrong number is a number that is equal to
    // the sum of its own digits raised to the power of the number of digits. For
    // example, 153 is an Armstrong number because 1^3 + 5^3 + 3^3 = 153.
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;
        int numDigits = countDigits(number);
        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numDigits);
            number /= 10;
        }
        return sum == originalNumber;
    }

    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    // Time complexity = O(d * log10(n)); Space complexity = O(1)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
        scanner.close();
    }

}
