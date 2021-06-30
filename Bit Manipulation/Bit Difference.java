class Solution{
    
    // Function to find number of bits needed to be flipped to convert A to B
    public static int countBitsFlip(int a, int b){
        int count=0;
       int n=a^b;
        while(n>0)
        {
            count=count + (n&1);
            n>>=1;
        }
        
        return count;
    }
    
    
}