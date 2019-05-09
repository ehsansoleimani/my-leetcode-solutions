package com.leetcode.longestsubstringwithoutrepeatingcharacters;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ehsan on 4/15/19.
 */

public class SolutionTest {

    @Test
    public void testSolution() {
        Solution solution = new Solution();
        assertEquals(solution.lengthOfLongestSubstring("abcabb"), 3);
        assertEquals(solution.lengthOfLongestSubstring("abcabcdabcdeabcdef"), 6);
        assertEquals(solution.lengthOfLongestSubstring("abcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefgh" +
                "abcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefgh" +
                "abcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefgh" +
                "abcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefgh" +
                "abcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefgh" +
                "abcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefgh" +
                "abcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefgh"), 8);
    }
}
