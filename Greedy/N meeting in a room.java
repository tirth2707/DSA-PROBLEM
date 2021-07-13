class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n)
    {
        
        pair [] x = new pair[n];
        
        //pushing the pair of starting and finish time in a list.
        for(int i = 0; i < n; i++){
            x[i]  = new pair(start[i],end[i]);
        }
        
         Arrays.sort(x,new Comparator<pair>() {
                @Override
                public int compare(pair s1, pair s2)
                {
                    return s1.second - s2.second;
                }
        });
        
        
        
        int count=1;
        int i=x[0].second;
        for(int j=1;j<n;j++)
        {
            if(x[j].first>i)
            {
                count++;
                i=x[j].second;
            }
        }
        
        return count;
    }
}
