# SORTING
## Time Complexity -> O(nlogn)
## Space Complexity -> O(1)

nums = [2,0,2,1,1,0]
nums.sort()
print(nums)

## COUNTING SORT
# Intuition: Since in this case there are only 3 distinct values in the array so it’s easy to maintain the count of all,
# Like the count of 0, 1, and 2. This can be followed by overwriting the array based on the frequency(count) of the values.

# Approach: 
# Take 3 variables to maintain the count of 0, 1 and 2.
# Travel the array once and increment the corresponding counting variables
# ( let’s consider count_0 = a, count_1 = b, count_2 = c )

# In 2nd traversal of array, we will now over write the first ‘a’ indices / positions in array with ’0’, the next ‘b’ 
# with ‘1’ and the remaining ‘c’ with ‘2’.

## Time Complexity -> O(n) + O(n)
## Space Complexity -> O(1)

nums = [2,0,2,1,1,0]
num = []
for _ in range(nums.count(0)):
        num.append(0)

for _ in range(nums.count(1)):
        num.append(1)

for _ in range(nums.count(2)):
        num.append(2)

nums = [2,0,2,1,1,0]
count_a = 0
count_b = 0
count_c = 0

for num in nums:
        if (num == 0):
                count_a += 1
        elif (num == 1):
                count_b += 1
        elif (num == 2):
                count_c += 1
count = count_a + count_b + count_c
for i in range(count):
        if(i < count_a): nums[i] = 0
        if(i >= count_a and i < (count_a + count_b)): nums[i] = 1
        if(i >= (count_a + count_b) and i < (count_a + count_b + count_c)): nums[i] = 2
         
print(nums)

# DUTCH NATIONAL FLAG ALGORITHM 3-Pointer approach

# Intuition: In this approach, we will be using 3 pointers named low, mid, and high. We will be using these 3 pointers 
# to move around the values. The primary goal here is to move 0s to the left and 2s to the right of the array and 
# at the same time all the 1s shall be in the middle region of the array and hence the array will be sorted. 

# Approach: 
# Initialize the 3 pointers such that low and mid will point to 0th index and high pointer will point to last index

# int low = arr[0]
# int mid = arr[0]
# int high = arr[n – 1]

# Now there will 3 different operations / steps based on the value of arr[mid] and will be repeated until mid <= high.

# arr[mid] == 0:
# swap(arr[low], arr[mid])
# low++, mid++

# arr[mid] == 1:
# mid++

# arr[mid] == 2:
# swap(arr[mid], arr[high])
# high–;
# The array formed after these steps will be a sorted array.


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


