class Solution{
    int longestCommonSubstr(String s1, String s2, int x, int y){
        
        int dp[][]=new int[x+1][y+1];
        
        for(int i=0;i<x+1;i++)
        {
            for(int j=0;j<y+1;j++)
            {
                if(i==0 || y==0)
                {
                    dp[i][j]=0;
                }
            }
        }
        int result=0;
        for(int i=1;i<x+1;i++)
        {
            for(int j=1;j<y+1;j++)
            {
                
                if(s1.charAt(i-1) == s2.charAt(j-1))
                {
                    dp[i][j]=1+dp[i-1][j-1];
                    result=Math.max(result,dp[i][j]);
                }
                else
                {
                    dp[i][j]=0;
                }
                
            }
        }
        return result;
        
    }
}
