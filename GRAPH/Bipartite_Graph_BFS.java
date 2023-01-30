package GRAPH;

import java.util.*;
import java.util.Queue;

public class Bipartite_Graph_BFS {

    private boolean check(int start, int V, ArrayList<ArrayList<Integer>> adj, int color[]){
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(start);
        color[start] = 0;

        while(!q.isEmpty()){
            int node = q.peek();
            q.remove();

            for (int it : adj.get(node)) {
                // if the adjacent node is yet not colored you will give opposite color of the node
                if (color[it] == -1){
                    color[it] = 1-color[node];
                    q.add(it); 
                }
                // if the adjacent guy having the same color someone did color it on some other path
                else if (color[it] == color[node]){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isBipartite(int V, ArrayList<ArrayList<Integer>> adj){
        int color[] = new int[V];
        for (int i = 0; i < V; i++){
            color[i] = -1;
        }

        // Graph Component
        for (int i = 0; i < V; i++){
            if (color[i] == -1) {
                if (check(i, V, adj, color) == false) {
                    return false;
                }
            }
        }
        return true;
    }
}
