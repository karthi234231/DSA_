package solutions.Foundation;

public class TrailingZerosInNFac {

    public static int TrailingZeros(int n) {
        int result = 0;
        int five = 5;
        while (five <= n) {

            result += n / five;
            five = five * 5;
        }
        return result;
    }

    public static void main(String[] rgs) {
        int n = 125;
        System.out.println("Number of Trailing Zeros for " + n + " is " + TrailingZeros(n));
    }
}
