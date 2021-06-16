class Solution
{
    //Function to find maximum of each subarray of size k.
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        ArrayList<Integer> a1 =new ArrayList();
        Deque<Integer> qi =new LinkedList<Integer>();
        int i;
        for(i=0;i<k;++i)
        {
            while(!qi.isEmpty() && arr[i] >= arr[qi.peekLast()])
            {
                
                qi.removeLast();
            }
            qi.addLast(i);
        }
        
        for(;i<n;++i)
        {
            a1.add(arr[qi.peek()]);
            
            while((!qi.isEmpty() ) && qi.peek() <= i-k)
            {
                qi.removeFirst();
            }
            
            while((!qi.isEmpty()) && arr[i] >= arr[qi.peekLast()] )
            {
                qi.removeLast();
            }
            
            qi.addLast(i);
        }
        a1.add(arr[qi.peek()]);
        return a1;
    }
}