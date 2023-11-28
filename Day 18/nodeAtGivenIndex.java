class GfG
{
   
    public static int getNth(Node node, int ind)
    {
       //Your code here
       while(ind-->1){
           node=node.next;
       }
       return node.data;
    }
}
