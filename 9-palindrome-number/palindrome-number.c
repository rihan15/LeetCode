bool isPalindrome(int x) {
    int rem=0;
    int n=x;
    long sum=0;
    while(x>0){
        rem=x%10;
        x=x/10;
        sum=(sum*10)+rem;
    }
    if(sum==n){
        return true;
    }
    else{
        return false;
    }
    
}