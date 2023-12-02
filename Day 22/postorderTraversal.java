/* A Binary Tree node
class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */

class Tree
{
    //Function to return a list containing the postorder traversal of the tree.
    ArrayList<Integer> postOrder(Node root)
    {
       // Your code goes here
       if(root==null)
            return new ArrayList<>();
        ArrayList<Integer>arr=new ArrayList<>();
        //step 1- left
        arr.addAll(postOrder(root.left));
        //step 2-right
        arr.addAll(postOrder(root.right));
        //step 3 -root
        arr.add(root.data);
        return arr;
    }
}
