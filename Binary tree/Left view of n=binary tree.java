class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
      ArrayList <Integer> ans =new ArrayList<Integer>();
      Queue<Node> queue = new LinkedList<Node>();
      if(root==null)
      {
          return ans;
      }
      queue.add(root);
      while(!queue.isEmpty())
      {
          int size=queue.size();
          ans.add(queue.peek().data);
          while(size--!=0)
          {
              Node temp=queue.peek();
              queue.remove();
              if(temp.left!=null)
              {
                  queue.add(temp.left);
              }
              if(temp.right!=null)
              {
                  queue.add(temp.right);
              }
              
          }
      }
      return ans;
     
      
    }
}