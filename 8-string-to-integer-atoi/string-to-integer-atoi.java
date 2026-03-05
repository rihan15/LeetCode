class Solution {
    public int myAtoi(String s) {
        int res = 0, flag = 0, i = 0;

        s = s.trim();
        if (s.length() == 0) return 0;

        if (s.charAt(0) == '-') {
            flag = 1;
            i++;
        } else if (s.charAt(0) == '+') {
            i++;
        }

        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            // 🔥 OVERFLOW CHECK
            if (res > (Integer.MAX_VALUE - digit) / 10) {
                return flag == 1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            res = res * 10 + digit;
            i++;
        }

        if (flag == 1) res *= -1;
        return res;
    }
}

