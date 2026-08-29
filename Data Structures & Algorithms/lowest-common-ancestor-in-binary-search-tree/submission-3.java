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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode tempP = p;
        TreeNode tempQ = q;
        if(tempP.val > tempQ.val){
            p = tempQ;
            q = tempP;
        }
        System.out.println("Root is: " + root.val + ", p is: " + p.val +", and q is: " + q.val);
        if(root.val >= p.val && root.val <= q.val ){
            return root;
        }
        else if(root.val > Math.max(p.val, q.val)){
            return lowestCommonAncestor(root.left, p, q);
        } else{
            return lowestCommonAncestor(root.right, p, q);
        }
    }
}
