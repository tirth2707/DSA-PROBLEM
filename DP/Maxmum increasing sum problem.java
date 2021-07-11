class Solution
{
	public int maxSumIS(int arr[], int n)  
	{  
	    int dp[]=new int[n];
	   
	    for(int i=0;i<n;i++)
	    {
	       dp[i]=arr[i];
	    }
	    
	    for(int i=1;i<n;i++)
	    {
	        for(int j=0;j<i;j++)
	        {
	            if(arr[i]>arr[j] && dp[i]<dp[j]+arr[i])
	            {
	                dp[i]=dp[j]+arr[i];
	            }
	            
	        }
	    }
	    int total=0;
	    for(int i=0;i<n;i++)
	    {
	        if(total<dp[i])
	        {
	            total=dp[i];
	        }
	    }
	    return total;
	}  
}