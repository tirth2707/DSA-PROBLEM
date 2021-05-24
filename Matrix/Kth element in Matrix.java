class Solution
{
	public static int kthSmallest(int[][]mat,int n,int k)
	{
	   int k1=0;
	   int a[]=new int[n*n]; 
       for(int i=0;i<n;i++)
       {
           for(int j=0;j<n;j++)
           {
               a[k1++]=mat[i][j];
           }
       }
       Arrays.sort(a);
       return a[k-1];
    }
}
