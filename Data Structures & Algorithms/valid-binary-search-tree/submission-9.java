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
    public boolean isValidBST(TreeNode root) {
        return isValidBst(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isValidBst(TreeNode root, int lowestAllowed, int maximumAllowed){
        if(root == null){
            return true;
        }
        boolean result = true;
        if(root.val <= lowestAllowed || root.val >= maximumAllowed){
            return false;
        }
        return isValidBst(root.left, lowestAllowed, root.val) && isValidBst(root.right, root.val, maximumAllowed);
    }
    
}
