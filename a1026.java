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
    public int maxAncestorDiff(TreeNode root) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        int max = func(root,al);
        return max;
    }
     public int func(TreeNode node, ArrayList al){
        int max = 0;
        int temp = 0;
        al.add(node.val);
        if(node.left!=null){
            temp =func(node.left,al);
            if(temp>max) max=temp;
        }
        if(node.right != null){
            max = func(node.right,al);
            if(temp>max) max=temp;
        }
        int val = (Integer)al.remove(al.size()-1);
        System.out.println(al.size());
        for(int i =0;i<al.size();i++){
            if(Math.abs(val - (Integer)al.get(i)) > max){
                max = Math.abs(val - (Integer)al.get(i));
            }
        }
        
        return max;
     }
}