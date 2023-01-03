# NAIVE APPROACH
## Time Complexity -> O(n^2) as we have two loops for traversal
## Space Complexity -> O(1)

# Intuition:
# We are required to find the longest subarray that sums to zero. 
# So our initial approach could be to consider all possible subarrays of the given array and 
# check for the subarrays that sum to zero. Among these valid subarrays (a sum equal to zero) 
# we’ll return the length of the largest subarray by maintaining a variable, say max.   

# Approach :  
# 1. Initialize a variable max = 0, which stores the length of the longest subarray with sum 0.
# 2. Traverse the array from start and initialize a variable sum = 0 which stores the sum of the 
#    subarray starting with the current index
# 3. Traverse from the next element of current_index up to the end of the array, each time add 
#    the element to the sum and check if it is equal to 0.
# 4. If sum = 0, check if the length of the subarray so far is > max and if yes update max
# 5. Now keep adding elements and repeat step 3 a.
# 6. After the outer loop traverses all elements return max

nums = [15,-2,2,-8,1,7,10,23]
sum = float("-inf")
maxL = 0
for i in range(len(nums)):
    for j in range(i, len(nums)):
        sum += nums[j]
        if (sum == 0):
            maxL = max(maxL, (j-i)+1)
    sum = 0
print(maxL)

# HASHING
## Time Complexity -> O(nlogn)
## Space Complexity -> O(n)

# Intuition:
# Now let’s say we know that the sum of subarray(i, j) = S, and we also know that sum of subarray(i, x) = S 
# where i < x < j. We can conclude that the sum of subarray(x+1, j) = 0.

# Approach: 
# 1. First let us initialise a variable say sum = 0 which stores the sum of elements traversed so far and 
#     another variable say max = 0 which stores the length of longest subarray with sum zero.
# 2. Declare a HashMap<Integer, Integer> which stores the prefix sum of every element as key and 
#     its index as value.
# 3. Now traverse the array, and add the array element to our sum. 
#  (i)  If sum = 0, then we can say that the subarray until the current index has a sum = 0, 
#       so we update max with the maximum value of (max, current_index+1)
#  (ii)  If sum is not equal to zero then we check hashmap if we’ve seen a subarray with this sum before
 
# if HashMap contains sum -> this is where the above-discussed case occurs (subarray with equal sum), 
#    so we update our max 

# else -> Insert (sum, current_index) into hashmap to store prefix sum until current index

# After traversing the entire array our max variable has the length of longest substring having 
# sum equal to zero, so return max.

elements = dict()
maxLen = 0
sum = 0
for i in range(len(nums)):
    # print(elements)
    sum += nums[i]
    if (sum == 0):
        maxLen = i+1
    else:
        if sum in elements:
            maxLen = max(maxLen, i - elements.get(sum))
        else:
            elements[sum] = i

print(maxLen)