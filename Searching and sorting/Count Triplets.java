class Solution
{
    long countTriplets(long a[], int n,int sum)
    {
          int ans = 0;
          Arrays.sort(a);
      
        // Fix the first element as A[i]
        for (int i = 0; i < n-2; i++)
        {
           // Fix the second element as A[j]
           int j=i+1,k=n-1;
           while(j<k)
           {
               if(a[i]+a[j]+a[k]>=sum)
               {
                   k--;
               }
               else
               {
                   ans += (k - j);
                   j++;
               }
               
           }
        }
      
        return ans;

    }
}