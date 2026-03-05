class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i,j;
        int n=matrix.length;
        for(i=0;i<n;i++){
            for(j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }
}