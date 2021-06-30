class Tree
{
    //Function to find the minimum element in the given BST.
    int minValue(Node node)
    {
        while(node.left!=null)
        {
            node=node.left;
        }
        
        return node.data;
        
    }
}
