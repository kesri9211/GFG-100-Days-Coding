/*Given two linked lists sorted in increasing order, create a new linked list representing the intersection of the two linked lists. 
The new linked list should be made with without changing the original lists.*/

class Solution
{
   public static Node findIntersection(Node head1, Node head2)
    {
        // code here.
        Node intersection=new Node(0);
        Node ans=intersection;
        if (head1==null || head2==null) return null;
        
        while(head1 != null && head2 != null){
            if(head1.data==head2.data){
                    intersection.next=head1;
                    intersection=intersection.next;
                    head1=head1.next;
                    head2=head2.next;
                }
              //move only one which is smaller
           else if(head1.data<head2.data)head1=head1.next;
           else head2=head2.next;
           
        }
        intersection.next=null;
        return ans.next;
    }
}
