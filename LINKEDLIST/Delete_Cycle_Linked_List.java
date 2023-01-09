// public class Delete_Cycle_Linked_List {
    
// }


// Hashing

// Time Complexity -> O(N)
// Reason: Entire list is iterated once.

// Space Complexity -> O(N)
// Reason: All nodes present in the list are stored in a hash table.

// Approach: We need to keep track of all the nodes we have visited till now so that once we visit the 
// same node again we can say that a cycle is detected. The process is as follows:

// 1. Use a hash table for storing nodes. 
// 2. Start iterating through the lists.
// 3. If the current node is present in the hash table already, 
//     this indicates the cycle is present in the linked list and returns true.
// 4. Else move insert the node in the hash table and move ahead.
// 5. If we reach the end of the list, which is NULL, 
//     hen we can say that the given list does not have a cycle in it and hence we return false.

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
// public class Solution {
//     public boolean hasCycle(ListNode head) {
//         HashSet <ListNode> hashTable = new HashSet<>();
//         while (head != null){
//             if(hashTable.contains(head)) return true;
//             hashTable.add(head);
//             head = head.next;
//         }
//         return false;
//     }
// }

// Slow and Faster Pointer
// Approach:
// We will use two pointers with different steps forward. The process is as follows:-

// 1. We will take two pointers, namely fast and slow. Fast pointer takes 2 steps ahead and 
//     slow pointer takes 2 points ahead.
// 2. Iterate through the list until the fast pointer is equal to NULL. 
//     This is because NULL indicates that there is no cycle present in the given list.
// 3. Cycle can be detected when fast and slow pointers collide.

// public class Solution {
//     public boolean hasCycle(ListNode head) {
        // if (head == null || head.next == null) return false;
        // ListNode fast = head;
        // ListNode slow = head;
        // while (fast.next != null && fast.next.next != null){
        //     fast = fast.next.next;
        //     slow = slow.next;
        //     if (fast == slow) return true;
        // }
        // return false;
//     }
// }