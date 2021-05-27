vector<int> find(int a[], int n , int x )
{
        int tmp1=-1;
        int tmp2=-1;
        int x1=0;
       for(int i=0;i<n;i++)
       {
           if(x1==0 && a[i]==x)
           {
                x1=1;
               tmp1=i;
               tmp2=i;
               
           }
           else if(a[i]==x)
           {
               
               tmp2=i;
           }
           
         
       }
       if(x==0)
       {
          return {-1,-1};
          
        }
        else
       {
          return {tmp1,tmp2};
          
       }
}