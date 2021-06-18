class Solution
{
    //Function to check if two strings are isomorphic.
    public static boolean areIsomorphic(String str1,String str2)
    {
        
        int n=str1.length();
        int m=str2.length();
        
        if(n!=m)
        {
            return false;
        }
        
        int counts1[]=new int[256];
        int counts2[]=new int[256];
        
        for(int i=0;i<n;i++)
        {
            
           counts1[str1.charAt(i)]++;
           
            
           counts2[str2.charAt(i)]++;
            if (counts1[str1.charAt(i)] != counts2[str2.charAt(i)])
            {
                return false;
            }
            
        }
        return true;
        
        
        
        
    }
}