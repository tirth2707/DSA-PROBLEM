class Solution{
    static int longestSubsequence(int N, int A[])
    {
        
        int dp[]=new int[N];
        for(int i=0;i<N;i++)
        {
            dp[i]=1;
        }
        
        for(int i=1;i<N;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(A[i]==A[j]+1 || A[i]==A[j]-1)
                {
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
                
            }
        }
         int result = 1;
        for (int i = 0 ; i < N; i++)
            if (result < dp[i])
                result = dp[i];
        return result;
    }
}