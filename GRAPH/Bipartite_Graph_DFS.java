package GRAPH;
import java.util.*;

// Time Complexity: O(V + 2E), 
// Where V = Vertices, 2E is for total degrees as we traverse all adjacent nodes.

// Space Complexity: O(3V) ~ O(V), 
// Space for DFS stack space, colour array and an adjacency list.

// Bipartite Graph - If we are able to colour a graph with two colours such that no adjacent nodes have the same colour, 
//     it is called a bipartite graph.

// Important
// 1. A bipartite graph is a graph which can be coloured using 2 colours such that no adjacent nodes have the same colour. 
// 2. Any linear graph with no cycle is always a bipartite graph. 
// 3. With a cycle, any graph with an even cycle length can also be a bipartite graph. 
// 4. So, any graph with an odd cycle length can never be a bipartite graph.

// DFS is a traversal technique which involves the idea of recursion and backtracking. 
// DFS goes in-depth, i.e., traverses all nodes by going ahead, and when there are no further nodes to traverse in the current path, 
// then it backtracks on the same path and traverses other unvisited nodes. 

// 1. For DFS traversal, we need a start node and a visited array but in this case, instead of a visited array, 
//     we will take a colour array where all the nodes are initialised to -1 indicating they are not coloured yet.
// 2. In the DFS function call, make sure to pass the value of the assigned colour, and assign the same in the colour array. 
//     We will try to colour with 0 and 1, but you can choose other colours as well. We will start with the colour 0, 
//     you can start with 1 as well, just make sure for the adjacent node, it should be opposite of what the current node has. 
// 3. In DFS traversal, we travel in-depth to all its uncoloured neighbours using the adjacency list. 
//     For every uncoloured node, initialise it with the opposite colour to that of the current node.
// 4. If at any moment, we get an adjacent node from the adjacency list which is already coloured and 
//     has the same colour as the current node, we can say it is not possible to colour it, hence it cannot be bipartite. 
//     Thereby return a false indicating the given graph is not bipartite; otherwise, keep on returning true.

public class Bipartite_Graph_DFS {

    private boolean dfsBipartiteGraph(int node, int col, int color[], ArrayList<ArrayList<Integer>>adj) {
        
        color[node] = col; 
        
        // traverse adjacent nodes
        for(int it : adj.get(node)) {
            // if uncoloured
            if(color[it] == -1) {
                if(dfsBipartiteGraph(it, 1 - col, color, adj) == false) return false; 
            }
            // if previously coloured and have the same colour
            else if(color[it] == col) {
                return false; 
            }
        }
        
        return true; 
    }

    public boolean isBipartite(int V, ArrayList<ArrayList<Integer>>adj)
    {
        int color[] = new int[V];
	    for(int i = 0;i<V;i++) color[i] = -1; 
	    
	    // for connected components
	    for(int i = 0;i<V;i++) {
	        if(color[i] == -1) {
	            if(dfsBipartiteGraph(i, 0, color, adj) == false) return false; 
	        }
	    }
	    return true; 
    }

    public static void main(String[] args)
    {
        // V = 4, E = 4
        ArrayList < ArrayList < Integer >> adj = new ArrayList < > ();
        for (int i = 0; i < 4; i++) {
            adj.add(new ArrayList < > ());
        }
        adj.get(0).add(2);
        adj.get(2).add(0);
        adj.get(0).add(3);
        adj.get(3).add(0);
        adj.get(1).add(3);
        adj.get(3).add(1);
        adj.get(2).add(3);
        adj.get(3).add(2);

        Bipartite_Graph_DFS obj = new Bipartite_Graph_DFS();
        boolean ans = obj.isBipartite(4, adj);
        if(ans)
            System.out.println("Bipartite");
        else System.out.println("Non Bipartite");
    }
    
}
