
/*
 * LeetCode 14 - Longest Common Prefix
 *
 * Difficulty: Easy
 * Topic: Strings
 * Approach: Horizontal Scanning
 *
 * Problem Statement:
 * Given an array of strings, find the longest common
 * prefix shared among all strings.
 * If there is no common prefix, return an empty string.
 *
 * Example 1:
 * Input: strs = ["flower", "flow", "flight"]
 * Output: "fl"
 *
 * Explanation:
 * "fl" is the longest prefix common to all three strings.
 *
 * Example 2:
 * Input: strs = ["dog", "racecar", "car"]
 * Output: ""
 *
 * Explanation:
 * There is no common prefix among the strings.
 *
 * Approach / Logic:
 * 1. Take the first string as the initial prefix.
 * 2. Compare the prefix with each remaining string.
 * 3. If the current string does not start with the prefix,
 *    remove the last character from the prefix.
 * 4. Continue until a common prefix is found.
 * 5. Return the final prefix.
 *
 * Java Solution:
 */

class Solution {
    public String longestCommonPrefix(String[] strs) {

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {

            while (!strs[i].startsWith(prefix)) {

                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
}

/*
 * Complexity Analysis:
 *
 * Time Complexity: O(n * m)
 * n = Number of strings
 * m = Length of the longest string
 *
 * Space Complexity: O(m)
 * Due to creation of prefix substring objects.
 *
 * Key Learning:
 * Horizontal scanning helps identify the common
 * prefix by progressively comparing strings.
 */
