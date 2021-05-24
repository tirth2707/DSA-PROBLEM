class Solution {
    int[][] sortedMatrix(int n, int mat[][]) {
        
        int a[]=new int[n*n];
        int k=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                
                a[k++]=mat[i][j];
                
            }
        }
        Arrays.sort(a);
        k=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                mat[i][j]=a[k++];
                
            }
        }
        return mat;
        
        
    }
};