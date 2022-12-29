# BRUTE FORCE
## Time Complexity -> O(n2)
## Space Complexity -> O(n)
s = "au"
lst = list(s)
maxLen = float('-inf')
arr = []
for i in range(len(lst)):
    arr = []
    for j in range(i, len(lst)):
        if(lst[j] in arr):
            maxLen = max(maxLen, len(arr))
            break
        arr.append(lst[j])
        maxLen = max(maxLen, len(arr))
print(maxLen)

# SLIDING WINDOW - TWO POINTER 
## Time Complexity -> O(n)
## Space Complexity -> O(n)
s = "abcabcbb"
elements =  dict()
lst = list(s)
maxLen = float('-inf')
left = right = 0
while(right < len(lst)):
    if(lst[right] in elements):
        left = max(elements.get(lst[right]) +1, left)
    elements[lst[right]] = right
    maxLen = max(maxLen, right-left+1)
    right =  right+1

print(maxLen)

