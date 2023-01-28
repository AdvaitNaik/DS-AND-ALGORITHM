# Time Complexity -> O(N) + O(2E), Where N = Nodes, 2E is for total degrees as 
# we traverse all adjacent nodes.

# Space Complexity: O(3N) ~ O(N), Space for queue data structure visited array and 
# an adjacency list

# 1. In BFS, we start with a “starting” node, mark it as visited, and push it into the queue data structure.
# 2. In every iteration, we pop out the node ‘v’ and put it in the solution vector, 
#     as we are traversing this node.
# 3. All the unvisited adjacent nodes from ‘v’ are visited next and are pushed into the queue.
#     The list of adjacent neighbors of the node can be accessed from the adjacency list.
# 5. Repeat steps 2 and 3 until the queue becomes empty, 
#     and this way you can easily traverse all the nodes in the graph.


# # BFS algorithm in Python
import collections

# BFS algorithm
def bfs(graph, root):

    visited, queue = set() , collections.deque([root])
    visited.add(root)

    while queue:

        # Dequeue a vertex from queue
        vertex = queue.popleft()
        print(str(vertex) + " ", end="")

        # If not visited, mark it as visited, and
        # enqueue it
        for neighbour in graph[vertex]:
            if neighbour not in visited:
                visited.add(neighbour)
                queue.append(neighbour)


if __name__ == '__main__':
    graph = {0: [1, 2], 1: [2], 2: [3], 3: [1, 2]}
    print("Following is Breadth First Traversal: ")
    bfs(graph, 0)
