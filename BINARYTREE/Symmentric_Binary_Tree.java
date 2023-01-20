// For mirror, in the next level, for a symmetric tree, 
// the node at the root’s left should be equal to the node at the root’s right.

// The algorithm steps can be summarized as follows::

// 1. We take two variables root1 and root2 initially both pointing to the root.
// 2. Then we use any tree traversal to traverse the nodes. 
//     We will simultaneously change root1 and root2 in this traversal function.
// 3. For the base case, if both are pointing to NULL, we return true, 
//     whereas if only one points to NULL and other to a node, we return false.
// 4. If both points to a node, we first compare their value, 
//     if it is the same we check for the lower levels of the tree.
// 5. We recursively call the function to check the root1’s left child with root2’s right child; 
//     then we again recursively check the root1’s right child with root2’s left child.
// 6. When all three conditions ( node values of left and right and two recursive calls) 
//     return true, we return true from our function else we return false.

// traversal left-subtree          root     left    right    
// mirror                  ---------------------------------------
// traversal right-subtree         root    right   left

// Time Complexity  -> O(N)
// Space Complexity -> O(N)

import java.util.*;

class Node {
  int data;
  Node  left,  right;
  Node(int data)
  {
      this.data=data;
      left=null;
      right=null;
  }
}

class Symmetric_Binary_Tree{
    static boolean isSymmetricUtil(Node  root1, Node  root2) {
      if (root1 == null || root2 == null)
        return root1 == root2;

      if (root1.data == root2.data) return false;

      return isSymmetricUtil(root1.left, root2.right) && 
             isSymmetricUtil(root1.right, root2.left);
    }
    static boolean isSymmetric(Node  root) {
      if (root==null) return true;
      return isSymmetricUtil(root.left, root.right);
    }

    public static void main(String args[]) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right = new Node(2);
        root.right.left = new Node(4);
        root.right.right = new Node(3);
      
        boolean res;
        res = isSymmetric(root);
      
        if (res)
          System.out.println("The tree is symmetrical");
        else System.out.println("The tree is NOT symmetrical");
      
      }
      }


    

