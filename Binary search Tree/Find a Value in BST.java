class Solution
{
    //Function to insert a node in a BST.
    Node insert(Node root, int key)
    {
            if(root == null) 
        return new Node(key);
        
        //if given data is less than data at the current node, we call the  
    	//function recursively to insert new node in left subtree.
        if(key < root.data)
            root.left  = insert(root.left,key);
            
        //else if given data is more than data at the current node, we call the  
        //function recursively to insert new node in right subtree.
        else if(key > root.data)
            root.right = insert(root.right,key);
            
        return root;
    }
    
}