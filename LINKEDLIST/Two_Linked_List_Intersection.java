// public class Two_Linked_List_Intersection { 
// }

//////////////////////// BRUTE FORCE ////////////////////////
// 1. Keep any one of the list to check its node present in the other list. 
//     Here, we are choosing the second list for this task.
// 2. Iterate through the other list. Here, it is the first one. 
// 3. Check if the both nodes are the same. If yes, we got our first intersection node.
// 4. If not, continue iteration.
// 5. If we did not find an intersection node and completed the entire iteration of the second list, 
//     then there is no intersection between the provided lists. Hence, return null.

// Time Complexity -> O(m*n)
// Space Complexity -> O(1)

// public class Solution {
//     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//         while(headB != null){
//             ListNode temp = headA;
//             while (temp != null){
//                 if (temp == headB) return headB;
//                 temp = temp.next;
//             }
//             headB = headB.next;
//         }
//         return null;        
//     }
// }

//////////////////////// HASHING ////////////////////////

// Time Complexity -> O(n+m)
// Reason: Iterating through list 1 first takes O(n), then iterating through list 2 takes O(m). 
// Space Complexity -> O(n)
// Reason: Storing list 1 node addresses in HashSet.

// Approach
// Can we improve brute-force time complexity? 
// In brute force, we are basically performing “searching”. We can also perform searches by Hashing. So the process is as follows:-

// 1. Iterate through list 1 and hash its node address. 
//    Why? (Hint: depends on common attribute we are searching)
// 2. Iterate through list 2 and search the hashed value in the hash table. If found, return node.

// public class Solution {
//     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            // HashSet<Node> st=new HashSet<>();  
            // while(headA != null){
            //     st.add(headA);
            //     headA = headA.next;
            // }  
            // while (headB != null){
            //     if (st.contains(headB)) return headB;
            //     headB = headB.next;
            // }
            // return null
//     }
// }

//////////////////////// LENGTH DIFFERENCE ////////////////////////

// Time Complexity: -> O(2max(m,n))+O(abs(m-n))+O(min(m,n))
// m -> Length of Linked List 1
// n -> Length of Linked List 2
// Reason -> Finding the length of both lists takes max(m,n) 
// because it is found simultaneously for both of them. 
// Moving the head pointer ahead by a difference of them. The next one is for searching.

// Space Complexity -> O(1)
// Reason: No extra space is used.

// Approach:
// We will reduce the search length. This can be done by searching the length of the shorter linked list. 
// How? Let’s see the process.

// 1. Find length of both the lists.
// 2. Find the positive difference of these lengths.
// 3. Move the dummy pointer of the larger list by difference achieved. 
//     This makes our search length reduced to the smaller list length.
// 4. Move both pointers, each pointing two lists, ahead simultaneously if both do not collide.


//////////////////////// OPTIMAL ////////////////////////
// Time Complexity -> O(2*max(m,n))
// m -> Length of Linked List 1
// n -> Length of Linked List 2

// Space Complexity -> O(1)

// Approach -
// The difference of length method requires various steps to work on it. 
// Using the same concept of difference of length, a different approach can be implemented. 

// The process is as follows:-
//     1. Take two dummy nodes for each list. Point each to the head of the lists.
//     2. Iterate over them. If anyone becomes null, point them to the head of the opposite lists and 
//         continue iterating until they collide.

// public class Solution {
//     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//         if(headA == null || headB == null){
//             return null;
//         }
//         ListNode a = headA;
//         ListNode b = headB;

//         while(a != b){
//             a = (a == null) ? headB : a.next;
//             b = (b == null) ? headA : b.next;
//         }
//         return a;
//     }
// }
