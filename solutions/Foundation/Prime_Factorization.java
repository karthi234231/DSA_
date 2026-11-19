package solutions.Foundation;

public class Prime_Factorization {
    // what is an prime factorization? Prime factorization is the process of finding
    // the prime numbers that multiply together to give a specific integer. For
    // example, the prime factorization of 12 is 2^2 * 3^1, since 2 and 3 are prime
    // numbers and 2 * 2 * 3 = 12.
    public static void pfactors(int n) {

        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n /= 2;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }

        if (n > 2)
            System.out.print(n);
    }
}
