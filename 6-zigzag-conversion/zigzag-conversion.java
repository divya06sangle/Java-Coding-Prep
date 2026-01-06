class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1 || s.length() <= numRows)
        return s;

        StringBuilder[] rows = new StringBuilder[numRows];

        for(int i=0; i<numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int index = 0;
        boolean down = false;

        for(char c : s.toCharArray()) {
            rows[index].append(c);

            //Direction change
            if(index == 0 || index == numRows - 1) {
                down = !down;
            }

            index += down ? 1 : -1;
        }

        StringBuilder sb = new StringBuilder();
        for(StringBuilder row : rows)
        sb.append(row);
        return sb.toString();
    }
}