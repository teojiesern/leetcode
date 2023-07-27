class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int level = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            int tempLength = q.size();
            for(int i=0; i<tempLength; i++){
                TreeNode temp = q.remove();
                if(temp.left != null) q.offer(temp.left);
                if(temp.right != null) q.offer(temp.right);
            }
            level += 1;
        }

        return level;
    }
}


// bfs traverse through each level and get the number of levels traversed through to know the depth.
// however using dfs is a much better approach to finding the depth