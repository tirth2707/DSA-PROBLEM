class Solution{
    
    static int subsetsum(int arr[],int sum,int n)
    {
        
        int dp[][]=new int[n+1][sum+1];
        
        for(int i=0;i<n+1;i++)
        {
            for(int j=0;j<sum+1;j++)
            {
                if(i==0)
                {
                    dp[i][j]=0;
                }
               
            }
        } 
        for(int i=0;i<n+1;i++)
        {
            for(int j=0;j<sum+1;j++)
            {
                if(j==0)
                {
                    dp[i][j]=1;
                }
               
            }
        }
        
        for(int i=1;i<n+1;i++)
        {
            for(int j=1;j<sum+1;j++)
            {
                if(arr[i-1]<=j)
                {
                    dp[i][j] = dp[i-1][j-arr[i-1]] | dp[i-1][j];
                    
                }
                else
                {
                    dp[i][j]=dp[i-1][j];
                    
                }
            }
        }
        return dp[n][sum];
        
        
    }
    
    
    static int equalPartition(int N, int arr[])
    {
      
          int sum=0;
          for(int i=0;i<N;i++)
          {
              sum+=arr[i];
          }
          
          if(sum%2==0)
          {
              
              return subsetsum(arr,sum/2,N);
              
          }
          else
          {
              return 0;
          }
    }
}