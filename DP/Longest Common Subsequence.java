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
        
        for(int i=1;i<x+1;i++)
        {
            for(int j=1;j<y+1;j++)
            {
                if(s1.length() ==0  || s2.length() == 0)
                {
                    return 0;
                }
                else if(s1.charAt(i-1) == s2.charAt(j-1))
                {
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else
                {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
                
            }
        }
        return dp[x][y];