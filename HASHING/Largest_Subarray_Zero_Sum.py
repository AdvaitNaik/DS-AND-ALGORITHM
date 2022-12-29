## Time Complexity -> O(n2)
## Space Complexity -> O(1)

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