class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = nums1.length+nums2.length;
        int[] arr = new int[len];
        int i = 0,j = 0,k = 0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                arr[k++] = nums1[i];
                i++;
            }
            else{arr[k++] = nums2[j];j++;}
        }
        for(int l=j;l<nums2.length;l++){
            arr[k++] = nums2[l];
        }
        for(int l=i;l<nums1.length;l++){
            arr[k++] = nums1[l];
        }
        if(len%2 == 0){
            return (arr[len/2-1]+arr[len/2])/2.0;
        }
        return arr[len/2];
               
    }
}