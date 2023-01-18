
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
// class Solution {
//     public void deleteNode(ListNode node) {
//         node.val = node.next.val
//         node.next = node.next.next
//     }
// }


// Approach 1: Iterative Solution without using a Previous Pointer
// Time Complexity: O(N) --> Each Node in the list is visited once.
// Space Complexity: O(1) --> Contant space is used for this solution
// class Solution {
//     public ListNode removeElements(ListNode head, int val) {
//         if (head == null) {
//             return null;
//         }

//         ListNode dummy = new ListNode();
//         dummy.next = head;
//         ListNode cur = dummy;

//         while (cur.next != null) {
//             if (cur.next.val == val) {
//                 cur.next = cur.next.next;
//                 // Here cannot move cur to cur.next as we need to validate the next node.
//             } else {
//                 cur = cur.next;
//             }
//         }

//         return dummy.next;
//     }
// }

// Approach 2: Iterative Solution using a Previous Pointer
// Time Complexity: O(N) --> Each Node in the list is visited once.
// Space Complexity: O(1) --> Contant space is used for this solution
// class Solution {
//     public ListNode removeElements(ListNode head, int val) {
//         if (head == null) {
//             return null;
//         }

//         ListNode dummy = new ListNode();
//         dummy.next = head;
//         ListNode cur = head;
//         ListNode prev = dummy;

//         while (cur != null) {
//             if (cur.val == val) {
//                 prev.next = cur.next;
//             } else {
//                 prev = cur;
//             }
//             cur = cur.next;
//         }

//         return dummy.next;
//     }
// }