class Solution {
    static boolean isPowerOfTwo(int n)
    {
        return n > 0 && ((n & (n - 1)) == 0);
    }
    static int findPosition(int N) {
        
        int count=0;
        if (!isPowerOfTwo(N))
            return -1;
        
        while(N>0)
        {
            N=N>>1;
            ++count;
        }
        return count;
    }
};