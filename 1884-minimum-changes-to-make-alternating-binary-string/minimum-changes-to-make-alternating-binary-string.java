class Solution {
    public int minOperations(String s) {
        char []arr1 = {'1','0'};
        int j=0,k=1;
        int count1 = 0,count2 = 0;
        for(int i=0;i<s.length();i++){
            if(arr1[(j++)%2] != s.charAt(i)) count1++;
            if(arr1[(k++)%2] != s.charAt(i)) count2++;
        }
        return Math.min(count1,count2);
    }
}