class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>(); 
        int c = 1;
        for(int i=1;i<=numRows;i++){
            List<Integer> li = new ArrayList<>();
            c = 1;
            for(int j=1;j<=i;j++){
                li.add(c);
                c = c*(i-j)/j;
            }
            res.add(li);
        }
        return res;
    }
}