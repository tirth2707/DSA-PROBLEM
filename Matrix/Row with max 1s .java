class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
       int c=0;
       int max=0;
       int tmp=-1;
       for(int i=0;i<n;i++)
       {
           for(int j=0;j<m;j++)
           {
               if(arr[i][j]==1)
               {
                   c++;
               }
           }
           
           if(c>max)
           {
               tmp=i;
               max=Math.max(max,c);
           }
           c=0;
       }
      return tmp;
       
    }