class Solution{
    static int setSetBit(int x, int y, int l, int r){
        
        int temp=(l-r)+1;
        int m1=(1<<temp);
        m1--;
        m1=(m1<<(l-1));
        m1=(m1 & y);
        x=x|m1;
        return x;
        
  
            
    }
}