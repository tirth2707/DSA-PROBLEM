class Solution {
    public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        
        int i=n-1;
        int j=0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        while(i>=0 && j<m)
        {
            if(arr1[i]>arr2[j])
            {
                int temp=arr1[i];
                arr1[i]=arr2[j];
                arr2[j]=temp;
            }
            i--;
            j++;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(k<=n)
        {
            return arr1[k-1];
        }
        else
        {
            int temp1=k-n;
            return arr2[temp1-1];
        }
        
        
        
        
        
    }
}