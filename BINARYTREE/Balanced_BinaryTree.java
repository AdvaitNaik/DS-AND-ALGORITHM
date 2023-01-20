// Naive approach

// For a Balanced Binary Tree, 
// 1. Check left subtree height and right subtree height for every node present in the tree. 
// 2. Hence, traverse the tree recursively and calculate the height of left and right subtree 
//    from every node, and whenever the condition of Balanced tree violates, simply return false.

// Condition for Balanced Binary Tree
// For all Nodes , Absolute( Left Subtree Height – Right Subtree Height ) <= 1

// Time Complexity -> O(N*N) 
// For every node, Height Function is called which takes O(N) Time. 
// Hence for every node it becomes N*N  

// Space Complexity -> O(1) (Extra Space)  +    O(H) (Recursive Stack Space)
// where “H” is the height of tree

// Bool check(Node){
//     if (Node == null) return true

//     left = findHeightLeft(Node.left)
//     right =  findHeightRight(Node.right)

//     if (abs(left - right) > 1) return false

//     Bool left = check(Node.left)
//     Bool right = check(Node.right)

//     if (!left || !right) return false

//     return true
// }

// ------------------- Post Order Traversal -----------------

// Time Complexity: O(N) 
// Space Complexity: O(1) Extra Space + O(H) Recursion Stack space 
// (Where “H”  is the height of binary tree)

// Approach : 

// 1. Start traversing the tree recursively and do work in Post Order.
// 2. For each call, caculate the height of the root node, and return it to previous calls.  
// 3. Simultaneously, in the Post Order of every node , 
//     Check for condition of balance as information of left and right subtree height is available.
// 4. If it is balanced , simply return height of current node and if not then return -1.
// 5. Whenever the subtree result is -1 , simply keep on returning -1.

class Solution {
    public boolean isBalanced(TreeNode root) {
        return dfsHeight (root) != -1;
    }
    int dfsHeight (TreeNode root) {
        if (root == null) return 0;
        
        int leftHeight = dfsHeight (root.left);
        if (leftHeight == -1) return -1;
        int rightHeight = dfsHeight (root.right);
        if (rightHeight == -1) return -1;
        
        if (Math.abs(leftHeight - rightHeight) > 1)  return -1;
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
