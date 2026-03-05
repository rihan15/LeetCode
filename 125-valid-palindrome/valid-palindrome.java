class Solution {
    public boolean isPalindrome(String s) {
        String str="";
        boolean flag=false;
        if(s.equals(" ")) return true;
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))|| Character.isDigit(s.charAt(i) )){
                str += Character.toLowerCase(s.charAt(i));            
            }
            else{
                continue;
            }
        }
        int i=0,j=str.length()-1;
       
        String reversed = new StringBuilder(str).reverse().toString();
        if(str.equals(reversed)) flag = true;
        return flag;
    }
}