# Solution 1: Recursive

# Time Complexity ->  N! x N
# Space Complexity->  O(N)

# Approach-
# Declare a map and initialize it to zero and call the recursive function

# Base condition-
# When the data structure’s size is equal to n(size of nums array)  
# then it is a permutation and stores that permutation in our ans, then returns it.

# Recursion-
# Run a for loop starting from 0 to nums.size() – 1. 
# Check if the frequency of i is unmarked, if it is unmarked then it means it has not been picked and 
# then we pick. And make sure it is marked as picked.

# Call the recursion with the parameters to pick the other elements 
# when we come back from the recursion make sure you throw that element out. 
# And unmark that element in the map.

# import java.util.*;
# class Solution {
#     private void recurPermute(int index, int[] nums, List < List < Integer >> ans) {
#         if (index == nums.length) {
#             // copy the ds to ans
#             List < Integer > ds = new ArrayList < > ();
#             for (int i = 0; i < nums.length; i++) {
#                 ds.add(nums[i]);
#             }
#             ans.add(new ArrayList < > (ds));
#             return;
#         }
#         for (int i = index; i < nums.length; i++) {
#             swap(i, index, nums);
#             recurPermute(index + 1, nums, ans);
#             swap(i, index, nums);
#         }
#     }
#     private void swap(int i, int j, int[] nums) {
#         int t = nums[i];
#         nums[i] = nums[j];
#         nums[j] = t;
#     }
#     public List < List < Integer >> permute(int[] nums) {
#         List < List < Integer >> ans = new ArrayList < > ();
#         recurPermute(0, nums, ans);
#         return ans;
#     }
# };

# class Print_Permutation {
#     public static void main(String[] args) {
#         int nums[] = {1,2,3};
#         Solution sol = new Solution();
#         List < List < Integer >> ls = sol.permute(nums);
#         System.out.println("All Permutations are");
#         for (int i = 0; i < ls.size(); i++) {
#             for (int j = 0; j < ls.get(i).size(); j++) {
#                 System.out.print(ls.get(i).get(j) + " ");
#             }
#             System.out.println();
#         }
#     }
# }

# Solution 2: Recursive with Backtracking.

# Time Complexity -> O(N! X N)
# Space Complexity-> O(1)

# Base condition:
# Whenever the index reaches the end take the nums array and put it in ans vector and return.

# Recursion:
# Go from index to n – 1 and swap. Once the swap has been done call recursion for the next state.
# After coming back from the recursion make sure you re-swap it because for the next element the swap will not take place.

def swap(i, j, nums):
    nums[i], nums[j] = nums[j], nums[i]

def recursionPermutation(index, nums, ans):
    if(index == len(nums)):
        # temp = []
        # for i in range(len(nums)):
        #     temp.append(nums[i])
        # ans.append(temp)
        ans.append(list(nums))
        return
    
    for i in range(index, len(nums)):
        swap(i, index, nums)
        recursionPermutation(index+1, nums, ans)
        swap(i, index, nums)

if __name__ == "__main__":
    nums = [1, 2, 3]
    k = 3
    ans = []
    recursionPermutation(0, nums, ans)
    ans.sort() # (n! * log(n!))
    print(ans)
    print(ans[k-1])
