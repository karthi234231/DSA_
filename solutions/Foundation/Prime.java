package solutions.Foundation;

import java.util.Scanner;

public class Prime {
    public static boolean isPrime(int num) {
        // Time complexity = O(n); Space complexity = O(1)
        int count = 0;
        if (num <= 1) {
            return false;
        }
        if (num == 2 || num == 3) {
            return true;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return count == 0;
    }

    public static void optimized_isPrime(int num) {
        // Time complexity = O(sqrt(n)); Space complexity = O(1)
        // time complexity of optimized solution is O(sqrt(n)) because we are checking
        // for factors of the number only up to its square root. This is because if a
        // number n has a factor larger than its square root, then it must also have a
        // factor smaller than its square root. Therefore, we only need to check for
        // factors up to the square root of n.
        // but is is having the skip of 6k+1 wont it reduce the time complexity to
        // O(sqrt(n)/6) ? yes it will reduce the number of iterations but the time
        // complexity will still be O(sqrt(n)) because we drop the constant factor 1/6
        // in big O notation. The time complexity of an algorithm is expressed in terms
        // of the input size n, and constant factors are ignored because they do not
        // affect the growth rate of the function as n increases. Therefore, even though
        // we are reducing the number of iterations by a factor of 6, the time
        // complexity is still O(sqrt(n)).
        if (num <= 1) {
            System.out.println(num + " is not a prime number. optimized solution");
            return;
        }
        if (num <= 3) {
            System.out.println(num + " is a prime number. optimized solution");
            return;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            System.out.println(num + " is not a prime number. optimized solution");
            return;
        }
        for (int i = 5; i <= Math.sqrt(num); i += 6) {
            // Check for factors of the form 6k ± 1 -> why ? Because all primes greater than
            // 3 are of the form 6k ± 1
            if (num % i == 0 || num % (i + 2) == 0) { // why did we use i + 2 here? Because we are checking for factors
                                                      // of the form 6k ± 1, so we need to check for both i and i + 2.
                System.out.println(num + " is not a prime number. optimized solution");
                return;
            }
        }
        System.out.println(num + " is a prime number. optimized solution");
    }

    public static boolean isPrimeOptimized_v2(int num) {
        // Time complexity = O(sqrt(n)); Space complexity = O(1)
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num; i += 6) { // is it better than using Math.sqrt(num) in the for loop condition? yes
                                                // it is better because it avoids the overhead of computing the square
                                                // root of num in each iteration of the loop. Instead, we can simply
                                                // check if i * i is less than or equal to num, which is equivalent to
                                                // checking if i is less than or equal to the square root of num. This
                                                // can improve performance, especially for large values of num.
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (isPrime(num)) {
            System.out.println(num + " is a prime number. brute force solution");
        } else {
            System.out.println(num + " is not a prime number. brute force solution");
        }

        if (num <= 1) {
            System.out.println(num + " is not a prime number. optimized solution");
        } else {
            optimized_isPrime(num);
        }
        sc.close();
    }
}
