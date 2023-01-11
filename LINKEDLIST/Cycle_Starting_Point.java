// public class Cycle_Starting_Point {
    
// }

//////////////////// HASHING ////////////////////////

// Time Complexity -> O(N) // Reason: Iterating the entire list once.

// Space Complexity -> O(N) // Reason: We store all nodes in a hash table.

// We can store nodes in a hash table so that, if a loop exists, the head will encounter the same node again. 
// This node will be present in the table and hence, we can detect the loop. The steps are:-

// 1. Iterate the given list.
// 2. For each node visited by the head pointer, check if the node is present in the hash table.
// 3. If yes, the loop detected
// 4. If not, insert the node in the hash table and move the head pointer ahead.
// 5. If the head reaches null, then the given list does not have a cycle in it.

// public class Solution {
//     public ListNode detectCycle(ListNode head) {
//         HashSet <ListNode> hashTable = new HashSet<>();
//         while (head != null){
//             if(hashTable.contains(head)) {
//                 return head;
//                 System.out.println(head);
//             }
//             hashTable.add(head); 
//             head = head.next;
//         }
//         return null;
//     }
// }

///////////////////////// Slow and Fast Pointer Method //////////////////////////////

// Approach:
// The following steps are required:

// 1. Initially take two pointers, fast and slow. The fast pointer takes two steps ahead while 
//     the slow pointer will take a single step ahead for each iteration.
// 2. We know that if a cycle exists, fast and slow pointers will collide.
// 3. If the cycle does not exist, the fast pointer will move to NULL
// 4. Else, when both slow and fast pointer collides, it detects a cycle exists.
// 5. Take another pointer, say entry. Point to the very first of the linked list.
// 6. Move the slow and the entry pointer ahead by single steps until they collide. 
// 7. Once they collide we get the starting node of the linked list.
// 8. But why use another pointer, or entry?

// Let’s say a slow pointer covers the L2 distance from the starting node of the cycle until it 
// collides with a fast pointer. 
// L1 is the distance traveled by the entry pointer to the starting node of the cycle. 
// So, in total, the slow pointer covers the L1+L2 distance. 
// We know that a fast pointer covers some steps more than a slow pointer. 
// Therefore, we can say that a fast pointer will surely cover the L1+L2 distance. 
// Plus, a fast pointer will cover more steps which will accumulate to nC length 
// where cC is the length of the cycle and n is the number of turns. 
// Thus, the fast pointer covers the total length of L1+L2+nC. 

// We know that the slow pointer travels twice the fast pointer. So this makes the equation to

// 2(L1+L2) = L1+L2+nC. 
// This makes the equation to L1+L2 = nC. Moving L2 to the right side
// L1 = nC-L2 and this shows why the entry pointer and the slow pointer would collide.

// public class Solution {
//     public boolean hasCycle(ListNode head) {
//         if (head == null || head.next == null) return false;
//         ListNode fast = head;
//         ListNode slow = head;
//         ListNode entry = head;
//         while (fast.next != null && fast.next.next != null){
//             fast = fast.next.next;
//             slow = slow.next;
//             if (fast == slow) {
//                 while (slow != entry) {
//                     slow = slow.next;
//                     entry = entry.next;
//                 }
//                 return slow;
//             }
//         }
//         return null;
//     }
// }

