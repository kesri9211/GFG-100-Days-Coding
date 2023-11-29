//Approach: 2 pointer approach
class Solution
{
    //Function to reverse a linked list.
    Node reverseList(Node head)
    {
        // code here
        //reverse the link of node
        Node prev=null;
        Node curr=head;
        Node after=null;
        while(curr!=null){
            after=curr.next;
            curr.next=prev;
            prev=curr;
            curr=after;
        }
        return prev;
    }
}
