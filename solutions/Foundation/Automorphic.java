package solutions.Foundation;

public class Automorphic {
    // Function to check if a number is an Automorphic number
    // What is an Automorphic number? An Automorphic number is a number whose square
    // ends with the same digits as the number itself. For example, 5 is an
    // Automorphic number because 5^2 = 25, which ends with 5.
    public static boolean isAutomorphic(int number) {
        int square = square(number);
        String numStr = Integer.toString(number);
        String squareStr = Integer.toString(square);
        return squareStr.endsWith(numStr);
    }

    public static int square(int number) {
        return number * number;
    }

    // another way optimied version for square function
    public static int squareOptimized(int number) {
        return (int) Math.pow(number, 2);
    }

    public static int squareOptimizedBitwise(int number) {
        return (number << 1) + (number << 0); // Using bitwise left shift to calculate square
    }

    public static void main(String[] args) {
        int number = 7;
        if (isAutomorphic(number)) {
            System.out.println(number + " is an Automorphic number.");
        } else {
            System.out.println(number + " is not an Automorphic number.");
        }
    }
}
