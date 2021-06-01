class GfG
{
    boolean isCircular(Node head)
    {
	    Node tmp=head.next;
	    while(tmp!=null && tmp!=head)
	    {
	        tmp=tmp.next;
	    }
	    return(head==tmp);
	    
    }
}
