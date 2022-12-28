## BRUTE FORCE
# Time Complexity -> O(n2)
# Space Complexity -> O(1)

nums = [40, 25, 19, 12, 9, 6, 2]
count = 0
for i in range(len(nums)):
    for j in range(i, len(nums)):
        if (nums[i] > nums[j] and nums[i] > 2*nums[j]):
            count += 1
print(count)