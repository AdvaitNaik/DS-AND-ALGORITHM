// ----------- Level Order Traversal -------------

// The depth of the Binary Tree is the number of levels in the binary tree. 
// So, if we simply do a level order traversal on the binary tree and keep a count of the 
// number of levels, it will be our answer.

// Time Complexity: O(N) 
// Space Complexity: O(N) ( Queue data structure)


// ----------- Recursively (Post Order Traversal) -----------

// Time Complexity -> O(N) 
// Space Complexity -> O(1) 
// Extra Space + O(H) Recursion Stack space, where “H”  is the height of the binary tree.

// 1 + max(depth of left subtree, depth of right subtree)

// Approach : 

// 1. We start to travel recursively and do our work in Post Order.
// 2. Reason behind using Post Order comes from our intuition , 
//     that if we know the result of  left and right child then we can calculate the result using that.
// 3. This is exactly an indication of PostOrder, because in PostOrder we already calculated 
//     results for left and right children than we do it for current node.
// 4. So for every node post order, we do Max( left result , right result ) + 1 and 
//     return it to the previous call.
// 5. Base Case is when root == null so we need to return 0;

// class Solution {
//     public int maxDepth(TreeNode root) {
//         if(root == null) return 0; 
        
//         int left = maxDepth(root.left); 
//         int right = maxDepth(root.right); 
        
//         return 1 + Math.max(left, right); 
//     }
// }

