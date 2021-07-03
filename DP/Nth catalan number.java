class Solution
{
    //Function to find the nth catalan number.
    public static long long findCatalan(int n)
    {
     
        long long dp[]=new long long[n+1];
        dp[0]=1;
        dp[1]=1;
        
        for(int i=2;i<dp.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                dp[i] += dp[j]*dp[i-j-1];
            }
        }
       // System.out.println(dp[n]);
        return dp[n];
        
    }
}