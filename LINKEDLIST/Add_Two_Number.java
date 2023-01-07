// public class Add_Two_Number {
    
// }


// ELEMENTRY SOLUTION

// Time Complexity -> O(max(m,n)). 
//     m and n represent the length of l1 and l2 respectively, 
//     the algorithm above iterates at most max(m,n) times.

// Space Complexity -> O(max(m,n)). The length of the new list is at most max(m,n)+1.

// 1. Create a dummy node which is the head of new linked list.
// 2. Create a node temp, initialise it with dummy.
// 3. Initialize carry to 0.
// 4. Loop through lists l1 and l2 until you reach both ends, and until carry is present.
//         1. Set sum=l1.val+ l2.val + carry.
//         2. Update carry=sum/10.
//         3. Create a new node with the digit value of (sum%10) and set it to temp node’s next, 
//             then advance temp node to next.
//         4. Advance both l1 and l2.
// 5. Return dummy’s next node.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

// class Solution{
//     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//         ListNode dummy = new ListNode();
//         ListNode temp = dummy;
//         int carry = 0
//         while(l1 != null || l2 != null || carry == 1) {
//             int sum = 0;
//             if (l1 != null){
//                 sum += l1.val;
//                 l1 = l1.next;
//             }
//             if (l2 != null){
//                 sum += l2.val;
//                 l2 = l2.next;
//             }

//             sum += carry;
//             carry = sum/10;
//             ListNode node = new ListNode(sum%10);
//             temp.next = node;
//             temp = temp.next;
//         }
//         return dummy.next;
//     }
// }