/*Given a linked list of N nodes such that it may contain a loop.
A loop here means that the last node of the link list is connected to the node at position X(1-based index).
If the link list does not have any loop, X=0.Remove the loop from the linked list, if it is present, 
i.e. unlink the last node which is forming the loop.

Example 1:
Input:
N = 3
value[] = {1,3,4}
X = 2
Output: 1
Explanation: The link list looks like
1 -> 3 -> 4
     ^    |
     |____|    
A loop is present. If you remove it 
successfully, the answer will be 1. */
class Solution
{
    //Function to remove a loop in the linked list.
    public static void removeLoop(Node head){
        // code here
        // remove the loop without losing any nodes
        if(head==null)
        return;
        Node slow=head;
        Node fast=head;
        int f=0;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
             if(fast==slow){
             f=1;
             break;
             }
        }
      if(fast==null || fast.next==null)
      return;
      slow=head;
        while(fast!=slow){
            fast=fast.next;
            slow=slow.next;
        }
      while(slow!=fast.next){
          fast=fast.next;
      }
      fast.next=null;
    }
}
