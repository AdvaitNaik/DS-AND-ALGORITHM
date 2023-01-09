// public class Remove_Nth_Node_End_Linked_List {
// }

// Naive Approach [Traverse 2 times]

// Intuition: We can traverse through the Linked List while maintaining a count of nodes, 
// let’s say in the variable count, and then traversing for the 2nd time for (n – count) 
// nodes to get to the nth node of the list.

// class Solution {
//     public ListNode removeNthFromEnd(ListNode head, int target) {
//         int n = 0;
//         ListNode temp = head;
//         while(temp != null){
//             n++;
//             temp = temp.next;
//         }
//         if (n == target){
//             return head.next;
//         }
//         temp = head;
//         for (int i = 0; i < (n-target-1); i++){
//             temp = temp.next;
//         }
//         temp.next = temp.next.next;
//         return head;
//     }
// }

// [Efficient] Two pointer Approach

// Time Complexity -> O(N)
// Space Complexity -> O(1)

// Unlike the above approach, we don’t have to maintain the count value, 
// we can find the nth node just by one traversal by using two pointer approach.

// class Solution {
//     public ListNode removeNthFromEnd(ListNode head, int n) {
//         ListNode temp = head;
//            ListNode fast = temp;
//            ListNode slow = temp;

//         for (int i = 1; i < n; i++){
//             fast = fast.next;
//         }
//             while(fast.next != null){
//                 fast = fast.next;
//                 slow = slow.next;
//             }
//             slow.next = slow.next.next;
//             return temp
//     }
// }


// class Solution {
//     public ListNode removeNthFromEnd(ListNode head, int n) {
//         ListNode start = new ListNode();
//         start.next = head;
//         ListNode fast = start;
//         ListNode slow = start;     

//         for(int i = 1; i <= n; i++)
//             fast = fast.next;
    
//         while(fast.next != null)
//         {
//             fast = fast.next;
//             slow = slow.next;
//         }
        
//         slow.next = slow.next.next;
        
//         return start.next;
//     }
// }