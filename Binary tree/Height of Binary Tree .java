class Solution {
    //Function to find the height of a binary tree.
    int height(Node node) 
    {
        if (node == null)
            return 0;
        else 
        {
            /* compute the depth of each subtree */
            int lDepth = height(node.left);
            int rDepth = height(node.right);
 
            /* use the larger one */
            if (lDepth > rDepth)
                return (lDepth + 1);
             else 
                return (rDepth + 1);
        }
        // code here 
    }
}
    