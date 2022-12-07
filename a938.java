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
    public int rangeSumBST(TreeNode root, int low, int high) {
        int sum = 0;        
        return func(root,low,high,sum);
    }

    public int func(TreeNode node, int low, int high, int sum){
        if(node.left!=null && node.val >= low) sum=func(node.left,low,high,sum);
        if(node.right!=null && node.val <= high) sum=func(node.right,low,high,sum);
        if(node.val>=low && node.val<=high){
            return sum+node.val;
        }else{
            return sum;
        }
    }
}