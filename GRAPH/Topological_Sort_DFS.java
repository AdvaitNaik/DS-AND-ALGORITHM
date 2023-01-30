package GRAPH;
import java.util.*;

// Link - https://takeuforward.org/data-structure/topological-sort-using-dfs/

// 1. Visited Vector – To store visit of each vertex
// 2. Stack – To maintain the topo sort order.
// 3. Dfs call will go from u to v. The 1st dfs (v) will get over first and then dfs(u). 
//      if u->v, then we will first push v into the stack and then u will be pushed. 
//      This is how Topological order is maintained in the Stack.

public class Topological_Sort_DFS {
    static void findTopoSort(int node, int vis[], ArrayList<ArrayList<Integer>> adj, Stack<Integer> st) {
        vis[node] = 1; 
        for(Integer it: adj.get(node)) {
            if(vis[it] == 0) {
                findTopoSort(it, vis, adj, st); 
            } 
        }
        st.push(node); 
    }
    static int[] topoSort(int N, ArrayList<ArrayList<Integer>> adj) {
        Stack<Integer> st = new Stack<Integer>(); 
        int vis[] = new int[N]; 
        
        for(int i = 0;i<N;i++) {
            if(vis[i] == 0) {
                findTopoSort(i, vis, adj, st);
            }
        }
        
        int topo[] = new int[N];
        int ind = 0; 
        while(!st.isEmpty()) {
            topo[ind++] = st.pop();
        }
        // for(int i = 0;i<N;i++) System.out.println(topo[i] + " "); 
        return topo; 
    }


    public static void main(String args[])
    {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        int n=6;
        for(int i=0;i<n;i++)
        {
            ArrayList<Integer> arr=new ArrayList<>();
            adj.add(arr);
        }
        
        adj.get(5).add(2);
        adj.get(5).add(0);
        adj.get(4).add(0);
        adj.get(4).add(1);
        adj.get(2).add(3);
        adj.get(3).add(1);
        
        int res[] = topoSort(6, adj);
   
        System.out.println("Toposort of the given graph is:" );
        for (int i = 0; i < res.length; i++) {
        System.out.print(res[i]+" ");
        }
    }
    
}


