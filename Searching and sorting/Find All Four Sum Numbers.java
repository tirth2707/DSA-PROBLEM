class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] a, int k) {
        
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        Arrays.sort(a);
        int n=a.length;
        int left,right;
        for(int i=0;i<n-3;i++)
        {
            if (a[i] > 0 && a[i] > k) break;
             if (i > 0 && a[i] == a[i - 1]) continue;
            for(int j=i+1;j<n-2;j++)
            {
                if (j > i + 1 && a[j] == a[j - 1]) continue;
                
                left=j+1;
                right=n-1;
                
                while(left<right)
                {
                    int old_l = left;
                    int old_r = right;
                    if(a[i]+a[j]+a[left]+a[right]==k)
                    {
                        ans.add(new ArrayList<Integer>(
                            Arrays.asList(a[i], a[j], a[left], a[right])));
                        while (left < right && a[left] == a[old_l]) left++;
                        while (left < right && a[right] == a[old_r]) right--;
                    }
                    else if(a[i]+a[j]+a[left]+a[right]<k)
                    {
                        left++;
                    }
                    else
                    {
                        right--;
                    }
                }
                
            }
        }
        
        return ans;
    }
}