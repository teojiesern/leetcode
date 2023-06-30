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
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();
        bfs(root1, a1);
        bfs(root2, a2);

        if(a1.size() != a2.size()) return false;
        for(int i=0; i<a1.size(); i++) if(a1.get(i) != a2.get(i)) return false;
        return true;
    }

    public static void bfs(TreeNode root, ArrayList arr){
        if(root == null) return;
        if(root.left == null && root.right == null){
            arr.add(root.val);
            return;
        }
        bfs(root.left, arr);
        bfs(root.right, arr);
    }
}