/*Input:
        1      
      /          
    4    
  /    \   
4       2
Output: 1 4 4 2 
  */
// class Node{
//     int data;
//     Node left,right;
//     Node(int d){
//         data=d;
//         left=right=null;
//     }
// }

class BinaryTree
{
    //Function to return a list containing the preorder traversal of the tree.
    static ArrayList<Integer> preorder(Node root)
    {
        // Code here
        if(root==null)
            return new ArrayList<>();
        ArrayList<Integer>arr=new ArrayList<>();
        //step 1
        arr.add(root.data);
        //step 2
        arr.addAll(preorder(root.left));
        //step 3
        arr.addAll(preorder(root.right));
        return arr;
    }

}
