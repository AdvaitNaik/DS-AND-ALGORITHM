## BRUTE FORCE
# Time Complexity -> O(n2)
# Space Complexity -> O(1)

arr = [8, 4, 2, 1]
arr.sort(reverse=True)
print(arr)
res = []

for i in range(len(arr)):
    for j in range(i+1, len(arr)):
        res.append((arr[i], arr[j]))

print(res)


## BMERGE SORT
# Time Complexity -> O(nlogn)
# Space Complexity -> O(n)