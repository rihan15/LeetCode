class Solution {
    public int romanToInt(String s) {
        int ans = 0;
        for(int i=0;i<s.length()-1;i++){
            if(val(s.charAt(i))>=val(s.charAt(i+1))) ans+=val(s.charAt(i));
            else ans-=val(s.charAt(i));
        }
        ans+=val(s.charAt(s.length()-1));
        return ans;
        
    }
    int val(char k){
        if(k == 'I') return 1;
        else if(k == 'V') return 5;
        else if(k == 'X') return 10;
        else if(k == 'L') return 50;
        else if(k == 'C') return 100;
        else if(k == 'D') return 500;
        return 1000;
    }
}