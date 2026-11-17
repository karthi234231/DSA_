
package solutions.Foundation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagram {

    // Sort both strings and compare the resulting character sequences.
    // Time: O(n log n) | Extra space: O(n)
    public static boolean isAnagram_SortCompare(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }

        char[] first = s.toCharArray();
        char[] second = t.toCharArray();

        Arrays.sort(first);
        Arrays.sort(second);

        return Arrays.equals(first, second);
    }

    // Count characters from s, then subtract characters from t.
    // At the end, every character count must be zero.
    // Time: O(n) average | Extra space: O(k), where k is distinct characters
    public static boolean isAnagram_HashMap(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> freq = new HashMap<>();

        for (char ch : s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        for (char ch : t.toCharArray()) {
            if (!freq.containsKey(ch)) {
                return false;
            }

            freq.put(ch, freq.get(ch) - 1);
        }

        for (int count : freq.values()) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    // Optimized HashMap version: stop as soon as a count becomes negative.
    // A negative count means t contains a character more times than s.
    // Time: O(n) average | Extra space: O(k)
    public static boolean isAnagram_HashMap_Optimized(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> freq = new HashMap<>();

        for (char ch : s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        for (char ch : t.toCharArray()) {
            Integer count = freq.get(ch);

            // null means this character does not occur in s.
            if (count == null) {
                return false;
            }

            int updatedCount = count - 1;
            if (updatedCount < 0) {
                return false;
            }

            freq.put(ch, updatedCount);
        }

        return true;
    }

    // Update both strings' counts in one indexed loop.
    // Positive counts come from s; negative counts come from t.
    // All counts must finish at zero.
    // Time: O(n) average | Extra space: O(k)
    public static boolean isAnagram_HashMap_SingleLoop(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> freq = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            freq.put(c1, freq.getOrDefault(c1, 0) + 1);
            freq.put(c2, freq.getOrDefault(c2, 0) - 1);
        }

        for (int count : freq.values()) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    // IMPORTANT: XOR alone cannot correctly determine whether two strings
    // are anagrams. Different character multisets can produce the same XOR.
    // This method keeps the requested method name but uses correct counting.
    // Supports all Java char values.
    // Time: O(n) | Extra space: O(1) because the array has a fixed size
    public static boolean isAnagram_Bitwise(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }

        int[] count = new int[Character.MAX_VALUE + 1];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
            count[t.charAt(i)]--;
        }

        for (int value : count) {
            if (value != 0) {
                return false;
            }
        }

        return true;
    }

    // Same correctness principle as the previous method, with the count
    // updates written as separate statements for clarity.
    // Time: O(n) | Extra space: O(1) fixed-size array
    public static boolean isAnagram_Bitwise_Optimized(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }

        int[] count = new int[Character.MAX_VALUE + 1];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
        }

        for (int i = 0; i < t.length(); i++) {
            count[t.charAt(i)]--;
        }

        for (int value : count) {
            if (value != 0) {
                return false;
            }
        }

        return true;
    }

    // Efficient single-loop frequency array for lowercase English letters.
    // Returns false for characters outside a-z rather than indexing incorrectly.
    // Time: O(n) | Extra space: O(1) (26 counters)
    public static boolean isAnagram_Bitwise_Optimized_SingleLoop(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (c1 < 'a' || c1 > 'z' || c2 < 'a' || c2 > 'z') {
                return false;
            }

            count[c1 - 'a']++;
            count[c2 - 'a']--;
        }

        for (int value : count) {
            if (value != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "silent";
        String t = "listen";

        System.out.println("Anagram (sort): " + isAnagram_SortCompare(s, t));
        System.out.println("Anagram (HashMap): " + isAnagram_HashMap(s, t));
        System.out.println("Anagram (HashMap optimized): " + isAnagram_HashMap_Optimized(s, t));
        System.out.println("Anagram (HashMap single loop): " + isAnagram_HashMap_SingleLoop(s, t));
        System.out.println("Anagram (count array): " + isAnagram_Bitwise(s, t));
        System.out.println("Anagram (count array optimized): " + isAnagram_Bitwise_Optimized(s, t));
        System.out.println("Anagram (26-count single loop): "
                + isAnagram_Bitwise_Optimized_SingleLoop(s, t));
    }
}
