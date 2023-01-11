import java.util.*;


// Solution 1 - Brute Force

// Time complexity -> O(n*log(n))+O(n)
// Space Complexity -> O(n) 

// Intuition: We have to think of a data structure that does not store duplicate elements. 
// So can we use a Hash set? Yes! We can. As we know HashSet only stores unique elements.

// Approach - 
// 1. Declare a HashSet.
// 2. Run a for loop from starting to the end.
// 3. Put every element of the array in the set.
// 4. Store size of the set in a variable K.
// 5. Now put all elements of the set in the array from the starting of the array.
// 6. Return K.


// public class Remove_Duplicate_Sorted_Array {
//     public static void main(String[] args) {
//         int arr[] = {1,1,2,2,2,3,3};
//         int k = removeDuplicates(arr);
//         System.out.println("The array after removing duplicate elements is ");
//         for (int i = 0; i < k; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
//     static int removeDuplicates(int[] arr) {
//         HashSet < Integer > set = new HashSet < > ();
//         for (int i = 0; i < arr.length; i++) {
//             set.add(arr[i]);
//         }
//         int k = set.size();
//         int j = 0;
//         for (int x: set) {
//             arr[j++] = x;
//         }
//         return k;
//     }
// }

// Solution 2 - Two pointers

// Time complexity -> O(n)
// Space Complexity -> O(1)

// Intuition: We can think of using two pointers ‘i’ and ‘j’, we move ‘j’ till we don’t get a number arr[j] which is different from arr[i]. 
// As we got a unique number we will increase the i pointer and update its value by arr[j]. 

// Approach - 
// 1. Take a variable i as 0;
// 2. Use a for loop by using a variable ‘j’ from 1 to length of the array.
// 3. If arr[j] != arr[i], increase ‘i’ and update arr[i] == arr[j].
// 4. After completion of the loop return i+1, i.e size of the array of unique elements.


// class Solution {
//     public int removeDuplicates(int[] nums) {
//         if(nums.length == 0) return 0;

//         int i = 0;
//         int j = 1;

//         while(j < nums.length) {
//             if (nums[i] != nums[j]){
//                 i = i + 1;
//                 nums[i] = nums[j];
//             }
//             j = j + 1;
//         }
//         return i+1;
        
//     }
// }
