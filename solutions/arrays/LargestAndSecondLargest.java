package solutions.arrays;

public class LargestAndSecondLargest {

    // Method 1: Find the largest element
    public static int Largest(int[] arr) {
        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        return largest;
    }

    // Method 2: Find the second largest distinct element
    public static int SecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;
    }

    public static void main(String[] args) {

        int[] arr = { 10, 5, 20, 8, 20, 15 };

        System.out.println("Largest: " + Largest(arr));
        System.out.println("Second Largest: " + SecondLargest(arr));
    }
}