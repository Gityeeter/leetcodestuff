/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    HashMap<Integer,List<Node>> NodesAtHeight= new HashMap<>();
    public Node connect(Node root) {
        if(root == null)
        {
            return null;
        }
        AddtoHeightLists(root,0);
        for(Integer i:NodesAtHeight.keySet())
        {
            List<Node> currentList = NodesAtHeight.get(i);
            for(int j = 0;j< currentList.size() -1; j++ )
            {
                currentList.get(j).next = currentList.get(j+1);
            }
        }
        return root;
    }
    public void AddtoHeightLists(Node current, int currentHeight)
    {
        if(current == null)
        {
            return;
        }
        if(!NodesAtHeight.containsKey(currentHeight + 1))
        {
            NodesAtHeight.put(currentHeight + 1,new ArrayList<Node>());
        }
        if(current.left != null)
        {
            NodesAtHeight.get(currentHeight + 1).add(current.left);
        }
        if(current.left != null)
        {
            NodesAtHeight.get(currentHeight + 1).add(current.right);
        }
        AddtoHeightLists(current.left, currentHeight + 1);
        AddtoHeightLists(current.right, currentHeight + 1);
    }
}