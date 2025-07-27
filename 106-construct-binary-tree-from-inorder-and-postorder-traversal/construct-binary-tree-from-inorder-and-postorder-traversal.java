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
    int postIndex; 
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postIndex = postorder.length -1;
        return build(inorder , postorder , 0 , inorder.length -1  );
        
    }
    public TreeNode build(int[]  inorder , int [] postorder , int inStart , int inEnd){
        if (inStart > inEnd) return null;
        int rootVal = postorder[postIndex--];
        
        
        TreeNode root = new TreeNode(rootVal);
        int index = findIndex(inorder , rootVal,inStart , inEnd);

        root.right = build(inorder , postorder , index +1 , inEnd);
        root.left = build(inorder , postorder , inStart , index -1);

        return root;
        

    }
    public int findIndex(int [] inorder ,int val ,int inStart , int inEnd){
        for(int i = 0 ; i <= inEnd ; i++){
            if(inorder[i] == val ) return i; 
            
        }
        return -1;

    }
}

