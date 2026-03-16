class Solution {
    public int[] shuffle(int[] nums, int n) {
        int []x = new int[n];
        int []y = new int[n];
        int k = 0,j = 0;
        for(int i=0;i<nums.length;i++){
            if(i<n) x[j++] = nums[i];
            if(i>=n) y[k++] = nums[i];
        }
        for(int i=0;i<n;i++){
            System.out.println(x[i] +" "+y[i]);
        }
        j = 0;
        k = 0;
        for(int i=0;i<nums.length;i++){
            if(i%2 == 0) nums[i] = x[j++];
            else nums[i] = y[k++];
        }
        return nums;
    }
}