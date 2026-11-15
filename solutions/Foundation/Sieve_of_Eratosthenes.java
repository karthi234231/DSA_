package solutions.Foundation;

import java.util.Scanner;

public class Sieve_of_Eratosthenes {
    // what is Sieve of Eratosthenes? The Sieve of Eratosthenes is an ancient
    // algorithm used to find all prime numbers up to a specified integer. It works
    // by iteratively marking the multiples of each prime number starting from 2,
    // the first prime number. The numbers which remain unmarked after all multiples
    // of each found prime are marked, are the prime numbers.
    public static void sieveOfEratosthenes(int n) {
        // use the package solutions.Foundation.Prime to check if a number is
        // prime or not

        for (int i = 2; i <= n; i++) {
            if (Prime.isPrimeOptimized_v2(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Prime numbers up to " + n + ":");
        sieveOfEratosthenes(n);
        sc.close();
    }
}
