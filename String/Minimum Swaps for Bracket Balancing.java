class Solution{
    static int minimumNumberOfSwaps(String S){
        
        
        int left=0,right=0,imbalance=0,swap=0;
        char c[]=S.toCharArray();
        
        for(int i=0;i<c.length;i++)
        {
            if(c[i]=='[')
            {
                left++;
                if(imbalance>0)
                {
                    swap+=imbalance;
                    imbalance--;
                }
            }
            else if(c[i]==']')
            {
                right++;
                imbalance=right-left;
            }
        
        }
        return swap;
    }
}
