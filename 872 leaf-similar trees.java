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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        String leaf1 = leaf(root1, "");
        String leaf2 = leaf(root2, "");
        if(leaf1.equals(leaf2)) return true;
        return false;
    }

    public static String leaf(TreeNode root, String sequence){
        if(root == null) return sequence;
        String left = leaf(root.left, sequence);
        String right = leaf(root.right, sequence);

        if(left.equals("") && right.equals("")) left += root.val + ",";
        return sequence += left + right;
    }
}