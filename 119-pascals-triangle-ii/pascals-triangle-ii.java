class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        long c = 1;
        for (int j = 0; j <= rowIndex; j++) {
            row.add((int)c);
            c = c * (rowIndex - j) / (j + 1); 
        }
        return row;
    }
}   