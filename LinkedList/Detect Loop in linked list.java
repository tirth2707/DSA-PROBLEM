class Solution {
    //Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head){
                Node first=head;
       Node secound=head;
        
        while(first!=null && first.next!=null)
        {
            first=first.next.next;
            System.out.println("first"+first.data);
            secound=secound.next;
            System.out.println("secound"+secound.data);
            if(first==secound)
            {
                return true;
            }
        }
        return false;
        // Add code here
    }
}