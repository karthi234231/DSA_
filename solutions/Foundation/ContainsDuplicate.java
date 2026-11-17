package solutions.Foundation;

import java.util.Arrays;
import java.util.BitSet;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ContainsDuplicate {

    // Brute force: compare every element with the elements after it.
    // Time: O(n^2) | Extra space: O(1)
    public static boolean containsDup(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            // Start at i + 1 so we do not compare an element with itself
            // or repeat comparisons that were already made.
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    // HashSet approach: add all values, then compare the set size with
    // the array length. A set stores each distinct value only once.
    // Time: O(n) average | Extra space: O(n)
    public static boolean containsDupOptimized(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        return set.size() != nums.length;
    }

    // Preferred version: return immediately when a value is seen again.
    // Set.add(value) returns false if that value was already in the set.
    // Time: O(n) average | Extra space: O(n)
    public static boolean containsDupOptimizedV2(int[] nums) {
        Set<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (!seen.add(num)) {
                return true;
            }
        }
        return false;
    }

    // Return every distinct number that occurs more than once.
    // Each duplicate number appears only once in the returned array.
    // LinkedHashMap preserves the order in which numbers first appear.
    // Time: O(n) average | Extra space: O(n)
    public static int[] duplicateNumbers(int[] nums) {
        Map<Integer, Integer> freq = new LinkedHashMap<>();

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        List<Integer> duplicates = freq.entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        return duplicates.stream().mapToInt(Integer::intValue).toArray();
    }

    // BitSet-based version. BitSet represents non-negative integers as bits:
    // bit n is set if number n has already appeared.
    // This method accepts only non-negative values.
    // Time: O(n + maxValue / wordSize) in the worst case | Extra space: depends on
    // max value
    public static int[] duplicateNumbers_bitwise(int[] nums) {
        BitSet seen = new BitSet();
        Set<Integer> duplicates = new LinkedHashSet<>();

        for (int num : nums) {
            if (num < 0) {
                throw new IllegalArgumentException(
                        "duplicateNumbers_bitwise accepts only non-negative integers.");
            }

            if (seen.get(num)) {
                duplicates.add(num);
            } else {
                seen.set(num);
            }
        }

        return duplicates.stream().mapToInt(Integer::intValue).toArray();
    }

    // Print distinct duplicate values using two sets.
    // seen tracks every value encountered; duplicates stores repeated values.
    // Time: O(n) average | Extra space: O(n)
    public static void printDuplicates(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new LinkedHashSet<>();

        for (int num : nums) {
            // Set.add returns true when the value is new, false when it exists.
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        System.out.println("Duplicates: " + duplicates);
    }

    // Sort a copy, then equal values will be next to each other.
    // A copy is used so the caller's original array is not changed.
    // Time: O(n log n) | Extra space: O(n) for the copy
    public static void printDuplicatesAfterSorting(int[] nums) {
        int[] sorted = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sorted);

        boolean foundDuplicate = false;

        for (int i = 1; i < sorted.length; i++) {
            if (sorted[i] == sorted[i - 1]
                    && (i == 1 || sorted[i] != sorted[i - 2])) {
                System.out.println("Duplicate: " + sorted[i]);
                foundDuplicate = true;
            }
        }

        if (!foundDuplicate) {
            System.out.println("No duplicates found.");
        }
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 2, 6, 7, 3 };

        boolean result = containsDupOptimizedV2(nums);
        System.out.println("Contains Duplicate: " + result);

        int[] duplicates = duplicateNumbers(nums);
        System.out.println("Duplicate Numbers: " + Arrays.toString(duplicates));

        int[] duplicateBits = duplicateNumbers_bitwise(nums);
        System.out.println("Duplicate Numbers (BitSet): " + Arrays.toString(duplicateBits));

        printDuplicates(nums);
        printDuplicatesAfterSorting(nums);
    }
}
