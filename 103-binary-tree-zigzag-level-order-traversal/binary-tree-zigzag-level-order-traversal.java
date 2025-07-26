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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new LinkedList<>();
        helper(root,0,ans);
        return ans;
    }
    private void helper(TreeNode node,int level,List<List<Integer>> ls){
        if(node==null) return;

        if(ls.size()==level) ls.add(new LinkedList<>());
        if(level%2==0) ls.get(level).add(node.val);
        else ls.get(level).addFirst(node.val);
        helper(node.left,level+1,ls);
        helper(node.right,level+1,ls);
    }
}