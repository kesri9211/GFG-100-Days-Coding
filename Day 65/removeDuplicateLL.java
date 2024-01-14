/*Given an unsorted linked list of N nodes. The task is to remove duplicate elements from this unsorted Linked List. When a value appears in multiple nodes, the node which appeared first should be kept, all others duplicates are to be removed.

Example 1:

Input:
N = 4
value[] = {5,2,2,4}
Output: 5 2 4*/
class Solution
{
    //Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) 
    {
          // Your code here
         HashSet<Integer> h=new HashSet<Integer>();
         Node n=head;
         Node p=null;
         while(n!=null){
             if(h.add(n.data)){
                 p=n;
                  n=n.next;
                  //p=p.next;
             }
             else{
                p.next=n.next;
                  n=n.next;
             }
            
         }
         return head;
        
    }
}
