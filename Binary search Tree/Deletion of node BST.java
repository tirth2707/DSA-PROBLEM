/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    public TreeNode inorder(TreeNode root)
    {
        TreeNode current=root;
        while( current.left!=null)
        {
            current=current.left;
            
        }
        return current;
    }
    
    public TreeNode deleteNode(TreeNode root, int key) {
        
        if(root==null)
        {
            return root;
        }
     
        if(key<root.val)
        {
            root.left=deleteNode(root.left,key);
        }
        else if(key> root.val)
        {
            root.right=deleteNode(root.right,key);
        }
        else
        {
            if(root.left==null)
            {
                TreeNode temp=root.right;
                root.right=null;
                return temp;
            }
            else if(root.right==null)
            {
                TreeNode temp=root.left;
                root.left=null;
                return temp;    
            }
          
            
                TreeNode temp=inorder(root.right);
                root.val=temp.val;
                root.right=deleteNode(root.right,temp.val);
          
        }
        return root;
        
        
        
        
    }
}