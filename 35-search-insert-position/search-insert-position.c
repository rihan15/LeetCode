int searchInsert(int* nums, int numsSize, int target) {
    int i=0,idx=0;
    for(i=0;i<numsSize;i++){
        if(*(nums+i)==target){
            idx=i;
            break;}
        else if(*(nums+i)>target){
            idx=i;
            break;}
        else
            idx=i+1;
    }
    return idx;
}