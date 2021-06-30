
class Solution
{
    public int[] singleNumber(int[] nums)
    {
        Set<Integer> s1=new HashSet<Integer>();
         
        List<Integer> al = new ArrayList<>();
       
        for(int i=0;i<nums.length;i++)
        {
            if(s1.contains(nums[i]))
            {
                al.remove(al.indexOf(nums[i]));
             //   System.out.println("remove"+nums[i]);
            }
            else
            {
              //  System.out.println(nums[i]);
                al.add(nums[i]);
            }
             s1.add(nums[i]);
        }
        
        int[] ret = new int[al.size()];
        for(int i = 0;i < ret.length;i++)
                ret[i] = al.get(i);
        Arrays.sort(ret);
        return ret;
        
    }
}