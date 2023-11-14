/*Given two sorted linked lists consisting of N and M nodes respectively.
  The task is to merge both of the list (in-place) and return head of the merged list.*/

class LinkedList
{
    //Function to merge two sorted linked list.
    Node sortedMerge(Node head1, Node head2) {
     // This is a "method-only" submission. 
     // You only need to complete this method

     Node temp=new Node(0);
     Node ans=temp;
     while(head1!=null && head2!=null){
        if(head1.data<head2.data){
             temp.next=head1;
             head1=head1.next;
             temp=temp.next;
            }
        else{
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
     }
     if(head1!=null)temp.next=head1;
     if(head2 !=null)temp.next=head2;
     return ans.next;
   } 
}
