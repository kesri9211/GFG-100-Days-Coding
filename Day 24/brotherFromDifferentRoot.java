/*Given two BSTs containing N1 and N2 distinct nodes respectively and given a value x, your task is to complete the function countPairs(),
that returns the count of all pairs of (a, b), where a belongs to one BST and b belongs to another BST, such that a + b = x.

//User function Template for Java

/*Structure of the Node of the BST is as
class Node
{
	int data;
	Node left, right;

	Node(int val) {
		data = val;
		left = right = null;
	}
}
*/
class Solution
{
    public static void traverse(Node root, Set<Integer> arr){
        if(root == null) return ;
        traverse(root.left,arr);
        arr.add(root.data);
        traverse(root.right,arr);
    }
    public static int countPairs(Node root1, Node root2, int x)
    {
        Set<Integer> arr = new HashSet<>();
        traverse(root1,arr);
        return count(root2,arr,x);
    }
    public static int count(Node root, Set<Integer> set,int x){
        int cnt = 0;
        if(root == null) return cnt;
        
        if(set.contains(x-root.data)){
            cnt++;
        }
        
        return cnt+count(root.left,set,x)+count(root.right,set,x);
    }
}
