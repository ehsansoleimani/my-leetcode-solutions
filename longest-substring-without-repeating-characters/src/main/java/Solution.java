import java.util.HashMap;

/**
 * Created by ehsan on 4/13/19.
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        String result = getSubstringWithoutRepeat(0, s);
        // System.out.println("final result: "+ result);
        return result.length();
    }

    private String getSubstringWithoutRepeat(int startIndex, String s) {
        StringBuilder builder = new StringBuilder();
        int repeatedCharIndex = -1;
        HashMap<Character, Integer> visited = new HashMap<>();
        for(int i=startIndex; i<s.length(); ++i) {
            // System.out.println("current char: "+s.charAt(i));
            if(visited.containsKey(s.charAt(i))) {
                repeatedCharIndex = visited.get(s.charAt(i));
                // System.out.println("repeated char index: "+ repeatedCharIndex);

                break;
            } else {
                // System.out.println("char appended: "+ s.charAt(i));
                builder.append(s.charAt(i));
                // System.out.println(builder.toString());
                visited.put(s.charAt(i), i);
            }


        }
        if(repeatedCharIndex >= 0) {
            String nextResult = getSubstringWithoutRepeat(repeatedCharIndex + 1, s);
            // System.out.println("repeatedCharIndex: ["+ repeatedCharIndex+"] , nextResult: ["+nextResult+"], currentResult: ["+builder.toString()+"]");
            return nextResult.length() > builder.length() ? nextResult : builder.toString();
        }

        return builder.toString();
    }
}
