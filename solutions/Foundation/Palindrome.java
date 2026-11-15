//brute force of palindrome
package solutions.Foundation;

import java.util.Scanner;

class palindrome {
    int num = 121;

    public static void bruteforce_palindrome(int num) {
        String str = Integer.toString(num);
        String revStr = new StringBuilder(str).reverse().toString();
        if (str.equals(revStr)) {
            System.out.println(num + " is a palindrome");
        } else {
            System.out.println(num + " is not a palindrome");
        }
    }

    public static void optimized_palindrome(int num) {
        int originalNum = num;
        int temp = originalNum;
        int reversedNum = 0;
        if (num < 0) {
            System.out.println(num + " is not a palindrome");
            return;
        }
        while (temp != 0) {
            int digit = temp % 10;
            reversedNum = reversedNum * 10 + digit;
            temp /= 10;
        }
        if (originalNum == reversedNum) { // why did we use == rather than .equals() even when we are comparingthe
                                          // values of two integers? it is because the == operator compares the values
                                          // of primitive data types (like int), while .equals() is used for comparing
                                          // objects. In this case, originalNum and reversedNum are both primitive int
                                          // types, so we use == to compare their values.
            System.out.println(originalNum + " is a palindrome");
        } else {
            System.out.println(originalNum + " is not a palindrome");
        }
    } // the complexity of the optimized solution is O(log10(n)) because we are
      // dividing the number by 10 in each iteration of the while loop, which reduces
      // the number of digits in the number. The number of digits in a number n is
      // proportional to log10(n), so the time complexity is O(log10(n)).

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        bruteforce_palindrome(num);
        optimized_palindrome(num);
        sc.close();
    }
}