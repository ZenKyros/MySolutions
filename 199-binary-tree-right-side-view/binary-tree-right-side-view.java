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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        
        int level = 0;
        
          right(root, level,result);
          return result;
        
    }
    public void right(TreeNode root , int level , List<Integer> result){
        if(root == null ){
            return;
      
        
        }
       
        if(level == result.size()){
            result .add(root.val);
        }
        right(root.right, level+1,result);
        right(root.left, level+1,result);
        
    }
}