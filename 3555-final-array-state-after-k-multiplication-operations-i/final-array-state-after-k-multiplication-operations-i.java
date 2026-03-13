class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int min = Integer.MAX_VALUE;
        int j = 0,idx = 0;
        while(j<k){
            for(int i=0;i<nums.length;i++){
                if(nums[i]<min){min = nums[i];idx = i;}
            }
            System.out.print(min+" ");
            nums[idx] = min*multiplier;
            idx = 0;
            min = Integer.MAX_VALUE;
            j++;
        }
        System.out.println(j+"j");
        return nums;
    }
}