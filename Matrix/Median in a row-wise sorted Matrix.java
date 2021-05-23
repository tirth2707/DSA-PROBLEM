class Solution {
    int median(int matrix[][], int r, int c) {
        
        int tempArr[]=new int[r*c];
    int desired_index = (1+r*c)/2 -1;
   int index = 0    ;
    for(int i=0; i<r; i++)
    {
      for(int j=0; j<c; j++)
      {
         tempArr[index++] = matrix[i][j];
      }
    }
    Arrays.sort(tempArr);
    return tempArr[desired_index];
       
        
           
    }
}