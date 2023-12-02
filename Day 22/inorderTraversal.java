/* A Binary Tree node

class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */
class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        // Code
        if(root==null){
            return new ArrayList<>();
        }
        ArrayList<Integer>arr=new ArrayList<>();
        //first step -left
        arr.addAll(inOrder(root.left));
        //second step-root
        arr.add(root.data);
        //third step- right
        arr.addAll(inOrder(root.right));
        return arr;
    }
}
