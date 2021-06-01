//User function Template for Java
/*
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        this.data = key;
        next = null;
    }
} */

class Solution
{
    static Node findmiddle(Node current,Node first,Node second)
    {
        Node fast=current.next;
        Node slow=current;
        
        
        while(fast!=null)
        {
            fast=fast.next;
            if(fast!=null)
            {
                slow=slow.next;
                fast=fast.next;
            }
        }
        first=current;
        second=slow.next;
        slow.next=null;
        
        
        
    }
    static Node Mergeboth(Node first,Node second)
    {
        Node ans=null;
        if(first==null)
        {
            return second;
        }
        if(second==null)
        {
            return first;
        }
        if(first.data<second.data)
        {
            ans=first;
            ans.next=Mergeboth(first.next,second);
        }
        else
        {
            ans=second;
            ans.next=Mergeboth(first,second.next);
        }
        return ans;
         
    }
    
    static Node mergeSort(Node head)
    {
        
       
        Node current=head;
        Node first=null;
        Node second=null;
        if(current==null || current.next==null)
        {
            return null;
        }
        first=current;
        second=findmiddle(current,first,second);
        mergeSort(first);
        mergeSort(second);
        head=Mergeboth(first,second);
        return head;
        
        
        
    }
}