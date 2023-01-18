package BINARYTREE;

// Time Complexity: O(N)
// Space Complexity: O(H)       (H -> Height of the Tree)

// 1. Create an vector data structure inside both the left and the right side view function
// 2. Call for the recursive _left and recursive_right function respectively with the 
//     (root,level,vector). Here level will be initially passed as 0.
// 3. Return the vector.
// 4. Now in the recursive_left function
// 5. If vector size is equal to the level then push_back its node value to the vector data structure.
// 6. Otherwise call recursive_left for (node->left,level+1,vector)
// 7. Call recursive_left for (node->right,level+1,vector)
// 8. Now in the recursive_right function
// 9. If vector size is equal to the level then push_back its node value to the vector data structure.
// 10. Otherwise call recursive_right for (node->right,level+1,vector)
// 11. Call recursive_right for (node->left,level+1,vector)

// public class Right_Left_View {

//     public void rightView(TreeNode current, List<Integer> resultRight, int current_Level){
//         if(current == null){
//             return;
//         }
//         if (current_Level == resultRight.size()){
//             resultRight.add(current.val);
//         }

//         rightView(current.right, resultRight, current_Level + 1);
//         rightView(current.left, resultRight, current_Level + 1);
//     }


//     public void leftView(TreeNode current, List<Integer> resultLeft, int current_Level){
//         if(current == null){
//             return;
//         }
//         if (current_Level == resultLeft.size()){
//             resultLeft.add(current.val);
//         }

//         rightView(current.left, resultLeft, current_Level + 1);
//         rightView(current.right, resultLeft, current_Level + 1);
//     }

//     public List<Integer> SideView(TreeNode root) {
//         List<Integer> resultLeft = new ArrayList<Integer>();
//         List<Integer> resultRight = new ArrayList<Integer>();
//         leftView(root, resultLeft , 0);
//         rightView(root, resultRight, 0);
//         System.out.println(resultLeft);
//         System.out.println(resultRight);
//     }
// }
