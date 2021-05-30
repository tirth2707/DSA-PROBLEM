class Solution 
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
	    int z=1;
	    long temp=1;
	    long a[]=new long[n];
       for(int i=0;i<n;i++)
       {
           for(int j=0;j<n;j++)
           {
               if(i!=j && z==1)
               {
                   z=0;
                   temp=nums[j];
               }
               else if(i!=j)
               {
                   temp=temp*nums[j];
               }
           }
           a[i]=temp;
           z=1;
       }
       return a;
      
	} 
} 