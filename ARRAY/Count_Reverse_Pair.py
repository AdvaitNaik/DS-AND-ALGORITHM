## BRUTE FORCE
# Time Complexity -> O(N^2)
# Space Complexity -> O(1)

# Intuition : 
# As we can see from the given question that i < j, So we can just use 2 nested loops and 
# check for the given condition which is arr [i] > 2* arr[j].

# Approach:
# We will be having 2 nested For loops the outer loop having i as pointer 
# The inner loop with j as pointer and we will make sure that 0 <= i < j < arr.length() and 
# also arr[i] > 2*arr[j] condition must be satisfied.

nums = [40, 25, 19, 12, 9, 6, 2]
count = 0
for i in range(len(nums)):
    for j in range(i+1, len(nums)):
        if (nums[i] > 2*nums[j]):
            count += 1
print(count)