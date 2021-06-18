class Solution
{
    int max=0;
    String secFrequent(String arr[], int N)
    {
        String firstchar="";
        String secondchar="";
        int first=0;
        int second=0;
        
        HashMap<String,Integer> h1=new HashMap<String,Integer>();
        
        for(int i=0;i<N;i++)
        {
            if(h1.containsKey(arr[i]))
            {
                h1.put(arr[i],h1.get(arr[i])+1);
            }
            else
            {
                h1.put(arr[i],1);
            }
        }
        
        for(String s:h1.keySet())
        {
            if(h1.get(s)>first)
            {
                second=first;
                secondchar=firstchar;
                firstchar=s;
                first=h1.get(s);
            }
            else
            {
                if(h1.get(s) > second && h1.get(s)< first )
                {
                    second=h1.get(s);
                    secondchar=s;
                }
            }
        }
        return secondchar;
        
    }
}