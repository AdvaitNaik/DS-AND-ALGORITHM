## BRUTE FROCE
# Intuition: The brute force solution is to generate all possible subarrays. 
# For each generated subarray we get the respective XOR and then check if this XOR is equal to B. 
# If it is then we increment the count. In the end, we will get the count of all possible subarrays that 
# have XOR equal to B.

# Approach:
# 1. Generate subarrays: To generate all possible subarrays, we use the same old technique of nested 
#     loops. For each value of the outer loop (i loop), the inner loop(j loop) runs from i till the last 
#     element. Each iteration of the inner loop gives a new subarray. 
# 2. Maintain XOR: Since each iteration of the inner loop gives a new subarray, we maintain a variable X, 
#     in which we keep the XOR of the current subarray. 
# 3. Check and Count: Before moving to the next iteration of the inner loop 
#     (that is before going to the next subarray), we check if the current XOR is equal to B, 
#     if it is then we increment the counter (counter also has to be maintained).

## Time Complexity -> O(N^2)
## Space Complexity -> O(1)

target = 6
count = 0

nums = [4, 2, 2, 6, 4]
for i in range(len(nums)):
    xorr = 0
    for j in range(i, len(nums)):
            xorr ^= nums[j]
            if (xorr == target):
                count += 1

print(count)

#HASH
## Time Complexity -> O(nlogn)
## Space Complexity -> O(n)

# Intuition: The main idea is to observe the prefix xor of the array. Prefix Xor is just another array, 
# where each index contains XOR of all elements of the original array starting from index 0 up to that 
# index. In other words prefix_xor[i] = XOR(a[0], a[1], a[2],……,a[I])

# Once we have made the prefix xor array, we observe a fact:

# P = xor(a[0], a[1], a[2],……, a[q], a[q+1],….., a[p])
# Q = xor(a[0], a[1], a[2],……, a[q])

# Therefore,
# P^Q = xor(a[q+1],….., a[p]) = M          

# Approach: We need to traverse the array while we maintain variables for current_perfix_xor, counter, 
# and also a map to keep track of visited xors. This map will maintain the frequency count of all previous
#  visited current_prefix_xor values. If for any index current_prefix_xor is equal to B, 
#  we increment the counter. If for any index we find that Z is present in the visited map, 
#  we increment the counter by visited[Z] (Z=current_prefi_xor^B). At every index, 
#  we insert the current_prefix_xor into the visited map with its frequency.

# NOTE: the complexity of worst-case searching for an unordered_map can go up to O(N), 
# hence it is safer to use ordered_map. But if we use ordered_map then the time complexity will be
# O(N logN). Space complexity will be the same in both cases.

nums = [4, 2, 2, 6, 4]
target = 6

elements = dict()
count = 0
xorh = 0
for i in range(len(nums)):
    # print(elements)
    xorh ^= nums[i]
    if (xorh == target):
        count += 1
    xorn = xorh^target
    if (xorn in elements):
        count = count + elements[xorn]

    if (xorh in elements):
        elements[xorh] = elements[xorh] + 1
    else:
        elements[xorh] = 1

    
print(elements)
print(count)