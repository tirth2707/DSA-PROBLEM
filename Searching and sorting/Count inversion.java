class Solution
{
    
    private static long mergeAndCount(long[] arr, int l,
                                     int m, int r)
    {
        long[] left = Arrays.copyOfRange(arr, l, m + 1);

        // Right subarray
        long[] right = Arrays.copyOfRange(arr, m + 1, r + 1);

        int i=0,j=0,k=l;
        long swaps=0;
        
        while(i<left.length && j<right.length)
        {
             if (left[i] <= right[j])
                arr[k++] = left[i++];
            else {
                arr[k++] = right[j++];
                swaps += (m + 1) - (l + i);
            }
            
        }
        while (i < left.length)
            arr[k++] = left[i++];
        while (j < right.length)
            arr[k++] = right[j++];
            
        return swaps;
        
    }
    public static long mergeSortAndCount(long[] arr,int l,int r)
    {
        long count=0;
        if(l<r)
        {
            int mid=(l+r)/2;
            count += mergeSortAndCount(arr,l,mid);
            count += mergeSortAndCount(arr,mid+1,r);
            
            count += mergeAndCount(arr,l,mid,r);
            
        }
        return count;
    }
    static long inversionCount(long arr[], long N)
    {
           long tmp= mergeSortAndCount(arr,0,arr.length-1);
           return tmp;
    }   
}
