class Solution
{
    //Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) 
    {
       HashSet<Integer> hs = new HashSet<>(); 
      
        
        Node current = head; 
        Node prev = null; 
        
        
        while (current != null)  
        { 
            int curval = current.data; 
              
            
            if (hs.contains(curval)) { 
                prev.next = current.next;
                
                current=null;
            }
            
            else { 
                hs.add(curval); 
                prev = current; 
            }
            //updating current to the next node of prev.
            current = prev.next; 
        } 
        return head;
	    
	    
	    
	   
    }
    
}
