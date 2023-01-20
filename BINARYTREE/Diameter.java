// Naive 

// Time Complexity -> O(N*N) 
// For every node, Height Function is called which takes O(N) time 
// hence for every node it becomes N*N 

// Space Complexity ->  O(1)     +    O(H) 
//                 (Extra Space)   (Recursive Stack Space where “H” is the height of tree)

// Diameter at given Curving Point = Left Height + Right Height 
// Approach : 
// 1. Traverse the tree recursively.
// 2. At every node, calculate height of left and right subtrees.
// 3. Calculate the diameter for every node using the above formula.
// 4. Calculate the maximum of all diameters. 
//     This can be done simply using a variable passed by reference in the recursive calls or 
//     a global static variable.

// public class Solution {
//     public int diameterOfBinaryTree(TreeNode root) {
//         int[] diameter = new int[1];
//         height(root, diameter);
//         return diameter[0];        
//     }

//     private int height(TreeNode node, int[] diameter) {
//         if (node == null) {
//             return 0;
//         }
//         int lh = height(node.left, diameter);
//         int rh = height(node.right, diameter);
//         diameter[0] = Math.max(diameter[0], lh + rh);
//         return 1 + Math.max(lh, rh);
//     }
// }