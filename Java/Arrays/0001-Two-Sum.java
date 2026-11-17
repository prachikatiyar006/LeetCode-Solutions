
# LeetCode 1 - Two Sum

**Difficulty:** Easy  
**Topic:** Array  
**Approach:** Brute Force

## Problem Statement

Given an array of integers `nums` and an integer `target`, return the indices of the two numbers such that they add up to the target.

Each input has exactly one solution, and you cannot use the same element twice.

## Example 1

**Input:**
```text
nums = [2, 7, 11, 15]
target = 9
```

**Output:**
```text
[0, 1]
```

**Explanation:**

nums[0] + nums[1] = 2 + 7 = 9.

Therefore, the answer is `[0, 1]`.

## Approach / Logic

1. Use a nested loop to check every possible pair.
2. The outer loop selects the first element.
3. The inner loop checks the elements after it.
4. If the sum of both elements equals the target, return their indices.
5. If a matching pair is not found, return an empty array.

## Java Solution

```java
class Solution {
    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{};
    }
}
```

## Complexity Analysis

- **Time Complexity:** O(n²) - Two nested loops check possible pairs.
- **Space Complexity:** O(1) - No extra data structure is used.

## Key Learning

The Brute Force approach checks all possible pairs to find the required target sum.
