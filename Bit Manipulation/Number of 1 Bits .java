class Solution {
    static int setBits(int n) {
        
        int temp=0;
        int count=0;
        while(n>0)
        {
            count=count+ (n&1);
            temp=n>>=1;
            System.out.println(temp);
            System.out.println("Count"+count);
            
        }
        return count;
    }
}