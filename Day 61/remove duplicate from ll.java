/*Given a singly linked list consisting of N nodes. The task is to remove duplicates (nodes with duplicate values) from the given list (if exists).
Note: Try not to use extra space. The nodes are arranged in a sorted way.

Example 1:

Input:
LinkedList: 2->2->4->5
Output: 2 4 5
Explanation: In the given linked list 
2 ->2 -> 4-> 5, only 2 occurs more 
than 1 time. So we need to remove it once.*/
class GfG
{
    //Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head)
    {
	// Your code here
	Node slow=head;
	Node fast=head.next;
while(fast!=null){
	    while(fast!=null && slow.data==fast.data){
	        fast=fast.next;
	    }
	    if(fast==null){
	        slow.next=null;
	        return head;
	    }
	    else{
	    slow.next=fast;
	    slow=fast;
	    fast=fast.next;
	    }
}
return head;
    }
}
