public class Solution {
    public int minFlips(String S) {
       
       int n=S.length();
       int temp1=0;
       int temp2=0;
       int x=0;
       int min;
       for(int i=0;i<S.length();i++)
       {
          
           if(x==0)
           {
              
               if(S.charAt(i)=='0')
               {
                   temp1++;
               }
               if(S.charAt(i)=='1')
               {
                   temp2++;
               }
               x=1;
               
           }
           else 
           {
              
                 if(S.charAt(i)=='0')
               {
                   temp2++;
               }
               if(S.charAt(i)=='1')
               {
                   temp1++;
               }
               x=0;
                
           }
       }
       if(temp1<temp2)
       {
           return temp1;
       }
       else
       {
           return temp2;
       }
       
       
       
       
       
    }
}