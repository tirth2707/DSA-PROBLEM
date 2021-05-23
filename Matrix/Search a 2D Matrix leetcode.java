class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
            int n=matrix.length;
        int k=1;
            for(int i=0;i<matrix.length;i++)
            {
                for(int j=0;j<matrix[i].length;j++)
                {
                    int m=matrix[i].length;
                    if(matrix[i][m-1]>=target)
                    {
                        if(matrix[i][j]==target)
                        {
                            k=0;
                            break;
                        }
                        
                    }
                    
                    
                }
            }
        if(k==0)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}
