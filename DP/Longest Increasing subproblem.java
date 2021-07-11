class Solution {
    public int lengthOfLIS(int[] a) {
        
        int size=a.length;
        int dp[]=new int[size];
        for(int i=0;i<size;i++)
        {
            dp[i]=1;
        }
        
        for(int i=1;i<size;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(a[i]>a[j] && dp[i]<dp[j]+1)
                {
                    dp[i]=dp[i]+1;
                }
            }
        }
        
        int max=0;
        for(int i=0;i<size;i++)
        {
            if(max<dp[i])
            {
                max=dp[i];
            }
        }
        
        return max;
        
    }
}