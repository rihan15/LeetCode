class Solution {
    public int singleNumber(int[] nums) {
        int cont=0,num=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]) cont++;
            }
            if(cont==1) num=nums[i];
            cont=0;
        }
        return num;
    }
}