class Solution
{
   
    boolean isPalindrome(Node head) 
    {
        Node slow=head;
        boolean check=true;
        Stack<Integer> stack=new Stack<Integer>();
        while(slow != null)
        {
            stack.push(slow.data);
            slow=slow.next;
        }
        
        while(head!=null)
        {
            
            int i=stack.pop();
            if(head.data==i)
            {
                check=true;
            }
            else
            {
                check=false;
                break;
            }
            head=head.next;
        }
        return check;
    }    
}
