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