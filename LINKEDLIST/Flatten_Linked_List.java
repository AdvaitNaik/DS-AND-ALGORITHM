// Since each list, followed by the bottom pointer, are in sorted order. 
// Our main aim is to make a single list in sorted order of all nodes. So, we can think of a merge algorithm of merge sort.

// The process to flatten the given linked list is as follows:-

// 1. We will recurse until the head pointer moves null. The main motive is to merge each list from the last.
// 2. Merge each list chosen using the merge algorithm. The steps are
// 3. Create a dummy node. Point two pointers, i.e, temp and res on dummy node. res is to keep track of dummy node and 
//     temp pointer is to move ahead as we build the flattened list.
// 4. We iterate through the two chosen. Move head from any of the chosen lists ahead whose current pointed node is smaller. 
// 5. Return the new flattened list found.

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

// class Flatten_Linked_List {
//     ListNode mergeTwoList(ListNode a, ListNode b) {
//         ListNode temp = new ListNode(0);
//         ListNode res = temp;

//         while (a != null && b != null) {
//             if (a.val <= b.val) {
//                 temp.bottom = a;
//                 temp = temp.bottom;
//                 a = a.bottom;
//             }
//             else {
//                 temp.bottom = b;
//                 temp = temp.bottom;
//                 b = b.bottom;
//             }
//         }
//         if (a != null) temp.bottom = a;
//         else temp.bottom = b;
//         return res.bottom;
//     }

//     ListNode Flatten(ListNode root){
//         if (root == null || root.next == null) return root;

//         root.next = Flatten(root.next);

//         root = mergeTwoList(root, root.next);

//         return root;
//     }
// }