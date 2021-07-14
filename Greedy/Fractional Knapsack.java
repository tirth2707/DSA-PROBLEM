class Solution
{
    class itemComparator implements Comparator<Item>
    {
        //comparison function to sort items according to value/weight ratio.
        public int compare(Item a, Item b)
        {
            double r1 = (double)a.value / a.weight;
            double r2 = (double)b.value / b.weight;
            if(r1 > r2){
                return -1;
            } else if(r1 < r2) {
                return 1;
            }
            return 0;
        }
    }
    //Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int w, Item a[], int n) 
    {
        Arrays.sort(a, new itemComparator());
        int current=0;
        double finalval=0.0;
        for(int i=0;i<n;i++)
        {
            if(current+a[i].weight<w)
            {
                current=current+a[i].weight;
                finalval=finalval+a[i].value;
            }
            else
            {
                int remain=w-current;
                finalval=finalval+a[i].value*((double)remain/a[i].weight);
                break;
            }
        }
        return finalval;
        
    }
}