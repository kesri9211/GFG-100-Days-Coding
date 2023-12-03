/*Input:         2
                \
                 81 
               /    \ 
             42      87 
              \       \ 
               66      90 
              / 
            45
X = 87
Output: 1
Explanation: As 87 is present in the
given nodes , so the output will be
1.*/
class BST {
    // Function to search a node in BST.
    boolean search(Node root, int x) {
        // Your code here
        if(root==null)return false;
        if(root.data ==x) return true;
            if(root.data<x){
                //traverse right
                return search(root.right,x);
            }
            else{
                //traverse left
                return search(root.left,x);
            }
    }
}
