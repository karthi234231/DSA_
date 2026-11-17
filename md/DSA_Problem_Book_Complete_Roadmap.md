# DSA PROBLEM BOOK — COMPLETE ROADMAP

**Difficulty:** E = Easy, M = Medium, H = Hard. **★ = core / must-do.** Original difficulty and star labels are preserved.



## 1. FOUNDATIONS & MATH

### 1. Palindrome Number (E)


**Problem:** Given an integer `x`, determine whether it reads the same forward and backward. Negative numbers are not palindromes. Do not convert the integer to a string for the optimal approach.

**Input:** `x = 121`  
**Output:** `true`

**Input:** `x = -121`  
**Output:** `false`

**Target:** O(log₁₀ n) time, O(1) space.  
**Pattern:** Reverse half of the digits and compare; integer digit extraction.

### 2. Reverse Integer (M)


**Problem:** Given a signed 32-bit integer `x`, reverse its decimal digits. Return `0` if the reversed value overflows the signed 32-bit integer range.

**Input:** `x = 123`  
**Output:** `321`

**Input:** `x = -120`  
**Output:** `-21`

**Target:** O(log₁₀ |x|) time, O(1) space.  
**Pattern:** Digit extraction and reconstruction; overflow checking before multiplication and addition.

### 3. Plus One (E)


**Problem:** An array of digits represents a non-negative integer, with the most significant digit first. Add one and return the resulting digit array. The input has no leading zeroes, except for the number zero itself.

**Input:** `digits = [1,2,3]`  
**Output:** `[1,2,4]`

**Input:** `digits = [9,9,9]`  
**Output:** `[1,0,0,0]`

**Target:** O(n) time, O(n) space for the returned array; O(1) auxiliary space when no new array is needed.  
**Pattern:** Array traversal from right to left; carry propagation.

### 4. Happy Number (E)


**Problem:** Starting with a positive integer, repeatedly replace it with the sum of the squares of its digits. Return `true` if the process eventually reaches `1`; otherwise, return `false` because the sequence enters a cycle.

**Input:** `n = 19`  
**Output:** `true`  
**Explanation:** `19 → 82 → 68 → 100 → 1`.

**Input:** `n = 2`  
**Output:** `false`

**Target:** O(log n) time per transformation; O(1) space with Floyd's cycle detection.  
**Pattern:** Digit processing; cycle detection using a hash set or slow/fast pointers.

### 5. Armstrong / Perfect / Strong number checks (E, one sitting)


**Problem:** Implement three independent number checks:
- Armstrong number: a number equal to the sum of each digit raised to the number of digits.
- Perfect number: a positive integer equal to the sum of its positive proper divisors.
- Strong number: a number equal to the sum of the factorials of its digits.

**Input:** `n = 153` (Armstrong check)  
**Output:** `true`

**Input:** `n = 28` (Perfect-number check)  
**Output:** `true`

**Input:** `n = 145` (Strong-number check)  
**Output:** `true`

**Target:** Armstrong and Strong: O(d) time for a fixed small digit range, where `d` is the number of digits; Perfect: O(√n) time. O(1) auxiliary space.  
**Pattern:** Digit decomposition; divisor enumeration in symmetric pairs; precomputed factorials for digits.

### 6. Check Prime, optimized to sqrt(n) (E)

**Problem:** Determine whether prime, optimized to sqrt(n) holds for the supplied input and return a boolean result. The input is one or more integers (and, where relevant, an array of integers). Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(E log V) time, O(V+E) space.
**Pattern:** Minimum spanning tree using Prim with a heap or Kruskal with DSU.

### 7. Count Primes, Sieve (M★)

**Problem:** Count the number of primes, sieve cases that satisfy the standard problem conditions. The input is one or more integers (and, where relevant, an array of integers). Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(E log V) time, O(V+E) space.
**Pattern:** Minimum spanning tree using Prim with a heap or Kruskal with DSU.

### 8. Prime Factorization using smallest prime factor sieve (M)


**Problem:** Precompute the smallest prime factor (SPF) for every integer up to a limit. For each query `n`, return its prime factorization, including repeated factors.

**Input:** `n = 84`  
**Output:** `[2,2,3,7]`

**Input:** `n = 13`  
**Output:** `[13]`

**Target:** Preprocessing O(N log log N) time and O(N) space; each factorization O(log n) time in the number of extracted prime factors.  
**Pattern:** Sieve preprocessing; repeated division by the smallest prime factor.

### 9. GCD / LCM, Euclid (E★)

**Problem:** Solve the standard interview formulation of GCD / LCM, Euclid: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is one or more integers (and, where relevant, an array of integers). Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(√n) or O(log n), depending on the operation time, O(1) unless a sieve/table is required space.
**Pattern:** Number theory, digit decomposition, arithmetic invariants or fast exponentiation.

### 10. GCD and LCM of an array (E)


**Problem:** Given an array of integers, compute the GCD and LCM of all its elements. Assume the array is non-empty and values are non-negative.

**Input:** `arr = [2,4,6,8]`  
**Output:** `GCD = 2, LCM = 24`

**Input:** `arr = [5,10,15]`  
**Output:** `GCD = 5, LCM = 30`

**Target:** O(n log M) time, O(1) auxiliary space, where `M` is the maximum value.  
**Pattern:** Fold/reduce using pairwise GCD and LCM.

### 11. Pow(x, n) (M★)


**Problem:** Implement `x` raised to the integer power `n` without using a built-in power function. Support negative exponents and the minimum 32-bit integer exponent.

**Input:** `x = 2.0, n = 10`  
**Output:** `1024.0`

**Input:** `x = 2.0, n = -2`  
**Output:** `0.25`

**Target:** O(log |n|) time, O(1) space for iterative implementation.  
**Pattern:** Binary exponentiation / exponentiation by squaring; careful handling of negative exponent and integer overflow when taking the absolute value of `n`.

### 12. Factorial Trailing Zeroes (M)


**Problem:** Given a non-negative integer `n`, return the number of trailing zeroes in `n!`.

**Input:** `n = 5`  
**Output:** `1`

**Input:** `n = 25`  
**Output:** `6`

**Target:** O(log₅ n) time, O(1) space.  
**Pattern:** Count factors of `5` using `⌊n/5⌋ + ⌊n/25⌋ + ...`.

### 13. Fibonacci, iterative + memo (E)

**Problem:** Solve the standard interview formulation of Fibonacci, iterative + memo: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is one or more integers (and, where relevant, an array of integers). Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(√n) or O(log n), depending on the operation time, O(1) unless a sieve/table is required space.
**Pattern:** Number theory, digit decomposition, arithmetic invariants or fast exponentiation.

### 14. Sqrt(x) without built-ins (E)


**Problem:** Given a non-negative integer `x`, return the integer square root of `x`, i.e. the greatest integer `r` such that `r² ≤ x`.

**Input:** `x = 8`  
**Output:** `2`

**Input:** `x = 16`  
**Output:** `4`

**Target:** O(log x) time, O(1) space using binary search.  
**Pattern:** Binary search on the answer; use division or a wider numeric type to avoid overflow in `mid × mid`.

### 15. Decimal to Binary / Binary to Decimal / Hex conversions (E)


**Problem:** Implement conversions between non-negative decimal integers and binary/hexadecimal representations without relying on built-in base-conversion methods. Validate that input digits are legal for the supplied base.

**Input:** `decimal = 13`  
**Output:** `binary = "1101", hexadecimal = "D"`

**Input:** `binary = "1010"`  
**Output:** `decimal = 10`

**Target:** O(log n) time and O(log n) output space for conversion of an integer with `n`-scale magnitude.  
**Pattern:** Repeated division and remainders for encoding; positional-value accumulation for decoding.

### 16. Excel Sheet Column Number / Title (E/M)


**Problem:** Implement both conversions: map an Excel column title (`A` to `Z`, `AA`, ...) to its 1-based column number, and map a positive column number back to its title.

**Input:** `columnTitle = "AB"`  
**Output:** `28`

**Input:** `columnNumber = 701`  
**Output:** `"ZY"`

**Target:** O(log₂₆ n) time, O(log₂₆ n) space for the output.  
**Pattern:** Base-26 positional conversion with digits `1` through `26` rather than `0` through `25`; adjust by one during reverse conversion.

### 17. Multiply Strings (M)


**Problem:** Given two non-negative integers represented as decimal strings, return their product as a decimal string. Do not convert either input to a built-in integer type or use a big-integer library.

**Input:** `num1 = "123", num2 = "456"`  
**Output:** `"56088"`

**Input:** `num1 = "0", num2 = "52"`  
**Output:** `"0"`

**Target:** O(mn) time, O(m+n) space, where `m` and `n` are the input lengths.  
**Pattern:** Grade-school multiplication; digit-position accumulation and carry propagation.

### 18. Add Strings (E)


**Problem:** Given two non-negative integers represented as decimal strings, return their sum as a decimal string. Do not convert the inputs to built-in integer types.

**Input:** `num1 = "11", num2 = "123"`  
**Output:** `"134"`

**Input:** `num1 = "999", num2 = "1"`  
**Output:** `"1000"`

**Target:** O(max(m,n)) time, O(max(m,n)) output space.  
**Pattern:** Two pointers from the end; digit addition and carry handling.

### 19. Roman to Integer (E)


**Problem:** Convert a valid Roman numeral into an integer. The symbols are `I, V, X, L, C, D, M`; account for subtractive pairs such as `IV` and `CM`.

**Input:** `s = "MCMXCIV"`  
**Output:** `1994`

**Input:** `s = "LVIII"`  
**Output:** `58`

**Target:** O(n) time, O(1) space.  
**Pattern:** Symbol-to-value mapping; compare each symbol with the next symbol to detect subtraction.

### 20. Integer to Roman (M)


**Problem:** Convert an integer in the range `1` to `3999` into its Roman numeral representation, using the standard subtractive forms (`IV`, `IX`, `XL`, `XC`, `CD`, `CM`).

**Input:** `num = 3749`  
**Output:** `"MMMDCCXLIX"`

**Input:** `num = 58`  
**Output:** `"LVIII"`

**Target:** O(1) time and O(1) output space under the fixed range 1–3999; more generally O(k), where `k` is the output length.  
**Pattern:** Greedy value-symbol mapping in descending order, including subtractive values.

### 21. Count Digits / Sum of Digits / Reverse digits (E, warm-up)


**Problem:** For a given integer, implement three operations: count its decimal digits, calculate the sum of its digits, and reverse its digits. Treat zero as having one digit; preserve the sign when reversing a negative integer. State and enforce an overflow policy for reversal.

**Input:** `n = 2048`  
**Output:** `digitCount = 4, digitSum = 14, reversed = 8402`

**Input:** `n = -120`  
**Output:** `digitCount = 3, digitSum = 3, reversed = -21`

**Target:** O(d) time, O(1) auxiliary space, where `d` is the number of digits.  
**Pattern:** Modulo and integer division; repeated digit extraction.

### 22. Find all divisors in O(sqrt n) (E)

**Problem:** Find and return all divisors in o(sqrt n) from the supplied input; return the required sentinel/empty result when it does not exist. The input is one or more integers (and, where relevant, an array of integers). Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(√n) or O(log n), depending on the operation time, O(1) unless a sieve/table is required space.
**Pattern:** Number theory, digit decomposition, arithmetic invariants or fast exponentiation.

### 23. Pascal's Triangle (E)


**Problem:** Given a non-negative number of rows, generate Pascal's Triangle. Each row starts and ends with `1`; every interior value is the sum of the two values directly above it.

**Input:** `numRows = 5`  
**Output:** `[[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]`

**Input:** `numRows = 1`  
**Output:** `[[1]]`

**Target:** O(r²) time and O(r²) space for the returned triangle, where `r` is the number of rows.  
**Pattern:** Row-by-row construction; dynamic programming from the previous row.

### 24. Pascal's Triangle II (E)


**Problem:** Given a zero-indexed row number `rowIndex`, return only that row of Pascal's Triangle.

**Input:** `rowIndex = 3`  
**Output:** `[1,3,3,1]`

**Input:** `rowIndex = 0`  
**Output:** `[1]`

**Target:** O(r²) time and O(r) space using in-place row updates, where `r = rowIndex`.  
**Pattern:** One-dimensional dynamic programming; update from right to left so previous-row values are not overwritten too early.

### 25. Rotate / Spiral / Diamond pattern printing (E, one sitting only)


**Problem:** Practise console pattern generation in one sitting. Implement: (1) a square pattern rotated by 90 degrees, (2) an `n × n` spiral number pattern, and (3) a centered diamond made of `*` characters. Use loops and avoid hard-coded output.

**Input:** `n = 3` (diamond)  
**Output:**
```text
  *
 ***
*****
 ***
  *
```

**Input:** `n = 3` (spiral)
**Output:** A 3 × 3 matrix containing `1` through `9` in clockwise spiral order.

**Target:** O(n²) time and O(n²) space for matrix-based patterns; O(n²) time and O(1) auxiliary space for direct character printing, excluding output.  
**Pattern:** Nested loops; row/column boundary control; coordinate transformations.

---

## Batch 1 Completion Checklist

- [ ] Solve every problem without looking at the solution.
- [ ] Write the time and space complexity from memory.
- [ ] Re-solve each ★ problem after 3 days and 14 days.
- [ ] Record the pattern, key trick, and mistake for every problem.

## 2. ARRAYS

### 26. Largest Element in Array (E)

**Problem:** Given an integer array, return its greatest element.

**Input:** `arr = [2, 8, 1, 5]`
**Output:** `8`

**Target:** O(n) time, O(1) space.
**Pattern:** Single-pass maximum tracking.

### 27. Second Largest Element (E)

**Problem:** Return the second distinct-largest value in the array; report that it does not exist when fewer than two distinct values are present.

**Input:** `arr = [12, 35, 1, 10, 34, 1]`
**Output:** `34`

**Target:** O(n) time, O(1) space.
**Pattern:** Track largest and second-largest distinct values in one pass.

### 28. Check if Array is Sorted and Rotated (E)

**Problem:** Determine whether the array is non-decreasing and can be made sorted by rotating it.

**Input:** `nums = [3, 4, 5, 1, 2]`
**Output:** `true`

**Target:** O(n) time, O(1) space.
**Pattern:** Count descents, including the wraparound boundary.

### 29. Remove Duplicates from Sorted Array (E★)

**Problem:** Modify a sorted array in place so each distinct value appears once; return the new logical length.

**Input:** `nums = [1, 1, 2]`
**Output:** `length = 2; prefix = [1, 2]`

**Target:** O(n) time, O(1) space.
**Pattern:** Slow/fast pointers; overwrite the next unique slot.

### 30. Remove Duplicates from Sorted Array II (M)

**Problem:** Modify a sorted array in place so each value appears at most twice; return the new logical length.

**Input:** `nums = [1, 1, 1, 2, 2, 3]`
**Output:** `length = 5; prefix = [1, 1, 2, 2, 3]`

**Target:** O(n) time, O(1) space.
**Pattern:** Write pointer with a k-occurrence invariant.

### 31. Remove Element (E)

**Problem:** Remove all occurrences of a given value in place and return the remaining length.

**Input:** `nums = [3, 2, 2, 3], val = 3`
**Output:** `length = 2; prefix = [2, 2]`

**Target:** O(n) time, O(1) space.
**Pattern:** In-place two pointers.

### 32. Move Zeroes (E★)

**Problem:** Move all zeroes to the end while preserving the relative order of non-zero elements.

**Input:** `nums = [0, 1, 0, 3, 12]`
**Output:** `[1, 3, 12, 0, 0]`

**Target:** O(n) time, O(1) space.
**Pattern:** Stable compaction with a write pointer.

### 33. Rotate Array (M★)

**Problem:** Rotate an array to the right by k positions, handling k greater than the array length.

**Input:** `nums = [1, 2, 3, 4, 5, 6, 7], k = 3`
**Output:** `[5, 6, 7, 1, 2, 3, 4]`

**Target:** O(n) time, O(1) space.
**Pattern:** Normalize k; triple-reversal or cyclic replacement.

### 34. Merge Sorted Array (E★)

**Problem:** Merge two sorted arrays into the first array, which has enough trailing capacity for the second.

**Input:** `nums1 = [1, 2, 3, 0, 0, 0], m = 3; nums2 = [2, 5, 6], n = 3`
**Output:** `[1, 2, 2, 3, 5, 6]`

**Target:** O(m+n) time, O(1) space.
**Pattern:** Three pointers from the end.

### 35. Missing Number (E★)

**Problem:** Given n distinct values from the range [0,n], return the missing value.

**Input:** `nums = [3, 0, 1]`
**Output:** `2`

**Target:** O(n) time, O(1) space.
**Pattern:** Arithmetic sum or XOR.

### 36. Find All Numbers Disappeared in an Array (E)

**Problem:** Find and return all numbers disappeared in an array from the supplied input; return the required sentinel/empty result when it does not exist. The input is an integer array and any parameters named in the task. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(n); O(n log n) when sorting is required time, O(1) auxiliary for in-place methods; otherwise O(n) space.
**Pattern:** Array traversal, in-place mutation, prefix/suffix state or greedy scanning.

### 37. Find the Duplicate Number (M★)

**Problem:** Given n+1 integers in [1,n], find the repeated value without modifying the array and using constant extra space.

**Input:** `nums = [1, 3, 4, 2, 2]`
**Output:** `2`

**Target:** O(n) time, O(1) space.
**Pattern:** Floyd cycle detection on index-linked values; binary-search counting is an alternative.

### 38. Find All Duplicates in an Array (M)

**Problem:** Find and return all duplicates in an array from the supplied input; return the required sentinel/empty result when it does not exist. The input is an integer array and any parameters named in the task. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(n); O(n log n) when sorting is required time, O(1) auxiliary for in-place methods; otherwise O(n) space.
**Pattern:** Array traversal, in-place mutation, prefix/suffix state or greedy scanning.

### 39. Set Mismatch (E)

**Problem:** Solve the standard interview formulation of Set Mismatch: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an integer array and any parameters named in the task. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(n); O(n log n) when sorting is required time, O(1) auxiliary for in-place methods; otherwise O(n) space.
**Pattern:** Array traversal, in-place mutation, prefix/suffix state or greedy scanning.

### 40. First Missing Positive (H★)

**Problem:** Return the smallest positive integer absent from an unsorted integer array.

**Input:** `nums = [3, 4, -1, 1]`
**Output:** `2`

**Target:** O(n) time, O(1) space.
**Pattern:** Index placement / cyclic sort.

### 41. Max Consecutive Ones (E)

**Problem:** Return the maximum number of consecutive 1s in a binary array.

**Input:** `nums = [1, 1, 0, 1, 1, 1]`
**Output:** `3`

**Target:** O(n) time, O(1) space.
**Pattern:** Linear run counting.

### 42. Single Number (E★)

**Problem:** Every value appears twice except one; return the value that appears once.

**Input:** `nums = [4, 1, 2, 1, 2]`
**Output:** `4`

**Target:** O(n) time, O(1) space.
**Pattern:** XOR cancellation.

### 43. Majority Element (E★)

**Problem:** Return the value occurring more than n/2 times; assume such a value exists.

**Input:** `nums = [2, 2, 1, 1, 1, 2, 2]`
**Output:** `2`

**Target:** O(n) time, O(1) space.
**Pattern:** Boyer–Moore majority vote.

### 44. Majority Element II (M)

**Problem:** Solve the standard interview formulation of Majority Element II: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an integer array and any parameters named in the task. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(n); O(n log n) when sorting is required time, O(1) auxiliary for in-place methods; otherwise O(n) space.
**Pattern:** Array traversal, in-place mutation, prefix/suffix state or greedy scanning.

### 45. Best Time to Buy and Sell Stock (E★)

**Problem:** Choose one buy day and a later sell day; return the maximum profit, or zero when no profitable trade exists.

**Input:** `prices = [7, 1, 5, 3, 6, 4]`
**Output:** `5`

**Target:** O(n) time, O(1) space.
**Pattern:** Track minimum price so far and best difference.

### 46. Maximum Subarray / Kadane (M★)

**Problem:** Return the largest sum of any non-empty contiguous subarray.

**Input:** `nums = [-2, 1, -3, 4, -1, 2, 1, -5, 4]`
**Output:** `6`

**Target:** O(n) time, O(1) space.
**Pattern:** Kadane: best subarray ending here versus restart here.

### 47. Print the subarray with max sum (M)

**Problem:** Solve the standard interview formulation of Print the subarray with max sum: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an integer array and any parameters named in the task. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(n); O(n log n) when sorting is required time, O(1) auxiliary for in-place methods; otherwise O(n) space.
**Pattern:** Array traversal, in-place mutation, prefix/suffix state or greedy scanning.

### 48. Maximum Product Subarray (M★)

**Problem:** Return the largest product of a non-empty contiguous subarray.

**Input:** `nums = [2, 3, -2, 4]`
**Output:** `6`

**Target:** O(n) time, O(1) space.
**Pattern:** Track both maximum and minimum ending products.

### 49. Maximum Sum Circular Subarray (M)

**Problem:** Find the maximum possible sum circular subarray over the allowed choices in the input. The input is an integer array and any parameters named in the task. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(n); O(n log n) when sorting is required time, O(1) auxiliary for in-place methods; otherwise O(n) space.
**Pattern:** Array traversal, in-place mutation, prefix/suffix state or greedy scanning.

### 50. Rearrange Array Elements by Sign (M)

**Problem:** Solve the standard interview formulation of Rearrange Array Elements by Sign: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an integer array and any parameters named in the task. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(n); O(n log n) when sorting is required time, O(1) auxiliary for in-place methods; otherwise O(n) space.
**Pattern:** Array traversal, in-place mutation, prefix/suffix state or greedy scanning.

### 51. Next Permutation (M★)

**Problem:** Rearrange the array into its next lexicographically greater permutation; wrap to the smallest permutation if none exists.

**Input:** `nums = [1, 2, 3]`
**Output:** `[1, 3, 2]`

**Target:** O(n) time, O(1) space.
**Pattern:** Find pivot, swap with successor, reverse suffix.

### 52. Leaders in an Array (E)

**Problem:** Solve the standard interview formulation of Leaders in an Array: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an integer array and any parameters named in the task. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(n); O(n log n) when sorting is required time, O(1) auxiliary for in-place methods; otherwise O(n) space.
**Pattern:** Array traversal, in-place mutation, prefix/suffix state or greedy scanning.

### 53. Sort Colors / Dutch National Flag (M★)

**Problem:** Sort an array containing only 0, 1 and 2 in place without using a general-purpose sort.

**Input:** `nums = [2, 0, 2, 1, 1, 0]`
**Output:** `[0, 0, 1, 1, 2, 2]`

**Target:** O(n) time, O(1) space.
**Pattern:** Three-way partition with low, mid and high pointers.

### 54. Product of Array Except Self (M★)

**Problem:** For each index, return the product of every other array element, without division.

**Input:** `nums = [1, 2, 3, 4]`
**Output:** `[24, 12, 8, 6]`

**Target:** O(n) time, O(1) auxiliary, excluding output space.
**Pattern:** Prefix products followed by a suffix-product pass.

### 55. Equilibrium / Pivot Index (E)

**Problem:** Solve the standard interview formulation of Equilibrium / Pivot Index: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an integer array and any parameters named in the task. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(n); O(n log n) when sorting is required time, O(1) auxiliary for in-place methods; otherwise O(n) space.
**Pattern:** Array traversal, in-place mutation, prefix/suffix state or greedy scanning.

### 56. Maximum Difference Between Increasing Elements (E)

**Problem:** Find the maximum possible difference between increasing elements over the allowed choices in the input. The input is an integer array and any parameters named in the task. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(n); O(n log n) when sorting is required time, O(1) auxiliary for in-place methods; otherwise O(n) space.
**Pattern:** Array traversal, in-place mutation, prefix/suffix state or greedy scanning.

### 57. Container With Most Water (M★)

**Problem:** Choose two vertical lines that form a container holding the maximum possible water.

**Input:** `height = [1, 8, 6, 2, 5, 4, 8, 3, 7]`
**Output:** `49`

**Target:** O(n) time, O(1) space.
**Pattern:** Two pointers; move the shorter boundary.

### 58. Trapping Rain Water (H★)

**Problem:** Given bar heights, calculate how much rainwater can be trapped between them.

**Input:** `height = [4, 2, 0, 3, 2, 5]`
**Output:** `9`

**Target:** O(n) time, O(1) space.
**Pattern:** Two pointers with left/right maximums; prefix/suffix or monotonic stack alternatives.

### 59. Set Matrix Zeroes (M★)

**Problem:** If a matrix cell is zero, set its entire row and column to zero in place.

**Input:** `matrix = [[1,1,1],[1,0,1],[1,1,1]]`
**Output:** `[[1,0,1],[0,0,0],[1,0,1]]`

**Target:** O(mn) time, O(1) auxiliary space.
**Pattern:** Use first row and column as marker storage.

### 60. Spiral Matrix (M★)

**Problem:** Return all matrix elements in clockwise spiral order.

**Input:** `matrix = [[1,2,3],[4,5,6],[7,8,9]]`
**Output:** `[1,2,3,6,9,8,7,4,5]`

**Target:** O(mn) time, O(1) auxiliary, excluding output space.
**Pattern:** Maintain top, bottom, left and right boundaries.

### 61. Spiral Matrix II (M)

**Problem:** Solve the standard interview formulation of Spiral Matrix II: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an integer array and any parameters named in the task. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(n); O(n log n) when sorting is required time, O(1) auxiliary for in-place methods; otherwise O(n) space.
**Pattern:** Array traversal, in-place mutation, prefix/suffix state or greedy scanning.

### 62. Rotate Image (M★)

**Problem:** Rotate an n×n matrix 90 degrees clockwise in place.

**Input:** `matrix = [[1,2,3],[4,5,6],[7,8,9]]`
**Output:** `[[7,4,1],[8,5,2],[9,6,3]]`

**Target:** O(n²) time, O(1) space.
**Pattern:** Transpose, then reverse each row.

### 63. Transpose Matrix (E)

**Problem:** Solve the standard interview formulation of Transpose Matrix: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an integer array and any parameters named in the task. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(n); O(n log n) when sorting is required time, O(1) auxiliary for in-place methods; otherwise O(n) space.
**Pattern:** Array traversal, in-place mutation, prefix/suffix state or greedy scanning.

### 64. Diagonal Traverse (M)

**Problem:** Solve the standard interview formulation of Diagonal Traverse: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an integer array and any parameters named in the task. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(n); O(n log n) when sorting is required time, O(1) auxiliary for in-place methods; otherwise O(n) space.
**Pattern:** Array traversal, in-place mutation, prefix/suffix state or greedy scanning.

### 65. Search a 2D Matrix (M★)

**Problem:** Search for a target in a matrix whose rows are sorted and whose first element in each row exceeds the previous row’s last element.

**Input:** `matrix = [[1,3,5],[7,9,11]], target = 9`
**Output:** `true`

**Target:** O(log(mn)) time, O(1) space.
**Pattern:** Binary search over a virtual flattened array.

### 66. Valid Sudoku (M)

**Problem:** Determine whether the supplied input satisfies the valid sudoku rules and return a boolean result. The input is an integer array and any parameters named in the task. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(n); O(n log n) when sorting is required time, O(1) auxiliary for in-place methods; otherwise O(n) space.
**Pattern:** Array traversal, in-place mutation, prefix/suffix state or greedy scanning.

### 67. Game of Life (M)

**Problem:** Solve the standard interview formulation of Game of Life: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an integer array and any parameters named in the task. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(n); O(n log n) when sorting is required time, O(1) auxiliary for in-place methods; otherwise O(n) space.
**Pattern:** Array traversal, in-place mutation, prefix/suffix state or greedy scanning.

### 68. Pascal-style matrix problems: Pascal Triangle variations (E)

**Problem:** Implement or apply Pascal-style matrix problems: Pascal Triangle variations to the supplied input and return the result required by its standard formulation. The input is an integer array and any parameters named in the task. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(n); O(n log n) when sorting is required time, O(1) auxiliary for in-place methods; otherwise O(n) space.
**Pattern:** Array traversal, in-place mutation, prefix/suffix state or greedy scanning.

### 69. Merge Intervals (M★)

**Problem:** Merge all overlapping intervals and return the resulting non-overlapping intervals.

**Input:** `intervals = [[1,3],[2,6],[8,10],[15,18]]`
**Output:** `[[1,6],[8,10],[15,18]]`

**Target:** O(n log n) time, O(n) for output space.
**Pattern:** Sort by start; sweep and extend the current interval.

### 70. Insert Interval (M★)

**Problem:** Insert a new interval into a sorted, non-overlapping interval list and merge overlaps.

**Input:** `intervals = [[1,3],[6,9]], newInterval = [2,5]`
**Output:** `[[1,5],[6,9]]`

**Target:** O(n) time, O(n) for output space.
**Pattern:** Three phases: before, merge overlaps, after.

### 71. Summary Ranges (E)

**Problem:** Solve the standard interview formulation of Summary Ranges: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an integer array and any parameters named in the task. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(n); O(n log n) when sorting is required time, O(1) auxiliary for in-place methods; otherwise O(n) space.
**Pattern:** Array traversal, in-place mutation, prefix/suffix state or greedy scanning.

### 72. Count Inversions (M/H)

**Problem:** Count the number of inversions cases that satisfy the standard problem conditions. The input is an integer array and any parameters named in the task. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n log n) time, O(n) space.
**Pattern:** Divide and conquer with merge-based counting.

### 73. Reverse Pairs (H)

**Problem:** Reverse pairs according to the standard problem rules, preserving any specified boundaries or grouping constraints. The input is an integer array and any parameters named in the task. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n log n) time, O(n) space.
**Pattern:** Divide and conquer with merge-based counting.

### 74. Maximum Gap (H)

**Problem:** Find the maximum possible gap over the allowed choices in the input. The input is an integer array and any parameters named in the task. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(n); O(n log n) when sorting is required time, O(1) auxiliary for in-place methods; otherwise O(n) space.
**Pattern:** Array traversal, in-place mutation, prefix/suffix state or greedy scanning.

### 75. Candy (H)

**Problem:** Solve the standard interview formulation of Candy: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an integer array and any parameters named in the task. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(n); O(n log n) when sorting is required time, O(1) auxiliary for in-place methods; otherwise O(n) space.
**Pattern:** Array traversal, in-place mutation, prefix/suffix state or greedy scanning.

### 76. Gas Station (M★)

**Problem:** Given gas and cost at each circular station, return a start index that completes the circuit, or -1 if impossible.

**Input:** `gas = [1,2,3,4,5], cost = [3,4,5,1,2]`
**Output:** `3`

**Target:** O(n) time, O(1) space.
**Pattern:** Greedy total-balance check and reset candidate after negative prefix.

### 77. Jump Game (M★)

**Problem:** Determine whether the last array index is reachable when each value is the maximum jump length from that position.

**Input:** `nums = [2, 3, 1, 1, 4]`
**Output:** `true`

**Target:** O(n) time, O(1) space.
**Pattern:** Greedy farthest-reachable boundary.

### 78. Jump Game II (M★)

**Problem:** Return the minimum number of jumps needed to reach the final index; assume it is reachable.

**Input:** `nums = [2, 3, 1, 1, 4]`
**Output:** `2`

**Target:** O(n) time, O(1) space.
**Pattern:** Greedy BFS-layer boundary expansion.

### 79. Shuffle an Array (M)

**Problem:** Solve the standard interview formulation of Shuffle an Array: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an integer array and any parameters named in the task. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(n); O(n log n) when sorting is required time, O(1) auxiliary for in-place methods; otherwise O(n) space.
**Pattern:** Array traversal, in-place mutation, prefix/suffix state or greedy scanning.

### 80. Merge Sorted Arrays without extra space (M)

**Problem:** Merge sorted arrays without extra space according to the standard ordering and overlap rules, returning the combined result. The input is an integer array and any parameters named in the task. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n log n) time, O(n) space.
**Pattern:** Divide and conquer with merge-based counting.

### 81. Intersection / Union of Two Arrays (E)

**Problem:** Solve the standard interview formulation of Intersection / Union of Two Arrays: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an integer array and any parameters named in the task. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(n); O(n log n) when sorting is required time, O(1) auxiliary for in-place methods; otherwise O(n) space.
**Pattern:** Array traversal, in-place mutation, prefix/suffix state or greedy scanning.

### 82. Find Pivot Element in rotated array (M)

**Problem:** Find and return pivot element in rotated array from the supplied input; return the required sentinel/empty result when it does not exist. The input is an integer array and any parameters named in the task. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(n); O(n log n) when sorting is required time, O(1) auxiliary for in-place methods; otherwise O(n) space.
**Pattern:** Array traversal, in-place mutation, prefix/suffix state or greedy scanning.

## 3. HASHING

### 83. Two Sum (E★)

**Problem:** Return the indices of two distinct elements whose values add to the target. Assume exactly one solution unless the judge says otherwise.

**Input:** `nums = [2, 7, 11, 15], target = 9`
**Output:** `[0, 1]`

**Target:** O(n) expected time, O(n) space.
**Pattern:** Hash map from value to previously seen index.

### 84. Contains Duplicate (E)

**Problem:** Determine whether any value occurs at least twice in the array.

**Input:** `nums = [1, 2, 3, 1]`
**Output:** `true`

**Target:** O(n) expected time, O(n) space.
**Pattern:** Hash set membership.

### 85. Contains Duplicate II (E)

**Problem:** Determine whether equal values occur at two indices whose distance is at most k.

**Input:** `nums = [1, 2, 3, 1], k = 3`
**Output:** `true`

**Target:** O(n) expected time, O(min(n,k)) space.
**Pattern:** Sliding hash set or last-seen index map.

### 86. Valid Anagram (E★)

**Problem:** Determine whether two strings contain exactly the same characters with the same multiplicities.

**Input:** `s = "anagram", t = "nagaram"`
**Output:** `true`

**Target:** O(n) time, O(1) for fixed alphabet; otherwise O(Σ) space.
**Pattern:** Frequency counting or sorting.

### 87. Group Anagrams (M★)

**Problem:** Group words that are anagrams of one another.

**Input:** `strs = ["eat","tea","tan","ate","nat","bat"]`
**Output:** `[["eat","tea","ate"],["tan","nat"],["bat"]]`

**Target:** O(total characters) expected time, O(total characters) space.
**Pattern:** Hash map keyed by character-frequency signature or sorted word.

### 88. Top K Frequent Elements (M★)

**Problem:** Return the k values with the highest frequencies.

**Input:** `nums = [1,1,1,2,2,3], k = 2`
**Output:** `[1, 2]`

**Target:** O(n log k) with heap; O(n) bucket option time, O(n) space.
**Pattern:** Frequency map plus min-heap or bucket grouping.

### 89. Sort Characters By Frequency (M)

**Problem:** Sort/reorder the supplied data according to characters by frequency and return the resulting sequence. The input is an array, string or collection of keys/values. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) expected time, O(n) space.
**Pattern:** HashMap/HashSet lookup, frequency counting or prefix-state hashing.

### 90. Longest Consecutive Sequence (M★)

**Problem:** Return the length of the longest run of consecutive integer values, regardless of input order.

**Input:** `nums = [100, 4, 200, 1, 3, 2]`
**Output:** `4`

**Target:** O(n) expected time, O(n) space.
**Pattern:** Hash set; expand only from sequence starts.

### 91. Isomorphic Strings (E)

**Problem:** Solve the standard interview formulation of Isomorphic Strings: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array, string or collection of keys/values. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) expected time, O(n) space.
**Pattern:** HashMap/HashSet lookup, frequency counting or prefix-state hashing.

### 92. Word Pattern (E)

**Problem:** Solve the standard interview formulation of Word Pattern: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array, string or collection of keys/values. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) expected time, O(n) space.
**Pattern:** HashMap/HashSet lookup, frequency counting or prefix-state hashing.

### 93. Ransom Note (E)

**Problem:** Solve the standard interview formulation of Ransom Note: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array, string or collection of keys/values. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) expected time, O(n) space.
**Pattern:** HashMap/HashSet lookup, frequency counting or prefix-state hashing.

### 94. First Unique Character in a String (E★)

**Problem:** Return the index of the first character that occurs exactly once, or -1 if none exists.

**Input:** `s = "leetcode"`
**Output:** `0`

**Target:** O(n) time, O(Σ) space.
**Pattern:** Frequency pass followed by an index scan.

### 95. Intersection of Two Arrays I and II (E)

**Problem:** Solve the standard interview formulation of Intersection of Two Arrays I and II: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array, string or collection of keys/values. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) expected time, O(n) space.
**Pattern:** HashMap/HashSet lookup, frequency counting or prefix-state hashing.

### 96. Happy Number via set (E)

**Problem:** Solve the standard interview formulation of Happy Number via set: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array, string or collection of keys/values. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) expected time, O(n) space.
**Pattern:** HashMap/HashSet lookup, frequency counting or prefix-state hashing.

### 97. 4Sum II (M)

**Problem:** Solve the standard interview formulation of 4Sum II: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array, string or collection of keys/values. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) expected time, O(n) space.
**Pattern:** HashMap/HashSet lookup, frequency counting or prefix-state hashing.

### 98. Brick Wall (M)

**Problem:** Solve the standard interview formulation of Brick Wall: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array, string or collection of keys/values. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) expected time, O(n) space.
**Pattern:** HashMap/HashSet lookup, frequency counting or prefix-state hashing.

### 99. Longest Subarray with Sum K (M)

**Problem:** Find the longest subarray with sum k satisfying the problem constraints. The input is an array, string or collection of keys/values. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) expected time, O(n) space.
**Pattern:** HashMap/HashSet lookup, frequency counting or prefix-state hashing.

### 100. Largest Subarray with Zero Sum (M)

**Problem:** Solve the standard interview formulation of Largest Subarray with Zero Sum: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array, string or collection of keys/values. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) expected time, O(n) space.
**Pattern:** HashMap/HashSet lookup, frequency counting or prefix-state hashing.

### 101. Subarray Sum Equals K (M★)

**Problem:** Count contiguous subarrays whose sum equals k.

**Input:** `nums = [1, 1, 1], k = 2`
**Output:** `2`

**Target:** O(n) expected time, O(n) space.
**Pattern:** Prefix-sum frequency map.

### 102. Subarray Sums Divisible by K (M★)

**Problem:** Solve the standard interview formulation of Subarray Sums Divisible by K: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array, string or collection of keys/values. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) preprocessing or scan time, O(n) space.
**Pattern:** Prefix sum / prefix frequency map / difference array.

### 103. Continuous Subarray Sum (M)

**Problem:** Solve the standard interview formulation of Continuous Subarray Sum: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array, string or collection of keys/values. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) preprocessing or scan time, O(n) space.
**Pattern:** Prefix sum / prefix frequency map / difference array.

### 104. Contiguous Array (M★)

**Problem:** Solve the standard interview formulation of Contiguous Array: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array, string or collection of keys/values. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) expected time, O(n) space.
**Pattern:** HashMap/HashSet lookup, frequency counting or prefix-state hashing.

### 105. Count Subarrays with XOR K (M)

**Problem:** Count the number of subarrays with xor k cases that satisfy the standard problem conditions. The input is an array, string or collection of keys/values. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) expected time, O(n) space.
**Pattern:** HashMap/HashSet lookup, frequency counting or prefix-state hashing.

### 106. Count Pairs with Given Sum / Difference (E/M)

**Problem:** Count the number of pairs with given sum / difference cases that satisfy the standard problem conditions. The input is an array, string or collection of keys/values. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) expected time, O(n) space.
**Pattern:** HashMap/HashSet lookup, frequency counting or prefix-state hashing.

### 107. Encode and Decode Strings (M)

**Problem:** Solve the standard interview formulation of Encode and Decode Strings: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array, string or collection of keys/values. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) expected time, O(n) space.
**Pattern:** HashMap/HashSet lookup, frequency counting or prefix-state hashing.

### 108. Design HashMap / HashSet (E)

**Problem:** Implement the Design HashMap / HashSet interface/technique and support the operations required by its standard interview formulation, preserving its stated invariants and complexity targets. The input is an array, string or collection of keys/values. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) expected time, O(n) space.
**Pattern:** HashMap/HashSet lookup, frequency counting or prefix-state hashing.

### 109. Number of Boomerangs (M)

**Problem:** Compute the number of boomerangs for the given input. The input is an array, string or collection of keys/values. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) expected time, O(n) space.
**Pattern:** HashMap/HashSet lookup, frequency counting or prefix-state hashing.

### 110. Max Points on a Line (H)

**Problem:** Solve the standard interview formulation of Max Points on a Line: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array, string or collection of keys/values. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) expected time, O(n) space.
**Pattern:** HashMap/HashSet lookup, frequency counting or prefix-state hashing.

### 111. Fraction to Recurring Decimal (M)

**Problem:** Solve the standard interview formulation of Fraction to Recurring Decimal: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array, string or collection of keys/values. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) expected time, O(n) space.
**Pattern:** HashMap/HashSet lookup, frequency counting or prefix-state hashing.

### 112. Minimum Index Sum of Two Lists (E)

**Problem:** Find the minimum possible index sum of two lists over the allowed choices in the input. The input is an array, string or collection of keys/values. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) expected time, O(n) space.
**Pattern:** HashMap/HashSet lookup, frequency counting or prefix-state hashing.

## 4. PREFIX SUM & DIFFERENCE ARRAY

### 113. Running Sum of 1D Array (E)

**Problem:** Solve the standard interview formulation of Running Sum of 1D Array: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array or matrix, plus range/query parameters. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) preprocessing or scan time, O(n) space.
**Pattern:** Prefix sum / prefix frequency map / difference array.

### 114. Range Sum Query Immutable (E)

**Problem:** Build a structure that answers sum queries over inclusive array ranges.

**Input:** `nums=[-2,0,3,-5,2,-1]; sumRange(0,2)`
**Output:** `1`

**Target:** O(n) build; O(1) query time, O(n) space.
**Pattern:** Prefix sums.

### 115. Range Sum Query 2D Immutable (M)

**Problem:** Build a structure to answer submatrix sum queries in constant time.

**Input:** `matrix=[[3,0,1],[5,6,3],[1,2,0]]; query rows 1..2, cols 1..2`
**Output:** `11`

**Target:** O(mn) build; O(1) query time, O(mn) space.
**Pattern:** 2D prefix sums and inclusion–exclusion.

### 116. Find Pivot Index (E)

**Problem:** Find and return pivot index from the supplied input; return the required sentinel/empty result when it does not exist. The input is an array or matrix, plus range/query parameters. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) preprocessing or scan time, O(n) space.
**Pattern:** Prefix sum / prefix frequency map / difference array.

### 117. Number of Subarrays with Odd Sum (M)

**Problem:** Compute the number of subarrays with odd sum for the given input. The input is an array or matrix, plus range/query parameters. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) preprocessing or scan time, O(n) space.
**Pattern:** Prefix sum / prefix frequency map / difference array.

### 118. Maximum Size Subarray Sum Equals k (M)

**Problem:** Find the maximum possible size subarray sum equals k over the allowed choices in the input. The input is an array or matrix, plus range/query parameters. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) preprocessing or scan time, O(n) space.
**Pattern:** Prefix sum / prefix frequency map / difference array.

### 119. Corporate Flight Bookings (M)

**Problem:** Solve the standard interview formulation of Corporate Flight Bookings: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array or matrix, plus range/query parameters. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) preprocessing or scan time, O(n) space.
**Pattern:** Prefix sum / prefix frequency map / difference array.

### 120. Car Pooling (M)

**Problem:** Solve the standard interview formulation of Car Pooling: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array or matrix, plus range/query parameters. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) preprocessing or scan time, O(n) space.
**Pattern:** Prefix sum / prefix frequency map / difference array.

### 121. Range Addition (M)

**Problem:** Solve the standard interview formulation of Range Addition: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array or matrix, plus range/query parameters. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) preprocessing or scan time, O(n) space.
**Pattern:** Prefix sum / prefix frequency map / difference array.

### 122. Maximum Subarray Sum with One Deletion (M)

**Problem:** Find the maximum possible subarray sum with one deletion over the allowed choices in the input. The input is an array or matrix, plus range/query parameters. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) preprocessing or scan time, O(n) space.
**Pattern:** Prefix sum / prefix frequency map / difference array.

### 123. Count Submatrices with Sum Equal Target (H)

**Problem:** Count the number of submatrices with sum equal target cases that satisfy the standard problem conditions. The input is an array or matrix, plus range/query parameters. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) preprocessing or scan time, O(n) space.
**Pattern:** Prefix sum / prefix frequency map / difference array.

### 124. Count Number of Nice Subarrays via prefix (M)

**Problem:** Count the number of number of nice subarrays via prefix cases that satisfy the standard problem conditions. The input is an array or matrix, plus range/query parameters. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) preprocessing or scan time, O(n) space.
**Pattern:** Prefix sum / prefix frequency map / difference array.

## 5. TWO POINTERS

### 125. Valid Palindrome (E★)

**Problem:** Determine whether a string is a palindrome after ignoring non-alphanumeric characters and letter case.

**Input:** `s = "A man, a plan, a canal: Panama"`
**Output:** `true`

**Target:** O(n) time, O(1) space.
**Pattern:** Two pointers moving inward while skipping ignored characters.

### 126. Valid Palindrome II (E)

**Problem:** Determine whether the supplied input satisfies the valid palindrome ii rules and return a boolean result. The input is an array or string, often with a target or pair/triplet constraint. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) after sorting; O(n log n) including sorting time, O(1) auxiliary, excluding output space.
**Pattern:** Opposing or same-direction pointers; sort first when the task requires ordering.

### 127. Reverse String (E)

**Problem:** Reverse string according to the standard problem rules, preserving any specified boundaries or grouping constraints. The input is an array or string, often with a target or pair/triplet constraint. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) after sorting; O(n log n) including sorting time, O(1) auxiliary, excluding output space.
**Pattern:** Opposing or same-direction pointers; sort first when the task requires ordering.

### 128. Reverse Vowels of a String (E)

**Problem:** Reverse vowels of a string according to the standard problem rules, preserving any specified boundaries or grouping constraints. The input is an array or string, often with a target or pair/triplet constraint. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) after sorting; O(n log n) including sorting time, O(1) auxiliary, excluding output space.
**Pattern:** Opposing or same-direction pointers; sort first when the task requires ordering.

### 129. Two Sum II (M★)

**Problem:** In a sorted array, return the 1-based indices of two values whose sum equals the target.

**Input:** `numbers = [2,7,11,15], target = 9`
**Output:** `[1, 2]`

**Target:** O(n) time, O(1) space.
**Pattern:** Opposing two pointers.

### 130. Squares of a Sorted Array (E★)

**Problem:** Return the squares of a sorted integer array in non-decreasing order.

**Input:** `nums = [-4, -1, 0, 3, 10]`
**Output:** `[0, 1, 9, 16, 100]`

**Target:** O(n) time, O(n) output space.
**Pattern:** Compare absolute values at both ends and fill output backwards.

### 131. 3Sum (M★)

**Problem:** Return all unique triplets whose values sum to zero.

**Input:** `nums = [-1,0,1,2,-1,-4]`
**Output:** `[[-1,-1,2],[-1,0,1]]`

**Target:** O(n²) time, O(1) auxiliary, excluding output space.
**Pattern:** Sort, fix one value, then use two pointers and skip duplicates.

### 132. 3Sum Closest (M)

**Problem:** Solve the standard interview formulation of 3Sum Closest: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array or string, often with a target or pair/triplet constraint. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) after sorting; O(n log n) including sorting time, O(1) auxiliary, excluding output space.
**Pattern:** Opposing or same-direction pointers; sort first when the task requires ordering.

### 133. 3Sum Smaller (M)

**Problem:** Solve the standard interview formulation of 3Sum Smaller: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array or string, often with a target or pair/triplet constraint. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) after sorting; O(n log n) including sorting time, O(1) auxiliary, excluding output space.
**Pattern:** Opposing or same-direction pointers; sort first when the task requires ordering.

### 134. 4Sum (M)

**Problem:** Solve the standard interview formulation of 4Sum: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array or string, often with a target or pair/triplet constraint. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) after sorting; O(n log n) including sorting time, O(1) auxiliary, excluding output space.
**Pattern:** Opposing or same-direction pointers; sort first when the task requires ordering.

### 135. Sort Colors (M)

**Problem:** Sort/reorder the supplied data according to colors and return the resulting sequence. The input is an array or string, often with a target or pair/triplet constraint. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) after sorting; O(n log n) including sorting time, O(1) auxiliary, excluding output space.
**Pattern:** Opposing or same-direction pointers; sort first when the task requires ordering.

### 136. Boats to Save People (M)

**Problem:** Solve the standard interview formulation of Boats to Save People: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array or string, often with a target or pair/triplet constraint. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) after sorting; O(n log n) including sorting time, O(1) auxiliary, excluding output space.
**Pattern:** Opposing or same-direction pointers; sort first when the task requires ordering.

### 137. Is Subsequence (E)

**Problem:** Solve the standard interview formulation of Is Subsequence: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array or string, often with a target or pair/triplet constraint. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) after sorting; O(n log n) including sorting time, O(1) auxiliary, excluding output space.
**Pattern:** Opposing or same-direction pointers; sort first when the task requires ordering.

### 138. Merge Strings Alternately (E)

**Problem:** Merge strings alternately according to the standard ordering and overlap rules, returning the combined result. The input is an array or string, often with a target or pair/triplet constraint. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) after sorting; O(n log n) including sorting time, O(1) auxiliary, excluding output space.
**Pattern:** Opposing or same-direction pointers; sort first when the task requires ordering.

### 139. Remove Nth Node using two pointers (M)

**Problem:** Solve the standard interview formulation of Remove Nth Node using two pointers: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array or string, often with a target or pair/triplet constraint. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) after sorting; O(n log n) including sorting time, O(1) auxiliary, excluding output space.
**Pattern:** Opposing or same-direction pointers; sort first when the task requires ordering.

### 140. Minimum Difference Between Largest and Smallest of K Elements (E)

**Problem:** Find the minimum possible difference between largest and smallest of k elements over the allowed choices in the input. The input is an array or string, often with a target or pair/triplet constraint. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) after sorting; O(n log n) including sorting time, O(1) auxiliary, excluding output space.
**Pattern:** Opposing or same-direction pointers; sort first when the task requires ordering.

### 141. Number of Subsequences That Satisfy the Given Sum Condition (M)

**Problem:** Compute the number of subsequences that satisfy the given sum condition for the given input. The input is an array or string, often with a target or pair/triplet constraint. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) after sorting; O(n log n) including sorting time, O(1) auxiliary, excluding output space.
**Pattern:** Opposing or same-direction pointers; sort first when the task requires ordering.

### 142. Trapping Rain Water (H★)

**Problem:** Given bar heights, calculate how much rainwater can be trapped between them.

**Input:** `height = [4, 2, 0, 3, 2, 5]`
**Output:** `9`

**Target:** O(n) time, O(1) space.
**Pattern:** Two pointers with left/right maximums; prefix/suffix or monotonic stack alternatives.

## 6. SLIDING WINDOW

### 143. Maximum Average Subarray I (E)

**Problem:** Return the maximum average among all contiguous subarrays of fixed length k.

**Input:** `nums = [1,12,-5,-6,50,3], k = 4`
**Output:** `12.75`

**Target:** O(n) time, O(1) space.
**Pattern:** Fixed-size sliding window.

### 144. Maximum Sum Subarray of Size K (E)

**Problem:** Find the maximum possible sum subarray of size k over the allowed choices in the input. The input is an array or string and a window size/threshold. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) expected time, O(Σ) or O(k) space.
**Pattern:** Fixed- or variable-length sliding window; expand right, restore validity by advancing left.

### 145. First Negative Number in Every Window (M)

**Problem:** Solve the standard interview formulation of First Negative Number in Every Window: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array or string and a window size/threshold. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) expected time, O(Σ) or O(k) space.
**Pattern:** Fixed- or variable-length sliding window; expand right, restore validity by advancing left.

### 146. Longest Substring Without Repeating Characters (M★)

**Problem:** Return the length of the longest substring containing no repeated characters.

**Input:** `s = "abcabcbb"`
**Output:** `3`

**Target:** O(n) time, O(Σ) space.
**Pattern:** Variable sliding window with last-seen indices.

### 147. Longest Repeating Character Replacement (M★)

**Problem:** Return the longest substring that can be made of one repeated character by replacing at most k characters.

**Input:** `s = "AABABBA", k = 1`
**Output:** `4`

**Target:** O(n) time, O(Σ) space.
**Pattern:** Sliding window; track maximum character frequency.

### 148. Permutation in String (M★)

**Problem:** Determine whether s2 contains a permutation of s1 as a contiguous substring.

**Input:** `s1 = "ab", s2 = "eidbaooo"`
**Output:** `true`

**Target:** O(n + Σ) time, O(Σ) space.
**Pattern:** Fixed-size sliding window with character counts.

### 149. Find All Anagrams in a String (M★)

**Problem:** Return all starting indices of substrings of s that are anagrams of p.

**Input:** `s = "cbaebabacd", p = "abc"`
**Output:** `[0, 6]`

**Target:** O(n + Σ) time, O(Σ) space.
**Pattern:** Fixed-size frequency-count sliding window.

### 150. Minimum Size Subarray Sum (M★)

**Problem:** Find the minimum length of a contiguous subarray with sum at least target; return 0 if none exists.

**Input:** `target = 7, nums = [2,3,1,2,4,3]`
**Output:** `2`

**Target:** O(n) time, O(1) space.
**Pattern:** Variable sliding window for positive numbers.

### 151. Max Consecutive Ones III (M★)

**Problem:** Solve the standard interview formulation of Max Consecutive Ones III: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array or string and a window size/threshold. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) expected time, O(Σ) or O(k) space.
**Pattern:** Fixed- or variable-length sliding window; expand right, restore validity by advancing left.

### 152. Fruit Into Baskets (M)

**Problem:** Solve the standard interview formulation of Fruit Into Baskets: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array or string and a window size/threshold. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) expected time, O(Σ) or O(k) space.
**Pattern:** Fixed- or variable-length sliding window; expand right, restore validity by advancing left.

### 153. Longest Substring with At Most K Distinct Characters (M)

**Problem:** Find the longest substring with at most k distinct characters satisfying the problem constraints. The input is an array or string and a window size/threshold. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) expected time, O(Σ) or O(k) space.
**Pattern:** Fixed- or variable-length sliding window; expand right, restore validity by advancing left.

### 154. Longest Substring with Exactly K Distinct (M)

**Problem:** Find the longest substring with exactly k distinct satisfying the problem constraints. The input is an array or string and a window size/threshold. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) expected time, O(Σ) or O(k) space.
**Pattern:** Fixed- or variable-length sliding window; expand right, restore validity by advancing left.

### 155. Count Number of Nice Subarrays (M)

**Problem:** Count the number of number of nice subarrays cases that satisfy the standard problem conditions. The input is an array or string and a window size/threshold. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) expected time, O(Σ) or O(k) space.
**Pattern:** Fixed- or variable-length sliding window; expand right, restore validity by advancing left.

### 156. Binary Subarrays With Sum (M)

**Problem:** Solve the standard interview formulation of Binary Subarrays With Sum: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array or string and a window size/threshold. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) expected time, O(Σ) or O(k) space.
**Pattern:** Fixed- or variable-length sliding window; expand right, restore validity by advancing left.

### 157. Number of Substrings Containing All Three Characters (M)

**Problem:** Compute the number of substrings containing all three characters for the given input. The input is an array or string and a window size/threshold. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) expected time, O(Σ) or O(k) space.
**Pattern:** Fixed- or variable-length sliding window; expand right, restore validity by advancing left.

### 158. Maximum Points You Can Obtain from Cards (M)

**Problem:** Find the maximum possible points you can obtain from cards over the allowed choices in the input. The input is an array or string and a window size/threshold. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) expected time, O(Σ) or O(k) space.
**Pattern:** Fixed- or variable-length sliding window; expand right, restore validity by advancing left.

### 159. Grumpy Bookstore Owner (M)

**Problem:** Solve the standard interview formulation of Grumpy Bookstore Owner: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array or string and a window size/threshold. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) expected time, O(Σ) or O(k) space.
**Pattern:** Fixed- or variable-length sliding window; expand right, restore validity by advancing left.

### 160. Get Equal Substrings Within Budget (M)

**Problem:** Solve the standard interview formulation of Get Equal Substrings Within Budget: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array or string and a window size/threshold. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) expected time, O(Σ) or O(k) space.
**Pattern:** Fixed- or variable-length sliding window; expand right, restore validity by advancing left.

### 161. Minimum Window Substring (H★)

**Problem:** Find the shortest substring of s containing every character of t with the required multiplicity.

**Input:** `s = "ADOBECODEBANC", t = "ABC"`
**Output:** `"BANC"`

**Target:** O(|s|+|t|) time, O(Σ) space.
**Pattern:** Expand/shrink sliding window with required and formed counts.

### 162. Sliding Window Maximum (H★)

**Problem:** For each window of size k, return its maximum value.

**Input:** `nums = [1,3,-1,-3,5,3,6,7], k = 3`
**Output:** `[3,3,5,5,6,7]`

**Target:** O(n) time, O(k) space.
**Pattern:** Monotonic deque.

### 163. Subarrays with K Different Integers (H)

**Problem:** Solve the standard interview formulation of Subarrays with K Different Integers: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array or string and a window size/threshold. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) expected time, O(Σ) or O(k) space.
**Pattern:** Fixed- or variable-length sliding window; expand right, restore validity by advancing left.

### 164. Minimum Window Subsequence (H)

**Problem:** Find the minimum possible window subsequence over the allowed choices in the input. The input is an array or string and a window size/threshold. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) expected time, O(Σ) or O(k) space.
**Pattern:** Fixed- or variable-length sliding window; expand right, restore validity by advancing left.

### 165. Longest Continuous Subarray With Abs Diff <= Limit (M)

**Problem:** Find the longest continuous subarray with abs diff <= limit satisfying the problem constraints. The input is an array or string and a window size/threshold. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) expected time, O(Σ) or O(k) space.
**Pattern:** Fixed- or variable-length sliding window; expand right, restore validity by advancing left.

### 166. Substring with Concatenation of All Words (H)

**Problem:** Solve the standard interview formulation of Substring with Concatenation of All Words: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array or string and a window size/threshold. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) expected time, O(Σ) or O(k) space.
**Pattern:** Fixed- or variable-length sliding window; expand right, restore validity by advancing left.

## 7. STRINGS

### 167. Longest Common Prefix (E)

**Problem:** Return the longest prefix shared by every string in the input list.

**Input:** `strs = ["flower","flow","flight"]`
**Output:** `"fl"`

**Target:** O(total characters) time, O(1) auxiliary space.
**Pattern:** Vertical scanning, sorting, or prefix shrinking.

### 168. Valid Parentheses (E)

**Problem:** Determine whether brackets are correctly matched and properly nested.

**Input:** `s = "()[]{}"`
**Output:** `true`

**Target:** O(n) time, O(n) space.
**Pattern:** Stack of opening brackets.

### 169. Reverse Words in a String (M)

**Problem:** Reverse words in a string according to the standard problem rules, preserving any specified boundaries or grouping constraints. The input is one or more strings and any parsing/matching parameters. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) or O(n+m) for two strings time, O(Σ), O(n), or output-dependent space.
**Pattern:** String scanning, parsing, character counts, stack parsing or string matching.

### 170. Count and Say (M)

**Problem:** Count the number of and say cases that satisfy the standard problem conditions. The input is one or more strings and any parsing/matching parameters. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) or O(n+m) for two strings time, O(Σ), O(n), or output-dependent space.
**Pattern:** String scanning, parsing, character counts, stack parsing or string matching.

### 171. Length of Last Word (E)

**Problem:** Solve the standard interview formulation of Length of Last Word: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is one or more strings and any parsing/matching parameters. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) or O(n+m) for two strings time, O(Σ), O(n), or output-dependent space.
**Pattern:** String scanning, parsing, character counts, stack parsing or string matching.

### 172. Add Binary (E)

**Problem:** Solve the standard interview formulation of Add Binary: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is one or more strings and any parsing/matching parameters. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) or O(n+m) for two strings time, O(Σ), O(n), or output-dependent space.
**Pattern:** String scanning, parsing, character counts, stack parsing or string matching.

### 173. Implement strStr / KMP (M★)

**Problem:** Implement the Implement strStr / KMP interface/technique and support the operations required by its standard interview formulation, preserving its stated invariants and complexity targets. The input is one or more strings and any parsing/matching parameters. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) or O(n+m) for two strings time, O(Σ), O(n), or output-dependent space.
**Pattern:** String scanning, parsing, character counts, stack parsing or string matching.

### 174. Repeated Substring Pattern (E)

**Problem:** Solve the standard interview formulation of Repeated Substring Pattern: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is one or more strings and any parsing/matching parameters. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) or O(n+m) for two strings time, O(Σ), O(n), or output-dependent space.
**Pattern:** String scanning, parsing, character counts, stack parsing or string matching.

### 175. String Compression (M)

**Problem:** Solve the standard interview formulation of String Compression: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is one or more strings and any parsing/matching parameters. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) or O(n+m) for two strings time, O(Σ), O(n), or output-dependent space.
**Pattern:** String scanning, parsing, character counts, stack parsing or string matching.

### 176. Rotate String (E)

**Problem:** Solve the standard interview formulation of Rotate String: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is one or more strings and any parsing/matching parameters. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) or O(n+m) for two strings time, O(Σ), O(n), or output-dependent space.
**Pattern:** String scanning, parsing, character counts, stack parsing or string matching.

### 177. Check if One String Swap Can Make Strings Equal (E)

**Problem:** Determine whether if one string swap can make strings equal holds for the supplied input and return a boolean result. The input is one or more strings and any parsing/matching parameters. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) or O(n+m) for two strings time, O(Σ), O(n), or output-dependent space.
**Pattern:** String scanning, parsing, character counts, stack parsing or string matching.

### 178. Longest Palindromic Substring (M★)

**Problem:** Find the longest palindromic substring satisfying the problem constraints. The input is one or more strings and any parsing/matching parameters. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) or O(n+m) for two strings time, O(Σ), O(n), or output-dependent space.
**Pattern:** String scanning, parsing, character counts, stack parsing or string matching.

### 179. Palindromic Substrings (M★)

**Problem:** Solve the standard interview formulation of Palindromic Substrings: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is one or more strings and any parsing/matching parameters. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) or O(n+m) for two strings time, O(Σ), O(n), or output-dependent space.
**Pattern:** String scanning, parsing, character counts, stack parsing or string matching.

### 180. Longest Palindrome (E)

**Problem:** Find the longest palindrome satisfying the problem constraints. The input is one or more strings and any parsing/matching parameters. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) or O(n+m) for two strings time, O(Σ), O(n), or output-dependent space.
**Pattern:** String scanning, parsing, character counts, stack parsing or string matching.

### 181. Valid Number (H)

**Problem:** Determine whether the supplied input satisfies the valid number rules and return a boolean result. The input is one or more strings and any parsing/matching parameters. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) or O(n+m) for two strings time, O(Σ), O(n), or output-dependent space.
**Pattern:** String scanning, parsing, character counts, stack parsing or string matching.

### 182. String to Integer (atoi) (M★)

**Problem:** Parse a string like atoi: skip leading spaces, read sign and digits, stop at first non-digit, and clamp to 32-bit signed bounds.

**Input:** `s = "   -42"`
**Output:** `-42`

**Target:** O(n) time, O(1) space.
**Pattern:** Finite-state parsing / careful digit accumulation with overflow checks.

### 183. Zigzag Conversion (M)

**Problem:** Solve the standard interview formulation of Zigzag Conversion: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is one or more strings and any parsing/matching parameters. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) or O(n+m) for two strings time, O(Σ), O(n), or output-dependent space.
**Pattern:** String scanning, parsing, character counts, stack parsing or string matching.

### 184. Compare Version Numbers (M)

**Problem:** Solve the standard interview formulation of Compare Version Numbers: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is one or more strings and any parsing/matching parameters. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) or O(n+m) for two strings time, O(Σ), O(n), or output-dependent space.
**Pattern:** String scanning, parsing, character counts, stack parsing or string matching.

### 185. Text Justification (H)

**Problem:** Solve the standard interview formulation of Text Justification: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is one or more strings and any parsing/matching parameters. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) or O(n+m) for two strings time, O(Σ), O(n), or output-dependent space.
**Pattern:** String scanning, parsing, character counts, stack parsing or string matching.

### 186. Minimum Add to Make Parentheses Valid (M)

**Problem:** Find the minimum possible add to make parentheses valid over the allowed choices in the input. The input is one or more strings and any parsing/matching parameters. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) or O(n+m) for two strings time, O(Σ), O(n), or output-dependent space.
**Pattern:** String scanning, parsing, character counts, stack parsing or string matching.

### 187. Find the Index of the First Occurrence (E)

**Problem:** Find and return the index of the first occurrence from the supplied input; return the required sentinel/empty result when it does not exist. The input is one or more strings and any parsing/matching parameters. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) or O(n+m) for two strings time, O(Σ), O(n), or output-dependent space.
**Pattern:** String scanning, parsing, character counts, stack parsing or string matching.

### 188. Reorganize String (M)

**Problem:** Solve the standard interview formulation of Reorganize String: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is one or more strings and any parsing/matching parameters. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) or O(n+m) for two strings time, O(Σ), O(n), or output-dependent space.
**Pattern:** String scanning, parsing, character counts, stack parsing or string matching.

### 189. Custom Sort String (M)

**Problem:** Implement or apply Custom Sort String to the supplied input and return the result required by its standard formulation. The input is one or more strings and any parsing/matching parameters. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) or O(n+m) for two strings time, O(Σ), O(n), or output-dependent space.
**Pattern:** String scanning, parsing, character counts, stack parsing or string matching.

### 190. Decode String (M★)

**Problem:** Decode repetitions in expressions such as k[encoded_string], including nested expressions.

**Input:** `s = "3[a2[c]]"`
**Output:** `"accaccacc"`

**Target:** O(decoded output length) time, O(n) stack space.
**Pattern:** Stack of repeat counts and partial strings.

### 191. Number of Atoms (H)

**Problem:** Compute the number of atoms for the given input. The input is one or more strings and any parsing/matching parameters. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) or O(n+m) for two strings time, O(Σ), O(n), or output-dependent space.
**Pattern:** String scanning, parsing, character counts, stack parsing or string matching.

### 192. Remove All Adjacent Duplicates in String (E)

**Problem:** Solve the standard interview formulation of Remove All Adjacent Duplicates in String: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is one or more strings and any parsing/matching parameters. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) or O(n+m) for two strings time, O(Σ), O(n), or output-dependent space.
**Pattern:** String scanning, parsing, character counts, stack parsing or string matching.

### 193. Remove All Adjacent Duplicates II (M)

**Problem:** Solve the standard interview formulation of Remove All Adjacent Duplicates II: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is one or more strings and any parsing/matching parameters. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) or O(n+m) for two strings time, O(Σ), O(n), or output-dependent space.
**Pattern:** String scanning, parsing, character counts, stack parsing or string matching.

### 194. Minimum Number of Swaps to Make String Balanced (M)

**Problem:** Find the minimum possible number of swaps to make string balanced over the allowed choices in the input. The input is one or more strings and any parsing/matching parameters. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) or O(n+m) for two strings time, O(Σ), O(n), or output-dependent space.
**Pattern:** String scanning, parsing, character counts, stack parsing or string matching.

## 8. BINARY SEARCH

### 195. Binary Search (E★)

**Problem:** Given a sorted array and target, return its index or -1 if absent.

**Input:** `nums = [-1,0,3,5,9,12], target = 9`
**Output:** `4`

**Target:** O(log n) time, O(1) space.
**Pattern:** Inclusive or half-open binary-search interval.

### 196. Search Insert Position (E★)

**Problem:** Return the index where target is found or should be inserted to preserve sorted order.

**Input:** `nums = [1,3,5,6], target = 2`
**Output:** `1`

**Target:** O(log n) time, O(1) space.
**Pattern:** Lower-bound binary search.

### 197. First and Last Position of Element (M★)

**Problem:** Return the first and last indices of target in a sorted array, or [-1,-1].

**Input:** `nums = [5,7,7,8,8,10], target = 8`
**Output:** `[3, 4]`

**Target:** O(log n) time, O(1) space.
**Pattern:** Two binary searches for lower and upper bounds.

### 198. Count Occurrences in Sorted Array (E)

**Problem:** Count the number of occurrences in sorted array cases that satisfy the standard problem conditions. The input is a sorted array or monotonic feasibility range, plus a target/threshold. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(log n), or O(n log R) when each feasibility check is O(n) time, O(1) space.
**Pattern:** Binary search on a sorted range or monotonic feasibility predicate.

### 199. Floor and Ceil in Sorted Array (E)

**Problem:** Implement or apply Floor and Ceil in Sorted Array to the supplied input and return the result required by its standard formulation. The input is a sorted array or monotonic feasibility range, plus a target/threshold. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(log n), or O(n log R) when each feasibility check is O(n) time, O(1) space.
**Pattern:** Binary search on a sorted range or monotonic feasibility predicate.

### 200. Search in Rotated Sorted Array (M★)

**Problem:** Search a distinct-valued sorted array rotated at an unknown pivot; return target index or -1.

**Input:** `nums = [4,5,6,7,0,1,2], target = 0`
**Output:** `4`

**Target:** O(log n) time, O(1) space.
**Pattern:** At each step identify the sorted half.

### 201. Search in Rotated Sorted Array II (M)

**Problem:** Implement or apply Search in Rotated Sorted Array II to the supplied input and return the result required by its standard formulation. The input is a sorted array or monotonic feasibility range, plus a target/threshold. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(log n), or O(n log R) when each feasibility check is O(n) time, O(1) space.
**Pattern:** Binary search on a sorted range or monotonic feasibility predicate.

### 202. Find Minimum in Rotated Sorted Array (M★)

**Problem:** Return the minimum value in a strictly increasing array rotated at an unknown pivot.

**Input:** `nums = [3,4,5,1,2]`
**Output:** `1`

**Target:** O(log n) time, O(1) space.
**Pattern:** Binary search against the right boundary.

### 203. Find Minimum in Rotated Sorted Array II (H)

**Problem:** Find and return minimum in rotated sorted array ii from the supplied input; return the required sentinel/empty result when it does not exist. The input is a sorted array or monotonic feasibility range, plus a target/threshold. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(log n), or O(n log R) when each feasibility check is O(n) time, O(1) space.
**Pattern:** Binary search on a sorted range or monotonic feasibility predicate.

### 204. Number of Times Array is Rotated (E)

**Problem:** Compute the number of times array is rotated for the given input. The input is a sorted array or monotonic feasibility range, plus a target/threshold. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(log n), or O(n log R) when each feasibility check is O(n) time, O(1) space.
**Pattern:** Binary search on a sorted range or monotonic feasibility predicate.

### 205. Find Peak Element (M★)

**Problem:** Return an index whose value is strictly greater than its neighbors; outside-array neighbors are negative infinity.

**Input:** `nums = [1,2,3,1]`
**Output:** `2`

**Target:** O(log n) time, O(1) space.
**Pattern:** Binary search on slope direction.

### 206. Peak Index in a Mountain Array (M)

**Problem:** Solve the standard interview formulation of Peak Index in a Mountain Array: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a sorted array or monotonic feasibility range, plus a target/threshold. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(log n), or O(n log R) when each feasibility check is O(n) time, O(1) space.
**Pattern:** Binary search on a sorted range or monotonic feasibility predicate.

### 207. Find in Mountain Array (H)

**Problem:** Find and return in mountain array from the supplied input; return the required sentinel/empty result when it does not exist. The input is a sorted array or monotonic feasibility range, plus a target/threshold. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(log n), or O(n log R) when each feasibility check is O(n) time, O(1) space.
**Pattern:** Binary search on a sorted range or monotonic feasibility predicate.

### 208. Single Element in Sorted Array (M)

**Problem:** Implement or apply Single Element in Sorted Array to the supplied input and return the result required by its standard formulation. The input is a sorted array or monotonic feasibility range, plus a target/threshold. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(log n), or O(n log R) when each feasibility check is O(n) time, O(1) space.
**Pattern:** Binary search on a sorted range or monotonic feasibility predicate.

### 209. Sqrt(x) (E★)

**Problem:** Return the integer floor of the square root of non-negative integer x without using a built-in square-root function.

**Input:** `x = 8`
**Output:** `2`

**Target:** O(log x) time, O(1) space.
**Pattern:** Binary search on answer; avoid multiplication overflow.

### 210. Nth Root of an Integer (M)

**Problem:** Solve the standard interview formulation of Nth Root of an Integer: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a sorted array or monotonic feasibility range, plus a target/threshold. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(log n), or O(n log R) when each feasibility check is O(n) time, O(1) space.
**Pattern:** Binary search on a sorted range or monotonic feasibility predicate.

### 211. Koko Eating Bananas (M★)

**Problem:** Find the minimum integer eating speed that lets Koko finish all piles within h hours.

**Input:** `piles = [3,6,7,11], h = 8`
**Output:** `4`

**Target:** O(n log M) time, O(1) space.
**Pattern:** Binary search on answer with a feasibility check.

### 212. Minimum Days to Make m Bouquets (M)

**Problem:** Find the minimum possible days to make m bouquets over the allowed choices in the input. The input is a sorted array or monotonic feasibility range, plus a target/threshold. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(log n), or O(n log R) when each feasibility check is O(n) time, O(1) space.
**Pattern:** Binary search on a sorted range or monotonic feasibility predicate.

### 213. Capacity to Ship Packages Within D Days (M★)

**Problem:** Find the minimum ship capacity that ships weights in order within D days.

**Input:** `weights = [1,2,3,4,5,6,7,8,9,10], days = 5`
**Output:** `15`

**Target:** O(n log(sum(weights))) time, O(1) space.
**Pattern:** Binary search on answer; greedy day-count feasibility.

### 214. Smallest Divisor Given a Threshold (M)

**Problem:** Solve the standard interview formulation of Smallest Divisor Given a Threshold: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a sorted array or monotonic feasibility range, plus a target/threshold. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(log n), or O(n log R) when each feasibility check is O(n) time, O(1) space.
**Pattern:** Binary search on a sorted range or monotonic feasibility predicate.

### 215. Kth Missing Positive Number (E)

**Problem:** Solve the standard interview formulation of Kth Missing Positive Number: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a sorted array or monotonic feasibility range, plus a target/threshold. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(log n), or O(n log R) when each feasibility check is O(n) time, O(1) space.
**Pattern:** Binary search on a sorted range or monotonic feasibility predicate.

### 216. Aggressive Cows (M★)

**Problem:** Solve the standard interview formulation of Aggressive Cows: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a sorted array or monotonic feasibility range, plus a target/threshold. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(log n), or O(n log R) when each feasibility check is O(n) time, O(1) space.
**Pattern:** Binary search on a sorted range or monotonic feasibility predicate.

### 217. Book Allocation / Allocate Pages (M★)

**Problem:** Solve the standard interview formulation of Book Allocation / Allocate Pages: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a sorted array or monotonic feasibility range, plus a target/threshold. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(log n), or O(n log R) when each feasibility check is O(n) time, O(1) space.
**Pattern:** Binary search on a sorted range or monotonic feasibility predicate.

### 218. Painter's Partition (M)

**Problem:** Solve the standard interview formulation of Painter's Partition: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a sorted array or monotonic feasibility range, plus a target/threshold. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(log n), or O(n log R) when each feasibility check is O(n) time, O(1) space.
**Pattern:** Binary search on a sorted range or monotonic feasibility predicate.

### 219. Split Array Largest Sum (H★)

**Problem:** Solve the standard interview formulation of Split Array Largest Sum: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a sorted array or monotonic feasibility range, plus a target/threshold. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(log n), or O(n log R) when each feasibility check is O(n) time, O(1) space.
**Pattern:** Binary search on a sorted range or monotonic feasibility predicate.

### 220. Magnetic Force Between Two Balls (M)

**Problem:** Solve the standard interview formulation of Magnetic Force Between Two Balls: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a sorted array or monotonic feasibility range, plus a target/threshold. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(log n), or O(n log R) when each feasibility check is O(n) time, O(1) space.
**Pattern:** Binary search on a sorted range or monotonic feasibility predicate.

### 221. Minimize Max Distance to Gas Station (H)

**Problem:** Solve the standard interview formulation of Minimize Max Distance to Gas Station: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a sorted array or monotonic feasibility range, plus a target/threshold. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(log n), or O(n log R) when each feasibility check is O(n) time, O(1) space.
**Pattern:** Binary search on a sorted range or monotonic feasibility predicate.

### 222. Median of Two Sorted Arrays (H★)

**Problem:** Return the median of two sorted arrays in logarithmic time in the shorter array.

**Input:** `nums1 = [1,3], nums2 = [2]`
**Output:** `2.0`

**Target:** O(log(min(m,n))) time, O(1) space.
**Pattern:** Binary-search partition with balanced left/right halves.

### 223. Kth Element of Two Sorted Arrays (H)

**Problem:** Return the k-th smallest element in the union of two sorted arrays.

**Input:** `a = [2,3,6,7,9], b = [1,4,8,10], k = 5`
**Output:** `6`

**Target:** O(log(min(m,n))) time, O(1) space.
**Pattern:** Binary-search partition / elimination by half.

### 224. Search a 2D Matrix II (M★)

**Problem:** Solve the standard interview formulation of Search a 2D Matrix II: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a sorted array or monotonic feasibility range, plus a target/threshold. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(log n), or O(n log R) when each feasibility check is O(n) time, O(1) space.
**Pattern:** Binary search on a sorted range or monotonic feasibility predicate.

### 225. Find Row with Maximum Ones (E)

**Problem:** Find and return row with maximum ones from the supplied input; return the required sentinel/empty result when it does not exist. The input is a sorted array or monotonic feasibility range, plus a target/threshold. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(log n), or O(n log R) when each feasibility check is O(n) time, O(1) space.
**Pattern:** Binary search on a sorted range or monotonic feasibility predicate.

### 226. Median in a Row-wise Sorted Matrix (H)

**Problem:** Implement or apply Median in a Row-wise Sorted Matrix to the supplied input and return the result required by its standard formulation. The input is a sorted array or monotonic feasibility range, plus a target/threshold. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(log n), or O(n log R) when each feasibility check is O(n) time, O(1) space.
**Pattern:** Binary search on a sorted range or monotonic feasibility predicate.

### 227. Kth Smallest Element in a Sorted Matrix (M)

**Problem:** Implement or apply Kth Smallest Element in a Sorted Matrix to the supplied input and return the result required by its standard formulation. The input is a sorted array or monotonic feasibility range, plus a target/threshold. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(log n), or O(n log R) when each feasibility check is O(n) time, O(1) space.
**Pattern:** Binary search on a sorted range or monotonic feasibility predicate.

### 228. Time Based Key-Value Store (M★)

**Problem:** Solve the standard interview formulation of Time Based Key-Value Store: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a sorted array or monotonic feasibility range, plus a target/threshold. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(log n), or O(n log R) when each feasibility check is O(n) time, O(1) space.
**Pattern:** Binary search on a sorted range or monotonic feasibility predicate.

### 229. Find K Closest Elements (M★)

**Problem:** Find and return k closest elements from the supplied input; return the required sentinel/empty result when it does not exist. The input is a sorted array or monotonic feasibility range, plus a target/threshold. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(log n), or O(n log R) when each feasibility check is O(n) time, O(1) space.
**Pattern:** Binary search on a sorted range or monotonic feasibility predicate.

### 230. Heaters (M)

**Problem:** Solve the standard interview formulation of Heaters: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a sorted array or monotonic feasibility range, plus a target/threshold. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(log n), or O(n log R) when each feasibility check is O(n) time, O(1) space.
**Pattern:** Binary search on a sorted range or monotonic feasibility predicate.

### 231. Maximum Running Time of N Computers (H)

**Problem:** Find the maximum possible running time of n computers over the allowed choices in the input. The input is a sorted array or monotonic feasibility range, plus a target/threshold. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(log n), or O(n log R) when each feasibility check is O(n) time, O(1) space.
**Pattern:** Binary search on a sorted range or monotonic feasibility predicate.

### 232. Find First and Last in rotated variants (M)

**Problem:** Find and return first and last in rotated variants from the supplied input; return the required sentinel/empty result when it does not exist. The input is a sorted array or monotonic feasibility range, plus a target/threshold. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(log n), or O(n log R) when each feasibility check is O(n) time, O(1) space.
**Pattern:** Binary search on a sorted range or monotonic feasibility predicate.

## 9. SORTING (implement from scratch once)

### 233. Bubble / Selection / Insertion sort (E)

**Problem:** Implement or apply Bubble / Selection / Insertion sort to the supplied input and return the result required by its standard formulation. The input is an array or list of records. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n log n) average/guaranteed for merge sort; selection average O(n) time, O(n) for merge sort; O(log n) stack for quicksort space.
**Pattern:** Comparison sorting, partitioning or selection.

### 234. Merge Sort (M★)

**Problem:** Sort an array by recursively sorting halves and merging them.

**Input:** `arr = [5,2,3,1]`
**Output:** `[1,2,3,5]`

**Target:** O(n log n) time, O(n) space.
**Pattern:** Divide and conquer; stable merge.

### 235. Quick Sort + Lomuto/Hoare partition (M★)

**Problem:** Implement in-place quicksort and understand both Lomuto and Hoare partition schemes.

**Input:** `arr = [5,1,4,2,8]`
**Output:** `[1,2,4,5,8]`

**Target:** Average O(n log n); worst O(n²) time, O(log n) average recursion space.
**Pattern:** Partition around a pivot; recurse on partitions.

### 236. Quickselect: Kth Largest Element (M★)

**Problem:** Return the k-th largest element without fully sorting the array.

**Input:** `nums = [3,2,1,5,6,4], k = 2`
**Output:** `5`

**Target:** Average O(n); worst O(n²) time, O(1) auxiliary, recursion dependent space.
**Pattern:** Quickselect with partition; optionally use a size-k heap.

### 237. Counting Sort / Radix Sort / Bucket Sort (M)

**Problem:** Implement or apply Counting Sort / Radix Sort / Bucket Sort to the supplied input and return the result required by its standard formulation. The input is an array or list of records. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n log n) average/guaranteed for merge sort; selection average O(n) time, O(n) for merge sort; O(log n) stack for quicksort space.
**Pattern:** Comparison sorting, partitioning or selection.

### 238. Sort an Array (M)

**Problem:** Sort/reorder the supplied data according to an array and return the resulting sequence. The input is an array or list of records. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n log n) average/guaranteed for merge sort; selection average O(n) time, O(n) for merge sort; O(log n) stack for quicksort space.
**Pattern:** Comparison sorting, partitioning or selection.

### 239. Sort List (M★)

**Problem:** Sort/reorder the supplied data according to list and return the resulting sequence. The input is an array or list of records. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n log n) average/guaranteed for merge sort; selection average O(n) time, O(n) for merge sort; O(log n) stack for quicksort space.
**Pattern:** Comparison sorting, partitioning or selection.

### 240. Wiggle Sort II (M)

**Problem:** Implement or apply Wiggle Sort II to the supplied input and return the result required by its standard formulation. The input is an array or list of records. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n log n) average/guaranteed for merge sort; selection average O(n) time, O(n) for merge sort; O(log n) stack for quicksort space.
**Pattern:** Comparison sorting, partitioning or selection.

### 241. Largest Number (M)

**Problem:** Solve the standard interview formulation of Largest Number: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array or list of records. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n log n) average/guaranteed for merge sort; selection average O(n) time, O(n) for merge sort; O(log n) stack for quicksort space.
**Pattern:** Comparison sorting, partitioning or selection.

### 242. Relative Sort Array (E)

**Problem:** Implement or apply Relative Sort Array to the supplied input and return the result required by its standard formulation. The input is an array or list of records. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n log n) average/guaranteed for merge sort; selection average O(n) time, O(n) for merge sort; O(log n) stack for quicksort space.
**Pattern:** Comparison sorting, partitioning or selection.

### 243. Sort Array by Increasing Frequency (E)

**Problem:** Sort/reorder the supplied data according to array by increasing frequency and return the resulting sequence. The input is an array or list of records. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n log n) average/guaranteed for merge sort; selection average O(n) time, O(n) for merge sort; O(log n) stack for quicksort space.
**Pattern:** Comparison sorting, partitioning or selection.

### 244. Merge Intervals via sorting (M)

**Problem:** Merge intervals via sorting according to the standard ordering and overlap rules, returning the combined result. The input is an array or list of records. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n log n) time, O(n) space.
**Pattern:** Sort intervals by start/end and sweep while maintaining the active merged/overlapping range.

## 10. LINKED LIST

### 245. Reverse Linked List (E★)

**Problem:** Reverse a singly linked list and return the new head.

**Input:** `head = 1 → 2 → 3 → null`
**Output:** `3 → 2 → 1 → null`

**Target:** O(n) time, O(1) iterative space.
**Pattern:** Maintain previous, current and next pointers.

### 246. Reverse Linked List II (M★)

**Problem:** Reverse linked list ii according to the standard problem rules, preserving any specified boundaries or grouping constraints. The input is the head node of one or more linked lists and any required parameter. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n), or O(n log n) for sorting/heap merging time, O(1) iterative unless recursion/heap is used space.
**Pattern:** Pointer traversal and link rewiring; use sentinel nodes where they simplify edge cases.

### 247. Reverse Linked List Recursively (E)

**Problem:** Reverse linked list recursively according to the standard problem rules, preserving any specified boundaries or grouping constraints. The input is the head node of one or more linked lists and any required parameter. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n), or O(n log n) for sorting/heap merging time, O(1) iterative unless recursion/heap is used space.
**Pattern:** Pointer traversal and link rewiring; use sentinel nodes where they simplify edge cases.

### 248. Middle of the Linked List (E★)

**Problem:** Return the middle node; for an even number of nodes, return the second middle.

**Input:** `head = 1 → 2 → 3 → 4 → 5 → 6`
**Output:** `4 → 5 → 6`

**Target:** O(n) time, O(1) space.
**Pattern:** Slow and fast pointers.

### 249. Merge Two Sorted Lists (E★)

**Problem:** Merge two sorted singly linked lists into one sorted list.

**Input:** `list1 = 1 → 2 → 4; list2 = 1 → 3 → 4`
**Output:** `1 → 1 → 2 → 3 → 4 → 4`

**Target:** O(m+n) time, O(1) iterative space.
**Pattern:** Dummy head and tail pointer.

### 250. Linked List Cycle (E★)

**Problem:** Determine whether a singly linked list contains a cycle.

**Input:** `head = 3 → 2 → 0 → -4, tail connects to node index 1`
**Output:** `true`

**Target:** O(n) time, O(1) space.
**Pattern:** Floyd tortoise-and-hare cycle detection.

### 251. Linked List Cycle II (M★)

**Problem:** Return the node where a cycle begins, or null if no cycle exists.

**Input:** `head = 3 → 2 → 0 → -4, tail connects to node index 1`
**Output:** `node with value 2`

**Target:** O(n) time, O(1) space.
**Pattern:** Floyd: detect meeting point, then move one pointer from head.

### 252. Remove Linked List Cycle (M)

**Problem:** Solve the standard interview formulation of Remove Linked List Cycle: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is the head node of one or more linked lists and any required parameter. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n), or O(n log n) for sorting/heap merging time, O(1) iterative unless recursion/heap is used space.
**Pattern:** Pointer traversal and link rewiring; use sentinel nodes where they simplify edge cases.

### 253. Palindrome Linked List (E★)

**Problem:** Determine whether a singly linked list reads identically forwards and backwards.

**Input:** `head = 1 → 2 → 2 → 1`
**Output:** `true`

**Target:** O(n) time, O(1) auxiliary space.
**Pattern:** Find middle, reverse second half, compare.

### 254. Intersection of Two Linked Lists (E★)

**Problem:** Solve the standard interview formulation of Intersection of Two Linked Lists: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is the head node of one or more linked lists and any required parameter. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n), or O(n log n) for sorting/heap merging time, O(1) iterative unless recursion/heap is used space.
**Pattern:** Pointer traversal and link rewiring; use sentinel nodes where they simplify edge cases.

### 255. Remove Nth Node From End (M★)

**Problem:** Remove the n-th node from the end of a singly linked list and return the head.

**Input:** `head = 1 → 2 → 3 → 4 → 5, n = 2`
**Output:** `1 → 2 → 3 → 5`

**Target:** O(n) time, O(1) space.
**Pattern:** Dummy node and lead/lag pointers separated by n nodes.

### 256. Remove Duplicates from Sorted List (E)

**Problem:** Implement or apply Remove Duplicates from Sorted List to the supplied input and return the result required by its standard formulation. The input is the head node of one or more linked lists and any required parameter. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n), or O(n log n) for sorting/heap merging time, O(1) iterative unless recursion/heap is used space.
**Pattern:** Pointer traversal and link rewiring; use sentinel nodes where they simplify edge cases.

### 257. Remove Duplicates from Sorted List II (M)

**Problem:** Implement or apply Remove Duplicates from Sorted List II to the supplied input and return the result required by its standard formulation. The input is the head node of one or more linked lists and any required parameter. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n), or O(n log n) for sorting/heap merging time, O(1) iterative unless recursion/heap is used space.
**Pattern:** Pointer traversal and link rewiring; use sentinel nodes where they simplify edge cases.

### 258. Remove Linked List Elements (E)

**Problem:** Solve the standard interview formulation of Remove Linked List Elements: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is the head node of one or more linked lists and any required parameter. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n), or O(n log n) for sorting/heap merging time, O(1) iterative unless recursion/heap is used space.
**Pattern:** Pointer traversal and link rewiring; use sentinel nodes where they simplify edge cases.

### 259. Delete Node in a Linked List (M)

**Problem:** Solve the standard interview formulation of Delete Node in a Linked List: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is the head node of one or more linked lists and any required parameter. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n), or O(n log n) for sorting/heap merging time, O(1) iterative unless recursion/heap is used space.
**Pattern:** Pointer traversal and link rewiring; use sentinel nodes where they simplify edge cases.

### 260. Reorder List (M★)

**Problem:** Reorder L0→L1→…→Ln as L0→Ln→L1→Ln-1… in place.

**Input:** `head = 1 → 2 → 3 → 4`
**Output:** `1 → 4 → 2 → 3`

**Target:** O(n) time, O(1) space.
**Pattern:** Find middle, reverse second half, weave two halves.

### 261. Add Two Numbers (M★)

**Problem:** Each linked list stores a non-negative integer in reverse digit order; return their sum in the same representation.

**Input:** `l1 = 2 → 4 → 3; l2 = 5 → 6 → 4`
**Output:** `7 → 0 → 8`

**Target:** O(max(m,n)) time, O(max(m,n)) output space.
**Pattern:** Digit-by-digit addition with carry.

### 262. Add Two Numbers II (M)

**Problem:** Solve the standard interview formulation of Add Two Numbers II: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is the head node of one or more linked lists and any required parameter. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n), or O(n log n) for sorting/heap merging time, O(1) iterative unless recursion/heap is used space.
**Pattern:** Pointer traversal and link rewiring; use sentinel nodes where they simplify edge cases.

### 263. Plus One Linked List (M)

**Problem:** Solve the standard interview formulation of Plus One Linked List: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is the head node of one or more linked lists and any required parameter. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n), or O(n log n) for sorting/heap merging time, O(1) iterative unless recursion/heap is used space.
**Pattern:** Pointer traversal and link rewiring; use sentinel nodes where they simplify edge cases.

### 264. Copy List with Random Pointer (M★)

**Problem:** Solve the standard interview formulation of Copy List with Random Pointer: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is the head node of one or more linked lists and any required parameter. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n), or O(n log n) for sorting/heap merging time, O(1) iterative unless recursion/heap is used space.
**Pattern:** Pointer traversal and link rewiring; use sentinel nodes where they simplify edge cases.

### 265. Rotate List (M)

**Problem:** Solve the standard interview formulation of Rotate List: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is the head node of one or more linked lists and any required parameter. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n), or O(n log n) for sorting/heap merging time, O(1) iterative unless recursion/heap is used space.
**Pattern:** Pointer traversal and link rewiring; use sentinel nodes where they simplify edge cases.

### 266. Swap Nodes in Pairs (M)

**Problem:** Solve the standard interview formulation of Swap Nodes in Pairs: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is the head node of one or more linked lists and any required parameter. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n), or O(n log n) for sorting/heap merging time, O(1) iterative unless recursion/heap is used space.
**Pattern:** Pointer traversal and link rewiring; use sentinel nodes where they simplify edge cases.

### 267. Odd Even Linked List (M)

**Problem:** Solve the standard interview formulation of Odd Even Linked List: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is the head node of one or more linked lists and any required parameter. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n), or O(n log n) for sorting/heap merging time, O(1) iterative unless recursion/heap is used space.
**Pattern:** Pointer traversal and link rewiring; use sentinel nodes where they simplify edge cases.

### 268. Partition List (M)

**Problem:** Solve the standard interview formulation of Partition List: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is the head node of one or more linked lists and any required parameter. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n), or O(n log n) for sorting/heap merging time, O(1) iterative unless recursion/heap is used space.
**Pattern:** Pointer traversal and link rewiring; use sentinel nodes where they simplify edge cases.

### 269. Flatten a Multilevel Doubly Linked List (M)

**Problem:** Solve the standard interview formulation of Flatten a Multilevel Doubly Linked List: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is the head node of one or more linked lists and any required parameter. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n), or O(n log n) for sorting/heap merging time, O(1) iterative unless recursion/heap is used space.
**Pattern:** Pointer traversal and link rewiring; use sentinel nodes where they simplify edge cases.

### 270. Flatten a Linked List (child pointers) (M)

**Problem:** Solve the standard interview formulation of Flatten a Linked List (child pointers): process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is the head node of one or more linked lists and any required parameter. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n), or O(n log n) for sorting/heap merging time, O(1) iterative unless recursion/heap is used space.
**Pattern:** Pointer traversal and link rewiring; use sentinel nodes where they simplify edge cases.

### 271. Pairs with Given Sum in Doubly Linked List (M)

**Problem:** Solve the standard interview formulation of Pairs with Given Sum in Doubly Linked List: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is the head node of one or more linked lists and any required parameter. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n), or O(n log n) for sorting/heap merging time, O(1) iterative unless recursion/heap is used space.
**Pattern:** Pointer traversal and link rewiring; use sentinel nodes where they simplify edge cases.

### 272. Convert Sorted List to BST (M)

**Problem:** Implement or apply Convert Sorted List to BST to the supplied input and return the result required by its standard formulation. The input is the head node of one or more linked lists and any required parameter. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n), or O(n log n) for sorting/heap merging time, O(1) iterative unless recursion/heap is used space.
**Pattern:** Pointer traversal and link rewiring; use sentinel nodes where they simplify edge cases.

### 273. Sort List (M★)

**Problem:** Sort/reorder the supplied data according to list and return the resulting sequence. The input is the head node of one or more linked lists and any required parameter. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n), or O(n log n) for sorting/heap merging time, O(1) iterative unless recursion/heap is used space.
**Pattern:** Pointer traversal and link rewiring; use sentinel nodes where they simplify edge cases.

### 274. Insertion Sort List (M)

**Problem:** Implement or apply Insertion Sort List to the supplied input and return the result required by its standard formulation. The input is the head node of one or more linked lists and any required parameter. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n), or O(n log n) for sorting/heap merging time, O(1) iterative unless recursion/heap is used space.
**Pattern:** Pointer traversal and link rewiring; use sentinel nodes where they simplify edge cases.

### 275. Split Linked List in Parts (M)

**Problem:** Solve the standard interview formulation of Split Linked List in Parts: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is the head node of one or more linked lists and any required parameter. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n), or O(n log n) for sorting/heap merging time, O(1) iterative unless recursion/heap is used space.
**Pattern:** Pointer traversal and link rewiring; use sentinel nodes where they simplify edge cases.

### 276. Reverse Nodes in k-Group (H★)

**Problem:** Reverse nodes in groups of k; leave any final incomplete group unchanged.

**Input:** `head = 1 → 2 → 3 → 4 → 5, k = 2`
**Output:** `2 → 1 → 4 → 3 → 5`

**Target:** O(n) time, O(1) iterative space.
**Pattern:** Check group length, reverse links, reconnect boundaries.

### 277. Merge k Sorted Lists (H★)

**Problem:** Merge k sorted linked lists into one sorted linked list.

**Input:** `lists = [[1,4,5],[1,3,4],[2,6]]`
**Output:** `1 → 1 → 2 → 3 → 4 → 4 → 5 → 6`

**Target:** O(N log k) time, O(k) space.
**Pattern:** Min-heap of current list heads or divide-and-conquer merging.

### 278. LRU Cache (M★)

**Problem:** Design a cache with get and put operations in O(1), evicting the least recently used entry when capacity is exceeded.

**Input:** `capacity = 2; put(1,1); put(2,2); get(1); put(3,3); get(2)`
**Output:** `get(1)=1; get(2)=-1`

**Target:** O(1) per operation time, O(capacity) space.
**Pattern:** Hash map + doubly linked list.

## 11. STACK

### 279. Valid Parentheses (E★)

**Problem:** Determine whether brackets are correctly matched and properly nested.

**Input:** `s = "()[]{}"`
**Output:** `true`

**Target:** O(n) time, O(n) space.
**Pattern:** Stack of opening brackets.

### 280. Min Stack (M★)

**Problem:** Design a stack supporting push, pop, top and retrieving the minimum element in O(1).

**Input:** `push(-2), push(0), push(-3), getMin(), pop(), top(), getMin()`
**Output:** `-3, 0, -2`

**Target:** O(1) per operation time, O(n) space.
**Pattern:** Auxiliary minimum stack or encoded values.

### 281. Implement Queue using Stacks (E)

**Problem:** Implement the Implement Queue using Stacks interface/technique and support the operations required by its standard interview formulation, preserving its stated invariants and complexity targets. The input is an operation sequence, string or array. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) or O(V+E) time, O(n) or O(V) space.
**Pattern:** FIFO queue / deque; for graph problems, mark on enqueue to avoid duplicate visits.

### 282. Implement Stack using Queues (E)

**Problem:** Implement the Implement Stack using Queues interface/technique and support the operations required by its standard interview formulation, preserving its stated invariants and complexity targets. The input is an operation sequence, string or array. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) or O(V+E) time, O(n) or O(V) space.
**Pattern:** FIFO queue / deque; for graph problems, mark on enqueue to avoid duplicate visits.

### 283. Baseball Game (E)

**Problem:** Solve the standard interview formulation of Baseball Game: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an operation sequence, string or array. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(n) amortized time, O(n) space.
**Pattern:** Stack simulation, expression parsing or monotonic stack of values/indices.

### 284. Backspace String Compare (E)

**Problem:** Solve the standard interview formulation of Backspace String Compare: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an operation sequence, string or array. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(n) amortized time, O(n) space.
**Pattern:** Stack simulation, expression parsing or monotonic stack of values/indices.

### 285. Next Greater Element I (E★)

**Problem:** For each query value from nums1, find the first greater value to its right in nums2, or -1.

**Input:** `nums1 = [4,1,2], nums2 = [1,3,4,2]`
**Output:** `[-1,3,-1]`

**Target:** O(n+m) time, O(n) space.
**Pattern:** Monotonic decreasing stack; map next-greater values.

### 286. Next Greater Element II (M★)

**Problem:** Solve the standard interview formulation of Next Greater Element II: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an operation sequence, string or array. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) time, O(n) space.
**Pattern:** Monotonic stack of values/indices; each element is pushed and popped at most once.

### 287. Next Smaller Element (M)

**Problem:** Solve the standard interview formulation of Next Smaller Element: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an operation sequence, string or array. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(n) amortized time, O(n) space.
**Pattern:** Stack simulation, expression parsing or monotonic stack of values/indices.

### 288. Previous Smaller / Greater Element (M)

**Problem:** Solve the standard interview formulation of Previous Smaller / Greater Element: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an operation sequence, string or array. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(n) amortized time, O(n) space.
**Pattern:** Stack simulation, expression parsing or monotonic stack of values/indices.

### 289. Daily Temperatures (M★)

**Problem:** For each day, return how many days until a warmer temperature; return 0 when none exists.

**Input:** `temperatures = [73,74,75,71,69,72,76,73]`
**Output:** `[1,1,4,2,1,1,0,0]`

**Target:** O(n) time, O(n) space.
**Pattern:** Monotonic decreasing stack of indices.

### 290. Online Stock Span (M★)

**Problem:** Solve the standard interview formulation of Online Stock Span: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an operation sequence, string or array. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(n) amortized time, O(n) space.
**Pattern:** Stack simulation, expression parsing or monotonic stack of values/indices.

### 291. Car Fleet (M★)

**Problem:** Solve the standard interview formulation of Car Fleet: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an operation sequence, string or array. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(n) amortized time, O(n) space.
**Pattern:** Stack simulation, expression parsing or monotonic stack of values/indices.

### 292. Asteroid Collision (M★)

**Problem:** Solve the standard interview formulation of Asteroid Collision: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an operation sequence, string or array. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(n) amortized time, O(n) space.
**Pattern:** Stack simulation, expression parsing or monotonic stack of values/indices.

### 293. Remove K Digits (M★)

**Problem:** Solve the standard interview formulation of Remove K Digits: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an operation sequence, string or array. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(n) amortized time, O(n) space.
**Pattern:** Stack simulation, expression parsing or monotonic stack of values/indices.

### 294. Remove Duplicate Letters (M★)

**Problem:** Solve the standard interview formulation of Remove Duplicate Letters: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an operation sequence, string or array. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(n) amortized time, O(n) space.
**Pattern:** Stack simulation, expression parsing or monotonic stack of values/indices.

### 295. Evaluate Reverse Polish Notation (M★)

**Problem:** Solve the standard interview formulation of Evaluate Reverse Polish Notation: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an operation sequence, string or array. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(n) amortized time, O(n) space.
**Pattern:** Stack simulation, expression parsing or monotonic stack of values/indices.

### 296. Decode String (M★)

**Problem:** Decode repetitions in expressions such as k[encoded_string], including nested expressions.

**Input:** `s = "3[a2[c]]"`
**Output:** `"accaccacc"`

**Target:** O(decoded output length) time, O(n) stack space.
**Pattern:** Stack of repeat counts and partial strings.

### 297. Simplify Path (M)

**Problem:** Solve the standard interview formulation of Simplify Path: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an operation sequence, string or array. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(n) amortized time, O(n) space.
**Pattern:** Stack simulation, expression parsing or monotonic stack of values/indices.

### 298. Basic Calculator (H★)

**Problem:** Solve the standard interview formulation of Basic Calculator: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an operation sequence, string or array. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(n) amortized time, O(n) space.
**Pattern:** Stack simulation, expression parsing or monotonic stack of values/indices.

### 299. Basic Calculator II (M★)

**Problem:** Solve the standard interview formulation of Basic Calculator II: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an operation sequence, string or array. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(n) amortized time, O(n) space.
**Pattern:** Stack simulation, expression parsing or monotonic stack of values/indices.

### 300. Sum of Subarray Minimums (M★)

**Problem:** Solve the standard interview formulation of Sum of Subarray Minimums: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an operation sequence, string or array. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) time, O(n) space.
**Pattern:** Monotonic stack of values/indices; each element is pushed and popped at most once.

### 301. Sum of Subarray Ranges (M)

**Problem:** Solve the standard interview formulation of Sum of Subarray Ranges: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an operation sequence, string or array. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(n) amortized time, O(n) space.
**Pattern:** Stack simulation, expression parsing or monotonic stack of values/indices.

### 302. Largest Rectangle in Histogram (H★)

**Problem:** Find the largest rectangle area that can be formed using consecutive histogram bars.

**Input:** `heights = [2,1,5,6,2,3]`
**Output:** `10`

**Target:** O(n) time, O(n) space.
**Pattern:** Monotonic increasing stack; previous/next smaller boundaries.

### 303. Maximal Rectangle (H★)

**Problem:** Solve the standard interview formulation of Maximal Rectangle: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an operation sequence, string or array. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(n) amortized time, O(n) space.
**Pattern:** Stack simulation, expression parsing or monotonic stack of values/indices.

### 304. Trapping Rain Water via stack (H)

**Problem:** Solve the standard interview formulation of Trapping Rain Water via stack: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an operation sequence, string or array. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(n) amortized time, O(n) space.
**Pattern:** Stack simulation, expression parsing or monotonic stack of values/indices.

### 305. 132 Pattern (M)

**Problem:** Solve the standard interview formulation of 132 Pattern: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an operation sequence, string or array. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(n) amortized time, O(n) space.
**Pattern:** Stack simulation, expression parsing or monotonic stack of values/indices.

### 306. Maximum Frequency Stack (H)

**Problem:** Find the maximum possible frequency stack over the allowed choices in the input. The input is an operation sequence, string or array. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(n) amortized time, O(n) space.
**Pattern:** Stack simulation, expression parsing or monotonic stack of values/indices.

### 307. Score of Parentheses (M)

**Problem:** Solve the standard interview formulation of Score of Parentheses: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an operation sequence, string or array. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(n) amortized time, O(n) space.
**Pattern:** Stack simulation, expression parsing or monotonic stack of values/indices.

### 308. Longest Valid Parentheses (H★)

**Problem:** Find the longest valid parentheses satisfying the problem constraints. The input is an operation sequence, string or array. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(n) amortized time, O(n) space.
**Pattern:** Stack simulation, expression parsing or monotonic stack of values/indices.

### 309. Minimum Remove to Make Valid Parentheses (M★)

**Problem:** Find the minimum possible remove to make valid parentheses over the allowed choices in the input. The input is an operation sequence, string or array. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(n) amortized time, O(n) space.
**Pattern:** Stack simulation, expression parsing or monotonic stack of values/indices.

### 310. Remove Outermost Parentheses (E)

**Problem:** Solve the standard interview formulation of Remove Outermost Parentheses: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an operation sequence, string or array. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(n) amortized time, O(n) space.
**Pattern:** Stack simulation, expression parsing or monotonic stack of values/indices.

### 311. Number of Visible People in a Queue (H)

**Problem:** Compute the number of visible people in a queue for the given input. The input is an operation sequence, string or array. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) or O(V+E) time, O(n) or O(V) space.
**Pattern:** FIFO queue / deque; for graph problems, mark on enqueue to avoid duplicate visits.

### 312. Stock Span / Celebrity Problem (M)

**Problem:** Implement or apply Stock Span / Celebrity Problem to the supplied input and return the result required by its standard formulation. The input is an operation sequence, string or array. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(n) amortized time, O(n) space.
**Pattern:** Stack simulation, expression parsing or monotonic stack of values/indices.

## 12. QUEUE & DEQUE

### 313. Design Circular Queue (M)

**Problem:** Implement the Design Circular Queue interface/technique and support the operations required by its standard interview formulation, preserving its stated invariants and complexity targets. The input is an operation sequence, stream or graph/grid input. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) or O(V+E) time, O(n) or O(V) space.
**Pattern:** FIFO queue / deque; for graph problems, mark on enqueue to avoid duplicate visits.

### 314. Design Circular Deque (M)

**Problem:** Implement the Design Circular Deque interface/technique and support the operations required by its standard interview formulation, preserving its stated invariants and complexity targets. The input is an operation sequence, stream or graph/grid input. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) or O(V+E) time, O(n) or O(V) space.
**Pattern:** FIFO queue / deque; for graph problems, mark on enqueue to avoid duplicate visits.

### 315. Number of Recent Calls (E)

**Problem:** Compute the number of recent calls for the given input. The input is an operation sequence, stream or graph/grid input. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) or O(V+E) time, O(n) or O(V) space.
**Pattern:** FIFO queue / deque; for graph problems, mark on enqueue to avoid duplicate visits.

### 316. Moving Average from Data Stream (E)

**Problem:** Solve the standard interview formulation of Moving Average from Data Stream: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an operation sequence, stream or graph/grid input. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) or O(V+E) time, O(n) or O(V) space.
**Pattern:** FIFO queue / deque; for graph problems, mark on enqueue to avoid duplicate visits.

### 317. First Non-Repeating Character in a Stream (M)

**Problem:** Solve the standard interview formulation of First Non-Repeating Character in a Stream: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an operation sequence, stream or graph/grid input. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) or O(V+E) time, O(n) or O(V) space.
**Pattern:** FIFO queue / deque; for graph problems, mark on enqueue to avoid duplicate visits.

### 318. Generate Binary Numbers 1 to N (E)

**Problem:** Solve the standard interview formulation of Generate Binary Numbers 1 to N: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an operation sequence, stream or graph/grid input. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) or O(V+E) time, O(n) or O(V) space.
**Pattern:** FIFO queue / deque; for graph problems, mark on enqueue to avoid duplicate visits.

### 319. Reveal Cards in Increasing Order (M)

**Problem:** Solve the standard interview formulation of Reveal Cards in Increasing Order: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an operation sequence, stream or graph/grid input. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) or O(V+E) time, O(n) or O(V) space.
**Pattern:** FIFO queue / deque; for graph problems, mark on enqueue to avoid duplicate visits.

### 320. Dota2 Senate (M)

**Problem:** Solve the standard interview formulation of Dota2 Senate: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an operation sequence, stream or graph/grid input. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) or O(V+E) time, O(n) or O(V) space.
**Pattern:** FIFO queue / deque; for graph problems, mark on enqueue to avoid duplicate visits.

### 321. Time Needed to Buy Tickets (E)

**Problem:** Solve the standard interview formulation of Time Needed to Buy Tickets: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an operation sequence, stream or graph/grid input. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) or O(V+E) time, O(n) or O(V) space.
**Pattern:** FIFO queue / deque; for graph problems, mark on enqueue to avoid duplicate visits.

### 322. Shortest Subarray with Sum at Least K (H★)

**Problem:** Find the shortest subarray with sum at least k satisfying the problem constraints. The input is an operation sequence, stream or graph/grid input. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) or O(V+E) time, O(n) or O(V) space.
**Pattern:** FIFO queue / deque; for graph problems, mark on enqueue to avoid duplicate visits.

### 323. Constrained Subsequence Sum (H)

**Problem:** Solve the standard interview formulation of Constrained Subsequence Sum: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an operation sequence, stream or graph/grid input. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) or O(V+E) time, O(n) or O(V) space.
**Pattern:** FIFO queue / deque; for graph problems, mark on enqueue to avoid duplicate visits.

### 324. Jump Game VI (M)

**Problem:** Solve the standard interview formulation of Jump Game VI: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an operation sequence, stream or graph/grid input. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) or O(V+E) time, O(n) or O(V) space.
**Pattern:** FIFO queue / deque; for graph problems, mark on enqueue to avoid duplicate visits.

## 13. RECURSION & BACKTRACKING

### 325. Print 1 to N / N to 1 using recursion (E)

**Problem:** Solve the standard interview formulation of Print 1 to N / N to 1 using recursion: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a set/sequence, target or constraint set. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Exponential worst case; depends on branching factor and depth time, O(recursion depth), excluding output space.
**Pattern:** Backtracking: choose → recurse → undo; prune invalid partial states early.

### 326. Sum, Factorial, Power using recursion (E)

**Problem:** Solve the standard interview formulation of Sum, Factorial, Power using recursion: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a set/sequence, target or constraint set. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Exponential worst case; depends on branching factor and depth time, O(recursion depth), excluding output space.
**Pattern:** Backtracking: choose → recurse → undo; prune invalid partial states early.

### 327. Tower of Hanoi (E)

**Problem:** Solve the standard interview formulation of Tower of Hanoi: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a set/sequence, target or constraint set. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Exponential worst case; depends on branching factor and depth time, O(recursion depth), excluding output space.
**Pattern:** Backtracking: choose → recurse → undo; prune invalid partial states early.

### 328. Josephus Problem (M)

**Problem:** Implement or apply Josephus Problem to the supplied input and return the result required by its standard formulation. The input is a set/sequence, target or constraint set. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Exponential worst case; depends on branching factor and depth time, O(recursion depth), excluding output space.
**Pattern:** Backtracking: choose → recurse → undo; prune invalid partial states early.

### 329. Print all Subsequences (M)

**Problem:** Solve the standard interview formulation of Print all Subsequences: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a set/sequence, target or constraint set. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Exponential worst case; depends on branching factor and depth time, O(recursion depth), excluding output space.
**Pattern:** Backtracking: choose → recurse → undo; prune invalid partial states early.

### 330. Subsets (M★)

**Problem:** Return every subset of a set of distinct values.

**Input:** `nums = [1,2]`
**Output:** `[[],[1],[2],[1,2]]`

**Target:** O(n·2^n) time, O(n) recursion, excluding output space.
**Pattern:** Backtracking or bitmask enumeration.

### 331. Subsets II (M★)

**Problem:** Solve the standard interview formulation of Subsets II: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a set/sequence, target or constraint set. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Exponential worst case; depends on branching factor and depth time, O(recursion depth), excluding output space.
**Pattern:** Backtracking: choose → recurse → undo; prune invalid partial states early.

### 332. Permutations (M★)

**Problem:** Return all possible orderings of distinct input values.

**Input:** `nums = [1,2,3]`
**Output:** `6 permutations`

**Target:** O(n·n!) time, O(n) recursion, excluding output space.
**Pattern:** Backtracking with used flags or swap-in-place.

### 333. Permutations II (M)

**Problem:** Solve the standard interview formulation of Permutations II: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a set/sequence, target or constraint set. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Exponential worst case; depends on branching factor and depth time, O(recursion depth), excluding output space.
**Pattern:** Backtracking: choose → recurse → undo; prune invalid partial states early.

### 334. Permutation Sequence (H)

**Problem:** Solve the standard interview formulation of Permutation Sequence: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a set/sequence, target or constraint set. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Exponential worst case; depends on branching factor and depth time, O(recursion depth), excluding output space.
**Pattern:** Backtracking: choose → recurse → undo; prune invalid partial states early.

### 335. Combinations (M)

**Problem:** Solve the standard interview formulation of Combinations: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a set/sequence, target or constraint set. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Exponential worst case; depends on branching factor and depth time, O(recursion depth), excluding output space.
**Pattern:** Backtracking: choose → recurse → undo; prune invalid partial states early.

### 336. Combination Sum (M★)

**Problem:** Return unique combinations of candidate values that sum to target; each candidate may be reused.

**Input:** `candidates = [2,3,6,7], target = 7`
**Output:** `[[2,2,3],[7]]`

**Target:** Exponential in output size time, O(target/minCandidate) recursion space.
**Pattern:** Backtracking; choose current candidate again or advance.

### 337. Combination Sum II (M★)

**Problem:** Solve the standard interview formulation of Combination Sum II: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a set/sequence, target or constraint set. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Exponential worst case; depends on branching factor and depth time, O(recursion depth), excluding output space.
**Pattern:** Backtracking: choose → recurse → undo; prune invalid partial states early.

### 338. Combination Sum III (M)

**Problem:** Solve the standard interview formulation of Combination Sum III: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a set/sequence, target or constraint set. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Exponential worst case; depends on branching factor and depth time, O(recursion depth), excluding output space.
**Pattern:** Backtracking: choose → recurse → undo; prune invalid partial states early.

### 339. Letter Combinations of a Phone Number (M★)

**Problem:** Solve the standard interview formulation of Letter Combinations of a Phone Number: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a set/sequence, target or constraint set. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Exponential worst case; depends on branching factor and depth time, O(recursion depth), excluding output space.
**Pattern:** Backtracking: choose → recurse → undo; prune invalid partial states early.

### 340. Generate Parentheses (M★)

**Problem:** Generate all well-formed parentheses strings containing n pairs.

**Input:** `n = 3`
**Output:** `["((()))","(()())","(())()","()(())","()()()"]`

**Target:** O(Cn·n) time, O(n) recursion, excluding output space.
**Pattern:** Backtracking; never let closes exceed opens.

### 341. Palindrome Partitioning (M★)

**Problem:** Solve the standard interview formulation of Palindrome Partitioning: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a set/sequence, target or constraint set. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Exponential worst case; depends on branching factor and depth time, O(recursion depth), excluding output space.
**Pattern:** Backtracking: choose → recurse → undo; prune invalid partial states early.

### 342. Word Search (M★)

**Problem:** Determine whether a word can be formed by adjacent horizontal/vertical cells in a grid without reusing a cell.

**Input:** `board = [["A","B"],["C","D"]], word = "AB"`
**Output:** `true`

**Target:** O(mn·4^L) time, O(L) space.
**Pattern:** DFS backtracking with temporary visited marking.

### 343. Word Search II (H★)

**Problem:** Solve the standard interview formulation of Word Search II: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a set/sequence, target or constraint set. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Exponential worst case; depends on branching factor and depth time, O(recursion depth), excluding output space.
**Pattern:** Backtracking: choose → recurse → undo; prune invalid partial states early.

### 344. Restore IP Addresses (M)

**Problem:** Solve the standard interview formulation of Restore IP Addresses: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a set/sequence, target or constraint set. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Exponential worst case; depends on branching factor and depth time, O(recursion depth), excluding output space.
**Pattern:** Backtracking: choose → recurse → undo; prune invalid partial states early.

### 345. Partition to K Equal Sum Subsets (M★)

**Problem:** Solve the standard interview formulation of Partition to K Equal Sum Subsets: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a set/sequence, target or constraint set. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Exponential worst case; depends on branching factor and depth time, O(recursion depth), excluding output space.
**Pattern:** Backtracking: choose → recurse → undo; prune invalid partial states early.

### 346. Matchsticks to Square (M)

**Problem:** Solve the standard interview formulation of Matchsticks to Square: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a set/sequence, target or constraint set. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Exponential worst case; depends on branching factor and depth time, O(recursion depth), excluding output space.
**Pattern:** Backtracking: choose → recurse → undo; prune invalid partial states early.

### 347. Beautiful Arrangement (M)

**Problem:** Solve the standard interview formulation of Beautiful Arrangement: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a set/sequence, target or constraint set. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Exponential worst case; depends on branching factor and depth time, O(recursion depth), excluding output space.
**Pattern:** Backtracking: choose → recurse → undo; prune invalid partial states early.

### 348. Rat in a Maze (M)

**Problem:** Solve the standard interview formulation of Rat in a Maze: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a set/sequence, target or constraint set. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Exponential worst case; depends on branching factor and depth time, O(recursion depth), excluding output space.
**Pattern:** Backtracking: choose → recurse → undo; prune invalid partial states early.

### 349. N-Queens (H★)

**Problem:** Place n queens on an n×n chessboard so no two queens attack each other; return all valid boards.

**Input:** `n = 4`
**Output:** `2 solutions`

**Target:** O(n!) upper-bound search time, O(n) state plus output space.
**Pattern:** Backtracking with occupied columns and diagonals.

### 350. N-Queens II (H)

**Problem:** Solve the standard interview formulation of N-Queens II: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a set/sequence, target or constraint set. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Exponential worst case; depends on branching factor and depth time, O(recursion depth), excluding output space.
**Pattern:** Backtracking: choose → recurse → undo; prune invalid partial states early.

### 351. Sudoku Solver (H★)

**Problem:** Fill an incomplete 9×9 Sudoku grid so each row, column and 3×3 box contains digits 1–9 exactly once.

**Input:** `board = standard partially filled Sudoku grid`
**Output:** `completed valid Sudoku board`

**Target:** Exponential worst case time, O(1) board state; recursion depth ≤ 81 space.
**Pattern:** Constraint-based backtracking; choose the most constrained empty cell.

### 352. M-Coloring Problem (M)

**Problem:** Implement or apply M-Coloring Problem to the supplied input and return the result required by its standard formulation. The input is a set/sequence, target or constraint set. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Exponential worst case; depends on branching factor and depth time, O(recursion depth), excluding output space.
**Pattern:** Backtracking: choose → recurse → undo; prune invalid partial states early.

### 353. Word Break II (H★)

**Problem:** Solve the standard interview formulation of Word Break II: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a set/sequence, target or constraint set. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Exponential worst case; depends on branching factor and depth time, O(recursion depth), excluding output space.
**Pattern:** Backtracking: choose → recurse → undo; prune invalid partial states early.

### 354. Expression Add Operators (H★)

**Problem:** Solve the standard interview formulation of Expression Add Operators: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a set/sequence, target or constraint set. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Exponential worst case; depends on branching factor and depth time, O(recursion depth), excluding output space.
**Pattern:** Backtracking: choose → recurse → undo; prune invalid partial states early.

### 355. Splitting a String Into Descending Consecutive Values (M)

**Problem:** Solve the standard interview formulation of Splitting a String Into Descending Consecutive Values: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a set/sequence, target or constraint set. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Exponential worst case; depends on branching factor and depth time, O(recursion depth), excluding output space.
**Pattern:** Backtracking: choose → recurse → undo; prune invalid partial states early.

### 356. Binary Watch (E)

**Problem:** Solve the standard interview formulation of Binary Watch: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a set/sequence, target or constraint set. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Exponential worst case; depends on branching factor and depth time, O(recursion depth), excluding output space.
**Pattern:** Backtracking: choose → recurse → undo; prune invalid partial states early.

### 357. Gray Code via recursion (M)

**Problem:** Solve the standard interview formulation of Gray Code via recursion: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a set/sequence, target or constraint set. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Exponential worst case; depends on branching factor and depth time, O(recursion depth), excluding output space.
**Pattern:** Backtracking: choose → recurse → undo; prune invalid partial states early.

### 358. Unique Paths III (H)

**Problem:** Solve the standard interview formulation of Unique Paths III: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a set/sequence, target or constraint set. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Exponential worst case; depends on branching factor and depth time, O(recursion depth), excluding output space.
**Pattern:** Backtracking: choose → recurse → undo; prune invalid partial states early.

### 359. The k-th Lexicographical String of All Happy Strings (M)

**Problem:** Solve the standard interview formulation of The k-th Lexicographical String of All Happy Strings: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a set/sequence, target or constraint set. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Exponential worst case; depends on branching factor and depth time, O(recursion depth), excluding output space.
**Pattern:** Backtracking: choose → recurse → undo; prune invalid partial states early.

## 14. BINARY TREES

### 360. Inorder / Preorder / Postorder, recursive (E★)

**Problem:** Solve the standard interview formulation of Inorder / Preorder / Postorder, recursive: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is the root of a binary tree and any target node/value. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) for full traversal; O(h) for search in BST time, O(h) recursive stack or O(width) BFS space.
**Pattern:** Tree DFS/BFS; choose preorder, inorder or postorder based on when node/child information is needed.

### 361. Inorder / Preorder / Postorder, iterative (M★)

**Problem:** Solve the standard interview formulation of Inorder / Preorder / Postorder, iterative: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is the root of a binary tree and any target node/value. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) for full traversal; O(h) for search in BST time, O(h) recursive stack or O(width) BFS space.
**Pattern:** Tree DFS/BFS; choose preorder, inorder or postorder based on when node/child information is needed.

### 362. Morris Inorder / Preorder (M)

**Problem:** Solve the standard interview formulation of Morris Inorder / Preorder: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is the root of a binary tree and any target node/value. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) for full traversal; O(h) for search in BST time, O(h) recursive stack or O(width) BFS space.
**Pattern:** Tree DFS/BFS; choose preorder, inorder or postorder based on when node/child information is needed.

### 363. Level Order Traversal (M★)

**Problem:** Given the relevant input structure, perform Level Order Traversal and return the required traversal/order or derived result. The input is the root of a binary tree and any target node/value. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) for full traversal; O(h) for search in BST time, O(h) recursive stack or O(width) BFS space.
**Pattern:** Tree DFS/BFS; choose preorder, inorder or postorder based on when node/child information is needed.

### 364. Level Order Traversal II (M)

**Problem:** Given the relevant input structure, perform Level Order Traversal II and return the required traversal/order or derived result. The input is the root of a binary tree and any target node/value. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) for full traversal; O(h) for search in BST time, O(h) recursive stack or O(width) BFS space.
**Pattern:** Tree DFS/BFS; choose preorder, inorder or postorder based on when node/child information is needed.

### 365. Zigzag Level Order Traversal (M★)

**Problem:** Given the relevant input structure, perform Zigzag Level Order Traversal and return the required traversal/order or derived result. The input is the root of a binary tree and any target node/value. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) for full traversal; O(h) for search in BST time, O(h) recursive stack or O(width) BFS space.
**Pattern:** Tree DFS/BFS; choose preorder, inorder or postorder based on when node/child information is needed.

### 366. Maximum Depth (E★)

**Problem:** Return the maximum number of nodes on a root-to-leaf path in a binary tree.

**Input:** `root = [3,9,20,null,null,15,7]`
**Output:** `3`

**Target:** O(n) time, O(h) recursive stack space.
**Pattern:** DFS recursion or iterative level-order traversal.

### 367. Minimum Depth (E)

**Problem:** Find the minimum possible depth over the allowed choices in the input. The input is the root of a binary tree and any target node/value. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) for full traversal; O(h) for search in BST time, O(h) recursive stack or O(width) BFS space.
**Pattern:** Tree DFS/BFS; choose preorder, inorder or postorder based on when node/child information is needed.

### 368. Balanced Binary Tree (E★)

**Problem:** Determine whether every node has left/right subtree heights differing by at most one.

**Input:** `root = [3,9,20,null,null,15,7]`
**Output:** `true`

**Target:** O(n) time, O(h) space.
**Pattern:** Postorder height computation with early failure sentinel.

### 369. Diameter of Binary Tree (E★)

**Problem:** Return the number of edges on the longest path between any two nodes in a binary tree.

**Input:** `root = [1,2,3,4,5]`
**Output:** `3`

**Target:** O(n) time, O(h) space.
**Pattern:** Postorder DFS returning height while updating best diameter.

### 370. Same Tree (E★)

**Problem:** Determine whether two binary trees have identical structure and node values.

**Input:** `p = [1,2,3], q = [1,2,3]`
**Output:** `true`

**Target:** O(n) time, O(h) space.
**Pattern:** Recursive paired DFS or iterative queue.

### 371. Symmetric Tree (E★)

**Problem:** Solve the standard interview formulation of Symmetric Tree: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is the root of a binary tree and any target node/value. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) for full traversal; O(h) for search in BST time, O(h) recursive stack or O(width) BFS space.
**Pattern:** Tree DFS/BFS; choose preorder, inorder or postorder based on when node/child information is needed.

### 372. Invert Binary Tree (E★)

**Problem:** Swap left and right children at every node.

**Input:** `root = [4,2,7,1,3,6,9]`
**Output:** `[4,7,2,9,6,3,1]`

**Target:** O(n) time, O(h) space.
**Pattern:** DFS or BFS; swap child references.

### 373. Subtree of Another Tree (E★)

**Problem:** Solve the standard interview formulation of Subtree of Another Tree: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is the root of a binary tree and any target node/value. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) for full traversal; O(h) for search in BST time, O(h) recursive stack or O(width) BFS space.
**Pattern:** Tree DFS/BFS; choose preorder, inorder or postorder based on when node/child information is needed.

### 374. Path Sum (E)

**Problem:** Solve the standard interview formulation of Path Sum: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is the root of a binary tree and any target node/value. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) for full traversal; O(h) for search in BST time, O(h) recursive stack or O(width) BFS space.
**Pattern:** Tree DFS/BFS; choose preorder, inorder or postorder based on when node/child information is needed.

### 375. Path Sum II (M★)

**Problem:** Solve the standard interview formulation of Path Sum II: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is the root of a binary tree and any target node/value. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) for full traversal; O(h) for search in BST time, O(h) recursive stack or O(width) BFS space.
**Pattern:** Tree DFS/BFS; choose preorder, inorder or postorder based on when node/child information is needed.

### 376. Path Sum III (M★)

**Problem:** Solve the standard interview formulation of Path Sum III: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is the root of a binary tree and any target node/value. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) for full traversal; O(h) for search in BST time, O(h) recursive stack or O(width) BFS space.
**Pattern:** Tree DFS/BFS; choose preorder, inorder or postorder based on when node/child information is needed.

### 377. Binary Tree Paths (E)

**Problem:** Solve the standard interview formulation of Binary Tree Paths: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is the root of a binary tree and any target node/value. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) for full traversal; O(h) for search in BST time, O(h) recursive stack or O(width) BFS space.
**Pattern:** Tree DFS/BFS; choose preorder, inorder or postorder based on when node/child information is needed.

### 378. Sum Root to Leaf Numbers (M)

**Problem:** Solve the standard interview formulation of Sum Root to Leaf Numbers: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is the root of a binary tree and any target node/value. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) for full traversal; O(h) for search in BST time, O(h) recursive stack or O(width) BFS space.
**Pattern:** Tree DFS/BFS; choose preorder, inorder or postorder based on when node/child information is needed.

### 379. Count Good Nodes (M★)

**Problem:** Count the number of good nodes cases that satisfy the standard problem conditions. The input is the root of a binary tree and any target node/value. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) for full traversal; O(h) for search in BST time, O(h) recursive stack or O(width) BFS space.
**Pattern:** Tree DFS/BFS; choose preorder, inorder or postorder based on when node/child information is needed.

### 380. Sum of Left Leaves (E)

**Problem:** Solve the standard interview formulation of Sum of Left Leaves: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is the root of a binary tree and any target node/value. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) for full traversal; O(h) for search in BST time, O(h) recursive stack or O(width) BFS space.
**Pattern:** Tree DFS/BFS; choose preorder, inorder or postorder based on when node/child information is needed.

### 381. Binary Tree Maximum Path Sum (H★)

**Problem:** Return the maximum sum of any non-empty path in a binary tree; a path may start and end anywhere.

**Input:** `root = [1,2,3]`
**Output:** `6`

**Target:** O(n) time, O(h) space.
**Pattern:** Postorder DFS; propagate one-sided gain and update through-node best.

### 382. Lowest Common Ancestor of a Binary Tree (M★)

**Problem:** Return the lowest node that is an ancestor of both target nodes in a binary tree.

**Input:** `tree = [3,5,1,6,2,0,8,null,null,7,4], p=5, q=1`
**Output:** `3`

**Target:** O(n) time, O(h) space.
**Pattern:** Postorder recursion; propagate found target nodes.

### 383. Right Side View (M★)

**Problem:** Solve the standard interview formulation of Right Side View: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is the root of a binary tree and any target node/value. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) for full traversal; O(h) for search in BST time, O(h) recursive stack or O(width) BFS space.
**Pattern:** Tree DFS/BFS; choose preorder, inorder or postorder based on when node/child information is needed.

### 384. Left View / Top View / Bottom View (M★)

**Problem:** Solve the standard interview formulation of Left View / Top View / Bottom View: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is the root of a binary tree and any target node/value. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) for full traversal; O(h) for search in BST time, O(h) recursive stack or O(width) BFS space.
**Pattern:** Tree DFS/BFS; choose preorder, inorder or postorder based on when node/child information is needed.

### 385. Vertical Order Traversal (H★)

**Problem:** Given the relevant input structure, perform Vertical Order Traversal and return the required traversal/order or derived result. The input is the root of a binary tree and any target node/value. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) for full traversal; O(h) for search in BST time, O(h) recursive stack or O(width) BFS space.
**Pattern:** Tree DFS/BFS; choose preorder, inorder or postorder based on when node/child information is needed.

### 386. Boundary Traversal (M)

**Problem:** Given the relevant input structure, perform Boundary Traversal and return the required traversal/order or derived result. The input is the root of a binary tree and any target node/value. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) for full traversal; O(h) for search in BST time, O(h) recursive stack or O(width) BFS space.
**Pattern:** Tree DFS/BFS; choose preorder, inorder or postorder based on when node/child information is needed.

### 387. Diagonal Traversal (M)

**Problem:** Given the relevant input structure, perform Diagonal Traversal and return the required traversal/order or derived result. The input is the root of a binary tree and any target node/value. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) for full traversal; O(h) for search in BST time, O(h) recursive stack or O(width) BFS space.
**Pattern:** Tree DFS/BFS; choose preorder, inorder or postorder based on when node/child information is needed.

### 388. Maximum Width of Binary Tree (M★)

**Problem:** Find the maximum possible width of binary tree over the allowed choices in the input. The input is the root of a binary tree and any target node/value. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) for full traversal; O(h) for search in BST time, O(h) recursive stack or O(width) BFS space.
**Pattern:** Tree DFS/BFS; choose preorder, inorder or postorder based on when node/child information is needed.

### 389. Check Children Sum Property (E)

**Problem:** Determine whether children sum property holds for the supplied input and return a boolean result. The input is the root of a binary tree and any target node/value. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) for full traversal; O(h) for search in BST time, O(h) recursive stack or O(width) BFS space.
**Pattern:** Tree DFS/BFS; choose preorder, inorder or postorder based on when node/child information is needed.

### 390. Root to Node Path (M)

**Problem:** Solve the standard interview formulation of Root to Node Path: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is the root of a binary tree and any target node/value. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) for full traversal; O(h) for search in BST time, O(h) recursive stack or O(width) BFS space.
**Pattern:** Tree DFS/BFS; choose preorder, inorder or postorder based on when node/child information is needed.

### 391. Construct Tree from Preorder + Inorder (M★)

**Problem:** Solve the standard interview formulation of Construct Tree from Preorder + Inorder: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is the root of a binary tree and any target node/value. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) for full traversal; O(h) for search in BST time, O(h) recursive stack or O(width) BFS space.
**Pattern:** Tree DFS/BFS; choose preorder, inorder or postorder based on when node/child information is needed.

### 392. Construct Tree from Inorder + Postorder (M★)

**Problem:** Solve the standard interview formulation of Construct Tree from Inorder + Postorder: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is the root of a binary tree and any target node/value. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) for full traversal; O(h) for search in BST time, O(h) recursive stack or O(width) BFS space.
**Pattern:** Tree DFS/BFS; choose preorder, inorder or postorder based on when node/child information is needed.

### 393. Construct Binary Tree from Preorder and Postorder (M)

**Problem:** Solve the standard interview formulation of Construct Binary Tree from Preorder and Postorder: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is the root of a binary tree and any target node/value. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) for full traversal; O(h) for search in BST time, O(h) recursive stack or O(width) BFS space.
**Pattern:** Tree DFS/BFS; choose preorder, inorder or postorder based on when node/child information is needed.

### 394. Serialize and Deserialize Binary Tree (H★)

**Problem:** Solve the standard interview formulation of Serialize and Deserialize Binary Tree: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is the root of a binary tree and any target node/value. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) for full traversal; O(h) for search in BST time, O(h) recursive stack or O(width) BFS space.
**Pattern:** Tree DFS/BFS; choose preorder, inorder or postorder based on when node/child information is needed.

### 395. Flatten Binary Tree to Linked List (M★)

**Problem:** Solve the standard interview formulation of Flatten Binary Tree to Linked List: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is the root of a binary tree and any target node/value. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) for full traversal; O(h) for search in BST time, O(h) recursive stack or O(width) BFS space.
**Pattern:** Tree DFS/BFS; choose preorder, inorder or postorder based on when node/child information is needed.

### 396. Populating Next Right Pointers I and II (M★)

**Problem:** Solve the standard interview formulation of Populating Next Right Pointers I and II: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is the root of a binary tree and any target node/value. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) for full traversal; O(h) for search in BST time, O(h) recursive stack or O(width) BFS space.
**Pattern:** Tree DFS/BFS; choose preorder, inorder or postorder based on when node/child information is needed.

### 397. All Nodes Distance K in Binary Tree (M★)

**Problem:** Solve the standard interview formulation of All Nodes Distance K in Binary Tree: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is the root of a binary tree and any target node/value. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) for full traversal; O(h) for search in BST time, O(h) recursive stack or O(width) BFS space.
**Pattern:** Tree DFS/BFS; choose preorder, inorder or postorder based on when node/child information is needed.

### 398. Amount of Time for Binary Tree to Be Infected (M★)

**Problem:** Solve the standard interview formulation of Amount of Time for Binary Tree to Be Infected: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is the root of a binary tree and any target node/value. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) for full traversal; O(h) for search in BST time, O(h) recursive stack or O(width) BFS space.
**Pattern:** Tree DFS/BFS; choose preorder, inorder or postorder based on when node/child information is needed.

### 399. House Robber III (M★)

**Problem:** Solve the standard interview formulation of House Robber III: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is the root of a binary tree and any target node/value. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) for full traversal; O(h) for search in BST time, O(h) recursive stack or O(width) BFS space.
**Pattern:** Tree DFS/BFS; choose preorder, inorder or postorder based on when node/child information is needed.

### 400. Count Complete Tree Nodes (M)

**Problem:** Count the number of complete tree nodes cases that satisfy the standard problem conditions. The input is the root of a binary tree and any target node/value. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) for full traversal; O(h) for search in BST time, O(h) recursive stack or O(width) BFS space.
**Pattern:** Tree DFS/BFS; choose preorder, inorder or postorder based on when node/child information is needed.

### 401. Binary Tree Cameras (H★)

**Problem:** Solve the standard interview formulation of Binary Tree Cameras: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is the root of a binary tree and any target node/value. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) for full traversal; O(h) for search in BST time, O(h) recursive stack or O(width) BFS space.
**Pattern:** Tree DFS/BFS; choose preorder, inorder or postorder based on when node/child information is needed.

### 402. Distribute Coins in Binary Tree (M)

**Problem:** Solve the standard interview formulation of Distribute Coins in Binary Tree: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is the root of a binary tree and any target node/value. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) for full traversal; O(h) for search in BST time, O(h) recursive stack or O(width) BFS space.
**Pattern:** Tree DFS/BFS; choose preorder, inorder or postorder based on when node/child information is needed.

### 403. Delete Nodes and Return Forest (M)

**Problem:** Solve the standard interview formulation of Delete Nodes and Return Forest: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is the root of a binary tree and any target node/value. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) for full traversal; O(h) for search in BST time, O(h) recursive stack or O(width) BFS space.
**Pattern:** Tree DFS/BFS; choose preorder, inorder or postorder based on when node/child information is needed.

### 404. Find Duplicate Subtrees (M)

**Problem:** Find and return duplicate subtrees from the supplied input; return the required sentinel/empty result when it does not exist. The input is the root of a binary tree and any target node/value. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) for full traversal; O(h) for search in BST time, O(h) recursive stack or O(width) BFS space.
**Pattern:** Tree DFS/BFS; choose preorder, inorder or postorder based on when node/child information is needed.

### 405. Longest ZigZag Path in a Binary Tree (M)

**Problem:** Find the longest zigzag path in a binary tree satisfying the problem constraints. The input is the root of a binary tree and any target node/value. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) for full traversal; O(h) for search in BST time, O(h) recursive stack or O(width) BFS space.
**Pattern:** Tree DFS/BFS; choose preorder, inorder or postorder based on when node/child information is needed.

### 406. Maximum Product of Splitted Binary Tree (M)

**Problem:** Find the maximum possible product of splitted binary tree over the allowed choices in the input. The input is the root of a binary tree and any target node/value. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) for full traversal; O(h) for search in BST time, O(h) recursive stack or O(width) BFS space.
**Pattern:** Tree DFS/BFS; choose preorder, inorder or postorder based on when node/child information is needed.

### 407. Lowest Common Ancestor of Deepest Leaves (M)

**Problem:** Solve the standard interview formulation of Lowest Common Ancestor of Deepest Leaves: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is the root of a binary tree and any target node/value. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) for full traversal; O(h) for search in BST time, O(h) recursive stack or O(width) BFS space.
**Pattern:** Tree DFS/BFS; choose preorder, inorder or postorder based on when node/child information is needed.

### 408. Binary Tree Longest Consecutive Sequence (M)

**Problem:** Solve the standard interview formulation of Binary Tree Longest Consecutive Sequence: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is the root of a binary tree and any target node/value. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) for full traversal; O(h) for search in BST time, O(h) recursive stack or O(width) BFS space.
**Pattern:** Tree DFS/BFS; choose preorder, inorder or postorder based on when node/child information is needed.

### 409. Cousins in Binary Tree (E)

**Problem:** Solve the standard interview formulation of Cousins in Binary Tree: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is the root of a binary tree and any target node/value. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) for full traversal; O(h) for search in BST time, O(h) recursive stack or O(width) BFS space.
**Pattern:** Tree DFS/BFS; choose preorder, inorder or postorder based on when node/child information is needed.

## 15. BST

### 410. Search in a BST (E)

**Problem:** Solve the standard interview formulation of Search in a BST: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is the root of a binary search tree and the requested key/rank/operation. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) for full traversal; O(h) for search in BST time, O(h) recursive stack or O(width) BFS space.
**Pattern:** Tree DFS/BFS; choose preorder, inorder or postorder based on when node/child information is needed.

### 411. Insert into a BST (M★)

**Problem:** Solve the standard interview formulation of Insert into a BST: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is the root of a binary search tree and the requested key/rank/operation. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) for full traversal; O(h) for search in BST time, O(h) recursive stack or O(width) BFS space.
**Pattern:** Tree DFS/BFS; choose preorder, inorder or postorder based on when node/child information is needed.

### 412. Delete Node in a BST (M★)

**Problem:** Solve the standard interview formulation of Delete Node in a BST: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is the root of a binary search tree and the requested key/rank/operation. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) for full traversal; O(h) for search in BST time, O(h) recursive stack or O(width) BFS space.
**Pattern:** Tree DFS/BFS; choose preorder, inorder or postorder based on when node/child information is needed.

### 413. Minimum / Maximum in BST (E)

**Problem:** Find the minimum possible / maximum in bst over the allowed choices in the input. The input is the root of a binary search tree and the requested key/rank/operation. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) for full traversal; O(h) for search in BST time, O(h) recursive stack or O(width) BFS space.
**Pattern:** Tree DFS/BFS; choose preorder, inorder or postorder based on when node/child information is needed.

### 414. Validate Binary Search Tree (M★)

**Problem:** Determine whether a binary tree satisfies strict BST ordering globally.

**Input:** `root = [2,1,3]`
**Output:** `true`

**Target:** O(n) time, O(h) space.
**Pattern:** DFS with exclusive lower/upper bounds or inorder monotonicity.

### 415. Kth Smallest Element in a BST (M★)

**Problem:** Return the k-th smallest value in a binary search tree.

**Input:** `root = [3,1,4,null,2], k = 1`
**Output:** `1`

**Target:** O(h+k) time, O(h) space.
**Pattern:** Inorder traversal, which visits BST keys in sorted order.

### 416. Kth Largest in BST (M)

**Problem:** Solve the standard interview formulation of Kth Largest in BST: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is the root of a binary search tree and the requested key/rank/operation. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) for full traversal; O(h) for search in BST time, O(h) recursive stack or O(width) BFS space.
**Pattern:** Tree DFS/BFS; choose preorder, inorder or postorder based on when node/child information is needed.

### 417. Floor and Ceil in BST (M)

**Problem:** Solve the standard interview formulation of Floor and Ceil in BST: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is the root of a binary search tree and the requested key/rank/operation. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) for full traversal; O(h) for search in BST time, O(h) recursive stack or O(width) BFS space.
**Pattern:** Tree DFS/BFS; choose preorder, inorder or postorder based on when node/child information is needed.

### 418. Inorder Successor / Predecessor in BST (M★)

**Problem:** Solve the standard interview formulation of Inorder Successor / Predecessor in BST: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is the root of a binary search tree and the requested key/rank/operation. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) for full traversal; O(h) for search in BST time, O(h) recursive stack or O(width) BFS space.
**Pattern:** Tree DFS/BFS; choose preorder, inorder or postorder based on when node/child information is needed.

### 419. LCA of a BST (M★)

**Problem:** Solve the standard interview formulation of LCA of a BST: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is the root of a binary search tree and the requested key/rank/operation. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) for full traversal; O(h) for search in BST time, O(h) recursive stack or O(width) BFS space.
**Pattern:** Tree DFS/BFS; choose preorder, inorder or postorder based on when node/child information is needed.

### 420. Construct BST from Preorder (M★)

**Problem:** Solve the standard interview formulation of Construct BST from Preorder: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is the root of a binary search tree and the requested key/rank/operation. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) for full traversal; O(h) for search in BST time, O(h) recursive stack or O(width) BFS space.
**Pattern:** Tree DFS/BFS; choose preorder, inorder or postorder based on when node/child information is needed.

### 421. Convert Sorted Array to BST (E★)

**Problem:** Implement or apply Convert Sorted Array to BST to the supplied input and return the result required by its standard formulation. The input is the root of a binary search tree and the requested key/rank/operation. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) for full traversal; O(h) for search in BST time, O(h) recursive stack or O(width) BFS space.
**Pattern:** Tree DFS/BFS; choose preorder, inorder or postorder based on when node/child information is needed.

### 422. Convert Sorted List to BST (M)

**Problem:** Implement or apply Convert Sorted List to BST to the supplied input and return the result required by its standard formulation. The input is the root of a binary search tree and the requested key/rank/operation. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) for full traversal; O(h) for search in BST time, O(h) recursive stack or O(width) BFS space.
**Pattern:** Tree DFS/BFS; choose preorder, inorder or postorder based on when node/child information is needed.

### 423. Two Sum IV, Input is a BST (E)

**Problem:** Solve the standard interview formulation of Two Sum IV, Input is a BST: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is the root of a binary search tree and the requested key/rank/operation. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) for full traversal; O(h) for search in BST time, O(h) recursive stack or O(width) BFS space.
**Pattern:** Tree DFS/BFS; choose preorder, inorder or postorder based on when node/child information is needed.

### 424. BST Iterator (M★)

**Problem:** Solve the standard interview formulation of BST Iterator: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is the root of a binary search tree and the requested key/rank/operation. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) for full traversal; O(h) for search in BST time, O(h) recursive stack or O(width) BFS space.
**Pattern:** Tree DFS/BFS; choose preorder, inorder or postorder based on when node/child information is needed.

### 425. Recover Binary Search Tree (M★)

**Problem:** Solve the standard interview formulation of Recover Binary Search Tree: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is the root of a binary search tree and the requested key/rank/operation. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) for full traversal; O(h) for search in BST time, O(h) recursive stack or O(width) BFS space.
**Pattern:** Tree DFS/BFS; choose preorder, inorder or postorder based on when node/child information is needed.

### 426. Range Sum of BST (E)

**Problem:** Solve the standard interview formulation of Range Sum of BST: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is the root of a binary search tree and the requested key/rank/operation. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) for full traversal; O(h) for search in BST time, O(h) recursive stack or O(width) BFS space.
**Pattern:** Tree DFS/BFS; choose preorder, inorder or postorder based on when node/child information is needed.

### 427. Trim a BST (M)

**Problem:** Solve the standard interview formulation of Trim a BST: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is the root of a binary search tree and the requested key/rank/operation. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) for full traversal; O(h) for search in BST time, O(h) recursive stack or O(width) BFS space.
**Pattern:** Tree DFS/BFS; choose preorder, inorder or postorder based on when node/child information is needed.

### 428. Balance a Binary Search Tree (M)

**Problem:** Solve the standard interview formulation of Balance a Binary Search Tree: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is the root of a binary search tree and the requested key/rank/operation. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) for full traversal; O(h) for search in BST time, O(h) recursive stack or O(width) BFS space.
**Pattern:** Tree DFS/BFS; choose preorder, inorder or postorder based on when node/child information is needed.

### 429. Largest BST Subtree (M★)

**Problem:** Solve the standard interview formulation of Largest BST Subtree: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is the root of a binary search tree and the requested key/rank/operation. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) for full traversal; O(h) for search in BST time, O(h) recursive stack or O(width) BFS space.
**Pattern:** Tree DFS/BFS; choose preorder, inorder or postorder based on when node/child information is needed.

### 430. Merge Two BSTs (H)

**Problem:** Merge two bsts according to the standard ordering and overlap rules, returning the combined result. The input is the root of a binary search tree and the requested key/rank/operation. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) for full traversal; O(h) for search in BST time, O(h) recursive stack or O(width) BFS space.
**Pattern:** Tree DFS/BFS; choose preorder, inorder or postorder based on when node/child information is needed.

### 431. Minimum Absolute Difference in BST (E)

**Problem:** Find the minimum possible absolute difference in bst over the allowed choices in the input. The input is the root of a binary search tree and the requested key/rank/operation. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) for full traversal; O(h) for search in BST time, O(h) recursive stack or O(width) BFS space.
**Pattern:** Tree DFS/BFS; choose preorder, inorder or postorder based on when node/child information is needed.

### 432. Binary Search Tree to Greater Sum Tree (M)

**Problem:** Solve the standard interview formulation of Binary Search Tree to Greater Sum Tree: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is the root of a binary search tree and the requested key/rank/operation. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) for full traversal; O(h) for search in BST time, O(h) recursive stack or O(width) BFS space.
**Pattern:** Tree DFS/BFS; choose preorder, inorder or postorder based on when node/child information is needed.

### 433. Unique Binary Search Trees I and II (M)

**Problem:** Solve the standard interview formulation of Unique Binary Search Trees I and II: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is the root of a binary search tree and the requested key/rank/operation. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) for full traversal; O(h) for search in BST time, O(h) recursive stack or O(width) BFS space.
**Pattern:** Tree DFS/BFS; choose preorder, inorder or postorder based on when node/child information is needed.

## 16. HEAP / PRIORITY QUEUE

### 434. Implement Min Heap / Max Heap from scratch (M★)

**Problem:** Implement heap insertion, peek and extraction while maintaining the min-heap or max-heap ordering invariant.

**Input:** `insert 4, 1, 7; extract top`
**Output:** `1 (min-heap)`

**Target:** O(log n) insert/extract; O(1) peek time, O(n) space.
**Pattern:** Array-backed complete binary tree; sift-up and sift-down.

### 435. Heap Sort (M)

**Problem:** Implement or apply Heap Sort to the supplied input and return the result required by its standard formulation. The input is an array/stream or collection of items and a priority/k parameter. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n log k) for top-k; O(n log n) for full ordering time, O(k) or O(n) space.
**Pattern:** Priority queue; maintain only the k best candidates when possible.

### 436. Kth Largest Element in a Stream (E★)

**Problem:** Solve the standard interview formulation of Kth Largest Element in a Stream: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/stream or collection of items and a priority/k parameter. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n log k) for top-k; O(n log n) for full ordering time, O(k) or O(n) space.
**Pattern:** Priority queue; maintain only the k best candidates when possible.

### 437. Kth Largest Element in an Array (M★)

**Problem:** Solve the standard interview formulation of Kth Largest Element in an Array: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/stream or collection of items and a priority/k parameter. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n log k) for top-k; O(n log n) for full ordering time, O(k) or O(n) space.
**Pattern:** Priority queue; maintain only the k best candidates when possible.

### 438. Last Stone Weight (E★)

**Problem:** Solve the standard interview formulation of Last Stone Weight: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/stream or collection of items and a priority/k parameter. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n log k) for top-k; O(n log n) for full ordering time, O(k) or O(n) space.
**Pattern:** Priority queue; maintain only the k best candidates when possible.

### 439. K Closest Points to Origin (M★)

**Problem:** Solve the standard interview formulation of K Closest Points to Origin: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/stream or collection of items and a priority/k parameter. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n log k) for top-k; O(n log n) for full ordering time, O(k) or O(n) space.
**Pattern:** Priority queue; maintain only the k best candidates when possible.

### 440. Top K Frequent Elements (M★)

**Problem:** Return the k values with the highest frequencies.

**Input:** `nums = [1,1,1,2,2,3], k = 2`
**Output:** `[1, 2]`

**Target:** O(n log k) with heap; O(n) bucket option time, O(n) space.
**Pattern:** Frequency map plus min-heap or bucket grouping.

### 441. Top K Frequent Words (M★)

**Problem:** Solve the standard interview formulation of Top K Frequent Words: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/stream or collection of items and a priority/k parameter. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n log k) for top-k; O(n log n) for full ordering time, O(k) or O(n) space.
**Pattern:** Priority queue; maintain only the k best candidates when possible.

### 442. Sort Characters By Frequency (M)

**Problem:** Sort/reorder the supplied data according to characters by frequency and return the resulting sequence. The input is an array/stream or collection of items and a priority/k parameter. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n log k) for top-k; O(n log n) for full ordering time, O(k) or O(n) space.
**Pattern:** Priority queue; maintain only the k best candidates when possible.

### 443. Task Scheduler (M★)

**Problem:** Solve the standard interview formulation of Task Scheduler: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/stream or collection of items and a priority/k parameter. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n log k) for top-k; O(n log n) for full ordering time, O(k) or O(n) space.
**Pattern:** Priority queue; maintain only the k best candidates when possible.

### 444. Reorganize String (M★)

**Problem:** Solve the standard interview formulation of Reorganize String: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/stream or collection of items and a priority/k parameter. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n log k) for top-k; O(n log n) for full ordering time, O(k) or O(n) space.
**Pattern:** Priority queue; maintain only the k best candidates when possible.

### 445. Design Twitter (M★)

**Problem:** Implement the Design Twitter interface/technique and support the operations required by its standard interview formulation, preserving its stated invariants and complexity targets. The input is an array/stream or collection of items and a priority/k parameter. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n log k) for top-k; O(n log n) for full ordering time, O(k) or O(n) space.
**Pattern:** Priority queue; maintain only the k best candidates when possible.

### 446. Find K Pairs with Smallest Sums (M★)

**Problem:** Find and return k pairs with smallest sums from the supplied input; return the required sentinel/empty result when it does not exist. The input is an array/stream or collection of items and a priority/k parameter. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n log k) for top-k; O(n log n) for full ordering time, O(k) or O(n) space.
**Pattern:** Priority queue; maintain only the k best candidates when possible.

### 447. Kth Smallest Element in a Sorted Matrix (M★)

**Problem:** Implement or apply Kth Smallest Element in a Sorted Matrix to the supplied input and return the result required by its standard formulation. The input is an array/stream or collection of items and a priority/k parameter. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n log k) for top-k; O(n log n) for full ordering time, O(k) or O(n) space.
**Pattern:** Priority queue; maintain only the k best candidates when possible.

### 448. Merge k Sorted Lists (H★)

**Problem:** Merge k sorted linked lists into one sorted linked list.

**Input:** `lists = [[1,4,5],[1,3,4],[2,6]]`
**Output:** `1 → 1 → 2 → 3 → 4 → 4 → 5 → 6`

**Target:** O(N log k) time, O(k) space.
**Pattern:** Min-heap of current list heads or divide-and-conquer merging.

### 449. Merge k Sorted Arrays (M)

**Problem:** Merge k sorted arrays according to the standard ordering and overlap rules, returning the combined result. The input is an array/stream or collection of items and a priority/k parameter. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n log k) for top-k; O(n log n) for full ordering time, O(k) or O(n) space.
**Pattern:** Priority queue; maintain only the k best candidates when possible.

### 450. Furthest Building You Can Reach (M)

**Problem:** Solve the standard interview formulation of Furthest Building You Can Reach: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/stream or collection of items and a priority/k parameter. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n log k) for top-k; O(n log n) for full ordering time, O(k) or O(n) space.
**Pattern:** Priority queue; maintain only the k best candidates when possible.

### 451. Minimum Cost to Connect Sticks (M)

**Problem:** Find the minimum possible cost to connect sticks over the allowed choices in the input. The input is an array/stream or collection of items and a priority/k parameter. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n log k) for top-k; O(n log n) for full ordering time, O(k) or O(n) space.
**Pattern:** Priority queue; maintain only the k best candidates when possible.

### 452. Meeting Rooms II (M★)

**Problem:** Given meeting time intervals, return the minimum number of rooms required.

**Input:** `intervals = [[0,30],[5,10],[15,20]]`
**Output:** `2`

**Target:** O(n log n) time, O(n) space.
**Pattern:** Sort endpoints or use min-heap of end times.

### 453. Car Pooling via heap (M)

**Problem:** Solve the standard interview formulation of Car Pooling via heap: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/stream or collection of items and a priority/k parameter. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n log k) for top-k; O(n log n) for full ordering time, O(k) or O(n) space.
**Pattern:** Priority queue; maintain only the k best candidates when possible.

### 454. Seat Reservation Manager (M)

**Problem:** Solve the standard interview formulation of Seat Reservation Manager: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/stream or collection of items and a priority/k parameter. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n log k) for top-k; O(n log n) for full ordering time, O(k) or O(n) space.
**Pattern:** Priority queue; maintain only the k best candidates when possible.

### 455. Find Median from Data Stream (H★)

**Problem:** Design a data structure that accepts numbers and returns the current median after each insertion.

**Input:** `add(1), add(2), findMedian(), add(3), findMedian()`
**Output:** `1.5, 2.0`

**Target:** O(log n) add; O(1) median time, O(n) space.
**Pattern:** Two heaps: max-heap lower half and min-heap upper half.

### 456. Sliding Window Median (H)

**Problem:** Solve the standard interview formulation of Sliding Window Median: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/stream or collection of items and a priority/k parameter. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) expected time, O(Σ) or O(k) space.
**Pattern:** Fixed- or variable-length sliding window; expand right, restore validity by advancing left.

### 457. IPO (H★)

**Problem:** Solve the standard interview formulation of IPO: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/stream or collection of items and a priority/k parameter. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n log k) for top-k; O(n log n) for full ordering time, O(k) or O(n) space.
**Pattern:** Priority queue; maintain only the k best candidates when possible.

### 458. Smallest Range Covering Elements from K Lists (H)

**Problem:** Solve the standard interview formulation of Smallest Range Covering Elements from K Lists: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/stream or collection of items and a priority/k parameter. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n log k) for top-k; O(n log n) for full ordering time, O(k) or O(n) space.
**Pattern:** Priority queue; maintain only the k best candidates when possible.

### 459. Minimum Cost to Hire K Workers (H)

**Problem:** Find the minimum possible cost to hire k workers over the allowed choices in the input. The input is an array/stream or collection of items and a priority/k parameter. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n log k) for top-k; O(n log n) for full ordering time, O(k) or O(n) space.
**Pattern:** Priority queue; maintain only the k best candidates when possible.

### 460. Maximum Performance of a Team (H)

**Problem:** Find the maximum possible performance of a team over the allowed choices in the input. The input is an array/stream or collection of items and a priority/k parameter. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n log k) for top-k; O(n log n) for full ordering time, O(k) or O(n) space.
**Pattern:** Priority queue; maintain only the k best candidates when possible.

### 461. Minimum Number of Refueling Stops (H)

**Problem:** Find the minimum possible number of refueling stops over the allowed choices in the input. The input is an array/stream or collection of items and a priority/k parameter. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n log k) for top-k; O(n log n) for full ordering time, O(k) or O(n) space.
**Pattern:** Priority queue; maintain only the k best candidates when possible.

### 462. Maximum Number of Events That Can Be Attended (M)

**Problem:** Find the maximum possible number of events that can be attended over the allowed choices in the input. The input is an array/stream or collection of items and a priority/k parameter. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n log k) for top-k; O(n log n) for full ordering time, O(k) or O(n) space.
**Pattern:** Priority queue; maintain only the k best candidates when possible.

### 463. Single-Threaded CPU (M)

**Problem:** Solve the standard interview formulation of Single-Threaded CPU: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/stream or collection of items and a priority/k parameter. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n log k) for top-k; O(n log n) for full ordering time, O(k) or O(n) space.
**Pattern:** Priority queue; maintain only the k best candidates when possible.

### 464. Process Tasks Using Servers (M)

**Problem:** Solve the standard interview formulation of Process Tasks Using Servers: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/stream or collection of items and a priority/k parameter. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n log k) for top-k; O(n log n) for full ordering time, O(k) or O(n) space.
**Pattern:** Priority queue; maintain only the k best candidates when possible.

## 17. GREEDY

### 465. Assign Cookies (E)

**Problem:** Solve the standard interview formulation of Assign Cookies: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array, set of intervals, jobs or choices with values/costs. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(n log n) time, O(1) auxiliary to O(n) space.
**Pattern:** Sort by the relevant key and make a locally optimal choice with an exchange/feasibility argument.

### 466. Lemonade Change (E)

**Problem:** Solve the standard interview formulation of Lemonade Change: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array, set of intervals, jobs or choices with values/costs. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(n log n) time, O(1) auxiliary to O(n) space.
**Pattern:** Sort by the relevant key and make a locally optimal choice with an exchange/feasibility argument.

### 467. Fractional Knapsack (M)

**Problem:** Solve the standard interview formulation of Fractional Knapsack: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array, set of intervals, jobs or choices with values/costs. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(n log n) time, O(1) auxiliary to O(n) space.
**Pattern:** Sort by the relevant key and make a locally optimal choice with an exchange/feasibility argument.

### 468. Maximum Units on a Truck (E)

**Problem:** Find the maximum possible units on a truck over the allowed choices in the input. The input is an array, set of intervals, jobs or choices with values/costs. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(n log n) time, O(1) auxiliary to O(n) space.
**Pattern:** Sort by the relevant key and make a locally optimal choice with an exchange/feasibility argument.

### 469. Jump Game / Jump Game II (M★)

**Problem:** Solve the standard interview formulation of Jump Game / Jump Game II: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array, set of intervals, jobs or choices with values/costs. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(n log n) time, O(1) auxiliary to O(n) space.
**Pattern:** Sort by the relevant key and make a locally optimal choice with an exchange/feasibility argument.

### 470. Gas Station (M★)

**Problem:** Given gas and cost at each circular station, return a start index that completes the circuit, or -1 if impossible.

**Input:** `gas = [1,2,3,4,5], cost = [3,4,5,1,2]`
**Output:** `3`

**Target:** O(n) time, O(1) space.
**Pattern:** Greedy total-balance check and reset candidate after negative prefix.

### 471. Hand of Straights (M★)

**Problem:** Solve the standard interview formulation of Hand of Straights: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array, set of intervals, jobs or choices with values/costs. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(n log n) time, O(1) auxiliary to O(n) space.
**Pattern:** Sort by the relevant key and make a locally optimal choice with an exchange/feasibility argument.

### 472. Partition Labels (M★)

**Problem:** Solve the standard interview formulation of Partition Labels: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array, set of intervals, jobs or choices with values/costs. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(n log n) time, O(1) auxiliary to O(n) space.
**Pattern:** Sort by the relevant key and make a locally optimal choice with an exchange/feasibility argument.

### 473. Valid Parenthesis String (M★)

**Problem:** Determine whether the supplied input satisfies the valid parenthesis string rules and return a boolean result. The input is an array, set of intervals, jobs or choices with values/costs. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(n log n) time, O(1) auxiliary to O(n) space.
**Pattern:** Sort by the relevant key and make a locally optimal choice with an exchange/feasibility argument.

### 474. Merge Triplets to Form Target Triplet (M)

**Problem:** Merge triplets to form target triplet according to the standard ordering and overlap rules, returning the combined result. The input is an array, set of intervals, jobs or choices with values/costs. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(n log n) time, O(1) auxiliary to O(n) space.
**Pattern:** Sort by the relevant key and make a locally optimal choice with an exchange/feasibility argument.

### 475. Queue Reconstruction by Height (M)

**Problem:** Solve the standard interview formulation of Queue Reconstruction by Height: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array, set of intervals, jobs or choices with values/costs. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) or O(V+E) time, O(n) or O(V) space.
**Pattern:** FIFO queue / deque; for graph problems, mark on enqueue to avoid duplicate visits.

### 476. Best Time to Buy and Sell Stock II (M★)

**Problem:** Given the relevant price series and transaction rules, compute the maximum achievable profit for best time to buy and sell stock ii. The input is an array, set of intervals, jobs or choices with values/costs. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(n log n) time, O(1) auxiliary to O(n) space.
**Pattern:** Sort by the relevant key and make a locally optimal choice with an exchange/feasibility argument.

### 477. Candy (H★)

**Problem:** Solve the standard interview formulation of Candy: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array, set of intervals, jobs or choices with values/costs. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(n log n) time, O(1) auxiliary to O(n) space.
**Pattern:** Sort by the relevant key and make a locally optimal choice with an exchange/feasibility argument.

### 478. Job Sequencing Problem (M★)

**Problem:** Implement or apply Job Sequencing Problem to the supplied input and return the result required by its standard formulation. The input is an array, set of intervals, jobs or choices with values/costs. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(n log n) time, O(1) auxiliary to O(n) space.
**Pattern:** Sort by the relevant key and make a locally optimal choice with an exchange/feasibility argument.

### 479. N Meetings in One Room (M)

**Problem:** Solve the standard interview formulation of N Meetings in One Room: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array, set of intervals, jobs or choices with values/costs. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(n log n) time, O(1) auxiliary to O(n) space.
**Pattern:** Sort by the relevant key and make a locally optimal choice with an exchange/feasibility argument.

### 480. Minimum Platforms (M★)

**Problem:** Find the minimum possible platforms over the allowed choices in the input. The input is an array, set of intervals, jobs or choices with values/costs. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(n log n) time, O(1) auxiliary to O(n) space.
**Pattern:** Sort by the relevant key and make a locally optimal choice with an exchange/feasibility argument.

### 481. Maximum Length of Pair Chain (M)

**Problem:** Find the maximum possible length of pair chain over the allowed choices in the input. The input is an array, set of intervals, jobs or choices with values/costs. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(n log n) time, O(1) auxiliary to O(n) space.
**Pattern:** Sort by the relevant key and make a locally optimal choice with an exchange/feasibility argument.

### 482. Minimum Number of Arrows to Burst Balloons (M★)

**Problem:** Find the minimum possible number of arrows to burst balloons over the allowed choices in the input. The input is an array, set of intervals, jobs or choices with values/costs. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(n log n) time, O(1) auxiliary to O(n) space.
**Pattern:** Sort by the relevant key and make a locally optimal choice with an exchange/feasibility argument.

### 483. Two City Scheduling (M)

**Problem:** Solve the standard interview formulation of Two City Scheduling: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array, set of intervals, jobs or choices with values/costs. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(n log n) time, O(1) auxiliary to O(n) space.
**Pattern:** Sort by the relevant key and make a locally optimal choice with an exchange/feasibility argument.

### 484. Bag of Tokens (M)

**Problem:** Solve the standard interview formulation of Bag of Tokens: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array, set of intervals, jobs or choices with values/costs. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(n log n) time, O(1) auxiliary to O(n) space.
**Pattern:** Sort by the relevant key and make a locally optimal choice with an exchange/feasibility argument.

### 485. Remove K Digits (M)

**Problem:** Solve the standard interview formulation of Remove K Digits: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array, set of intervals, jobs or choices with values/costs. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(n log n) time, O(1) auxiliary to O(n) space.
**Pattern:** Sort by the relevant key and make a locally optimal choice with an exchange/feasibility argument.

### 486. Create Maximum Number (H)

**Problem:** Solve the standard interview formulation of Create Maximum Number: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array, set of intervals, jobs or choices with values/costs. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(n log n) time, O(1) auxiliary to O(n) space.
**Pattern:** Sort by the relevant key and make a locally optimal choice with an exchange/feasibility argument.

### 487. Wiggle Subsequence (M)

**Problem:** Solve the standard interview formulation of Wiggle Subsequence: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array, set of intervals, jobs or choices with values/costs. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(n log n) time, O(1) auxiliary to O(n) space.
**Pattern:** Sort by the relevant key and make a locally optimal choice with an exchange/feasibility argument.

### 488. Split Array into Consecutive Subsequences (M)

**Problem:** Solve the standard interview formulation of Split Array into Consecutive Subsequences: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array, set of intervals, jobs or choices with values/costs. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(n log n) time, O(1) auxiliary to O(n) space.
**Pattern:** Sort by the relevant key and make a locally optimal choice with an exchange/feasibility argument.

### 489. Reduce Array Size to Half (M)

**Problem:** Solve the standard interview formulation of Reduce Array Size to Half: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array, set of intervals, jobs or choices with values/costs. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(n log n) time, O(1) auxiliary to O(n) space.
**Pattern:** Sort by the relevant key and make a locally optimal choice with an exchange/feasibility argument.

### 490. Minimum Deletions to Make Character Frequencies Unique (M)

**Problem:** Find the minimum possible deletions to make character frequencies unique over the allowed choices in the input. The input is an array, set of intervals, jobs or choices with values/costs. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(n log n) time, O(1) auxiliary to O(n) space.
**Pattern:** Sort by the relevant key and make a locally optimal choice with an exchange/feasibility argument.

### 491. Boats to Save People (M)

**Problem:** Solve the standard interview formulation of Boats to Save People: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array, set of intervals, jobs or choices with values/costs. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(n log n) time, O(1) auxiliary to O(n) space.
**Pattern:** Sort by the relevant key and make a locally optimal choice with an exchange/feasibility argument.

### 492. Broken Calculator (M)

**Problem:** Solve the standard interview formulation of Broken Calculator: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array, set of intervals, jobs or choices with values/costs. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(n log n) time, O(1) auxiliary to O(n) space.
**Pattern:** Sort by the relevant key and make a locally optimal choice with an exchange/feasibility argument.

### 493. Remove Covered Intervals (M)

**Problem:** Solve the standard interview formulation of Remove Covered Intervals: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array, set of intervals, jobs or choices with values/costs. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n log n) time, O(n) space.
**Pattern:** Sort intervals by start/end and sweep while maintaining the active merged/overlapping range.

### 494. Divide Array in Sets of K Consecutive Numbers (M)

**Problem:** Solve the standard interview formulation of Divide Array in Sets of K Consecutive Numbers: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array, set of intervals, jobs or choices with values/costs. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(n log n) time, O(1) auxiliary to O(n) space.
**Pattern:** Sort by the relevant key and make a locally optimal choice with an exchange/feasibility argument.

## 18. INTERVALS

### 495. Merge Intervals (M★)

**Problem:** Merge all overlapping intervals and return the resulting non-overlapping intervals.

**Input:** `intervals = [[1,3],[2,6],[8,10],[15,18]]`
**Output:** `[[1,6],[8,10],[15,18]]`

**Target:** O(n log n) time, O(n) for output space.
**Pattern:** Sort by start; sweep and extend the current interval.

### 496. Insert Interval (M★)

**Problem:** Insert a new interval into a sorted, non-overlapping interval list and merge overlaps.

**Input:** `intervals = [[1,3],[6,9]], newInterval = [2,5]`
**Output:** `[[1,5],[6,9]]`

**Target:** O(n) time, O(n) for output space.
**Pattern:** Three phases: before, merge overlaps, after.

### 497. Non-overlapping Intervals (M★)

**Problem:** Solve the standard interview formulation of Non-overlapping Intervals: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a list of [start,end] intervals and, where required, a query interval. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n log n) time, O(n) space.
**Pattern:** Sort intervals by start/end and sweep while maintaining the active merged/overlapping range.

### 498. Meeting Rooms (E★)

**Problem:** Solve the standard interview formulation of Meeting Rooms: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a list of [start,end] intervals and, where required, a query interval. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n log n) time, O(n) space.
**Pattern:** Sort intervals by start/end and sweep while maintaining the active merged/overlapping range.

### 499. Meeting Rooms II (M★)

**Problem:** Given meeting time intervals, return the minimum number of rooms required.

**Input:** `intervals = [[0,30],[5,10],[15,20]]`
**Output:** `2`

**Target:** O(n log n) time, O(n) space.
**Pattern:** Sort endpoints or use min-heap of end times.

### 500. Interval List Intersections (M★)

**Problem:** Solve the standard interview formulation of Interval List Intersections: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a list of [start,end] intervals and, where required, a query interval. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n log n) time, O(n) space.
**Pattern:** Sort intervals by start/end and sweep while maintaining the active merged/overlapping range.

### 501. Employee Free Time (H★)

**Problem:** Solve the standard interview formulation of Employee Free Time: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a list of [start,end] intervals and, where required, a query interval. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n log n) time, O(n) space.
**Pattern:** Sort intervals by start/end and sweep while maintaining the active merged/overlapping range.

### 502. My Calendar I (M)

**Problem:** Solve the standard interview formulation of My Calendar I: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a list of [start,end] intervals and, where required, a query interval. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n log n) time, O(n) space.
**Pattern:** Sort intervals by start/end and sweep while maintaining the active merged/overlapping range.

### 503. My Calendar II (M)

**Problem:** Solve the standard interview formulation of My Calendar II: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a list of [start,end] intervals and, where required, a query interval. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n log n) time, O(n) space.
**Pattern:** Sort intervals by start/end and sweep while maintaining the active merged/overlapping range.

### 504. My Calendar III (H)

**Problem:** Solve the standard interview formulation of My Calendar III: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a list of [start,end] intervals and, where required, a query interval. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n log n) time, O(n) space.
**Pattern:** Sort intervals by start/end and sweep while maintaining the active merged/overlapping range.

### 505. Minimum Interval to Include Each Query (H)

**Problem:** Find the minimum possible interval to include each query over the allowed choices in the input. The input is a list of [start,end] intervals and, where required, a query interval. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n log n) time, O(n) space.
**Pattern:** Sort intervals by start/end and sweep while maintaining the active merged/overlapping range.

### 506. Divide Intervals Into Minimum Number of Groups (M)

**Problem:** Solve the standard interview formulation of Divide Intervals Into Minimum Number of Groups: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a list of [start,end] intervals and, where required, a query interval. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n log n) time, O(n) space.
**Pattern:** Sort intervals by start/end and sweep while maintaining the active merged/overlapping range.

### 507. Data Stream as Disjoint Intervals (H)

**Problem:** Solve the standard interview formulation of Data Stream as Disjoint Intervals: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a list of [start,end] intervals and, where required, a query interval. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n log n) time, O(n) space.
**Pattern:** Sort intervals by start/end and sweep while maintaining the active merged/overlapping range.

### 508. Remove Interval (M)

**Problem:** Solve the standard interview formulation of Remove Interval: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a list of [start,end] intervals and, where required, a query interval. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n log n) time, O(n) space.
**Pattern:** Sort intervals by start/end and sweep while maintaining the active merged/overlapping range.

## 19. TRIES

### 509. Implement Trie (M★)

**Problem:** Implement insert, search and startsWith for a trie of lowercase words.

**Input:** `insert("apple"); search("apple"); search("app"); startsWith("app")`
**Output:** `true, false, true`

**Target:** O(L) per operation time, O(total inserted characters) space.
**Pattern:** Prefix tree with child links and terminal marker.

### 510. Implement Trie II (M)

**Problem:** Implement the Implement Trie II interface/technique and support the operations required by its standard interview formulation, preserving its stated invariants and complexity targets. The input is a collection of strings/keys and a sequence of trie operations. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(L) per operation, where L is key length time, O(total stored key length) space.
**Pattern:** Trie traversal keyed by characters/bits; prune prefixes that cannot match.

### 511. Design Add and Search Words (M★)

**Problem:** Implement the Design Add and Search Words interface/technique and support the operations required by its standard interview formulation, preserving its stated invariants and complexity targets. The input is a collection of strings/keys and a sequence of trie operations. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(L) per operation, where L is key length time, O(total stored key length) space.
**Pattern:** Trie traversal keyed by characters/bits; prune prefixes that cannot match.

### 512. Replace Words (M)

**Problem:** Solve the standard interview formulation of Replace Words: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a collection of strings/keys and a sequence of trie operations. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(L) per operation, where L is key length time, O(total stored key length) space.
**Pattern:** Trie traversal keyed by characters/bits; prune prefixes that cannot match.

### 513. Longest Word in Dictionary (M)

**Problem:** Find the longest word in dictionary satisfying the problem constraints. The input is a collection of strings/keys and a sequence of trie operations. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(L) per operation, where L is key length time, O(total stored key length) space.
**Pattern:** Trie traversal keyed by characters/bits; prune prefixes that cannot match.

### 514. Map Sum Pairs (M)

**Problem:** Solve the standard interview formulation of Map Sum Pairs: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a collection of strings/keys and a sequence of trie operations. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(L) per operation, where L is key length time, O(total stored key length) space.
**Pattern:** Trie traversal keyed by characters/bits; prune prefixes that cannot match.

### 515. Search Suggestions System (M★)

**Problem:** Solve the standard interview formulation of Search Suggestions System: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a collection of strings/keys and a sequence of trie operations. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(L) per operation, where L is key length time, O(total stored key length) space.
**Pattern:** Trie traversal keyed by characters/bits; prune prefixes that cannot match.

### 516. Maximum XOR of Two Numbers in an Array (M★)

**Problem:** Find the maximum XOR obtainable from any pair of array values.

**Input:** `nums = [3,10,5,25,2,8]`
**Output:** `28`

**Target:** O(n·B) time, O(n·B) space.
**Pattern:** Bitwise greedy with a binary trie or prefix-set feasibility.

### 517. Word Search II (H★)

**Problem:** Solve the standard interview formulation of Word Search II: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a collection of strings/keys and a sequence of trie operations. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(L) per operation, where L is key length time, O(total stored key length) space.
**Pattern:** Trie traversal keyed by characters/bits; prune prefixes that cannot match.

### 518. Stream of Characters (H)

**Problem:** Solve the standard interview formulation of Stream of Characters: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a collection of strings/keys and a sequence of trie operations. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(L) per operation, where L is key length time, O(total stored key length) space.
**Pattern:** Trie traversal keyed by characters/bits; prune prefixes that cannot match.

### 519. Prefix and Suffix Search (H)

**Problem:** Solve the standard interview formulation of Prefix and Suffix Search: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a collection of strings/keys and a sequence of trie operations. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(L) per operation, where L is key length time, O(total stored key length) space.
**Pattern:** Trie traversal keyed by characters/bits; prune prefixes that cannot match.

### 520. Count Distinct Substrings using Trie (M)

**Problem:** Count the number of distinct substrings using trie cases that satisfy the standard problem conditions. The input is a collection of strings/keys and a sequence of trie operations. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(L) per operation, where L is key length time, O(total stored key length) space.
**Pattern:** Trie traversal keyed by characters/bits; prune prefixes that cannot match.

## 20. GRAPHS

Implement once from scratch: BFS, DFS, DSU (rank + path compression), Kahn's topo sort,

Dijkstra, Bellman-Ford, Floyd-Warshall, Prim, Kruskal, Tarjan bridges / articulation points, Kosaraju.

### Traversal & grids

### 521. Graph representation: matrix, list, edge list (E)

**Problem:** Solve the standard interview formulation of Graph representation: matrix, list, edge list: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a graph (vertices and edges), often with weights, direction, grid cells or a source/target. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(V+E), O((V+E) log V), or O(VE), depending on algorithm time, O(V+E) space.
**Pattern:** Graph traversal, topological ordering, DSU, shortest paths or spanning trees as indicated by the subtopic.

### 522. BFS of graph / DFS of graph (E★)

**Problem:** Given the relevant input structure, perform BFS of graph / DFS of graph and return the required traversal/order or derived result. The input is a graph (vertices and edges), often with weights, direction, grid cells or a source/target. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) or O(V+E) time, O(n) or O(V) space.
**Pattern:** FIFO queue / deque; for graph problems, mark on enqueue to avoid duplicate visits.

### 523. Flood Fill (E★)

**Problem:** Starting at a pixel, recolor its four-directionally connected region having the original color.

**Input:** `image = [[1,1,1],[1,1,0],[1,0,1]], sr=1, sc=1, color=2`
**Output:** `[[2,2,2],[2,2,0],[2,0,1]]`

**Target:** O(mn) time, O(mn) worst-case space.
**Pattern:** DFS/BFS connected-component traversal.

### 524. Number of Islands (M★)

**Problem:** Count connected components of land cells (1) in a binary grid using four-directional adjacency.

**Input:** `grid = [[1,1,0],[0,1,0],[1,0,1]]`
**Output:** `3`

**Target:** O(mn) time, O(mn) worst-case traversal space.
**Pattern:** DFS/BFS flood fill; mark visited land.

### 525. Max Area of Island (M★)

**Problem:** Solve the standard interview formulation of Max Area of Island: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a graph (vertices and edges), often with weights, direction, grid cells or a source/target. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(V+E), O((V+E) log V), or O(VE), depending on algorithm time, O(V+E) space.
**Pattern:** Graph traversal, topological ordering, DSU, shortest paths or spanning trees as indicated by the subtopic.

### 526. Number of Enclaves (M★)

**Problem:** Compute the number of enclaves for the given input. The input is a graph (vertices and edges), often with weights, direction, grid cells or a source/target. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(V+E), O((V+E) log V), or O(VE), depending on algorithm time, O(V+E) space.
**Pattern:** Graph traversal, topological ordering, DSU, shortest paths or spanning trees as indicated by the subtopic.

### 527. Surrounded Regions (M★)

**Problem:** Solve the standard interview formulation of Surrounded Regions: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a graph (vertices and edges), often with weights, direction, grid cells or a source/target. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(V+E), O((V+E) log V), or O(VE), depending on algorithm time, O(V+E) space.
**Pattern:** Graph traversal, topological ordering, DSU, shortest paths or spanning trees as indicated by the subtopic.

### 528. Pacific Atlantic Water Flow (M★)

**Problem:** Solve the standard interview formulation of Pacific Atlantic Water Flow: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a graph (vertices and edges), often with weights, direction, grid cells or a source/target. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(V+E), O((V+E) log V), or O(VE), depending on algorithm time, O(V+E) space.
**Pattern:** Graph traversal, topological ordering, DSU, shortest paths or spanning trees as indicated by the subtopic.

### 529. Rotting Oranges (M★)

**Problem:** Return minutes until all fresh oranges become rotten under simultaneous four-directional spread, or -1 if impossible.

**Input:** `grid = [[2,1,1],[1,1,0],[0,1,1]]`
**Output:** `4`

**Target:** O(mn) time, O(mn) space.
**Pattern:** Multi-source BFS from all initially rotten cells.

### 530. 01 Matrix (M★)

**Problem:** Solve the standard interview formulation of 01 Matrix: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a graph (vertices and edges), often with weights, direction, grid cells or a source/target. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(V+E), O((V+E) log V), or O(VE), depending on algorithm time, O(V+E) space.
**Pattern:** Graph traversal, topological ordering, DSU, shortest paths or spanning trees as indicated by the subtopic.

### 531. Walls and Gates (M★)

**Problem:** Solve the standard interview formulation of Walls and Gates: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a graph (vertices and edges), often with weights, direction, grid cells or a source/target. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(V+E), O((V+E) log V), or O(VE), depending on algorithm time, O(V+E) space.
**Pattern:** Graph traversal, topological ordering, DSU, shortest paths or spanning trees as indicated by the subtopic.

### 532. Shortest Path in Binary Matrix (M)

**Problem:** Find the shortest path in binary matrix satisfying the problem constraints. The input is a graph (vertices and edges), often with weights, direction, grid cells or a source/target. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** BFS O(V+E); Dijkstra O((V+E) log V); Bellman–Ford O(VE) time, O(V+E) space.
**Pattern:** Shortest-path relaxation; use BFS for unit weights, Dijkstra for non-negative weights, Bellman–Ford for negative edges.

### 533. As Far from Land as Possible (M)

**Problem:** Solve the standard interview formulation of As Far from Land as Possible: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a graph (vertices and edges), often with weights, direction, grid cells or a source/target. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(V+E), O((V+E) log V), or O(VE), depending on algorithm time, O(V+E) space.
**Pattern:** Graph traversal, topological ordering, DSU, shortest paths or spanning trees as indicated by the subtopic.

### 534. Number of Distinct Islands (M★)

**Problem:** Compute the number of distinct islands for the given input. The input is a graph (vertices and edges), often with weights, direction, grid cells or a source/target. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(V+E), O((V+E) log V), or O(VE), depending on algorithm time, O(V+E) space.
**Pattern:** Graph traversal, topological ordering, DSU, shortest paths or spanning trees as indicated by the subtopic.

### 535. Island Perimeter (E)

**Problem:** Solve the standard interview formulation of Island Perimeter: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a graph (vertices and edges), often with weights, direction, grid cells or a source/target. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(V+E), O((V+E) log V), or O(VE), depending on algorithm time, O(V+E) space.
**Pattern:** Graph traversal, topological ordering, DSU, shortest paths or spanning trees as indicated by the subtopic.

### 536. Number of Closed Islands (M)

**Problem:** Compute the number of closed islands for the given input. The input is a graph (vertices and edges), often with weights, direction, grid cells or a source/target. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(V+E), O((V+E) log V), or O(VE), depending on algorithm time, O(V+E) space.
**Pattern:** Graph traversal, topological ordering, DSU, shortest paths or spanning trees as indicated by the subtopic.

### 537. Making A Large Island (H)

**Problem:** Solve the standard interview formulation of Making A Large Island: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a graph (vertices and edges), often with weights, direction, grid cells or a source/target. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(V+E), O((V+E) log V), or O(VE), depending on algorithm time, O(V+E) space.
**Pattern:** Graph traversal, topological ordering, DSU, shortest paths or spanning trees as indicated by the subtopic.

### 538. Clone Graph (M★)

**Problem:** Solve the standard interview formulation of Clone Graph: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a graph (vertices and edges), often with weights, direction, grid cells or a source/target. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(V+E), O((V+E) log V), or O(VE), depending on algorithm time, O(V+E) space.
**Pattern:** Graph traversal, topological ordering, DSU, shortest paths or spanning trees as indicated by the subtopic.

### 539. Find if Path Exists in Graph (E)

**Problem:** Find and return if path exists in graph from the supplied input; return the required sentinel/empty result when it does not exist. The input is a graph (vertices and edges), often with weights, direction, grid cells or a source/target. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(V+E), O((V+E) log V), or O(VE), depending on algorithm time, O(V+E) space.
**Pattern:** Graph traversal, topological ordering, DSU, shortest paths or spanning trees as indicated by the subtopic.

### 540. All Paths From Source to Target (M)

**Problem:** Solve the standard interview formulation of All Paths From Source to Target: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a graph (vertices and edges), often with weights, direction, grid cells or a source/target. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(V+E), O((V+E) log V), or O(VE), depending on algorithm time, O(V+E) space.
**Pattern:** Graph traversal, topological ordering, DSU, shortest paths or spanning trees as indicated by the subtopic.

### 541. Keys and Rooms (M)

**Problem:** Solve the standard interview formulation of Keys and Rooms: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a graph (vertices and edges), often with weights, direction, grid cells or a source/target. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(V+E), O((V+E) log V), or O(VE), depending on algorithm time, O(V+E) space.
**Pattern:** Graph traversal, topological ordering, DSU, shortest paths or spanning trees as indicated by the subtopic.

### 542. Number of Provinces (M★)

**Problem:** Compute the number of provinces for the given input. The input is a graph (vertices and edges), often with weights, direction, grid cells or a source/target. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(V+E), O((V+E) log V), or O(VE), depending on algorithm time, O(V+E) space.
**Pattern:** Graph traversal, topological ordering, DSU, shortest paths or spanning trees as indicated by the subtopic.

### 543. Find the Town Judge (E)

**Problem:** Find and return the town judge from the supplied input; return the required sentinel/empty result when it does not exist. The input is a graph (vertices and edges), often with weights, direction, grid cells or a source/target. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(V+E), O((V+E) log V), or O(VE), depending on algorithm time, O(V+E) space.
**Pattern:** Graph traversal, topological ordering, DSU, shortest paths or spanning trees as indicated by the subtopic.

### 544. Find Center of Star Graph (E)

**Problem:** Find and return center of star graph from the supplied input; return the required sentinel/empty result when it does not exist. The input is a graph (vertices and edges), often with weights, direction, grid cells or a source/target. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(V+E), O((V+E) log V), or O(VE), depending on algorithm time, O(V+E) space.
**Pattern:** Graph traversal, topological ordering, DSU, shortest paths or spanning trees as indicated by the subtopic.

### Cycles, bipartite, topo

### 545. Detect Cycle in Undirected Graph (BFS + DFS) (M★)

**Problem:** Given the relevant input structure, perform Detect Cycle in Undirected Graph (BFS + DFS) and return the required traversal/order or derived result. The input is a graph (vertices and edges), often with weights, direction, grid cells or a source/target. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) or O(V+E) time, O(n) or O(V) space.
**Pattern:** FIFO queue / deque; for graph problems, mark on enqueue to avoid duplicate visits.

### 546. Detect Cycle in Directed Graph (M★)

**Problem:** Solve the standard interview formulation of Detect Cycle in Directed Graph: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a graph (vertices and edges), often with weights, direction, grid cells or a source/target. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(V+E), O((V+E) log V), or O(VE), depending on algorithm time, O(V+E) space.
**Pattern:** Graph traversal, topological ordering, DSU, shortest paths or spanning trees as indicated by the subtopic.

### 547. Is Graph Bipartite? (M★)

**Problem:** Solve the standard interview formulation of Is Graph Bipartite?: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a graph (vertices and edges), often with weights, direction, grid cells or a source/target. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(V+E), O((V+E) log V), or O(VE), depending on algorithm time, O(V+E) space.
**Pattern:** Graph traversal, topological ordering, DSU, shortest paths or spanning trees as indicated by the subtopic.

### 548. Possible Bipartition (M)

**Problem:** Solve the standard interview formulation of Possible Bipartition: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a graph (vertices and edges), often with weights, direction, grid cells or a source/target. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(V+E), O((V+E) log V), or O(VE), depending on algorithm time, O(V+E) space.
**Pattern:** Graph traversal, topological ordering, DSU, shortest paths or spanning trees as indicated by the subtopic.

### 549. Course Schedule (M★)

**Problem:** Given course prerequisite pairs, determine whether all courses can be completed.

**Input:** `numCourses = 2, prerequisites = [[1,0]]`
**Output:** `true`

**Target:** O(V+E) time, O(V+E) space.
**Pattern:** Directed-cycle detection using DFS colors or Kahn indegrees.

### 550. Course Schedule II (M★)

**Problem:** Return a valid ordering of all courses respecting prerequisite edges, or an empty array if impossible.

**Input:** `numCourses = 2, prerequisites = [[1,0]]`
**Output:** `[0,1]`

**Target:** O(V+E) time, O(V+E) space.
**Pattern:** Topological sorting using Kahn BFS or DFS postorder.

### 551. Find Eventual Safe States (M★)

**Problem:** Find and return eventual safe states from the supplied input; return the required sentinel/empty result when it does not exist. The input is a graph (vertices and edges), often with weights, direction, grid cells or a source/target. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(V+E) time, O(V+E) space.
**Pattern:** Topological ordering / directed-cycle detection using indegrees (Kahn) or DFS coloring.

### 552. Parallel Courses (M)

**Problem:** Solve the standard interview formulation of Parallel Courses: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a graph (vertices and edges), often with weights, direction, grid cells or a source/target. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(V+E) time, O(V+E) space.
**Pattern:** Topological ordering / directed-cycle detection using indegrees (Kahn) or DFS coloring.

### 553. Alien Dictionary (H★)

**Problem:** Solve the standard interview formulation of Alien Dictionary: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a graph (vertices and edges), often with weights, direction, grid cells or a source/target. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(V+E) time, O(V+E) space.
**Pattern:** Topological ordering / directed-cycle detection using indegrees (Kahn) or DFS coloring.

### 554. Sequence Reconstruction (M)

**Problem:** Solve the standard interview formulation of Sequence Reconstruction: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a graph (vertices and edges), often with weights, direction, grid cells or a source/target. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(V+E) time, O(V+E) space.
**Pattern:** Topological ordering / directed-cycle detection using indegrees (Kahn) or DFS coloring.

### 555. Minimum Height Trees (M★)

**Problem:** Find the minimum possible height trees over the allowed choices in the input. The input is a graph (vertices and edges), often with weights, direction, grid cells or a source/target. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(V+E), O((V+E) log V), or O(VE), depending on algorithm time, O(V+E) space.
**Pattern:** Graph traversal, topological ordering, DSU, shortest paths or spanning trees as indicated by the subtopic.

### 556. Topological Sort (DFS + Kahn's) (M★)

**Problem:** Given the relevant input structure, perform Topological Sort (DFS + Kahn's) and return the required traversal/order or derived result. The input is a graph (vertices and edges), often with weights, direction, grid cells or a source/target. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(V+E) time, O(V+E) space.
**Pattern:** Topological ordering / directed-cycle detection using indegrees (Kahn) or DFS coloring.

### BFS variants

### 557. Word Ladder (H★)

**Problem:** Solve the standard interview formulation of Word Ladder: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a graph (vertices and edges), often with weights, direction, grid cells or a source/target. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(V+E), O((V+E) log V), or O(VE), depending on algorithm time, O(V+E) space.
**Pattern:** Graph traversal, topological ordering, DSU, shortest paths or spanning trees as indicated by the subtopic.

### 558. Word Ladder II (H)

**Problem:** Solve the standard interview formulation of Word Ladder II: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a graph (vertices and edges), often with weights, direction, grid cells or a source/target. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(V+E), O((V+E) log V), or O(VE), depending on algorithm time, O(V+E) space.
**Pattern:** Graph traversal, topological ordering, DSU, shortest paths or spanning trees as indicated by the subtopic.

### 559. Open the Lock (M)

**Problem:** Solve the standard interview formulation of Open the Lock: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a graph (vertices and edges), often with weights, direction, grid cells or a source/target. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(V+E), O((V+E) log V), or O(VE), depending on algorithm time, O(V+E) space.
**Pattern:** Graph traversal, topological ordering, DSU, shortest paths or spanning trees as indicated by the subtopic.

### 560. Snakes and Ladders (M)

**Problem:** Solve the standard interview formulation of Snakes and Ladders: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a graph (vertices and edges), often with weights, direction, grid cells or a source/target. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(V+E), O((V+E) log V), or O(VE), depending on algorithm time, O(V+E) space.
**Pattern:** Graph traversal, topological ordering, DSU, shortest paths or spanning trees as indicated by the subtopic.

### 561. Minimum Genetic Mutation (M)

**Problem:** Find the minimum possible genetic mutation over the allowed choices in the input. The input is a graph (vertices and edges), often with weights, direction, grid cells or a source/target. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(V+E), O((V+E) log V), or O(VE), depending on algorithm time, O(V+E) space.
**Pattern:** Graph traversal, topological ordering, DSU, shortest paths or spanning trees as indicated by the subtopic.

### 562. Shortest Path in Undirected Graph, unit weights (M)

**Problem:** Find the shortest path in undirected graph, unit weights satisfying the problem constraints. The input is a graph (vertices and edges), often with weights, direction, grid cells or a source/target. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** BFS O(V+E); Dijkstra O((V+E) log V); Bellman–Ford O(VE) time, O(V+E) space.
**Pattern:** Shortest-path relaxation; use BFS for unit weights, Dijkstra for non-negative weights, Bellman–Ford for negative edges.

### 563. Bus Routes (H)

**Problem:** Solve the standard interview formulation of Bus Routes: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a graph (vertices and edges), often with weights, direction, grid cells or a source/target. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(V+E), O((V+E) log V), or O(VE), depending on algorithm time, O(V+E) space.
**Pattern:** Graph traversal, topological ordering, DSU, shortest paths or spanning trees as indicated by the subtopic.

### 564. Jump Game III / IV (M)

**Problem:** Solve the standard interview formulation of Jump Game III / IV: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a graph (vertices and edges), often with weights, direction, grid cells or a source/target. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(V+E), O((V+E) log V), or O(VE), depending on algorithm time, O(V+E) space.
**Pattern:** Graph traversal, topological ordering, DSU, shortest paths or spanning trees as indicated by the subtopic.

### DSU

### 565. Disjoint Set Union implementation (M★)

**Problem:** Implement union and find for disjoint sets, using path compression and union by size/rank.

**Input:** `n=5; union(0,1); union(1,2); find(2)==find(0)`
**Output:** `true`

**Target:** Amortized O(α(n)) per operation time, O(n) space.
**Pattern:** Disjoint-set forest with path compression and union by rank/size.

### 566. Number of Connected Components in Undirected Graph (M★)

**Problem:** Count connected components in an undirected graph with n vertices.

**Input:** `n=5, edges=[[0,1],[1,2],[3,4]]`
**Output:** `2`

**Target:** O(V+E) time, O(V) space.
**Pattern:** DFS/BFS or DSU.

### 567. Graph Valid Tree (M★)

**Problem:** Solve the standard interview formulation of Graph Valid Tree: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a graph (vertices and edges), often with weights, direction, grid cells or a source/target. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(V+E), O((V+E) log V), or O(VE), depending on algorithm time, O(V+E) space.
**Pattern:** Graph traversal, topological ordering, DSU, shortest paths or spanning trees as indicated by the subtopic.

### 568. Redundant Connection I and II (M★)

**Problem:** Solve the standard interview formulation of Redundant Connection I and II: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a graph (vertices and edges), often with weights, direction, grid cells or a source/target. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O((V+E) α(V)) time, O(V) space.
**Pattern:** Disjoint Set Union with path compression and union by size/rank.

### 569. Accounts Merge (M★)

**Problem:** Solve the standard interview formulation of Accounts Merge: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a graph (vertices and edges), often with weights, direction, grid cells or a source/target. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O((V+E) α(V)) time, O(V) space.
**Pattern:** Disjoint Set Union with path compression and union by size/rank.

### 570. Most Stones Removed with Same Row or Column (M)

**Problem:** Solve the standard interview formulation of Most Stones Removed with Same Row or Column: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a graph (vertices and edges), often with weights, direction, grid cells or a source/target. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O((V+E) α(V)) time, O(V) space.
**Pattern:** Disjoint Set Union with path compression and union by size/rank.

### 571. Number of Operations to Make Network Connected (M★)

**Problem:** Compute the number of operations to make network connected for the given input. The input is a graph (vertices and edges), often with weights, direction, grid cells or a source/target. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O((V+E) α(V)) time, O(V) space.
**Pattern:** Disjoint Set Union with path compression and union by size/rank.

### 572. Number of Islands II (H)

**Problem:** Compute the number of islands ii for the given input. The input is a graph (vertices and edges), often with weights, direction, grid cells or a source/target. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(V+E), O((V+E) log V), or O(VE), depending on algorithm time, O(V+E) space.
**Pattern:** Graph traversal, topological ordering, DSU, shortest paths or spanning trees as indicated by the subtopic.

### 573. Satisfiability of Equality Equations (M)

**Problem:** Solve the standard interview formulation of Satisfiability of Equality Equations: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a graph (vertices and edges), often with weights, direction, grid cells or a source/target. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O((V+E) α(V)) time, O(V) space.
**Pattern:** Disjoint Set Union with path compression and union by size/rank.

### 574. Smallest String With Swaps (M)

**Problem:** Solve the standard interview formulation of Smallest String With Swaps: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a graph (vertices and edges), often with weights, direction, grid cells or a source/target. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(V+E), O((V+E) log V), or O(VE), depending on algorithm time, O(V+E) space.
**Pattern:** Graph traversal, topological ordering, DSU, shortest paths or spanning trees as indicated by the subtopic.

### 575. Regions Cut by Slashes (M)

**Problem:** Solve the standard interview formulation of Regions Cut by Slashes: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a graph (vertices and edges), often with weights, direction, grid cells or a source/target. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(V+E), O((V+E) log V), or O(VE), depending on algorithm time, O(V+E) space.
**Pattern:** Graph traversal, topological ordering, DSU, shortest paths or spanning trees as indicated by the subtopic.

### 576. Swim in Rising Water (H★)

**Problem:** Solve the standard interview formulation of Swim in Rising Water: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a graph (vertices and edges), often with weights, direction, grid cells or a source/target. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(V+E), O((V+E) log V), or O(VE), depending on algorithm time, O(V+E) space.
**Pattern:** Graph traversal, topological ordering, DSU, shortest paths or spanning trees as indicated by the subtopic.

### 577. Evaluate Division (M★)

**Problem:** Solve the standard interview formulation of Evaluate Division: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a graph (vertices and edges), often with weights, direction, grid cells or a source/target. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(V+E), O((V+E) log V), or O(VE), depending on algorithm time, O(V+E) space.
**Pattern:** Graph traversal, topological ordering, DSU, shortest paths or spanning trees as indicated by the subtopic.

### Shortest paths

### 578. Dijkstra's Algorithm (M★)

**Problem:** Given a weighted directed/undirected graph with non-negative edge weights and a source, compute shortest distances to all vertices.

**Input:** `edges: 0–1(4), 0–2(1), 2–1(2); source=0`
**Output:** `distances: [0,3,1]`

**Target:** O((V+E) log V) time, O(V+E) space.
**Pattern:** Priority queue with stale-entry skipping and relaxation.

### 579. Network Delay Time (M★)

**Problem:** Given a directed weighted graph and a source, return the time for all nodes to receive the signal, or -1 if some are unreachable.

**Input:** `times = [[2,1,1],[2,3,1],[3,4,1]], n=4, k=2`
**Output:** `2`

**Target:** O((V+E) log V) time, O(V+E) space.
**Pattern:** Dijkstra shortest paths; take maximum finite distance.

### 580. Cheapest Flights Within K Stops (M★)

**Problem:** Solve the standard interview formulation of Cheapest Flights Within K Stops: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a graph (vertices and edges), often with weights, direction, grid cells or a source/target. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n log k) for top-k; O(n log n) for full ordering time, O(k) or O(n) space.
**Pattern:** Priority queue; maintain only the k best candidates when possible.

### 581. Path With Minimum Effort (M★)

**Problem:** Solve the standard interview formulation of Path With Minimum Effort: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a graph (vertices and edges), often with weights, direction, grid cells or a source/target. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(V+E), O((V+E) log V), or O(VE), depending on algorithm time, O(V+E) space.
**Pattern:** Graph traversal, topological ordering, DSU, shortest paths or spanning trees as indicated by the subtopic.

### 582. Path with Maximum Probability (M)

**Problem:** Solve the standard interview formulation of Path with Maximum Probability: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a graph (vertices and edges), often with weights, direction, grid cells or a source/target. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(V+E), O((V+E) log V), or O(VE), depending on algorithm time, O(V+E) space.
**Pattern:** Graph traversal, topological ordering, DSU, shortest paths or spanning trees as indicated by the subtopic.

### 583. Minimum Cost to Make at Least One Valid Path in a Grid (H)

**Problem:** Find the minimum possible cost to make at least one valid path in a grid over the allowed choices in the input. The input is a graph (vertices and edges), often with weights, direction, grid cells or a source/target. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(V+E), O((V+E) log V), or O(VE), depending on algorithm time, O(V+E) space.
**Pattern:** Graph traversal, topological ordering, DSU, shortest paths or spanning trees as indicated by the subtopic.

### 584. Number of Ways to Arrive at Destination (M★)

**Problem:** Compute the number of ways to arrive at destination for the given input. The input is a graph (vertices and edges), often with weights, direction, grid cells or a source/target. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(V+E), O((V+E) log V), or O(VE), depending on algorithm time, O(V+E) space.
**Pattern:** Graph traversal, topological ordering, DSU, shortest paths or spanning trees as indicated by the subtopic.

### 585. Shortest Path in Weighted DAG (M)

**Problem:** Find the shortest path in weighted dag satisfying the problem constraints. The input is a graph (vertices and edges), often with weights, direction, grid cells or a source/target. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** BFS O(V+E); Dijkstra O((V+E) log V); Bellman–Ford O(VE) time, O(V+E) space.
**Pattern:** Shortest-path relaxation; use BFS for unit weights, Dijkstra for non-negative weights, Bellman–Ford for negative edges.

### 586. Bellman-Ford (M★)

**Problem:** Solve the standard interview formulation of Bellman-Ford: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a graph (vertices and edges), often with weights, direction, grid cells or a source/target. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Bellman–Ford O(VE); Floyd–Warshall O(V³) time, O(V) or O(V²) space.
**Pattern:** Repeated edge relaxation / all-pairs dynamic programming.

### 587. Floyd-Warshall (M★)

**Problem:** Solve the standard interview formulation of Floyd-Warshall: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a graph (vertices and edges), often with weights, direction, grid cells or a source/target. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Bellman–Ford O(VE); Floyd–Warshall O(V³) time, O(V) or O(V²) space.
**Pattern:** Repeated edge relaxation / all-pairs dynamic programming.

### 588. Find the City With the Smallest Number of Neighbors (M)

**Problem:** Find and return the city with the smallest number of neighbors from the supplied input; return the required sentinel/empty result when it does not exist. The input is a graph (vertices and edges), often with weights, direction, grid cells or a source/target. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(V+E), O((V+E) log V), or O(VE), depending on algorithm time, O(V+E) space.
**Pattern:** Graph traversal, topological ordering, DSU, shortest paths or spanning trees as indicated by the subtopic.

### 589. Reachable Nodes In Subdivided Graph (H)

**Problem:** Solve the standard interview formulation of Reachable Nodes In Subdivided Graph: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a graph (vertices and edges), often with weights, direction, grid cells or a source/target. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(V+E), O((V+E) log V), or O(VE), depending on algorithm time, O(V+E) space.
**Pattern:** Graph traversal, topological ordering, DSU, shortest paths or spanning trees as indicated by the subtopic.

### 590. Minimum Obstacle Removal to Reach Corner (H)

**Problem:** Find the minimum possible obstacle removal to reach corner over the allowed choices in the input. The input is a graph (vertices and edges), often with weights, direction, grid cells or a source/target. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(V+E), O((V+E) log V), or O(VE), depending on algorithm time, O(V+E) space.
**Pattern:** Graph traversal, topological ordering, DSU, shortest paths or spanning trees as indicated by the subtopic.

### MST

### 591. Prim's Algorithm (M★)

**Problem:** Implement or apply Prim's Algorithm to the supplied input and return the result required by its standard formulation. The input is a graph (vertices and edges), often with weights, direction, grid cells or a source/target. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(E log V) time, O(V+E) space.
**Pattern:** Minimum spanning tree using Prim with a heap or Kruskal with DSU.

### 592. Kruskal's Algorithm (M★)

**Problem:** Implement or apply Kruskal's Algorithm to the supplied input and return the result required by its standard formulation. The input is a graph (vertices and edges), often with weights, direction, grid cells or a source/target. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(E log V) time, O(V+E) space.
**Pattern:** Minimum spanning tree using Prim with a heap or Kruskal with DSU.

### 593. Min Cost to Connect All Points (M★)

**Problem:** Solve the standard interview formulation of Min Cost to Connect All Points: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a graph (vertices and edges), often with weights, direction, grid cells or a source/target. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(V+E), O((V+E) log V), or O(VE), depending on algorithm time, O(V+E) space.
**Pattern:** Graph traversal, topological ordering, DSU, shortest paths or spanning trees as indicated by the subtopic.

### 594. Optimize Water Distribution in a Village (H)

**Problem:** Solve the standard interview formulation of Optimize Water Distribution in a Village: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a graph (vertices and edges), often with weights, direction, grid cells or a source/target. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(V+E), O((V+E) log V), or O(VE), depending on algorithm time, O(V+E) space.
**Pattern:** Graph traversal, topological ordering, DSU, shortest paths or spanning trees as indicated by the subtopic.

### 595. Find Critical and Pseudo-Critical Edges in MST (H)

**Problem:** Find and return critical and pseudo-critical edges in mst from the supplied input; return the required sentinel/empty result when it does not exist. The input is a graph (vertices and edges), often with weights, direction, grid cells or a source/target. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(E log V) time, O(V+E) space.
**Pattern:** Minimum spanning tree using Prim with a heap or Kruskal with DSU.

### Advanced

### 596. Critical Connections in a Network / Bridges (H★)

**Problem:** Solve the standard interview formulation of Critical Connections in a Network / Bridges: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a graph (vertices and edges), often with weights, direction, grid cells or a source/target. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(V+E), O((V+E) log V), or O(VE), depending on algorithm time, O(V+E) space.
**Pattern:** Graph traversal, topological ordering, DSU, shortest paths or spanning trees as indicated by the subtopic.

### 597. Articulation Points (H)

**Problem:** Solve the standard interview formulation of Articulation Points: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a graph (vertices and edges), often with weights, direction, grid cells or a source/target. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(V+E), O((V+E) log V), or O(VE), depending on algorithm time, O(V+E) space.
**Pattern:** Graph traversal, topological ordering, DSU, shortest paths or spanning trees as indicated by the subtopic.

### 598. Strongly Connected Components: Kosaraju (H★)

**Problem:** Solve the standard interview formulation of Strongly Connected Components: Kosaraju: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a graph (vertices and edges), often with weights, direction, grid cells or a source/target. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O((V+E) α(V)) time, O(V) space.
**Pattern:** Disjoint Set Union with path compression and union by size/rank.

### 599. Tarjan's SCC (H)

**Problem:** Solve the standard interview formulation of Tarjan's SCC: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a graph (vertices and edges), often with weights, direction, grid cells or a source/target. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(V+E), O((V+E) log V), or O(VE), depending on algorithm time, O(V+E) space.
**Pattern:** Graph traversal, topological ordering, DSU, shortest paths or spanning trees as indicated by the subtopic.

### 600. Reconstruct Itinerary (H★)

**Problem:** Solve the standard interview formulation of Reconstruct Itinerary: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a graph (vertices and edges), often with weights, direction, grid cells or a source/target. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(V+E), O((V+E) log V), or O(VE), depending on algorithm time, O(V+E) space.
**Pattern:** Graph traversal, topological ordering, DSU, shortest paths or spanning trees as indicated by the subtopic.

### 601. Shortest Path Visiting All Nodes (H★)

**Problem:** Find the shortest path visiting all nodes satisfying the problem constraints. The input is a graph (vertices and edges), often with weights, direction, grid cells or a source/target. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** BFS O(V+E); Dijkstra O((V+E) log V); Bellman–Ford O(VE) time, O(V+E) space.
**Pattern:** Shortest-path relaxation; use BFS for unit weights, Dijkstra for non-negative weights, Bellman–Ford for negative edges.

### 602. Cheapest path with bitmask states (H)

**Problem:** Solve the standard interview formulation of Cheapest path with bitmask states: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a graph (vertices and edges), often with weights, direction, grid cells or a source/target. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n log k) for top-k; O(n log n) for full ordering time, O(k) or O(n) space.
**Pattern:** Priority queue; maintain only the k best candidates when possible.

### 603. Maximum Total Importance of Roads (M)

**Problem:** Find the maximum possible total importance of roads over the allowed choices in the input. The input is a graph (vertices and edges), often with weights, direction, grid cells or a source/target. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(V+E), O((V+E) log V), or O(VE), depending on algorithm time, O(V+E) space.
**Pattern:** Graph traversal, topological ordering, DSU, shortest paths or spanning trees as indicated by the subtopic.

### 604. Reorder Routes to Make All Paths Lead to City Zero (M)

**Problem:** Solve the standard interview formulation of Reorder Routes to Make All Paths Lead to City Zero: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a graph (vertices and edges), often with weights, direction, grid cells or a source/target. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(V+E), O((V+E) log V), or O(VE), depending on algorithm time, O(V+E) space.
**Pattern:** Graph traversal, topological ordering, DSU, shortest paths or spanning trees as indicated by the subtopic.

### 605. Eulerian Path / Circuit (H)

**Problem:** Solve the standard interview formulation of Eulerian Path / Circuit: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is a graph (vertices and edges), often with weights, direction, grid cells or a source/target. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(V+E), O((V+E) log V), or O(VE), depending on algorithm time, O(V+E) space.
**Pattern:** Graph traversal, topological ordering, DSU, shortest paths or spanning trees as indicated by the subtopic.

## 21. DYNAMIC PROGRAMMING

Always write: state, transition, base case, memo, tabulation, then space-optimize.

### 1D / linear

### 606. Climbing Stairs (E★)

**Problem:** Count ways to reach step n when each move is one or two steps.

**Input:** `n = 3`
**Output:** `3`

**Target:** O(n) time, O(1) optimized space.
**Pattern:** Fibonacci-style one-dimensional DP.

### 607. Min Cost Climbing Stairs (E★)

**Problem:** Solve the standard interview formulation of Min Cost Climbing Stairs: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 608. Frog Jump / Frog Jump with K Distances (M)

**Problem:** Solve the standard interview formulation of Frog Jump / Frog Jump with K Distances: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 609. House Robber (M★)

**Problem:** Choose non-adjacent houses to maximize the total amount stolen.

**Input:** `nums = [2,7,9,3,1]`
**Output:** `12`

**Target:** O(n) time, O(1) optimized space.
**Pattern:** DP: best through i is max(skip i, take i + best through i-2).

### 610. House Robber II (M★)

**Problem:** Solve the standard interview formulation of House Robber II: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 611. Maximum Sum of Non-Adjacent Elements (M)

**Problem:** Find the maximum possible sum of non-adjacent elements over the allowed choices in the input. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 612. Decode Ways (M★)

**Problem:** Solve the standard interview formulation of Decode Ways: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 613. Delete and Earn (M★)

**Problem:** Solve the standard interview formulation of Delete and Earn: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 614. Coin Change (M★)

**Problem:** Return the fewest coins needed to form amount, using unlimited coins of given denominations; return -1 if impossible.

**Input:** `coins = [1,2,5], amount = 11`
**Output:** `3`

**Target:** O(amount × number of coins) time, O(amount) space.
**Pattern:** Unbounded minimum-count DP.

### 615. Coin Change II (M★)

**Problem:** Count combinations that make amount using unlimited coins, ignoring order.

**Input:** `amount = 5, coins = [1,2,5]`
**Output:** `4`

**Target:** O(amount × number of coins) time, O(amount) space.
**Pattern:** Unbounded combination-count DP; iterate coins outermost.

### 616. Perfect Squares (M★)

**Problem:** Solve the standard interview formulation of Perfect Squares: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 617. Word Break (M★)

**Problem:** Solve the standard interview formulation of Word Break: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 618. Combination Sum IV (M)

**Problem:** Solve the standard interview formulation of Combination Sum IV: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 619. Minimum Cost For Tickets (M)

**Problem:** Find the minimum possible cost for tickets over the allowed choices in the input. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 620. Solving Questions With Brainpower (M)

**Problem:** Solve the standard interview formulation of Solving Questions With Brainpower: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 621. Maximum Alternating Subsequence Sum (M)

**Problem:** Find the maximum possible alternating subsequence sum over the allowed choices in the input. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 622. N-th Tribonacci Number (E)

**Problem:** Solve the standard interview formulation of N-th Tribonacci Number: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 623. Ugly Number II (M)

**Problem:** Solve the standard interview formulation of Ugly Number II: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 624. Integer Break (M)

**Problem:** Solve the standard interview formulation of Integer Break: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 625. Jump Game via DP (M)

**Problem:** Solve the standard interview formulation of Jump Game via DP: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 626. Counting Bits via DP (E)

**Problem:** Solve the standard interview formulation of Counting Bits via DP: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 627. Paint Fence (M)

**Problem:** Solve the standard interview formulation of Paint Fence: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 628. Domino and Tromino Tiling (M)

**Problem:** Solve the standard interview formulation of Domino and Tromino Tiling: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 629. Knight Dialer (M)

**Problem:** Solve the standard interview formulation of Knight Dialer: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 630. Number of Dice Rolls With Target Sum (M)

**Problem:** Compute the number of dice rolls with target sum for the given input. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n·target) or O(n·capacity) time, O(target) optimized space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### LIS family

### 631. Longest Increasing Subsequence, O(n^2) + O(n log n) (M★)

**Problem:** Return the length of the longest strictly increasing subsequence.

**Input:** `nums = [10,9,2,5,3,7,101,18]`
**Output:** `4`

**Target:** O(n log n) optimal; O(n²) baseline time, O(n) space.
**Pattern:** DP by ending index; patience sorting with lower-bound tails.

### 632. Print LIS (M)

**Problem:** Solve the standard interview formulation of Print LIS: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 633. Number of Longest Increasing Subsequences (M)

**Problem:** Compute the number of longest increasing subsequences for the given input. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n log n) optimal for LIS-family sorting/tails variants time, O(n) space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 634. Largest Divisible Subset (M)

**Problem:** Solve the standard interview formulation of Largest Divisible Subset: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n·target) or O(n·capacity) time, O(target) optimized space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 635. Longest String Chain (M)

**Problem:** Find the longest string chain satisfying the problem constraints. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 636. Russian Doll Envelopes (H★)

**Problem:** Solve the standard interview formulation of Russian Doll Envelopes: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n log n) optimal for LIS-family sorting/tails variants time, O(n) space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 637. Maximum Length of Pair Chain (M)

**Problem:** Find the maximum possible length of pair chain over the allowed choices in the input. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 638. Longest Bitonic Subsequence (M)

**Problem:** Find the longest bitonic subsequence satisfying the problem constraints. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 639. Minimum Deletions to Make Array a Mountain (H)

**Problem:** Find the minimum possible deletions to make array a mountain over the allowed choices in the input. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 640. Maximum Sum Increasing Subsequence (M)

**Problem:** Find the maximum possible sum increasing subsequence over the allowed choices in the input. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### Grid

### 641. Unique Paths (M★)

**Problem:** Count paths from top-left to bottom-right of an m×n grid, moving only right or down.

**Input:** `m = 3, n = 7`
**Output:** `28`

**Target:** O(mn) time, O(n) optimized space.
**Pattern:** Grid DP or binomial coefficient.

### 642. Unique Paths II (M★)

**Problem:** Solve the standard interview formulation of Unique Paths II: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 643. Minimum Path Sum (M★)

**Problem:** Find the minimum possible path sum over the allowed choices in the input. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 644. Triangle (M★)

**Problem:** Solve the standard interview formulation of Triangle: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 645. Minimum / Maximum Falling Path Sum (M★)

**Problem:** Find the minimum possible / maximum falling path sum over the allowed choices in the input. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 646. Maximal Square (M★)

**Problem:** Solve the standard interview formulation of Maximal Square: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 647. Count Square Submatrices with All Ones (M)

**Problem:** Count the number of square submatrices with all ones cases that satisfy the standard problem conditions. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 648. Cherry Pickup (H★)

**Problem:** Solve the standard interview formulation of Cherry Pickup: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 649. Cherry Pickup II (H★)

**Problem:** Solve the standard interview formulation of Cherry Pickup II: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 650. Dungeon Game (H★)

**Problem:** Solve the standard interview formulation of Dungeon Game: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 651. Longest Increasing Path in a Matrix (H★)

**Problem:** Find the longest increasing path in a matrix satisfying the problem constraints. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n log n) optimal for LIS-family sorting/tails variants time, O(n) space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 652. Number of Paths With Max Score (H)

**Problem:** Compute the number of paths with max score for the given input. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 653. Out of Boundary Paths (M)

**Problem:** Solve the standard interview formulation of Out of Boundary Paths: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 654. Maximum Number of Points with Cost (H)

**Problem:** Find the maximum possible number of points with cost over the allowed choices in the input. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### Strings

### 655. Longest Common Subsequence (M★)

**Problem:** Return the length of the longest sequence appearing in both strings in the same relative order, not necessarily contiguously.

**Input:** `text1 = "abcde", text2 = "ace"`
**Output:** `3`

**Target:** O(mn) time, O(min(m,n)) optimized space.
**Pattern:** Two-dimensional DP over matching prefixes.

### 656. Print LCS (M)

**Problem:** Solve the standard interview formulation of Print LCS: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 657. Longest Common Substring (M)

**Problem:** Find the longest common substring satisfying the problem constraints. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 658. Shortest Common Supersequence (H★)

**Problem:** Find the shortest common supersequence satisfying the problem constraints. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 659. Edit Distance (M★)

**Problem:** Return the minimum insertions, deletions and substitutions needed to convert one string into another.

**Input:** `word1 = "horse", word2 = "ros"`
**Output:** `3`

**Target:** O(mn) time, O(min(m,n)) optimized space.
**Pattern:** Prefix DP with insert/delete/replace transitions.

### 660. Delete Operation for Two Strings (M)

**Problem:** Solve the standard interview formulation of Delete Operation for Two Strings: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 661. Minimum ASCII Delete Sum for Two Strings (M)

**Problem:** Find the minimum possible ascii delete sum for two strings over the allowed choices in the input. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 662. Longest Palindromic Subsequence (M★)

**Problem:** Find the longest palindromic subsequence satisfying the problem constraints. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 663. Minimum Insertions to Make String Palindrome (H★)

**Problem:** Find the minimum possible insertions to make string palindrome over the allowed choices in the input. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 664. Palindrome Partitioning II (H★)

**Problem:** Solve the standard interview formulation of Palindrome Partitioning II: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 665. Distinct Subsequences (H★)

**Problem:** Solve the standard interview formulation of Distinct Subsequences: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 666. Interleaving String (M★)

**Problem:** Solve the standard interview formulation of Interleaving String: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(mn) time, O(min(m,n)) optimized space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 667. Wildcard Matching (H★)

**Problem:** Solve the standard interview formulation of Wildcard Matching: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(mn) time, O(min(m,n)) optimized space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 668. Regular Expression Matching (H★)

**Problem:** Solve the standard interview formulation of Regular Expression Matching: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(mn) time, O(min(m,n)) optimized space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 669. Scramble String (H)

**Problem:** Solve the standard interview formulation of Scramble String: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 670. Longest Repeating Subsequence (M)

**Problem:** Find the longest repeating subsequence satisfying the problem constraints. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 671. Shortest Palindrome (H)

**Problem:** Find the shortest palindrome satisfying the problem constraints. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 672. Count Different Palindromic Subsequences (H)

**Problem:** Count the number of different palindromic subsequences cases that satisfy the standard problem conditions. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### Subset / knapsack

### 673. Subset Sum (M★)

**Problem:** Solve the standard interview formulation of Subset Sum: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n·target) or O(n·capacity) time, O(target) optimized space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 674. Partition Equal Subset Sum (M★)

**Problem:** Solve the standard interview formulation of Partition Equal Subset Sum: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n·target) or O(n·capacity) time, O(target) optimized space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 675. Minimum Subset Sum Difference (M★)

**Problem:** Find the minimum possible subset sum difference over the allowed choices in the input. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n·target) or O(n·capacity) time, O(target) optimized space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 676. Count Subsets with Sum K (M★)

**Problem:** Count the number of subsets with sum k cases that satisfy the standard problem conditions. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n·target) or O(n·capacity) time, O(target) optimized space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 677. Count Partitions with Given Difference (M★)

**Problem:** Count the number of partitions with given difference cases that satisfy the standard problem conditions. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 678. Target Sum (M★)

**Problem:** Assign + or − to every number so the resulting expression equals target; count assignments.

**Input:** `nums = [1,1,1,1,1], target = 3`
**Output:** `5`

**Target:** O(n·sum(nums)) time, O(sum(nums)) space.
**Pattern:** Transform to subset-sum counting DP, handling zeros.

### 679. 0/1 Knapsack (M★)

**Problem:** Choose each item at most once to maximize value without exceeding the capacity.

**Input:** `weights=[1,3,4,5], values=[1,4,5,7], capacity=7`
**Output:** `9`

**Target:** O(nW) time, O(W) optimized space.
**Pattern:** Capacity DP iterated in descending order.

### 680. Unbounded Knapsack (M★)

**Problem:** Solve the standard interview formulation of Unbounded Knapsack: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n·target) or O(n·capacity) time, O(target) optimized space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 681. Rod Cutting (M)

**Problem:** Solve the standard interview formulation of Rod Cutting: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 682. Last Stone Weight II (M)

**Problem:** Solve the standard interview formulation of Last Stone Weight II: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 683. Ones and Zeroes (M★)

**Problem:** Solve the standard interview formulation of Ones and Zeroes: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 684. Profitable Schemes (H)

**Problem:** Solve the standard interview formulation of Profitable Schemes: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 685. Partition to K Equal Sum Subsets via DP bitmask (H)

**Problem:** Solve the standard interview formulation of Partition to K Equal Sum Subsets via DP bitmask: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(2^n · poly(n)) time, O(2^n · poly(n)) space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### Stocks

### 686. Best Time to Buy and Sell Stock I / II (E/M★)

**Problem:** For the specified stock variant, maximize profit under its transaction rules (one transaction for I; unlimited non-overlapping transactions for II).

**Input:** `prices = [7,1,5,3,6,4] (I)`
**Output:** `5`

**Target:** I: O(n); II: O(n) time, O(1) space.
**Pattern:** Track minimum price for I; sum positive adjacent rises for II.

### 687. Best Time to Buy and Sell Stock III (H★)

**Problem:** Given the relevant price series and transaction rules, compute the maximum achievable profit for best time to buy and sell stock iii. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 688. Best Time to Buy and Sell Stock IV (H★)

**Problem:** Given the relevant price series and transaction rules, compute the maximum achievable profit for best time to buy and sell stock iv. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 689. Best Time with Cooldown (M★)

**Problem:** Given the relevant price series and transaction rules, compute the maximum achievable profit for best time with cooldown. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 690. Best Time with Transaction Fee (M★)

**Problem:** Given the relevant price series and transaction rules, compute the maximum achievable profit for best time with transaction fee. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### Interval / partition

### 691. Matrix Chain Multiplication (H★)

**Problem:** Solve the standard interview formulation of Matrix Chain Multiplication: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Typically O(n³) time, O(n²) space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 692. Minimum Cost to Cut a Stick (H★)

**Problem:** Find the minimum possible cost to cut a stick over the allowed choices in the input. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Typically O(n³) time, O(n²) space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 693. Burst Balloons (H★)

**Problem:** Solve the standard interview formulation of Burst Balloons: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Typically O(n³) time, O(n²) space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 694. Palindrome Removal (H)

**Problem:** Solve the standard interview formulation of Palindrome Removal: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 695. Boolean Parenthesization (H★)

**Problem:** Solve the standard interview formulation of Boolean Parenthesization: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Typically O(n³) time, O(n²) space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 696. Partition Array for Maximum Sum (M)

**Problem:** Solve the standard interview formulation of Partition Array for Maximum Sum: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 697. Minimum Cost to Merge Stones (H)

**Problem:** Find the minimum possible cost to merge stones over the allowed choices in the input. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 698. Strange Printer (H)

**Problem:** Solve the standard interview formulation of Strange Printer: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 699. Remove Boxes (H)

**Problem:** Solve the standard interview formulation of Remove Boxes: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 700. Guess Number Higher or Lower II (M)

**Problem:** Solve the standard interview formulation of Guess Number Higher or Lower II: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 701. Egg Dropping Problem (H)

**Problem:** Implement or apply Egg Dropping Problem to the supplied input and return the result required by its standard formulation. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 702. Maximum Profit in Job Scheduling (H★)

**Problem:** Find the maximum possible profit in job scheduling over the allowed choices in the input. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 703. Stone Game I to III (M/H)

**Problem:** Solve the standard interview formulation of Stone Game I to III: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 704. Predict the Winner (M)

**Problem:** Solve the standard interview formulation of Predict the Winner: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 705. Optimal Binary Search Tree (H)

**Problem:** Solve the standard interview formulation of Optimal Binary Search Tree: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### Bitmask DP

### 706. Traveling Salesman Problem (H★)

**Problem:** Implement or apply Traveling Salesman Problem to the supplied input and return the result required by its standard formulation. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(2^n · poly(n)) time, O(2^n · poly(n)) space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 707. Partition to K Equal Sum Subsets (H)

**Problem:** Solve the standard interview formulation of Partition to K Equal Sum Subsets: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n·target) or O(n·capacity) time, O(target) optimized space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 708. Shortest Superstring (H)

**Problem:** Find the shortest superstring satisfying the problem constraints. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 709. Number of Ways to Wear Different Hats (H)

**Problem:** Compute the number of ways to wear different hats for the given input. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(2^n · poly(n)) time, O(2^n · poly(n)) space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 710. Maximum Students Taking Exam (H)

**Problem:** Find the maximum possible students taking exam over the allowed choices in the input. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 711. Minimum Number of Work Sessions (M)

**Problem:** Find the minimum possible number of work sessions over the allowed choices in the input. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### Tree DP / Digit DP / others

### 712. House Robber III (M★)

**Problem:** Solve the standard interview formulation of House Robber III: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 713. Binary Tree Cameras (H★)

**Problem:** Solve the standard interview formulation of Binary Tree Cameras: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 714. Diameter of N-ary Tree (M)

**Problem:** Solve the standard interview formulation of Diameter of N-ary Tree: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 715. Sum of Distances in Tree, rerooting (H)

**Problem:** Solve the standard interview formulation of Sum of Distances in Tree, rerooting: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 716. Count Numbers with Unique Digits (M)

**Problem:** Count the number of numbers with unique digits cases that satisfy the standard problem conditions. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 717. Numbers At Most N Given Digit Set (H)

**Problem:** Solve the standard interview formulation of Numbers At Most N Given Digit Set: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 718. Number of Digit One (H)

**Problem:** Compute the number of digit one for the given input. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 719. Digit DP: count numbers with digit sum K (H)

**Problem:** Solve the standard interview formulation of Digit DP: count numbers with digit sum K: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 720. Paint House I/II/III (M/H)

**Problem:** Solve the standard interview formulation of Paint House I/II/III: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 721. Super Egg Drop (H)

**Problem:** Solve the standard interview formulation of Super Egg Drop: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 722. Number of Ways to Form a Target String (H)

**Problem:** Compute the number of ways to form a target string for the given input. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

### 723. Tallest Billboard (H)

**Problem:** Solve the standard interview formulation of Tallest Billboard: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array/string/grid or item set, plus a target/capacity/limit. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Number of states × transitions per state time, O(number of states), often reducible to rolling rows space.
**Pattern:** State definition → transition → base cases → memoization/tabulation → space optimization.

## 22. BIT MANIPULATION

### 724. Check odd/even, ith bit set, set / clear / toggle bit (E)

**Problem:** For a given integer, test parity and inspect, set, clear or toggle a selected bit position.

**Input:** `n = 10, i = 1; test bit i (0-based)`
**Output:** `set`

**Target:** O(1) time, O(1) space.
**Pattern:** Bit masks: AND, OR, AND with complement, XOR.

### 725. Remove last set bit / Check Power of Two (E★)

**Problem:** Solve the standard interview formulation of Remove last set bit / Check Power of Two: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is one or more integers and bit positions/ranges. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(1) to O(B) per value; B is bit width time, O(1), unless storing a trie/table space.
**Pattern:** Bit masks, shifts, XOR identities or bitwise greedy construction.

### 726. Number of 1 Bits (E★)

**Problem:** Return the number of set bits in the binary representation of an integer.

**Input:** `n = 11 (binary 1011)`
**Output:** `3`

**Target:** O(number of bits) time, O(1) space.
**Pattern:** Brian Kernighan: repeatedly clear lowest set bit.

### 727. Counting Bits (E★)

**Problem:** For every integer i from 0 through n, return the number of set bits in i.

**Input:** `n = 5`
**Output:** `[0,1,1,2,1,2]`

**Target:** O(n) time, O(n) output space.
**Pattern:** DP: bits[i] = bits[i >> 1] + (i & 1).

### 728. Reverse Bits (E★)

**Problem:** Reverse bits according to the standard problem rules, preserving any specified boundaries or grouping constraints. The input is one or more integers and bit positions/ranges. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(1) to O(B) per value; B is bit width time, O(1), unless storing a trie/table space.
**Pattern:** Bit masks, shifts, XOR identities or bitwise greedy construction.

### 729. Hamming Distance (E)

**Problem:** Solve the standard interview formulation of Hamming Distance: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is one or more integers and bit positions/ranges. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(1) to O(B) per value; B is bit width time, O(1), unless storing a trie/table space.
**Pattern:** Bit masks, shifts, XOR identities or bitwise greedy construction.

### 730. Total Hamming Distance (M)

**Problem:** Solve the standard interview formulation of Total Hamming Distance: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is one or more integers and bit positions/ranges. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(1) to O(B) per value; B is bit width time, O(1), unless storing a trie/table space.
**Pattern:** Bit masks, shifts, XOR identities or bitwise greedy construction.

### 731. Single Number (E★)

**Problem:** Every value appears twice except one; return the value that appears once.

**Input:** `nums = [4, 1, 2, 1, 2]`
**Output:** `4`

**Target:** O(n) time, O(1) space.
**Pattern:** XOR cancellation.

### 732. Single Number II (M★)

**Problem:** Every value appears three times except one; return the unique value.

**Input:** `nums = [2,2,3,2]`
**Output:** `3`

**Target:** O(n) time, O(1) space.
**Pattern:** Bitwise per-bit counts modulo three or finite-state bit masks.

### 733. Single Number III (M★)

**Problem:** Solve the standard interview formulation of Single Number III: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is one or more integers and bit positions/ranges. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(1) to O(B) per value; B is bit width time, O(1), unless storing a trie/table space.
**Pattern:** Bit masks, shifts, XOR identities or bitwise greedy construction.

### 734. Missing Number via XOR (E)

**Problem:** Solve the standard interview formulation of Missing Number via XOR: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is one or more integers and bit positions/ranges. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(1) to O(B) per value; B is bit width time, O(1), unless storing a trie/table space.
**Pattern:** Bit masks, shifts, XOR identities or bitwise greedy construction.

### 735. XOR from L to R (M)

**Problem:** Solve the standard interview formulation of XOR from L to R: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is one or more integers and bit positions/ranges. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(1) to O(B) per value; B is bit width time, O(1), unless storing a trie/table space.
**Pattern:** Bit masks, shifts, XOR identities or bitwise greedy construction.

### 736. Power of Four (E)

**Problem:** Solve the standard interview formulation of Power of Four: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is one or more integers and bit positions/ranges. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(1) to O(B) per value; B is bit width time, O(1), unless storing a trie/table space.
**Pattern:** Bit masks, shifts, XOR identities or bitwise greedy construction.

### 737. Sum of Two Integers (M★)

**Problem:** Solve the standard interview formulation of Sum of Two Integers: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is one or more integers and bit positions/ranges. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(1) to O(B) per value; B is bit width time, O(1), unless storing a trie/table space.
**Pattern:** Bit masks, shifts, XOR identities or bitwise greedy construction.

### 738. Divide Two Integers (M★)

**Problem:** Solve the standard interview formulation of Divide Two Integers: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is one or more integers and bit positions/ranges. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(1) to O(B) per value; B is bit width time, O(1), unless storing a trie/table space.
**Pattern:** Bit masks, shifts, XOR identities or bitwise greedy construction.

### 739. Bitwise AND of Numbers Range (M★)

**Problem:** Solve the standard interview formulation of Bitwise AND of Numbers Range: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is one or more integers and bit positions/ranges. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(1) to O(B) per value; B is bit width time, O(1), unless storing a trie/table space.
**Pattern:** Bit masks, shifts, XOR identities or bitwise greedy construction.

### 740. Subsets via bitmask (M★)

**Problem:** Solve the standard interview formulation of Subsets via bitmask: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is one or more integers and bit positions/ranges. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(1) to O(B) per value; B is bit width time, O(1), unless storing a trie/table space.
**Pattern:** Bit masks, shifts, XOR identities or bitwise greedy construction.

### 741. Gray Code (M)

**Problem:** Solve the standard interview formulation of Gray Code: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is one or more integers and bit positions/ranges. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(1) to O(B) per value; B is bit width time, O(1), unless storing a trie/table space.
**Pattern:** Bit masks, shifts, XOR identities or bitwise greedy construction.

### 742. Maximum XOR of Two Numbers (M★)

**Problem:** Find the maximum possible xor of two numbers over the allowed choices in the input. The input is one or more integers and bit positions/ranges. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(1) to O(B) per value; B is bit width time, O(1), unless storing a trie/table space.
**Pattern:** Bit masks, shifts, XOR identities or bitwise greedy construction.

### 743. Minimum XOR Operations (M)

**Problem:** Find the minimum possible xor operations over the allowed choices in the input. The input is one or more integers and bit positions/ranges. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(1) to O(B) per value; B is bit width time, O(1), unless storing a trie/table space.
**Pattern:** Bit masks, shifts, XOR identities or bitwise greedy construction.

### 744. Count Triplets That Can Form Two Arrays of Equal XOR (M)

**Problem:** Count the number of triplets that can form two arrays of equal xor cases that satisfy the standard problem conditions. The input is one or more integers and bit positions/ranges. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(1) to O(B) per value; B is bit width time, O(1), unless storing a trie/table space.
**Pattern:** Bit masks, shifts, XOR identities or bitwise greedy construction.

### 745. Maximum Product of Word Lengths (M)

**Problem:** Find the maximum possible product of word lengths over the allowed choices in the input. The input is one or more integers and bit positions/ranges. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(1) to O(B) per value; B is bit width time, O(1), unless storing a trie/table space.
**Pattern:** Bit masks, shifts, XOR identities or bitwise greedy construction.

### 746. UTF-8 Validation (M)

**Problem:** Solve the standard interview formulation of UTF-8 Validation: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is one or more integers and bit positions/ranges. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(1) to O(B) per value; B is bit width time, O(1), unless storing a trie/table space.
**Pattern:** Bit masks, shifts, XOR identities or bitwise greedy construction.

### 747. Complement of Base 10 Integer (E)

**Problem:** Solve the standard interview formulation of Complement of Base 10 Integer: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is one or more integers and bit positions/ranges. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(1) to O(B) per value; B is bit width time, O(1), unless storing a trie/table space.
**Pattern:** Bit masks, shifts, XOR identities or bitwise greedy construction.

### 748. Find the Difference (E)

**Problem:** Find and return the difference from the supplied input; return the required sentinel/empty result when it does not exist. The input is one or more integers and bit positions/ranges. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(1) to O(B) per value; B is bit width time, O(1), unless storing a trie/table space.
**Pattern:** Bit masks, shifts, XOR identities or bitwise greedy construction.

## 23. DESIGN DATA STRUCTURES

### 749. LRU Cache (M★)

**Problem:** Design a cache with get and put operations in O(1), evicting the least recently used entry when capacity is exceeded.

**Input:** `capacity = 2; put(1,1); put(2,2); get(1); put(3,3); get(2)`
**Output:** `get(1)=1; get(2)=-1`

**Target:** O(1) per operation time, O(capacity) space.
**Pattern:** Hash map + doubly linked list.

### 750. LFU Cache (H★)

**Problem:** Solve the standard interview formulation of LFU Cache: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an operation sequence and its arguments for the data structure API. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** State expected per-operation costs explicitly time, O(number of stored elements) space.
**Pattern:** Define operation contracts and invariants; combine arrays, maps, linked structures, trees or heaps to meet target costs.

### 751. Insert Delete GetRandom O(1) (M★)

**Problem:** Solve the standard interview formulation of Insert Delete GetRandom O(1): process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an operation sequence and its arguments for the data structure API. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** State expected per-operation costs explicitly time, O(number of stored elements) space.
**Pattern:** Define operation contracts and invariants; combine arrays, maps, linked structures, trees or heaps to meet target costs.

### 752. Insert Delete GetRandom with Duplicates (H)

**Problem:** Solve the standard interview formulation of Insert Delete GetRandom with Duplicates: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an operation sequence and its arguments for the data structure API. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** State expected per-operation costs explicitly time, O(number of stored elements) space.
**Pattern:** Define operation contracts and invariants; combine arrays, maps, linked structures, trees or heaps to meet target costs.

### 753. Design HashMap / HashSet (E)

**Problem:** Implement the Design HashMap / HashSet interface/technique and support the operations required by its standard interview formulation, preserving its stated invariants and complexity targets. The input is an operation sequence and its arguments for the data structure API. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** State expected per-operation costs explicitly time, O(number of stored elements) space.
**Pattern:** Define operation contracts and invariants; combine arrays, maps, linked structures, trees or heaps to meet target costs.

### 754. Design Browser History (M)

**Problem:** Implement the Design Browser History interface/technique and support the operations required by its standard interview formulation, preserving its stated invariants and complexity targets. The input is an operation sequence and its arguments for the data structure API. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** State expected per-operation costs explicitly time, O(number of stored elements) space.
**Pattern:** Define operation contracts and invariants; combine arrays, maps, linked structures, trees or heaps to meet target costs.

### 755. Design Underground System (M)

**Problem:** Implement the Design Underground System interface/technique and support the operations required by its standard interview formulation, preserving its stated invariants and complexity targets. The input is an operation sequence and its arguments for the data structure API. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** State expected per-operation costs explicitly time, O(number of stored elements) space.
**Pattern:** Define operation contracts and invariants; combine arrays, maps, linked structures, trees or heaps to meet target costs.

### 756. Design Hit Counter (M)

**Problem:** Implement the Design Hit Counter interface/technique and support the operations required by its standard interview formulation, preserving its stated invariants and complexity targets. The input is an operation sequence and its arguments for the data structure API. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** State expected per-operation costs explicitly time, O(number of stored elements) space.
**Pattern:** Define operation contracts and invariants; combine arrays, maps, linked structures, trees or heaps to meet target costs.

### 757. Design Logger Rate Limiter (E)

**Problem:** Implement the Design Logger Rate Limiter interface/technique and support the operations required by its standard interview formulation, preserving its stated invariants and complexity targets. The input is an operation sequence and its arguments for the data structure API. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** State expected per-operation costs explicitly time, O(number of stored elements) space.
**Pattern:** Define operation contracts and invariants; combine arrays, maps, linked structures, trees or heaps to meet target costs.

### 758. Design Twitter (M★)

**Problem:** Implement the Design Twitter interface/technique and support the operations required by its standard interview formulation, preserving its stated invariants and complexity targets. The input is an operation sequence and its arguments for the data structure API. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** State expected per-operation costs explicitly time, O(number of stored elements) space.
**Pattern:** Define operation contracts and invariants; combine arrays, maps, linked structures, trees or heaps to meet target costs.

### 759. Design Food Rating System (M)

**Problem:** Implement the Design Food Rating System interface/technique and support the operations required by its standard interview formulation, preserving its stated invariants and complexity targets. The input is an operation sequence and its arguments for the data structure API. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** State expected per-operation costs explicitly time, O(number of stored elements) space.
**Pattern:** Define operation contracts and invariants; combine arrays, maps, linked structures, trees or heaps to meet target costs.

### 760. Design Snapshot Array (M)

**Problem:** Implement the Design Snapshot Array interface/technique and support the operations required by its standard interview formulation, preserving its stated invariants and complexity targets. The input is an operation sequence and its arguments for the data structure API. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** State expected per-operation costs explicitly time, O(number of stored elements) space.
**Pattern:** Define operation contracts and invariants; combine arrays, maps, linked structures, trees or heaps to meet target costs.

### 761. Time Based Key-Value Store (M★)

**Problem:** Solve the standard interview formulation of Time Based Key-Value Store: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an operation sequence and its arguments for the data structure API. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** State expected per-operation costs explicitly time, O(number of stored elements) space.
**Pattern:** Define operation contracts and invariants; combine arrays, maps, linked structures, trees or heaps to meet target costs.

### 762. Design All O(1) Data Structure (H)

**Problem:** Implement the Design All O(1) Data Structure interface/technique and support the operations required by its standard interview formulation, preserving its stated invariants and complexity targets. The input is an operation sequence and its arguments for the data structure API. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** State expected per-operation costs explicitly time, O(number of stored elements) space.
**Pattern:** Define operation contracts and invariants; combine arrays, maps, linked structures, trees or heaps to meet target costs.

### 763. Design Skiplist (H)

**Problem:** Implement the Design Skiplist interface/technique and support the operations required by its standard interview formulation, preserving its stated invariants and complexity targets. The input is an operation sequence and its arguments for the data structure API. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** State expected per-operation costs explicitly time, O(number of stored elements) space.
**Pattern:** Define operation contracts and invariants; combine arrays, maps, linked structures, trees or heaps to meet target costs.

### 764. Design Phone Directory (M)

**Problem:** Implement the Design Phone Directory interface/technique and support the operations required by its standard interview formulation, preserving its stated invariants and complexity targets. The input is an operation sequence and its arguments for the data structure API. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** State expected per-operation costs explicitly time, O(number of stored elements) space.
**Pattern:** Define operation contracts and invariants; combine arrays, maps, linked structures, trees or heaps to meet target costs.

### 765. Design a Text Editor (H)

**Problem:** Implement the Design a Text Editor interface/technique and support the operations required by its standard interview formulation, preserving its stated invariants and complexity targets. The input is an operation sequence and its arguments for the data structure API. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** State expected per-operation costs explicitly time, O(number of stored elements) space.
**Pattern:** Define operation contracts and invariants; combine arrays, maps, linked structures, trees or heaps to meet target costs.

### 766. Design Excel Sum Formula (H)

**Problem:** Implement the Design Excel Sum Formula interface/technique and support the operations required by its standard interview formulation, preserving its stated invariants and complexity targets. The input is an operation sequence and its arguments for the data structure API. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** State expected per-operation costs explicitly time, O(number of stored elements) space.
**Pattern:** Define operation contracts and invariants; combine arrays, maps, linked structures, trees or heaps to meet target costs.

### 767. Design File System (M)

**Problem:** Implement the Design File System interface/technique and support the operations required by its standard interview formulation, preserving its stated invariants and complexity targets. The input is an operation sequence and its arguments for the data structure API. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** State expected per-operation costs explicitly time, O(number of stored elements) space.
**Pattern:** Define operation contracts and invariants; combine arrays, maps, linked structures, trees or heaps to meet target costs.

### 768. Design Add and Search Words (M)

**Problem:** Implement the Design Add and Search Words interface/technique and support the operations required by its standard interview formulation, preserving its stated invariants and complexity targets. The input is an operation sequence and its arguments for the data structure API. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** State expected per-operation costs explicitly time, O(number of stored elements) space.
**Pattern:** Define operation contracts and invariants; combine arrays, maps, linked structures, trees or heaps to meet target costs.

### 769. Min Stack / Max Stack (M/H)

**Problem:** Solve the standard interview formulation of Min Stack / Max Stack: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an operation sequence and its arguments for the data structure API. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** State expected per-operation costs explicitly time, O(number of stored elements) space.
**Pattern:** Define operation contracts and invariants; combine arrays, maps, linked structures, trees or heaps to meet target costs.

### 770. Flatten Nested List Iterator (M)

**Problem:** Solve the standard interview formulation of Flatten Nested List Iterator: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an operation sequence and its arguments for the data structure API. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** State expected per-operation costs explicitly time, O(number of stored elements) space.
**Pattern:** Define operation contracts and invariants; combine arrays, maps, linked structures, trees or heaps to meet target costs.

### 771. Peeking Iterator (M)

**Problem:** Solve the standard interview formulation of Peeking Iterator: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an operation sequence and its arguments for the data structure API. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** State expected per-operation costs explicitly time, O(number of stored elements) space.
**Pattern:** Define operation contracts and invariants; combine arrays, maps, linked structures, trees or heaps to meet target costs.

### 772. Zigzag Iterator (M)

**Problem:** Solve the standard interview formulation of Zigzag Iterator: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an operation sequence and its arguments for the data structure API. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** State expected per-operation costs explicitly time, O(number of stored elements) space.
**Pattern:** Define operation contracts and invariants; combine arrays, maps, linked structures, trees or heaps to meet target costs.

### 773. Serialize and Deserialize BST / N-ary tree (M)

**Problem:** Solve the standard interview formulation of Serialize and Deserialize BST / N-ary tree: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an operation sequence and its arguments for the data structure API. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** State expected per-operation costs explicitly time, O(number of stored elements) space.
**Pattern:** Define operation contracts and invariants; combine arrays, maps, linked structures, trees or heaps to meet target costs.

## 24. MATH / NUMBER THEORY (interview-relevant)

### 774. Sieve + Segmented Sieve (M)

**Problem:** Implement or apply Sieve + Segmented Sieve to the supplied input and return the result required by its standard formulation. The input is integers, modular parameters, probabilities or query values. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(log n), O(√n), or sieve/precomputation complexity time, O(1) or O(n) preprocessing space.
**Pattern:** Number-theoretic preprocessing, modular arithmetic, combinatorics, sampling or mathematical invariants.

### 775. Euler's Totient (M)

**Problem:** Solve the standard interview formulation of Euler's Totient: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is integers, modular parameters, probabilities or query values. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(log n), O(√n), or sieve/precomputation complexity time, O(1) or O(n) preprocessing space.
**Pattern:** Number-theoretic preprocessing, modular arithmetic, combinatorics, sampling or mathematical invariants.

### 776. Modular Inverse + Fermat's Little Theorem (M)

**Problem:** Solve the standard interview formulation of Modular Inverse + Fermat's Little Theorem: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is integers, modular parameters, probabilities or query values. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(log n), O(√n), or sieve/precomputation complexity time, O(1) or O(n) preprocessing space.
**Pattern:** Number-theoretic preprocessing, modular arithmetic, combinatorics, sampling or mathematical invariants.

### 777. nCr mod p with precomputed factorials (M)

**Problem:** Solve the standard interview formulation of nCr mod p with precomputed factorials: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is integers, modular parameters, probabilities or query values. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(log n), O(√n), or sieve/precomputation complexity time, O(1) or O(n) preprocessing space.
**Pattern:** Number-theoretic preprocessing, modular arithmetic, combinatorics, sampling or mathematical invariants.

### 778. Catalan Numbers + Unique BSTs (M)

**Problem:** Solve the standard interview formulation of Catalan Numbers + Unique BSTs: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is integers, modular parameters, probabilities or query values. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(log n), O(√n), or sieve/precomputation complexity time, O(1) or O(n) preprocessing space.
**Pattern:** Number-theoretic preprocessing, modular arithmetic, combinatorics, sampling or mathematical invariants.

### 779. Extended Euclid (M)

**Problem:** Solve the standard interview formulation of Extended Euclid: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is integers, modular parameters, probabilities or query values. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(log n), O(√n), or sieve/precomputation complexity time, O(1) or O(n) preprocessing space.
**Pattern:** Number-theoretic preprocessing, modular arithmetic, combinatorics, sampling or mathematical invariants.

### 780. Matrix Exponentiation, fast Fibonacci (H)

**Problem:** Solve the standard interview formulation of Matrix Exponentiation, fast Fibonacci: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is integers, modular parameters, probabilities or query values. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(log n), O(√n), or sieve/precomputation complexity time, O(1) or O(n) preprocessing space.
**Pattern:** Number-theoretic preprocessing, modular arithmetic, combinatorics, sampling or mathematical invariants.

### 781. Count lattice paths (M)

**Problem:** Count the number of lattice paths cases that satisfy the standard problem conditions. The input is integers, modular parameters, probabilities or query values. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(log n), O(√n), or sieve/precomputation complexity time, O(1) or O(n) preprocessing space.
**Pattern:** Number-theoretic preprocessing, modular arithmetic, combinatorics, sampling or mathematical invariants.

### 782. Nim Game / Game theory basics (E/M)

**Problem:** Solve the standard interview formulation of Nim Game / Game theory basics: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is integers, modular parameters, probabilities or query values. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(log n), O(√n), or sieve/precomputation complexity time, O(1) or O(n) preprocessing space.
**Pattern:** Number-theoretic preprocessing, modular arithmetic, combinatorics, sampling or mathematical invariants.

### 783. Bulb Switcher (M)

**Problem:** Solve the standard interview formulation of Bulb Switcher: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is integers, modular parameters, probabilities or query values. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(log n), O(√n), or sieve/precomputation complexity time, O(1) or O(n) preprocessing space.
**Pattern:** Number-theoretic preprocessing, modular arithmetic, combinatorics, sampling or mathematical invariants.

### 784. Rectangle Area (M)

**Problem:** Solve the standard interview formulation of Rectangle Area: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is integers, modular parameters, probabilities or query values. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(log n), O(√n), or sieve/precomputation complexity time, O(1) or O(n) preprocessing space.
**Pattern:** Number-theoretic preprocessing, modular arithmetic, combinatorics, sampling or mathematical invariants.

### 785. Valid Square (M)

**Problem:** Determine whether the supplied input satisfies the valid square rules and return a boolean result. The input is integers, modular parameters, probabilities or query values. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(log n), O(√n), or sieve/precomputation complexity time, O(1) or O(n) preprocessing space.
**Pattern:** Number-theoretic preprocessing, modular arithmetic, combinatorics, sampling or mathematical invariants.

### 786. Random Pick with Weight (M)

**Problem:** Solve the standard interview formulation of Random Pick with Weight: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is integers, modular parameters, probabilities or query values. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(log n), O(√n), or sieve/precomputation complexity time, O(1) or O(n) preprocessing space.
**Pattern:** Number-theoretic preprocessing, modular arithmetic, combinatorics, sampling or mathematical invariants.

### 787. Implement Rand10 using Rand7 (M)

**Problem:** Implement the Implement Rand10 using Rand7 interface/technique and support the operations required by its standard interview formulation, preserving its stated invariants and complexity targets. The input is integers, modular parameters, probabilities or query values. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(log n), O(√n), or sieve/precomputation complexity time, O(1) or O(n) preprocessing space.
**Pattern:** Number-theoretic preprocessing, modular arithmetic, combinatorics, sampling or mathematical invariants.

### 788. Reservoir sampling: Linked List Random Node (M)

**Problem:** Solve the standard interview formulation of Reservoir sampling: Linked List Random Node: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is integers, modular parameters, probabilities or query values. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Usually O(log n), O(√n), or sieve/precomputation complexity time, O(1) or O(n) preprocessing space.
**Pattern:** Number-theoretic preprocessing, modular arithmetic, combinatorics, sampling or mathematical invariants.

## 25. SEGMENT TREE / FENWICK / RANGE QUERIES

### 789. Range Sum Query Mutable (M★)

**Problem:** Support point updates and range-sum queries on an array.

**Input:** `nums=[1,3,5]; sumRange(0,2); update(1,2); sumRange(0,2)`
**Output:** `9, then 8`

**Target:** O(log n) update/query time, O(n) space.
**Pattern:** Fenwick tree or segment tree.

### 790. Range Minimum Query, sparse table (M)

**Problem:** Solve the standard interview formulation of Range Minimum Query, sparse table: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array and a sequence of range queries/updates. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(log n) query/update; O(n) build time, O(n) space.
**Pattern:** Tree-based or Fenwick aggregate maintenance for point/range queries and updates.

### 791. Segment Tree implementation with point + range update (H)

**Problem:** Solve the standard interview formulation of Segment Tree implementation with point + range update: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array and a sequence of range queries/updates. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) build; O(log n) query/update time, O(n) space.
**Pattern:** Fenwick tree or segment tree; preserve the aggregate invariant during updates.

### 792. Count of Smaller Numbers After Self (H★)

**Problem:** Count the number of of smaller numbers after self cases that satisfy the standard problem conditions. The input is an array and a sequence of range queries/updates. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(log n) query/update; O(n) build time, O(n) space.
**Pattern:** Tree-based or Fenwick aggregate maintenance for point/range queries and updates.

### 793. Reverse Pairs via BIT / merge sort (H)

**Problem:** Reverse pairs via bit / merge sort according to the standard problem rules, preserving any specified boundaries or grouping constraints. The input is an array and a sequence of range queries/updates. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n log n) time, O(n) space.
**Pattern:** Divide and conquer with merge-based counting.

### 794. Count of Range Sum (H)

**Problem:** Count the number of of range sum cases that satisfy the standard problem conditions. The input is an array and a sequence of range queries/updates. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(log n) query/update; O(n) build time, O(n) space.
**Pattern:** Tree-based or Fenwick aggregate maintenance for point/range queries and updates.

### 795. The Skyline Problem (H★)

**Problem:** Given buildings as [left,right,height], return the critical points of the skyline.

**Input:** `buildings = [[2,9,10],[3,7,15],[5,12,12]]`
**Output:** `[[2,10],[3,15],[7,12],[12,0]]`

**Target:** O(n log n) time, O(n) space.
**Pattern:** Sweep line with max-heap or divide and conquer.

### 796. Falling Squares (H)

**Problem:** Solve the standard interview formulation of Falling Squares: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array and a sequence of range queries/updates. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(log n) query/update; O(n) build time, O(n) space.
**Pattern:** Tree-based or Fenwick aggregate maintenance for point/range queries and updates.

### 797. Range Module (H)

**Problem:** Solve the standard interview formulation of Range Module: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array and a sequence of range queries/updates. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) build; O(log n) query/update time, O(n) space.
**Pattern:** Fenwick tree or segment tree; preserve the aggregate invariant during updates.

### 798. My Calendar III via segment tree (H)

**Problem:** Solve the standard interview formulation of My Calendar III via segment tree: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is an array and a sequence of range queries/updates. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) build; O(log n) query/update time, O(n) space.
**Pattern:** Fenwick tree or segment tree; preserve the aggregate invariant during updates.

## 26. STRETCH (competitive programming, optional, only after W22)

JAVA-SPECIFIC TRAPS

- Never use (a, b) -> a - b as comparator. Overflows. Use Integer.compare(a, b).

- PriorityQueue is a min-heap. Max-heap: Collections.reverseOrder() or comparator.

- Prefer ArrayDeque over Stack and LinkedList.

- Integer == Integer compares references outside -128..127. Use equals().

- Arrays.sort(int[]) = dual-pivot quicksort; Integer[]/objects = stable TimSort.

- Use long for sums, products, mod. Cast before multiplying: (long) a * b.

- StringBuilder for string building. Never += in loops.

- TreeMap/TreeSet: floorKey, ceilingKey, headMap, tailMap solve "closest" problems.

- HashMap internals: hashing, bucket array, treeify at 8, resize at 0.75 load factor.

- Deep recursion on 10^5 nodes throws StackOverflowError. Know the iterative version.

- Collections.unmodifiableList, List.of immutability; Arrays.asList fixed-size trap.

LLD (start W10, 1 design per week, code in Java and run it)

Prereqs: SOLID, Strategy, Observer, Factory, Singleton, Builder, Decorator, State, Command.

Designs: Parking Lot, Elevator, LRU/LFU Cache, Rate Limiter, Splitwise, Snake & Ladder,

Tic-Tac-Toe, Vending Machine, BookMyShow, Library Management, Notification Service,

Logger Framework, ATM, Chess, Food Delivery, Ride Sharing, Stock Exchange, In-memory File System.

HLD (start W10, 1 design per week)

Prereqs: load balancing, caching (write-through/back/around), sharding, replication,

CAP/PACELC, consistency models, message queues, CDN, indexing, consistent hashing,

back-of-envelope estimation, API design, idempotency.

Designs: URL Shortener, Rate Limiter, Distributed Cache, Key-Value Store, News Feed,

Chat (WhatsApp), Notification System, Search Autocomplete, Web Crawler, Uber,

YouTube/Netflix, Payment System, Dropbox, Ticket Booking, Distributed Message Queue.

CHECKPOINTS

End W8:  arrays/strings/LL/stack solvable cold, Medium in <30 min.

End W14: trees + graphs patterns recognized in under 2 min.

End W19: all DP patterns covered; 60% on unseen Mediums.

End W26: 5 mocks passed, Hard in 45 min for at least half of ★ Hards.

### 799. Z Algorithm / Rabin-Karp / Manacher / Boyer-Moore (H)

**Problem:** Implement or apply Z Algorithm / Rabin-Karp / Manacher / Boyer-Moore to the supplied input and return the result required by its standard formulation. The input is the graph/string/tree/array instance specified by the advanced technique. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Algorithm-specific; often O(n log n) or better time, Algorithm-specific, usually O(n) to O(n log n) space.
**Pattern:** Advanced string, graph, tree, range-query or optimization technique; identify the invariant before coding.

### 800. Suffix Array + LCP (H)

**Problem:** Solve the standard interview formulation of Suffix Array + LCP: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is the graph/string/tree/array instance specified by the advanced technique. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Algorithm-specific; often O(n log n) or better time, Algorithm-specific, usually O(n) to O(n log n) space.
**Pattern:** Advanced string, graph, tree, range-query or optimization technique; identify the invariant before coding.

### 801. Longest Duplicate Substring (H)

**Problem:** Find the longest duplicate substring satisfying the problem constraints. The input is the graph/string/tree/array instance specified by the advanced technique. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Algorithm-specific; often O(n log n) or better time, Algorithm-specific, usually O(n) to O(n log n) space.
**Pattern:** Advanced string, graph, tree, range-query or optimization technique; identify the invariant before coding.

### 802. Maximum Flow: Ford-Fulkerson / Edmonds-Karp / Dinic (H)

**Problem:** Find the maximum possible flow: ford-fulkerson / edmonds-karp / dinic over the allowed choices in the input. The input is the graph/string/tree/array instance specified by the advanced technique. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Algorithm-specific; often O(n log n) or better time, Algorithm-specific, usually O(n) to O(n log n) space.
**Pattern:** Advanced string, graph, tree, range-query or optimization technique; identify the invariant before coding.

### 803. Maximum Bipartite Matching (H)

**Problem:** Find the maximum possible bipartite matching over the allowed choices in the input. The input is the graph/string/tree/array instance specified by the advanced technique. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Algorithm-specific; often O(n log n) or better time, Algorithm-specific, usually O(n) to O(n log n) space.
**Pattern:** Advanced string, graph, tree, range-query or optimization technique; identify the invariant before coding.

### 804. Binary Lifting LCA (H)

**Problem:** Solve the standard interview formulation of Binary Lifting LCA: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is the graph/string/tree/array instance specified by the advanced technique. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Algorithm-specific; often O(n log n) or better time, Algorithm-specific, usually O(n) to O(n log n) space.
**Pattern:** Advanced string, graph, tree, range-query or optimization technique; identify the invariant before coding.

### 805. Heavy-Light Decomposition (H)

**Problem:** Solve the standard interview formulation of Heavy-Light Decomposition: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is the graph/string/tree/array instance specified by the advanced technique. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Algorithm-specific; often O(n log n) or better time, Algorithm-specific, usually O(n) to O(n log n) space.
**Pattern:** Advanced string, graph, tree, range-query or optimization technique; identify the invariant before coding.

### 806. Centroid Decomposition (H)

**Problem:** Solve the standard interview formulation of Centroid Decomposition: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is the graph/string/tree/array instance specified by the advanced technique. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Algorithm-specific; often O(n log n) or better time, Algorithm-specific, usually O(n) to O(n log n) space.
**Pattern:** Advanced string, graph, tree, range-query or optimization technique; identify the invariant before coding.

### 807. Mo's Algorithm / Sqrt Decomposition (H)

**Problem:** Implement or apply Mo's Algorithm / Sqrt Decomposition to the supplied input and return the result required by its standard formulation. The input is the graph/string/tree/array instance specified by the advanced technique. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Algorithm-specific; often O(n log n) or better time, Algorithm-specific, usually O(n) to O(n log n) space.
**Pattern:** Advanced string, graph, tree, range-query or optimization technique; identify the invariant before coding.

### 808. 2-SAT (H)

**Problem:** Solve the standard interview formulation of 2-SAT: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is the graph/string/tree/array instance specified by the advanced technique. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Algorithm-specific; often O(n log n) or better time, Algorithm-specific, usually O(n) to O(n log n) space.
**Pattern:** Advanced string, graph, tree, range-query or optimization technique; identify the invariant before coding.

### 809. Convex Hull Trick / Divide & Conquer DP / Knuth Optimization (H)

**Problem:** Solve the standard interview formulation of Convex Hull Trick / Divide & Conquer DP / Knuth Optimization: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is the graph/string/tree/array instance specified by the advanced technique. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Algorithm-specific; often O(n log n) or better time, Algorithm-specific, usually O(n) to O(n log n) space.
**Pattern:** Advanced string, graph, tree, range-query or optimization technique; identify the invariant before coding.

### 810. Treap / AVL / Red-Black / B-Tree implementation (H)

**Problem:** Solve the standard interview formulation of Treap / AVL / Red-Black / B-Tree implementation: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is the graph/string/tree/array instance specified by the advanced technique. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Algorithm-specific; often O(n log n) or better time, Algorithm-specific, usually O(n) to O(n log n) space.
**Pattern:** Advanced string, graph, tree, range-query or optimization technique; identify the invariant before coding.

### 811. Aho-Corasick (H)

**Problem:** Solve the standard interview formulation of Aho-Corasick: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is the graph/string/tree/array instance specified by the advanced technique. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Algorithm-specific; often O(n log n) or better time, Algorithm-specific, usually O(n) to O(n log n) space.
**Pattern:** Advanced string, graph, tree, range-query or optimization technique; identify the invariant before coding.

### 812. Persistent Segment Tree (H)

**Problem:** Solve the standard interview formulation of Persistent Segment Tree: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is the graph/string/tree/array instance specified by the advanced technique. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** O(n) build; O(log n) query/update time, O(n) space.
**Pattern:** Fenwick tree or segment tree; preserve the aggregate invariant during updates.

### 813. Min-Cost Max-Flow (H)

**Problem:** Solve the standard interview formulation of Min-Cost Max-Flow: process the supplied input and return the requested value, structure or boolean result while meeting the stated constraints. The input is the graph/string/tree/array instance specified by the advanced technique. Return the result in the format required by the named task.

**Input / Output example:** The supplied roadmap does not include a sample for this entry. Use the exact sample and input signature from the judge/version you choose; the problem title alone is insufficient to provide a reliable literal example for this variant.

**Target:** Algorithm-specific; often O(n log n) or better time, Algorithm-specific, usually O(n) to O(n log n) space.
**Pattern:** Advanced string, graph, tree, range-query or optimization technique; identify the invariant before coding.

---

## Appendix A — LLD design practice (from the roadmap)

Prerequisites: SOLID, Strategy, Observer, Factory, Singleton, Builder, Decorator, State and Command.

1. **Design Parking Lot:** Define requirements, entities, APIs, core classes, state transitions, concurrency controls, and tests. Implement in Java.
2. **Design Elevator:** Define requirements, entities, APIs, core classes, state transitions, concurrency controls, and tests. Implement in Java.
3. **Design LRU/LFU Cache:** Define requirements, entities, APIs, core classes, state transitions, concurrency controls, and tests. Implement in Java.
4. **Design Rate Limiter:** Define requirements, entities, APIs, core classes, state transitions, concurrency controls, and tests. Implement in Java.
5. **Design Splitwise:** Define requirements, entities, APIs, core classes, state transitions, concurrency controls, and tests. Implement in Java.
6. **Design Snake & Ladder:** Define requirements, entities, APIs, core classes, state transitions, concurrency controls, and tests. Implement in Java.
7. **Design Tic-Tac-Toe:** Define requirements, entities, APIs, core classes, state transitions, concurrency controls, and tests. Implement in Java.
8. **Design Vending Machine:** Define requirements, entities, APIs, core classes, state transitions, concurrency controls, and tests. Implement in Java.
9. **Design BookMyShow:** Define requirements, entities, APIs, core classes, state transitions, concurrency controls, and tests. Implement in Java.
10. **Design Library Management:** Define requirements, entities, APIs, core classes, state transitions, concurrency controls, and tests. Implement in Java.
11. **Design Notification Service:** Define requirements, entities, APIs, core classes, state transitions, concurrency controls, and tests. Implement in Java.
12. **Design Logger Framework:** Define requirements, entities, APIs, core classes, state transitions, concurrency controls, and tests. Implement in Java.
13. **Design ATM:** Define requirements, entities, APIs, core classes, state transitions, concurrency controls, and tests. Implement in Java.
14. **Design Chess:** Define requirements, entities, APIs, core classes, state transitions, concurrency controls, and tests. Implement in Java.
15. **Design Food Delivery:** Define requirements, entities, APIs, core classes, state transitions, concurrency controls, and tests. Implement in Java.
16. **Design Ride Sharing:** Define requirements, entities, APIs, core classes, state transitions, concurrency controls, and tests. Implement in Java.
17. **Design Stock Exchange:** Define requirements, entities, APIs, core classes, state transitions, concurrency controls, and tests. Implement in Java.
18. **Design In-memory File System:** Define requirements, entities, APIs, core classes, state transitions, concurrency controls, and tests. Implement in Java.

## Appendix B — HLD system-design practice (from the roadmap)

Prerequisites: load balancing, caching (write-through/back/around), sharding, replication, CAP/PACELC, consistency models, message queues, CDN, indexing, consistent hashing, back-of-envelope estimation, API design and idempotency.

1. **Design URL Shortener:** Specify scale/SLAs, APIs, data model, storage, caching, partitioning, failure handling, consistency and observability; explain trade-offs.
2. **Design Rate Limiter:** Specify scale/SLAs, APIs, data model, storage, caching, partitioning, failure handling, consistency and observability; explain trade-offs.
3. **Design Distributed Cache:** Specify scale/SLAs, APIs, data model, storage, caching, partitioning, failure handling, consistency and observability; explain trade-offs.
4. **Design Key-Value Store:** Specify scale/SLAs, APIs, data model, storage, caching, partitioning, failure handling, consistency and observability; explain trade-offs.
5. **Design News Feed:** Specify scale/SLAs, APIs, data model, storage, caching, partitioning, failure handling, consistency and observability; explain trade-offs.
6. **Design Chat (WhatsApp):** Specify scale/SLAs, APIs, data model, storage, caching, partitioning, failure handling, consistency and observability; explain trade-offs.
7. **Design Notification System:** Specify scale/SLAs, APIs, data model, storage, caching, partitioning, failure handling, consistency and observability; explain trade-offs.
8. **Design Search Autocomplete:** Specify scale/SLAs, APIs, data model, storage, caching, partitioning, failure handling, consistency and observability; explain trade-offs.
9. **Design Web Crawler:** Specify scale/SLAs, APIs, data model, storage, caching, partitioning, failure handling, consistency and observability; explain trade-offs.
10. **Design Uber:** Specify scale/SLAs, APIs, data model, storage, caching, partitioning, failure handling, consistency and observability; explain trade-offs.
11. **Design YouTube/Netflix:** Specify scale/SLAs, APIs, data model, storage, caching, partitioning, failure handling, consistency and observability; explain trade-offs.
12. **Design Payment System:** Specify scale/SLAs, APIs, data model, storage, caching, partitioning, failure handling, consistency and observability; explain trade-offs.
13. **Design Dropbox:** Specify scale/SLAs, APIs, data model, storage, caching, partitioning, failure handling, consistency and observability; explain trade-offs.
14. **Design Ticket Booking:** Specify scale/SLAs, APIs, data model, storage, caching, partitioning, failure handling, consistency and observability; explain trade-offs.
15. **Design Distributed Message Queue:** Specify scale/SLAs, APIs, data model, storage, caching, partitioning, failure handling, consistency and observability; explain trade-offs.

## Appendix C — Java-specific traps (preserved from the roadmap)

- Never use (a, b) -> a - b as comparator. Overflows. Use Integer.compare(a, b).
- PriorityQueue is a min-heap. Max-heap: Collections.reverseOrder() or comparator.
- Prefer ArrayDeque over Stack and LinkedList.
- Integer == Integer compares references outside -128..127. Use equals().
- Arrays.sort(int[]) = dual-pivot quicksort; Integer[]/objects = stable TimSort.
- Use long for sums, products, mod. Cast before multiplying: (long) a * b.
- StringBuilder for string building. Never += in loops.
- TreeMap/TreeSet: floorKey, ceilingKey, headMap, tailMap solve "closest" problems.
- HashMap internals: hashing, bucket array, treeify at 8, resize at 0.75 load factor.
- Deep recursion on 10^5 nodes throws StackOverflowError. Know the iterative version.
- Collections.unmodifiableList, List.of immutability; Arrays.asList fixed-size trap.

## Appendix D — Roadmap schedule and checkpoints (preserved)

### Rules and weekly plan

RULES
- Stuck rule: 25 min on a Medium, then hint, then solution.
- Re-solve cold after 3 days and again after 14 days. Re-solves are the metric, not first solves.
- Log every problem: pattern, the trick, the mistake.
- Time targets: Easy 10-15 min, Medium 25-30, Hard 45.
- Pace: 3/day weekdays, 8-10 on weekends (~25/week).
- From W12: one LeetCode contest per week. From W16: one mock per week.
- ★ only pass = ~12 weeks. Full list = 28 weeks.
28-WEEK PLAN
W1    Foundations/Math + Arrays
W2    Arrays (finish) + Hashing
W3    Prefix Sum + Two Pointers
W4    Sliding Window + Strings
W5    Binary Search + Sorting
W6    Linked List
W7    Stack + Queue/Deque
W8    Recursion + Backtracking
W9    Binary Trees
W10   Binary Trees (finish) + BST
W11   Heap + Greedy + Intervals
W12   Tries + Graphs I (BFS/DFS/grids)
W13   Graphs II (DSU, topo sort)
W14   Graphs III (Dijkstra, Bellman-Ford, MST, bridges)
W15-19 Dynamic Programming (1D, grid, strings, knapsack, subsequence, stocks, interval, bitmask, trees)
W20   Bit Manipulation + Design DS
W21   Math/Number theory + Segment tree/Fenwick
W22-23 Redo all failed/slow ★ + company-tagged sets
W24-26 Mocks, weak-pattern drilling, contests
W27-28 Stretch section (optional) or more mocks
LLD + HLD in parallel from W10 (3 sessions/week). See bottom.

### Checkpoints

End W8:  arrays/strings/LL/stack solvable cold, Medium in <30 min.
End W14: trees + graphs patterns recognized in under 2 min.
End W19: all DP patterns covered; 60% on unseen Mediums.
End W26: 5 mocks passed, Hard in 45 min for at least half of ★ Hards.
