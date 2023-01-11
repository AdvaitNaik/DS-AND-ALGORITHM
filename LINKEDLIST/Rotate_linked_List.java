// public class Rotate_linked_List {
    
// }

/////////////// BRUTE FORCE //////////////////

// Time Complexity -> O(N*k)
// N -> Number of nodes present in the list
// Reason -> For k times, we are iterating through the entire list to get the last element and 
//         move it to first.

// Space Complexity: O(1)
// Reason -> No extra data structures are used for computations

// Approach:
// We have to move the last element to first for each k.
// For each k, find the last element from the list. Move it to the first.

// class Solution {
//     public ListNode rotateRight(ListNode head, int k) {
//         if (head == null || head.next == null) return head;

//         for (int i = 0; i < k; i++) {
//             ListNode temp = head;
//             while (temp.next.next != null) temp = temp.next;
//             Listnode end = temp.next;
//             temp.next = null;
//             end.next = head;
//             head = end;
//         }
//         return head;
//     }
// }


////////////////// OPTIMAL SOLUTION //////////////////////

// Let’s take an example. 
// head = [1,2,3,4,5] k = 2000000000
// If we see a brute force approach, it will take O(5*2000000000) which is not a good time complexity 
// when we can optimize it.

// 1. We can see that for every k which is multiple of the length of the list, 
//      we get back the original list. Try to operate brute force on any linked list 
//      for k as multiple of the length of the list.

// 2. This gives us a hint that for k greater than the length of the list, 
//      we have to rotate the list for k%length of the list. This reduces our time complexity.

// Steps to the algorithm - 
// 1. Calculate the length of the list.
// 2. Connect the last node to the first node, converting it to a circular linked list.
// 3. Iterate to cut the link of the last node and start a node of k%length of the list rotated list.

// class Solution {
//     public ListNode rotateRight(ListNode head, int k) {
//         if (head == null || head.next == null || k == 0) return head;

//         ListNode temp = head;
//         int length = 1;
//         while(temp.next != null){
//             length = length + 1;
//             temp = temp.next;
//         }

//         temp.next = head;
//         k = k%length;
//         int end = length-k;
//         while(end != 0){
//             temp = temp.next;
//             end = end-1;
//         }
//         head = temp.next;
//         temp.next = null;

//         return head;
//     }
// }