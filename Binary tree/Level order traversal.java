class Solution
{
    static ArrayList <Integer> levelOrder(Node node) 
    {
        ArrayList<Integer> a = new ArrayList<Integer>();
        Queue<Node> q = new LinkedList<>();
        if(node!=null)
        {
            q.add(node);
        }
        while(!q.isEmpty())
        {
            Node temp=q.peek();
            a.add(temp.data);
            if(temp.left!=null)
            {
                q.add(temp.left);
            }
            if(temp.right!=null)
            {
                q.add(temp.right);
            }
            q.remove();
            
        }
        return a;
        
    }
}