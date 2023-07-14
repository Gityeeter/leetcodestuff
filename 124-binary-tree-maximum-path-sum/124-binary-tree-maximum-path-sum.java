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
    int maxValue = -2147483648;
    public int maxPathSum(TreeNode root) 
    {
        explore(root);
        return maxValue;
    }
     public void explore(TreeNode root) 
    {
         
         int full = root.val +  aggregateValue(root.right) + aggregateValue(root.left);
         int left = root.val + aggregateValue(root.left);
         int right = root.val + aggregateValue(root.right);
          int current_value = Math.max(Math.max(Math.max(full,left),right), root.val);
         if(current_value > maxValue)
         {
             maxValue = current_value;
         }
         if(root.left != null)
        {
            explore(root.left) ;
        }
        if(root.right != null)
        {
           explore(root.right) ;
        }
    }
    public int aggregateValue(TreeNode root) 
    {
        if(root == null)
        {
            return 0;
        }
        int total = root.val;
        int leftValue = 0;
        int rightValue = 0;
        if(root.left != null)
        {
            leftValue = aggregateValue(root.left); 
        }
        else
        {
            leftValue = 0;
        }
        if(root.right != null)
        {
            rightValue = aggregateValue(root.right) ;
        }
        else
        {
            rightValue = 0;
        }
        return Math.max(Math.max(total,total+leftValue),total+rightValue);
    }
}