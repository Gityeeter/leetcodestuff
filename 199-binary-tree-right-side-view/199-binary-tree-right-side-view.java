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
    List<Integer> answer = new ArrayList<Integer>();
    HashSet<Integer> heights = new HashSet<>();
    public List<Integer> rightSideView(TreeNode root) {
        if(root == null)
        {
            return answer;
        }
        TreeNode current = root;
        recurse(current,0);
        return answer;
        
    }
    public void recurse(TreeNode current, int height)
    {
        if(!heights.contains(height))
        {
            answer.add(current.val);
            heights.add(height);
        }
        if(current.right != null)
        {
            recurse(current.right,height + 1);
        }
        if(current.left != null)
        {
            recurse(current.left,height + 1);
        }
    }
}