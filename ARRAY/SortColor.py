## Time Complexity -> O(nlogn)
## Space Complexity -> O(1)

nums = [2,0,2,1,1,0]
nums.sort()
print(nums)

# 27 ms
# 13.8 MB


# COUNTING SORT
## Time Complexity -> O(2n)
## Space Complexity -> O(1)

num = []
for _ in range(nums.count(0)):
        num.append(0)

for _ in range(nums.count(1)):
        num.append(1)

for _ in range(nums.count(2)):
        num.append(2)

print(num)

# DUTCH NATIONAL FLAG ALGORITHM
## Time Complexity -> O(n)
## Space Complexity -> O(1)

nums = [2,0,2,1,1,0]
low = 0
mid = 0
high = len(nums) - 1
while(mid <= high):
    if (nums[mid] == 0):
        nums[low], nums[mid] = nums[mid], nums[low]
        low += 1
        mid += 1 

    elif (nums[mid] == 1):
        mid += 1

    elif (nums[mid] == 2):
        nums[mid], nums[high] = nums[high], nums[mid]
        high -= 1

print(nums)


