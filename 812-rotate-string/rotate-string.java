class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        String res = s+s;
        boolean r = res.contains(goal);
        return r;
    }
}