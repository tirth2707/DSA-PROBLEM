class Solution
{
    //Function to find the maximum money the thief can get.
    public int FindMaxSum(int a[], int n)
    {
        int incl = a[0];
        int excl = 0;
        int excl_new;
        
       for(int i=1;i<n;i++)
       {
          excl_new = (incl > excl) ? incl : excl;

            /* current max including i */
            incl = excl + a[i];
            excl = excl_new;
       }
        return ((incl > excl) ? incl : excl);
    }
}