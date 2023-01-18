// Postorder Traversal - Left, Root, Right

// Solution 1: Iterative (Two Stack)

// Time Complexity: O(N).
// Reason: We are traversing N nodes and every node is visited exactly once.

// Space Complexity: O(N + N)
// Reason: In the worst case (a tree with just left children), the space complexity will be O(N).

// The algorithm approach can be stated as:
// 1. We take two explicit stacks S1 and S2.
// 2. We insert our node to S1(if it’s not pointing to NULL).
// 3. We will set up a while loop to run till S1 is non-empty.
// 4. In every iteration, we pop out the top of S1 and then push this popped node to S2. 
//     Moreover we will push the left child and right child of this popped node to S1.
//     (If they are not pointing to NULL).
// 5. Then we start the next iteration with the next node as top of S1.
// 6. We stop the iteration when S1 becomes empty.
// 7. At last we start popping at the top of S2 and print the node values, 
//     we will get the postorder traversal.


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

public class Postorder_Traversal {
    
    static ArrayList <Integer> postorderTrav(TreeNode root){
        ArrayList <Integer> postorder = new ArrayList <Integer> ();
        Stack <TreeNode> st1 = new Stack <TreeNode> ();
        Stack <TreeNode> st2 = new Stack <TreeNode> ();
        st1.push(root);
        while(!st1.isEmpty()){
            root = st1.peek();
            st1.pop();
            st2.push(root);
            if (root.left != null)
                st1.push(root.left);
            if (root.right != null)
                st1.push(root.right);
        }
        while(!st2.isEmpty()){
            postorder.add(st2.peek().val);
            st2.pop();
        }
        return postorder;
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

        ArrayList < Integer > Postorder = new ArrayList < > ();
        Postorder = postorderTrav(root);

        System.out.print("The Postorder Traversal is : ");
        for (int i = 0; i < Postorder.size(); i++) {
            System.out.print(Postorder.get(i) + "->");
        }
    }
    
}

// Solution 2: Recursive

// Time Complexity -> O(N).
// Space Complexity -> O(N)

// The algorithm approach can be stated as:
// 1. We first recursively visit the left child and go on left till we find a node pointing to NULL.
// 2. Then we return to its parent.
// 3. Then we recursively visit the right child.
// 4. After we have returned from the right child as well, 
//     only then will we print the  current node value.


// # Definition for a binary tree node.
// # class TreeNode:
// #     def __init__(self, val=0, left=None, right=None):
// #         self.val = val
// #         self.left = left
// #         self.right = right
// class Solution:

//     def postorderTraversalRecursive(self, root: Optional[TreeNode], postorder: List[int]) -> List[int]:
//         if (root == None):
//             return
        
//         self.postorderTraversalRecursive(root.left, postorder)
//         self.postorderTraversalRecursive(root.right, postorder)
//         postorder.append(root.val)

//         return postorder


//     def postorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
//         postorder = []
//         return self.postorderTraversalRecursive(root,  postorder)
