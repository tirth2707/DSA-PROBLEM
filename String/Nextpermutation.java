class Solution {
    public void nextPermutation(int[] arr) {
        int index=-1;
        int size=arr.length;
        for(int i=size-1;i>0;i--)
        {
            if(arr[i]>arr[i-1])
            {
                index=i;
                break;
            }
        }
        if(index==-1)
        {
            Arrays.sort(arr);
        }
        else
        {
            int prev=index;
            for(int i=index+1;i<size;i++)
            {
                if(arr[i]>arr[index-1] && arr[i]<=arr[prev])
                {
                   prev=i;
                }
            }
            int temp=arr[prev];
            arr[prev]=arr[index-1];
            arr[index-1]=temp;
            Arrays.sort(arr,index,size);
        }
        
    }
}