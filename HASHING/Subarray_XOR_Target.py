## Time Complexity -> O(n2)
## Space Complexity -> O(1)
target = 6
count = 0
xorr = 0
arr = []
temp = []
nums = [4, 2, 2, 6, 4]
for i in range(len(nums)):
    for j in range(i, len(nums)):
        for k in range(i, j+1):
            arr.append(nums[k])
        temp.append(arr)
        arr = []

print(temp)
for arr in temp:
    l = len(arr)
    xorr = 0
    for i in range(l):
        xorr = xorr ^ arr[i]
    if (xorr ==  target):
        count += 1

print(count)

#HASH
## Time Complexity -> O(nlogn)
## Space Complexity -> O(n)