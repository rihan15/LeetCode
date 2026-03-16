class Solution {
    public void sortColors(int[] nums) {
        //int []res = new int[nums.length];
        int z = 0,o = 0,t = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0) z++;
            else if(nums[i] == 1) o++;
            else if(nums[i] == 2) t++;
        }
        System.out.println(z+" "+o+" "+t);
        int k = 0;
        for(int i=0;i<z;i++){
            nums[k++] = 0;
        }
        for(int i=0;i<o;i++){
            nums[k++] = 1;
        }
        for(int i=0;i<t;i++){
            nums[k++] = 2;
        }
    }
}