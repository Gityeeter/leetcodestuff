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
    
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        getDiameter(root);
        return diameter;
    }
    public void getDiameter(TreeNode current)
    {
        if(current == null)
        {
            return;
        }
        int leftHeight = new heightCalculator().getHeight(current.left);
        int rightHeight = new heightCalculator().getHeight(current.right);
        int currentDiameter = leftHeight + rightHeight;
        if(current.left != null && current.right != null)
        {
            currentDiameter = leftHeight + rightHeight + 2;
        }
        else if(current.left != null || current.right != null)
        {
            currentDiameter = leftHeight + rightHeight + 1;
        }
        if(currentDiameter > diameter)
        {
            diameter = currentDiameter;
        }
        getDiameter(current.left);
        getDiameter(current.right);
        return;
    }
    public class heightCalculator
    {
        int height = 0;
        public int getHeight(TreeNode root)
        {
            explore(root,0);
            return height;
        }
        public void explore(TreeNode current, int currentHeight)
        {
            if(current == null)
            {
                return;
            }
            if(currentHeight > height)
            {
                height = currentHeight;
            }
            explore(current.left, currentHeight + 1);
            explore(current.right, currentHeight + 1);
        }
    }

}