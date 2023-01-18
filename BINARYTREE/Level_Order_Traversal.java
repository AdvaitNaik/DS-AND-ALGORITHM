package BINARYTREE;

public class Level_Order_Traversal {}

// The algorithm steps are stated as:
// 1. Take a queue data structure and push the root node to the queue.
// 2. Set a while loop which will run till our queue is non-empty.
// 3. In every iteration, pop out from the front of the queue and assign it to a variable (say temp).
// 4. If temp has a left child, push it to the queue.
// 5. If temp has a right child, push it to the queue.
// 6. At last push the value of the temp node to our “ans” data structure.

// Time Complexity -> O(N)
// Space Complexity-> O(N)


// class Solution {
//     public List<Integer> levelOrder(TreeNode root) {
        
//         Queue<TreeNode> queue = new LinkedList<TreeNode>();
//         List<Integer> ans = new List<Integer>();
        
//         if(root == null) return ans;
        
//         queue.offer(root);
//         while(!queue.isEmpty()){
            
//             if(queue.peek().left != null) 
//                 queue.offer(queue.peek().left);
                
//             if(queue.peek().right != null) 
//                 queue.offer(queue.peek().right);
                
//             ans.add(queue.poll().val);
//         }
//         return ans;
//     }
// }

// 1. First we need to declare a 2d array to store our answer
//     ( vector<vector<int>> in C++ and List<List<int>> in Java).
// 2. Inside the while loop, first we declare a list to store nodes of a level (say level), 
//     then we need to set another for loop, which iterates for the size of the queue and 
//     inside this for loop we need to write the logic which we had discussed in the first approach
// 3. The for loop ensures that all the nodes of a particular level are inserted together and 
//     when the iteration of the for loop ends, the queue contains the elements of only one level 
//     at a time.
// 4. Inside the for loop we push the value of temp to ‘level’.
// 5. After the for loop ends, we push ‘level’ to the answer.

// class Solution {
//     public List<List<Integer>> levelOrder(TreeNode root) {
        
        
//         List<List<Integer>> ans = new LinkedList<>();
        
//         if(root == null) return ans;

//         Queue<TreeNode> queue = new LinkedList<TreeNode>();
//         queue.add(root);
//         while(!queue.isEmpty()){
//             int NodeLevel = queue.size();
//             List<Integer> subList = new ArrayList<>();
               
//             for (int i = 0; i < NodeLevel; i++){
//                 TreeNode current = queue.poll();
//                 subList.add(current.val);
//                 if(current.left != null) queue.add(current.left);
//                 if(current.right != null) queue.add(current.right);
                
//             }
//             ans.add(subList);
//         }
//         return ans;
//     }
// }