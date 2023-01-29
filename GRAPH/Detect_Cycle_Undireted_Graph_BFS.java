package GRAPH;
import java.util.*;


// 1. Queue: Define a queue and insert the source node along with parent data (<source node, parent>). 
//     For example, (2, 1) means 2 is the source node and 1 is its parent node.
// 2. Visited array: an array initialized to 0 indicating unvisited nodes.  
//     The algorithm steps are as follows:

// 1. For BFS traversal, we need a queue data structure and a visited array. 
// 2. Push the pair of the source node and its parent data (<source, parent>) in the queue, 
//     and mark the node as visited. The parent will be needed so that we don’t do 
//     a backward traversal in the graph, we just move frontwards. 
// 3. Start the BFS traversal, pop out an element from the queue every time and travel to all its 
//     unvisited neighbors using an adjacency list.
// 4. Repeat the steps either until the queue becomes empty, or a node appears to be already visited 
//     which is not the parent, even though we traveled in different directions during the traversal, 
//     indicating there is a cycle.
// 5. If the queue becomes empty and no such node is found then there is no cycle in the graph.

// Time Complexity -> O(N + 2E) + O(N), 
//     Where N = Nodes, 2E is for total degrees as we traverse all adjacent nodes. 
//     In the case of connected components of a graph, it will take another O(N) time.
// Space Complexity -> O(N) + O(N) ~ O(N), Space for queue data structure and visited array.

class Node {
    int first;
    int second;
    public Node(int first, int second){
        this.first = first;
        this.second = second;
    }
}


class Solution{

    static boolean checkForCycle(ArrayList<ArrayList<Integer>> adj, int s, boolean vis[], int parent[]){
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(s, -1));
        vis[s] = true;

        while(!q.isEmpty()){

            // source node and its parent node
            int node = q.peek().first;
            int par = q.peek().second;
            q.remove();

            // go to all the adjacent nodes
            for(Integer it: adj.get(node)){
                if (vis[it] == false){
                    q.add(new Node(it, node));
                    vis[it] = true;
                }

                // if adjacent node is visited and is not its own parent n
                else if (par != it) return true;
            }
        }
        return false;
    }

    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj){
        boolean vis[] = new boolean[V];
        Arrays.fill(vis, false);
        int parent[] = new int[V];
        Arrays.fill(parent, -1);

        for (int i = 0; i < V; i++){
            if (vis[i] == false)
                if (checkForCycle(adj, i, vis, parent))
                    return true;
        }
        return false;
        
    }

    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 4; i++){
            adj.add(new ArrayList<>());
        }

        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(3).add(3);
        adj.get(3).add(2);

        Solution obj = new Solution();
        boolean ans = obj.isCycle(4, adj);

        if (ans)
            System.out.println("True");
        else
            System.out.println("False");
    }
    
}