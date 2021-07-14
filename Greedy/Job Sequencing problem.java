class jobComparator implements Comparator<Job> 
{
    public int compare(Job j1, Job j2){
        if(j1.profit > j2.profit)return -1;
        if(j1.profit < j2.profit)return 1;
        return 0;
    }
}

class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
        
        Arrays.sort(arr, new jobComparator());
        int temp=1;
        int count=0,profit=0;
        boolean[] slot = new boolean[n];
        Arrays.fill(slot, false);
        for(int i=0;i<n;i++)
        {
            for(int j=Math.min(n,arr[i].deadline)-1;j>=0;j--)
            {
                if(slot[j]==false)
                {
                    count+=1;
                    profit+=arr[i].profit;
                    
                    slot[j]=true;
                    break;
                }
            }
            
        }
        
        int[] ans = new int[2];
	    ans[0] = count;
	    ans[1] = profit;
	    return ans;
        
        
    }
}