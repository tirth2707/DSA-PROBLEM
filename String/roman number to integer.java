class RomanToNumber {
    
    public int value(char s)
    {
       
           if(s=='I')
           {
                return 1;
           }
           else if(s=='V')
           {
               return 5;
           }
           else if(s=='X')
           {
             return 10;
           }
           else if(s=='L')
           {
               return 50;
           }
           else if(s=='C')
           {
                return 100;
           }
           else if(s=='D')
           {
               return 500;
           }
           else if(s=='M')
           {
              return 1000;
           }
           else
           {
               return -1;
           }
      
        
    }
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String s) {
       int ans=0;
       for(int i=0;i<s.length();i++)
       {
           int s1=value(s.charAt(i));
           if(i+1 < s.length())
           {
               int s2=value(s.charAt(i+1));
               if(s1>=s2)
               {
                   ans=ans+s1;
               }
               else
               {
                   ans=ans+s2-s1;
                   i++;
               }
           }
           else
           {
               ans=ans+s1;
           }
       }
       return ans;
      
    }
}