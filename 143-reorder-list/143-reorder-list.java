/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        ArrayList<ListNode> list = new ArrayList<ListNode>();
        ListNode current = head;
        while(current!= null)
        {
            list.add(current);
            current = current.next;
        }
        
        for(int i =0; i < list.size()/2;i++)
        {
            if(i == list.size()/2 - 1)
            {
             list.get(i).next = list.get(list.size() - 1 - i);
             list.get(list.size() - 1 - i).next = null;
             if(list.size() % 2 != 0)
              {
                list.get(list.size() - 1 - i).next = list.get(list.size()/2);
                list.get(list.size()/2).next = null;
              }
            }
            else
            {
            list.get(i).next = list.get(list.size() - 1 - i);
            list.get(list.size() - 1 - i).next = list.get(i + 1);
            }   
        }
        /*
        ListNode current2 = head;
        if(list.size() % 2 != 0)
        {
            while(current2.next!= null)
            {
                current2 = current2.next;
            }
            current2.next = list.get(list.size()/2 + 1);
        }
       */
         /*
        ListNode current3 = head;
        for(int i =0; i < 15;i++)
        {
            System.out.print(current3.val+",");
            current3 = current3.next;
        }
         */
    }
}