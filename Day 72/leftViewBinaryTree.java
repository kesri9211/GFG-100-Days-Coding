/*Left view of following tree is 1 2 4 8.

          1
       /     \
     2        3
   /  \      /  \
  4     5   6    7
   \
     8   

*/
class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
       
       
         ArrayList<Integer> result = new ArrayList<>();
        leftViewRecursive(root, 1, result);
        return result;
    }

    private void leftViewRecursive(Node node, int level, ArrayList<Integer> result) {
        if (node == null) {
            return;
        }

  
               if (level > result.size()) {
                 result.add(node.data);
        }


        leftViewRecursive(node.left, level + 1, result);
        leftViewRecursive(node.right, level + 1, result);
    }
}
