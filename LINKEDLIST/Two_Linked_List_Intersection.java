// public class Two_Linked_List_Intersection { 
// }

// BRUTE FORCE
// 1. Keep any one of the list to check its node present in the other list. 
//     Here, we are choosing the second list for this task.
// 2. Iterate through the other list. Here, it is the first one. 
// 3. Check if the both nodes are the same. If yes, we got our first intersection node.
// 4. If not, continue iteration.
// 5. If we did not find an intersection node and completed the entire iteration of the second list, 
//     then there is no intersection between the provided lists. Hence, return null.

// Time Complexity -> O(m*n)
// Space Complexity -> O(1)