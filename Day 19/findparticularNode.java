/*Given a singly linked list and a number k. Write a function to find the (N/k)th element, 
  where N is the number of elements in the list. We need to consider ceil value in case of decimals.*/

//approach: find size of LL then find (size/k)th element by traversing to that node
class GfG
{
    public static int nknode(Node head, int k)
    {
       // add your code here
       int c=0;
       Node temp=head;
       while(temp!=null){
           c++;
           temp=temp.next;
       }
       int ind=(int) Math.ceil((double)c/k);
       while(ind-->1){
           head=head.next;
       }
       return head.data;
    }
}
