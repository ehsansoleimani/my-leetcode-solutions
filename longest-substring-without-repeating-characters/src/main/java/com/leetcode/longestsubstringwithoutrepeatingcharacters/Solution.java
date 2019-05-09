package com.leetcode.longestsubstringwithoutrepeatingcharacters;

import java.util.HashMap;

/**
 * Created by ehsan on 4/13/19.
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> visited = new HashMap<>();
        int startIndex = 0;
        int longestSubStringLength = 0;
        for (int i = 0; i < s.length(); ++i) {
            Character c = s.charAt(i);
            if (visited.containsKey(c)) {
                Integer index = visited.get(c);
                if (index >= startIndex) {
                    int length = i - startIndex;
                    if (length > longestSubStringLength) {
                        longestSubStringLength = length;
                    }
                    startIndex = index + 1;
                }
            }
            if (i == s.length() - 1) {
                int length = s.length() - startIndex;
                if (length > longestSubStringLength) {
                    longestSubStringLength = length;
                }
            }
            visited.put(c, i);
        }

        return longestSubStringLength;
    }
}
