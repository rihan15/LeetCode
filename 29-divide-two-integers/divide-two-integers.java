class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        boolean isNegative = (dividend < 0) ^ (divisor < 0);
        long lDividend = Math.abs((long) dividend);
        long lDivisor = Math.abs((long) divisor);
        int quotient = 0;
        while (lDividend >= lDivisor) {
            long tempDivisor = lDivisor;
            int numMultiples = 1;
            while (lDividend >= (tempDivisor << 1)) {
                tempDivisor <<= 1;
                numMultiples <<= 1;
            }

            lDividend -= tempDivisor;
            quotient += numMultiples;
        }
        return isNegative ? -quotient : quotient;
    }
}