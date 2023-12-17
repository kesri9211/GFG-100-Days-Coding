/*Given a BST and a key K. If K is not present in the BST, Insert a new Node with a value equal to K into the BST.
If K is already present in the BST, don't modify the BST.
Example 1:
Input:
     2
   /   \   
  1     3
K = 4
Output: 
1 2 3 4
Explanation: 
After inserting the node 4
Inorder traversal will be 1 2 3 4.*/
class Solution {
    // Function to insert a node in a BST.
    Node insert(Node root, int key) {
        // your code here
        //insert at last
        if(root==null){
            return new Node(key);
        }
        if(key>root.data){
            //traverse right of root 
            root.right=insert(root.right,key);
        }
        else if(key<root.data){
            //traverse in left of root
            root.left=insert(root.left,key);
        }
            return root;
    }
}
