class Solution
{
    static Node rev(Node start)
    {
        if(start==null)
        {
            return null;
        }
        Node prev=null;
        Node head=start;
        Node next=start.next;
        while(head!=null)
        {
           head.next=prev;
           prev=head;
           head=next;
           if(next!=null)
           {
               next=next.next;
           }
        }
        return prev;
    }
   
    public static Node reverse(Node node, int k)
    {
        if(node==null)
        {
            return null;
            
        }
       Node temp=node;
       Node ans=null;
       Node globalprev=null;
       
       while(temp!=null)
       {
           int s=1;
           Node start=temp;
           Node end=temp;
           while(s<k && end.next!=null)
           {
               end=end.next;
               s++;
           }
           temp=end.next;
           end.next=null;
           Node newnode=rev(start);
       
       
       if(ans==null)
       {
           ans=newnode;
           globalprev=start;
           
       }
       else
       {
           globalprev.next=newnode;
           globalprev=start;
           
           
       }
       }
       return ans;
       
       
       
        
        
    }
}
