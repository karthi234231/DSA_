
package solutions.Foundation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    // Brute force: test every pair of different indices.
    // Return the first matching pair of indices, or an empty array if none exists.
    // Time: O(n^2) | Extra space: O(1)
    public static int[] twoSum_(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }

        return new int[] {};
    }

    // HashMap approach: store each previously visited number and its index.
    // For current value x, look for target - x among earlier values.
    // Check before inserting the current value so one element is not used twice.
    // Time: O(n) average | Extra space: O(n)
    public static int[] twoSumOptimized(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            // Save the current value and its index for later iterations.
            map.put(nums[i], i);
        }

        return new int[] {};
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;

        int[] result = twoSumOptimized(nums, target);

        if (result.length == 2) {
            System.out.println("Index 1: " + result[0] + ", Index 2: " + result[1]);
            System.out.println("Values: " + nums[result[0]] + " + "
                    + nums[result[1]] + " = " + target);
        } else {
            System.out.println("No pair found.");
        }

        System.out.println("Brute force result: " + Arrays.toString(twoSum_(nums, target)));
    }
}
