/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) 
    {
       List<TreeNode> qpath = new PathFinder().FindNodePath(root,q);
       List<TreeNode> ppath = new PathFinder().FindNodePath(root,p);
        
       int LastIndex = Math.min(qpath.size(),ppath.size()) - 1;
       int q_value = qpath.get(LastIndex).val;
       int p_value = ppath.get(LastIndex).val;
       while(q_value != p_value)
       {
           LastIndex--;
       q_value = qpath.get(LastIndex).val;
       p_value = ppath.get(LastIndex).val;
       }
      
        return qpath.get(LastIndex);
         /*
        for(int i =0; i< qpath.size();i++)
        {
            System.out.print(qpath.get(i).val + ",");
        }
        for(int i =0; i< ppath.size();i++)
        {
            System.out.print(ppath.get(i).val + ",");
        }
         return null;
        */
       
    }
    public class PathFinder
    {
        List<TreeNode> path = new ArrayList<TreeNode>();
        public List<TreeNode> FindNodePath(TreeNode current, TreeNode target)
        {
            if(current.val == target.val)
            {
                path.add(current);
                return path;
            }
            if(target.val > current.val)
            {
                path.add(current);
               return FindNodePath(current.right,target);
            }
            else
            {
                path.add(current);
               return FindNodePath(current.left,target);
            }
        }
    }
    
}