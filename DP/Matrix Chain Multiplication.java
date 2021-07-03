class Solution{
    
    static int dp[][]=new int[501][501];
    
    static int solve(int arr[],int i,int j)
    {
        
        if(i>=j)
        {
            return 0;
        }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
       dp[i][j]=Integer.MAX_VALUE;
        for(int k=i;k<=j-1;k++)
        {
            int tempans=solve(arr,i,k) + solve(arr,k+1,j) + arr[i-1]*arr[k]*arr[j];
            if(tempans<dp[i][j])
            {
                dp[i][j]=tempans;
            }
        }
        return dp[i][j];
    }
    
    
    static int matrixMultiplication(int N, int arr[])
    {
        for(int i=0;i<501;i++)
        {
            for(int j=0;j<501;j++)
            {
                dp[i][j]=-1;
            }
        }
        int ans=solve(arr,1,N-1);
        return ans;
    }
}