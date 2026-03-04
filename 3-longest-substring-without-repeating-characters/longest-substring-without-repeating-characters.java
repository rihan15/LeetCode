class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.equals(" ")){return 1;}
        HashSet<Character> h=new HashSet<>();
        int i=0,cont=0,j=0,max = 0;
        while(i<s.length()){
            if(!h.contains(s.charAt(i))){
                h.add(s.charAt(i));
                cont++;
                i++;
            }
            else{
                h.remove(s.charAt(j));
                j++;
                cont--;
            }
            if(max < cont) max = cont;
        }
        return max;
        
    }
}