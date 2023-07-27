class Solution {
    public int goodNodes(TreeNode root) {
        return 1 + count(root.left, root.val) + count(root.right, root.val);
    }

    public int count(TreeNode root, int max){
        if(root == null) return 0;
        int res = 0;
        if(root.val >= max) {
            max = root.val;
            res = 1;
        }
        return res + count(root.left, max) + count(root.right, max);
    }
}

// dfs approach, adding 1 each time we encounter that the current node has value greater than or equals to the maximum