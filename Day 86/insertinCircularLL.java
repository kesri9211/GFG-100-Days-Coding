/*Your Task:
The task is to complete the function sortedInsert() which should insert the new node into
the given circular linked list and return the head of the linked list.

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)

Constraints:
0 <= n <= 105
Input:
n = 4
LinkedList = 1->4->7->9
(the first and last node is connected, i.e. 9 --> 1)
data = 5
Output: 
1 4 5 7 9
Explanation:
We can add 5 after the second node.
*/
class Solution {
    public Node sortedInsert(Node head, int data) {
        // code here
         if (head == null) {
            Node newNode = new Node(data);
            newNode.next = newNode;
            return newNode;
        }
        
        Node temp=head;
        Node dnode= new Node(data);
        if(data==0)return dnode;
       //insert at first position
      if(temp.data>=data){
          dnode.next=head;
          while(temp.next!=head) temp=temp.next;
          temp.next=dnode;
          return dnode;
      }
        while(temp.next!=head){
            if(data>temp.next.data){
                temp=temp.next;
            }
            else{
                dnode.next=temp.next;
                temp.next=dnode;
                return head;
            }
        }
        //insert at last positon 
        dnode.next=temp.next;
        temp.next=dnode;
        return head;
    }
}
