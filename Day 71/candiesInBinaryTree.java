/*Given a binary tree with N nodes, in which each node value represents number of candies present at that node. In one move, one may choose two adjacent nodes and move only one candy from one node to another (the move may be from parent to child, or from child to parent.) 
The task is to find the number of moves required such that every node has exactly one candy.
Note that the testcases are framed such that it is always possible to achieve a configuration in which every node has exactly one candy, after some moves.

Example 1:

Input :      3
           /   \
          0     0 
Output : 2
Explanation: 
From the root of the tree, we move one 
candy to its left child, and one candy to
its right child.*/
class Solution
{
    static int totalMoves;

    public static int distributeCandy(Node root) {
        totalMoves = 0;
        distribute(root);
        return totalMoves;
    }

    private static int distribute(Node node) {
        if (node == null) {
            return 0;
        }
        // Post-order traversal: first deal with left and right children
        int left = distribute(node.left);
        int right = distribute(node.right);

        // Calculate total moves
        totalMoves += Math.abs(left) + Math.abs(right);

        // Return excess or deficit of candies to parent
        return node.data - 1 + left + right;
    }
}
