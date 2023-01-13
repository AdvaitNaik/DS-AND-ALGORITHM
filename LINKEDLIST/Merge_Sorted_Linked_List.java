// Solution Brute Force - Externally Linked List 

// Time Complexity -> O(N+M).
// Let N be the number of nodes in list l1 and M be the number of nodes in list l2. 
// We have to iterate through both lists. So, the total time complexity is O(N+M).

// Space Complexity -> O(N+M).
// We are creating another linked list that contains the (N+M) number of nodes in the list. So, space complexity is O(N+M).

// Approach -
// Step 1 - Create a new dummy node. It will have the value 0 and will point to NULL respectively. 
//     This will be the head of the new list. Another pointer to keep track of traversals in the new list.
// Step 2 - Find the smallest among two nodes pointed by the head pointer of both input lists, 
//     and store that data in a new list created.
// Step 3 - Move the head pointer to the next node of the list whose value is stored in the new list.
// Step 4 - Repeat the above steps till any one of the head pointers stores NULL. 
//     Copy remaining nodes of the list whose head is not NULL in the new list.

// class Solution {
//     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//         ListNode dummy = new ListNode(0);
//         // temp.next = null;
//         ListNode temp = dummy; 
//         int newVal;
//         while (list1 != null || list2 != null){
//             if(list1.val < list2.val){
//                 newVal = list1.val;
//                 list1 = list1.next;
//             } else {
//                 newVal = list2.val;
//                 list2 = list2.next;
//             }
//             ListNode node = new ListNode(newVal);
//             temp.next = node;
//             temp = temp.next;
//         }
//         temp.next = list1 == null ? list2 : list1;
//     }
// }

// Inplace method without using extra space.

// Time Complexity -> O(N+M).
// Let N be the number of nodes in list l1 and M be the number of nodes in list l2. 
// We have to iterate through both lists. So, the total time complexity is O(N+M).

// Space Complexity -> O(1).

// Step 1: Create two pointers, say l1 and l2. Compare the first node of both lists and find the small among the two. 
//     Assign pointer l1 to the smaller value node.
// Step 2: Create a pointer, say res, to l1. An iteration is basically iterating through both lists till the value pointed by 
//     l1 is less than or equal to the value pointed by l2.
// Step 3: Start iteration. Create a variable, say, temp. It will keep track of the last node sorted list in an iteration. 
// Step 4: Once an iteration is complete, link node pointed by temp to node pointed by l2. Swap l1 and l2.
// Step 5: If any one of the pointers among l1 and l2 is NULL, then move the node pointed by temp to the next higher value node.

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            // list1 is empty then output will be same as list2
            if (list1 == null) return list2;
            
            // list2 is empty then output will be same as list1
            if (list2 == null) return list1;

            if (list1.val > list2.val) {
                ListNode tmp = list1;
                list1 = list2;
                list2 = tmp;
            }

            ListNode res = list1;
            while(list1 != null && list2 != null) {
                ListNode temp = null;
                while (list1 != null && list1.val <= list2.val) {
                    temp = list1;
                    list1 = list1.next;
                }
                temp.next = list2;

                ListNode tmp = list1;
                list1 = list2;
                list2 = tmp;
            }
            return res;
    }
}