// Preorder Traversal - Root, Left, Right. 

// Solution 1: Iterative

// Time Complexity -> O(N).
// Reason: We are traversing N nodes and every node is visited exactly once.

// Space Complexity -> O(N)
// Reason: In the worst case,(a tree with every node having a single right child and left-subtree), 
// the space complexity can be considered as O(N).

// The algorithm approach can be stated as:

// 1. We first take an explicit stack data structure and push the root node to it.
//     (if the root node is not NULL).
// 2. Then we use a while loop to iterate over the stack till the stack remains non-empty.
// 3. In every iteration we first pop the stack’s top and print it. 
// 4. Then we first push the right child of this popped node and then push the left child, 
//     if they are not NULL. We do so because stack is a last-in-first-out(LIFO) data structure. 
//     We need to access the left child first, so we need to push it at the last.
// 5. The execution continues and will stop when the stack becomes empty. 
//     In this process, we will get the preorder traversal of the tree.

package BINARYTREE;

// import java.util.ArrayList;
// import java.util.Stack;
import java.util.*;

class TreeNode{
    int val;
    TreeNode left, right;
    TreeNode(int val){
        this.val = val;
        left = right = null;
    }
}

public class Preorder_Traversal {

    static ArrayList <Integer> preOrderTrav(TreeNode root){
        ArrayList <Integer> preOrder = new ArrayList <Integer> ();
        if (root == null)
            return preOrder;

        Stack <TreeNode> st = new Stack <TreeNode> ();
        st.push(root);

        while(!st.isEmpty()){
            TreeNode topNode = st.peek();
            preOrder.add(topNode.val);
            st.pop();
            if (topNode.right != null)
                st.push(topNode.right);
            if (topNode.left != null)
                st.push(topNode.left);
        }
        return preOrder;

        }
 

    public static void main(String args[]){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.left = new TreeNode(8);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.right.right.left = new TreeNode(9);
        root.right.right.right = new TreeNode(10);

        ArrayList < Integer > preOrder = new ArrayList < > ();
        preOrder = preOrderTrav(root);

        System.out.print("The preOrder Traversal is : ");
        for (int i = 0; i < preOrder.size(); i++) {
            System.out.print(preOrder.get(i) + "->");
        }
    }
}


// Solution 2: Recursive

// Time Complexity -> O(N).
// Reason: We are traversing N nodes and every node is visited exactly once.

// Space Complexity -> O(N)
// Reason: Space is needed for the recursion stack. In the worst case (skewed tree), 
// space complexity can be O(N).

// The algorithm approach can be stated as:

// 1. We first visit the root node and before visiting its children we print its value.
// 2. After this, we recursively visit its left child.
// 3. Then we recursively visit the right child.
// 4. If we encounter a node pointing to NULL, we simply return to its parent.

// # Definition for a binary tree node.
// # class TreeNode:
// #     def __init__(self, val=0, left=None, right=None):
// #         self.val = val
// #         self.left = left
// #         self.right = right
// class Solution:
//     def preorderTraversalRecursive(self, root: Optional[TreeNode], preorder: List[int]) -> List[int]:
//         if (root == None):
//             return
//         preorder.append(root.val)
//         self.preorderTraversalRecursive(root.left, preorder)
//         self.preorderTraversalRecursive(root.right, preorder)

//         return preorder


//     def preorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
//         preorder = []
//         return self.preorderTraversalRecursive(root,  preorder)
        



