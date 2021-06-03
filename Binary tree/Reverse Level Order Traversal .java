class Tree
{
    public ArrayList<Integer> reverseLevelOrder(Node node) 
    {
        
        ArrayList<Integer> a =new ArrayList<Integer>();
        Queue<Node> q=new LinkedList<>();
        Stack<Node> s=new Stack();
        while(node!=null)
        {
            q.add(node);
        }
        while(q!=null)
        {
            Node temp=q.peek();
            s.push(temp);
            q.remove();
            if(temp.right!=null)
            {
                s.push(temp.right);
            }
            if(temp.left!=null)
            {
                s.push(temp.left);
            }
        }
        while(s.empty()==false)
        {
            a.add(s.peek().data);
            s.pop();
        }
        return a;
        
        
    }
}      