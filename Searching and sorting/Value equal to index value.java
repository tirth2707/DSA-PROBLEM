class Solution {
    ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        
        ArrayList<Integer> a1=new ArrayList<Integer>();
        
        for(int i=0;i<n;i++)
        {
            int temp=i+1;
            if(arr[i]==temp)
            {
                a1.add(arr[i]);
            }
            
        }
        return a1;
       
    }
}