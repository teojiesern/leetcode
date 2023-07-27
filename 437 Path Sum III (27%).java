class Solution {
    public int pathSum(TreeNode root, int targetSum) {
        if(root == null) return 0;
        return count(root, targetSum, 0) + pathSum(root.left, targetSum) + pathSum(root.right, targetSum);
    }

    public int count(TreeNode root, int targetSum, long tempSum){
        if(root == null) return 0;
        int numPaths = 0;
        tempSum += root.val;
        if(targetSum == tempSum) numPaths++;
        return numPaths + count(root.left, targetSum, tempSum) + count(root.right, targetSum, tempSum);
    }
}

// class Solution {
//     public int pathSum(TreeNode root, int sum) {
//         if (root == null) return 0;
//         return pathSumFrom(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
//     }
    
//     private int pathSumFrom(TreeNode node, long sum) {
//         if (node == null) return 0;
//         return (node.val == sum ? 1 : 0) 
//             + pathSumFrom(node.left, sum - node.val) + pathSumFrom(node.right, sum - node.val);
//     }
// }



// using two recursions to try to start with each one of the node
// traverse down and pass the tempSum to indicate the sum of nodes, and return the numPaths plus all numPaths at the lower tree