/**
 * Created by ehsan on 6/30/19.
 */
public class Solution {
    public String convert(String s, int numRows) {
        Group[] groups = Group.makeGroups(s, numRows);
        String[] rows = new String[numRows];
        for (int i = 0; i < numRows; ++i) {
            rows[i] = "";
        }
        for (int i = 0; i < groups.length; ++i) {
            for (int r = 0; r < numRows; ++r) {
                rows[r] += groups[i].getRowAt(r);
            }
        }
        StringBuilder resultBuilder = new StringBuilder("");
        for (int i = 0; i < numRows; ++i) {
            resultBuilder = resultBuilder.append(rows[i]);
        }
        return resultBuilder.toString();
    }

    public static class Group {
        private String[] rows;

        public String getRowAt(int i) {
            return rows[i];
        }

        public Group(String input, int numRows) {
            this.rows = new String[numRows];
            for (int i = 0; i < numRows; ++i) {
                rows[i] = "";
            }
            for (int i = 0; i < Math.min(numRows, input.length()); ++i) {
                rows[i] += input.charAt(i);
            }

            int j = numRows;
            for (int i = numRows - 1; i > 1 && j < input.length(); --i) {
                rows[i - 1] += input.charAt(j++);
            }
        }

        public static Group[] makeGroups(String input, int numRows) {
            int groupSize = numRows * 2 - 2;
            int numGroups = (int) Math.ceil((double) input.length() / groupSize);
            Group[] groups = new Group[numGroups];
            for (int i = 0; i < numGroups; i++) {
                int beginIndex = i * groupSize;
                int endIndex = Math.min((i + 1) * groupSize, input.length());
                groups[i] = new Group(input.substring(beginIndex, endIndex), numRows);
            }
            return groups;
        }
    }
}