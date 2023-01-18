// Preorder Traversal - Left, Root, Right

// Solution 1: Iterative

// Time Complexity: O(N).
// Reason: We are traversing N nodes and every node is visited exactly once.

// Space Complexity: O(N)
// Reason: In the worst case (a tree with just left children), the space complexity will be O(N).

// The algorithm approach can be stated as:

// 1. We first take an explicit stack data structure and set an infinite loop.
// 2. In every iteration we check whether our current node is pointing to NULL or not.
// 3. If it is not pointing to null, we simply push the current value to the stack and 
//     move the current node to its left child.
// 4. If it is pointing to NULL, we first check whether the stack is empty or not. 
//     If the stack is empty, it means that we have traversed the tree and we break out of the loop.
// 5. If the stack is not empty, we pop the top value of the stack, 
//     print it and move the current node to its right child.

package BINARYTREE;
import java.util.*;

class TreeNode{
    int val;
    TreeNode left, right;
    TreeNode(int val){
        this.val = val;
        left = right = null;
    }
}

public class Inorder_Traversal {
    static ArrayList <Integer> InorderTrav(TreeNode root){
        ArrayList <Integer> Inorder = new ArrayList <Integer> ();
        Stack <TreeNode> st = new Stack <TreeNode> ();

        while(true){
            if (root != null){
                st.push(root);
                root = root.left;
            } else {
                if (st.isEmpty()) break;
                root = st.peek();
                Inorder.add(root.val);
                st.pop();
                root = root.right;
            }
        }
        return Inorder;
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

        ArrayList < Integer > Inorder = new ArrayList < > ();
        Inorder = InorderTrav(root);

        System.out.print("The Inorder Traversal is : ");
        for (int i = 0; i < Inorder.size(); i++) {
            System.out.print(Inorder.get(i) + "->");
        }
    }
    
}

// Solution 2: Recursive

// The algorithm approach can be stated as:
// 1. We first recursively visit the left child and go on till we find a leaf node.
// 2. Then we print that node value.
// 3. Then we recursively visit the right child.
// 4. If we encounter a node pointing to NULL, we simply return to its parent.

// # Definition for a binary tree node.
// # class TreeNode:
// #     def __init__(self, val=0, left=None, right=None):
// #         self.val = val
// #         self.left = left
// #         self.right = right

// class Solution:
//     def inorderTraversalRecursive(self, root: Optional[TreeNode], inorder: List[int]) -> List[int]:
//         if (root == None):
//             return
        
//         self.inorderTraversalRecursive(root.left, inorder)
//         inorder.append(root.val)
//         self.inorderTraversalRecursive(root.right, inorder)

//         return inorder


//     def inorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
//         inorder = []
//         return self.inorderTraversalRecursive(root,  inorder)
