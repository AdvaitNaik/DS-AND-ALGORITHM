// Time Complexity -> O(N) + O(E) -> DIRECTED GRAPHS
// Time Complexity -> O(N) + O(2xE) -> UNDIRECTED GRAPHS
// Because for every node we are calling the recursive function once, the time taken is O(N) and 
// 2E is for total degrees as we traverse for all adjacent nodes.

// Space Complexity ->  O(3N) ~ O(N), 
// Space for dfs stack space, visited array and an adjacency list.

// 1. In DFS, we start with a node ‘v’, mark it as visited and store it in the solution vector. 
//     It is unexplored as its adjacent nodes are not visited.
// 2. We run through all the adjacent nodes, and call the recursive dfs function to explore the node ‘v’ 
//     which has not been visited previously. This leads to the exploration of another node ‘u’ 
//     which is its adjacent node and is not visited. 
// 3. The adjacency list stores the list of neighbours for any node. Pick the neighbour list of node ‘v’ 
//     and run a for loop on the list of neighbours (say nodes ‘u’ and ‘w’ are in the list). 
//     We go in-depth with each node. When node ‘u’ is explored completely then it backtracks and 
//     explores node ‘w’.
// 4. This traversal terminates when all the nodes are completely explored. 


package GRAPH;

import java.util.*;

class DFS{
    private LinkedList<Integer> adjLists[];
    private boolean visited[];

    // Graph Creation
    DFS(int vertices) {
        adjLists = new LinkedList[vertices];
        visited = new boolean[vertices];

        for (int i = 0; i < vertices; i++)
            adjLists[i] = new LinkedList<Integer>();
    }

    // Insert Edges
    void addEdges(int src, int dest) {
        adjLists[src].add(dest);
    }
    
    void DepthFirstSearch(int vertex){
        visited[vertex] = true;
        System.out.println(vertex + " ");

        Iterator<Integer> ite = adjLists[vertex].listIterator();
        while(ite.hasNext()) {
            int adj = ite.next();
            if (!visited[adj])
                DepthFirstSearch(adj);
        }
    }

    public static void main(String args[]){
        DFS dfs = new DFS(4);

        dfs.addEdges(0,1);
        dfs.addEdges(0,2);
        dfs.addEdges(1,2);
        dfs.addEdges(2,3);

        System.out.println("Following is Depth First Traversal");

        dfs.DepthFirstSearch(1);
    }
}