/*Input:
LinkedList: 3 <--> 4 <--> 5
Output: 5 4 3*/
public static Node reverseDLL(Node  head)
{
    //Your code here
    Node temp=head;
    
    while(temp.next!=null){
        Node t=temp.prev;
        temp.prev=temp.next;
        temp.next=t;
        temp=temp.prev;
    }
    Node t=temp.prev;
    temp.prev=temp.next;
    temp.next=t;
    head=temp;
    
    return head;
}
