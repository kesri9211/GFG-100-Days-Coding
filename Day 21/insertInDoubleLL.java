//Given a sorted doubly linked list and an element X, your need to insert the element X into correct position in the sorted DLL.

// function should insert a new node in sorted way in
// a sorted doubly linked list
class GfG
{
    public static Node sortedInsert(Node head, int x)
    {
        Node num=new Node(x);
        Node temp=head;
        //when size of LL is one
        if(head.next==null){
            head.next=num;
            num.prev=head;
            return head;
        }
          //Insert at beginning
        if(x<head.data){
            num.next=head;
            head.prev=num;
            return num;
        }
        //find suitable positon and establish relation
        while(temp.next!=null){
            if(x>temp.data)
                temp=temp.next;
            else{
                num.next=temp;
                num.prev=temp.prev;
                temp.prev.next=num;
                temp.prev=num;
                return head;
            }
        }
        //insert at last
        //when temp is at last
        if(x>temp.data){
        num.prev=temp;
        temp.next=num;
        return head;
        }
        //when temp is at second last
        else if(x<temp.data){
            num.next=temp;
            num.prev=temp.prev;
            temp.prev.next=num;
            temp.prev=num;
            return head;
        }
        return null;
    }
}
