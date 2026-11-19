package solutions.Foundation;

public class HarshadNumber {
    // Function to check if a number is a Harshad number
    // What is a Harshad number? A Harshad number (or Niven number) is an integer
    // that is divisible by the sum of its digits. For example, 18 is a Harshad
    // number because 1 + 8 = 9 and 18 is divisible by 9.
    public static boolean isHarshad(int number) {
        int sumOfDigits = digitSum(number);
        return number % sumOfDigits == 0;
    }

    // Function to calculate the sum of digits of a number
    public static int digitSum(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
