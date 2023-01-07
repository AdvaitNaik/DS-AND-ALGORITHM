// Time Complexity -> O(N) 
//  where N represents the number of nodes.
//  move to the end of the list and achieve our reversed list.

// Space Complexity -> O(1)
//  Apart from recursion using stack space, no external storage is used.

// SOLUTION - https://takeuforward.org/data-structure/reverse-a-linked-list/

// We will use three-pointers to traverse through the entire list and interchange links between nodes. 
// One pointer to keep track of the current node in the list. 
// The second one is to keep track of the previous node to the current node and change links. 
// Lastly, a pointer to keep track of nodes in front of current nodes.

// STEP 1 ->

// currrent_p is a pointer to keep track of current nodes. Set it to head.
// prev_p is a pointer to keep track of previous nodes. Set it to NULL.
// next_p is a pointer to keep track of the next nodes.

// STEP 2 ->

// Set next_p to point next node to node pointed by current_p.
// Change link between nodes pointed by current_p and prev_p.
// Update prev_p to current_p and current_p pointer to next_p.
// Perform STEP 2 until current_p reaches the end of the list.

// STEP 3 ->

// Set head as prev_p. This makes the head point at the last node.


// class Solution {
//     public ListNode reverseList(ListNode head) {
//         ListNode newHead = null;
//         while (head != null) {
//             ListNode next = head.next;
//             head.next = newHead;
//             newHead = head;
//             head = next;
//         }
//         return newHead;
//     }
// }