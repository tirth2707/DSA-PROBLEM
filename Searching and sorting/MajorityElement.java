class Solution
{
    static int majorityElement(int a[], int size)
    {
        int x=0;
        int temp=0;
        int hello=239802;
        Arrays.sort(a);
        for(int i=1;i<size;i++)
        {
            
             
            
            if(a[i-1]==a[i])
            {
                temp++;
                
                
            }
            if(size/2==temp)
            {
                
                
                    x=1;
                    hello=a[i-1];
                    break;
            }
            else
            {
                    temp=0;
            }
                
            
        }
        if(x==1)
        {
            return hello;
        }
        else
        {
            return -1;
        }
        
    }
}