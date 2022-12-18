# Time Complexity -> O(n) + O(n) + O(n) -> O(n)
# Space Complexity -> O(1)

arr = [1,3,2]

index  = -1
i = len(arr) - 1
while(i != 0):
    if(arr[i] > arr[i-1]):
        index1 = i-1
        break
    i -= 1

if (index1 == -1):
    arr.reverse()
         
i = len(arr) - 1
print(i)
while(i != 0):
    if (arr[i] > arr[index1]):
        index2 = i
        break
    i -= 1
print(index2)
arr[index1], arr[index2] = arr[index2], arr[index1]
print(arr)
arr = arr[:(index1+1)] + arr[:(index1):-1]
print(arr)