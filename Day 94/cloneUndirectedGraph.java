/*Given a connected undirected graph with n nodes and m edges, with each node having a distinct label from 0 to n-1, 
create a clone of the graph. Each node in the graph contains an integer val and an array (neighbors) of nodes, containing nodes 
that are adjacent to the current node.

Note: If the user returns a correct copy of the given graph, then the system will print 1; in the case when an incorrect copy
is generated or when the user returns the original node, the system will print 0.

For Example :    

class Node {
    val: integer
    neighbors: List[Node]
}
Example 1:

Input:
adjList = 
{
    {1, 3},
    {0, 2},
    {1, 3},
    {0, 2}
}
Output: 1
Explanation:
1 is the output that the driver code will print in case 
you successfully cloned the given graph.*/
class Solution{
    Node cloneGraph(Node node){
        HashMap<Integer, Node> hm = new HashMap();
        HashSet<Integer> visited = new HashSet();
        Queue<Node> q = new LinkedList();
        
        //Initial Adding
        q.add(node);
        hm.put(node.val, new Node(node.val, new ArrayList()));
        
        while(!q.isEmpty()){
            // put node in visited
            Node cur = q.remove();
            visited.add(cur.val);
            ArrayList<Node> neighbours = hm.get(cur.val).neighbors ;
            
            // traverse the entire arraylist
            for(Node n : cur.neighbors){
                if( !visited.contains(n.val)){
                    q.add(n);
                    hm.put(n.val,  new Node(n.val, new ArrayList()));   
                }
                neighbours.add(hm.get(n.val));
            }
        }
        return hm.get(node.val);
    }
}
