package GRAPH;
import java.util.*;

public class Detect_Cycle_Directed_Graph_BFS{

    private boolean checkCycle(int node, ArrayList<ArrayList<Integer>> adj, int vis[], int dfsvis[]){
        vis[node] = 1;
        dfsvis[node] = 1;

        for (Integer it: adj.get(node)){
            if (vis[it] == 0){
                if (checkCycle(it, adj, vis, dfsvis) == true){
                    return true;
                } 
            } else if (dfsvis[it] == 1){
                return true;
            }
        }
        dfsvis[node] = 0;
        return false;
    }

    public boolean isCycle( int N, ArrayList<ArrayList<Integer>> adj){
        int vis[] = new int[N];
        int dfsvis[] = new int[N];
        
        for (int i = 0; i < N; i++){
            if (vis[i] == 0){
                if (checkCycle(i, adj, vis, dfsvis) == true) return true;
            }
        }
        return false;
    }
    
}


