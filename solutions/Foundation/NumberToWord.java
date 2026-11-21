package solutions.Foundation;

public class NumberToWord {

    private static final String[] ONES = {
            "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"
    };

    private static final String[] TEENS = {
            "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen",
            "sixteen", "seventeen", " eighteen", "nineteen"
    };

    private static final String[] TENS = {
            "", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
    };

    public static String numberToWord_(int number) {
        if (number == 0) {
            return "zero";
        }
        return convertLessThanThousand(number);
    }

    private static String convertLessThanThousand(int num) {
        if (num == 0) {
            return "";
        }

        StringBuilder result = new StringBuilder();

        int hundreds = num / 100;
        int remainder = num % 100;

        if (hundreds > 0) {
            result.append(ONES[hundreds]).append(" hundred");
            if (remainder > 0) {
                result.append(" ");
            }
        }

        if (remainder > 0) {
            if (remainder < 10) {
                result.append(ONES[remainder]);
            } else if (remainder < 20) {
                result.append(TEENS[remainder - 10]);
            } else {
                int ten = remainder / 10;
                int one = remainder % 10;
                result.append(TENS[ten]);
                if (one > 0) {
                    result.append("-").append(ONES[one]);
                }
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        int number = 123;
        String wordRepresentation = numberToWord_(number);
        System.out.println("The word representation of " + number + " is: " + wordRepresentation);
    }
}
