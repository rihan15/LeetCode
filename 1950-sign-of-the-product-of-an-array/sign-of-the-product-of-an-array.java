class Solution {
    public int arraySign(int[] nums) {
        int pro = 1;
        for(int i=0;i<nums.length;i++){
            pro*=signfunc(nums[i]);
        }
        if(pro>0) return 1;
        else if(pro == 0) return 0;
        return -1;
    }
    int signfunc(int n){
        if(n>0) return 1;
        else if(n<0) return -1;
        return 0;
    }
}