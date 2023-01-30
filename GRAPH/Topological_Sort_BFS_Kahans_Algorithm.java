package GRAPH;
import java.util.*;
import java.io.*;
import java.lang.*;

// Link - https://takeuforward.org/data-structure/topological-sort-bfs/
// Link - https://takeuforward.org/data-structure/detect-a-cycle-in-directed-graph-topological-sort-kahns-algorithm-g-23/

// Directed Acyclic Graph (DAG)
// Undirected graph we can’t decide which node will come first because there will be no direction, 
// and if there is a cycle topological order will not be possible

// Learning Ordering of vertices such that if there is a edge between u & v, u appears before v 
// in that ordering

// Intuition - 
// 1. Start from a node that doesn’t have any previous edges
// 2. Use the concept of in-degree (Number of edges pointing toward a node). 
//     We find an in-degree which has indegree=0 and we start from this. 

// Approach:
// 1. In order to maintain the In-degree of each and every node, we take an array of size v 
//     ( where v is the number of nodes).
// 2. Find in-degree of all nodes and fill them in an array
// 3. Now take Queue data structure and add nodes that have in-degree is 0 
//     and simply apply bfs on queue with some condition.
// 4. Take the top/peek node from Queue ( let the popped node be x), add this x to our answer. 

// 5. We’ll apply some conditions to the BFS:
// 6. Now take neighbour nodes of popped nodes and reduce their in-degree by 1.
// 7. Check if any of the popped element nodes in degree becomes 0, after reducing in-degree by 1 
//     if it happens then add this neighbour element to the queue for which the in-degree became zero.
// 8. Repeat step 4 till the queue becomes empty.

class SolutionTopologicalSort {
    public boolean isCyclic(int N, ArrayList<ArrayList<Integer>> adj) {

        int indegree[] = new int[N];

        //finding indegree
        for(int i = 0;i<N;i++) {
            for(Integer it: adj.get(i)) {
                indegree[it]++;
            }
        }

        Queue<Integer> q = new LinkedList<Integer>();
        for(int i = 0;i<N;i++) {
            //adding nodes to queue with indegree = 0
            if(indegree[i] == 0) {
                q.add(i);
            }
        }

        int topo[] = new int[N];
        int ind=0;
        int cnt = 0;

        while(!q.isEmpty()) {
            Integer node = q.peek();
            q.remove();
            topo[ind++] = node;
            cnt++;

            //getting neighbour nodes of popped node and decreasing  their indegree by 1
            for(Integer it: adj.get(node)) {
                indegree[it]--;
                if(indegree[it] == 0) {
                    q.add(it);
                }
            }
        }
        for (int i=0;i< topo.length;i++){
            System.out.print(topo[i]+" ");
        }
        if(cnt == N) return false;
        return true;

    }

}

public class Topological_Sort_BFS_Kahans_Algorithm {
    public static void main(String args[]) {
        ArrayList < ArrayList < Integer >> adj = new ArrayList < > ();

        // adding new arraylists to 'adj' to add neighbour nodes
        for (int i = 0; i < 6; i++) {
                adj.add(new ArrayList < > ());
        }


        adj.get(5).add(2);
        adj.get(5).add(0);
        adj.get(4).add(0);
        adj.get(4).add(1);
        adj.get(3).add(1);
        adj.get(2).add(3);


        new  SolutionTopologicalSort().isCyclic(6,adj);
    }
    
}




