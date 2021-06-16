class Solution {
    int[] kLargest(int[] arr, int n, int k) {
    
        int b[]=new int[k];
        Arrays.sort(arr);
        int j=0;
        for(int i=n-1;i>=n-k;i--)
        {
            
            b[j]=arr[i];
            j++;
        }   
        return b;
    
    }
}