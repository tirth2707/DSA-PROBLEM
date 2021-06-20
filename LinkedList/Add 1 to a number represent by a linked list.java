class Solution
{
    static Node addOneUtil(Node head)
    {
        // res is head node of the resultant list
        Node res = head;
        Node temp = null, prev = null;
 
        int carry = 1, sum;
 
        while (head != null) // while both lists exist
        {
            
            sum = carry + head.data;
 
            
            carry = (sum >= 10) ? 1 : 0;
 
           
            sum = sum % 10;
 
            
            head.data = sum;
 
            
            temp = head;
            head = head.next;
        }
 
       
        if (carry > 0)
            temp.next = new Node(carry);
 
        
        return res;
    }
    public static Node reverse(Node head)
    {
        Node cur=head;
        Node next=null;
        Node prev=null;
        while(cur!=null)
        {
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        return prev;
        
    }
    public static Node addOne(Node head) 
    { 
        
       head = reverse(head);
       head = addOneUtil(head);
       return reverse(head);
        
    }
}
