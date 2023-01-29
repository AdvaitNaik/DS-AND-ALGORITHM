package GRAPH;
import java.util.*;

class Node {
    int first;
    int second;
    public Node(int first, int second){
        this.first = first;
        this.second = second;
    }
}

// 1. In the DFS function call make sure to store the parent data along with the source node, 
//     create a visited array, and initialize to 0. The parent is stored so that while 
//     checking for re-visited nodes, we don’t check for parents. 
// 2. We run through all the unvisited adjacent nodes using an adjacency list and call the recursive 
//     dfs function. Also, mark the node as visited.
// 3. If we come across a node that is already marked as visited and is not a parent node, 
//     then keep on returning true indicating the presence of a cycle; 
//     otherwise return false after all the adjacent nodes have been checked and we did not find a cycle.


// Time Complexity -> O(N + 2E) + O(N), 
//     Where N = Nodes, 2E is for total degrees as we traverse all adjacent nodes. 
//     In the case of connected components of a graph, it will take another O(N) time.
// Space Complexity -> O(N) + O(N) ~ O(N), Space for queue data structure and visited array.

class Solution{

    private boolean dfs(int node, int parent, int vis[], ArrayList<ArrayList<Integer>> adj){
        vis[node] =1;

        for (int adjacentNode: adj.get(node)){
            if (vis[adjacentNode] == 0){
                if (dfs(adjacentNode, node, vis, adj) == true)
                    return true;
            }

            else if (adjacentNode != parent) return true;
        }
        return false;
    }

    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj){
        int vis[] = new int[V];

        for (int i = 0; i < V; i++){
            if (vis[i] == 0)
                if (dfs (i, -1, vis, adj) == true)
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