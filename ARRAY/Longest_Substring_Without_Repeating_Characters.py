# BRUTE FORCE
## Time Complexity -> O(n^2)
## Space Complexity -> O(n)

# Approach: This approach consists of taking the two loops one for traversing the string and 
# another loop – nested loop for finding different substrings and after that, we will check 
# for all substrings one by one and check for each and every element if the element is not found then
# we will store that element in HashSet otherwise we will break from the loop and count it.

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

# Approach: 
# We will have two pointers left and right. 
# Pointer ‘left’ is used for maintaining the starting point of substring while 
# ‘right’ will maintain the endpoint of the substring.’ right’ pointer will move forward and 
# check for the duplicate occurrence of the current element if found then ‘left’ pointer will be shifted 
# ahead so as to delete the duplicate elements.

# we will make a map that will take care of counting the elements and maintaining the frequency of each 
# and every element as a unity by taking the latest index of every element.

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

