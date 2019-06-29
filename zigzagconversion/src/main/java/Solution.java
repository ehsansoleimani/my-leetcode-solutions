/**
 * Created by ehsan on 6/30/19.
 */
public class Solution {
    public String convert(String s, int numRows) {
        if(s.length() < numRows || numRows == 1) {
            return s;
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numRows; ++i) {
            int index = i;
            while(index < s.length()) {
                int pivot = getNextPivot(index, numRows);
                result.append(s.charAt(index));
                index = mirror(index, pivot);
            }
        }
        return result.toString();
    }

    private int mirror(int index, int pivot) {
        return 2 * pivot - index;
    }

    private int getNextPivot(int index, int numRows) {
        return (numRows - 1) * (index / (numRows- 1) + 1);
    }
}