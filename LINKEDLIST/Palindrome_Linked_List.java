///////////////////// EXTRA DATA STRUCTURE ///////////////////////

// Time Complexity -> O(N)
// Reason: Iterating through the list to store elements in the array.

// Space Complexity -> O(N)
// Reason: Using an array to store list elements for further computations.

// 1. Iterate through the given list to store it in an array.
// 2. Iterate through the array.
// 3. For each index in range of n/2 where n is the size of the array
// 4. Check if the number in it is the same as the number in the n-index-1 of the array.

// class Solution {
//     public boolean isPalindrome(ListNode head) {
//         ArrayList<Integer> arr=new ArrayList<>();
//         while(head != null) {
//             arr.add(head.val);
//             head = head.next;
//         }
//         for (int i = 0; i < arr.size()/2; i++){
//             if (arr.get(i) != arr.get(arr.size() - i - 1)) return false;

//         return true;
//         }
        
//     }
// }

///////////////////// OPTIMAL SOLUTION ///////////////////////

// Time Complexity: O(N/2) + O(N/2) + O(N/2)
// Reason: O(N/2) for finding the middle element, 
//                    reversing the list from the middle element, 
//                    and traversing again to find palindrome respectively.

// Space Complexity: O(1)
// Reason: No extra data structures are used.

// 1. Find the middle element of the linked list. Refer to this article to know the steps 
//     https://takeuforward.org/data-structure/find-middle-element-in-a-linked-list/
// 2. Reverse linked list from next element of middle element. 
//     Refer to this article to know the steps https://takeuforward.org/data-structure/reverse-a-linked-list/
// 3. Iterate through the new list until the middle element reaches the end of the list.
// 4. Use a dummy node to check if the same element exists in the linked list from the middle element.

// class Solution {
//     static ListNode reverse(listNode ptr){
//         ListNode previous = null;
//         ListNode next = null;
//         while(ptr != null){
//             next = ptr.next;
//             ptr.next = previous;
//             previous = ptr;
//             ptr = next;
//         }
//         return previous;
//     }


//     public boolean isPalindrome(ListNode head) {
//         if (head == null || head.next == null) return true;

//         ListNode slow = head;
//         ListNode fast = head;

//         while(fast.next != null && fast.next.next != null){
//             slow = slow.next;
//             fast = fast.next.next;
//         }

//         slow.next = reverse(slow.next);
//         slow = slow.next;
//         ListNode temp = head;

//         while(slow != null){
//             if (dummy.val != slow.val) return false;
//             dummy = dummy.next;
//             slow = slow.next;
//         }
//         return true;

        
//     }
// }