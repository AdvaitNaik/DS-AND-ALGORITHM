## BRUTE FORCE
# Time Complexity -> O(n x m)
# Space Complexity -> O(1)

matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]]
target = 6

n = len(matrix)
m = len(matrix[0])
flag = 0

for i in range(n):
    for j in range(m):
        if(matrix[i][j] == target):
            flag = 1
            break

if (flag == 1):
    print('True')
else:
    print('False')


## BINARY SEARCH
# Time Complexity -> O(n x logm)
# Space Complexity -> O(1)

flag = 0
def BinarySearch(arr, target) -> bool:
    while(len(arr) > 1):
        mid = len(arr)//2
        if (target == arr[mid]):
            return True
        elif (target >= arr[mid]):
            return BinarySearch(arr[mid:], target)
        elif (target <= arr[mid]):
            return BinarySearch(arr[:mid], target)
        else:
            return False

for arr in matrix:
    print(arr)
    print(BinarySearch(arr, target))
    flag = BinarySearch(arr, target)

if(flag):
    print("True")
else:
    print("False")


## OPTIMAL SOLUTION
# mat = { {10, 20, 30, 40},  
#         {15, 25, 35, 45},
#         {27, 29, 37, 48},
#         {32, 33, 39, 50} }

# GEEKS FOR GEEKS
# Index -> [0][(mat[0].length - 1)]
# If Target - Greater Index -> Move Down
# If Target - Smaller Index -> Move Right

# Time Complexity -> O(log(n x m))
# Space Complexity -> O(1)

matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]]
target = 6

n = len(matrix)
m = len(matrix[0])

low = 0
high = (n*m) - 1

while(low <= high):
    mid = (low + high)//2
    if(matrix[mid//m][mid%m] == target): # -> Importsnt
        print(True)

    if(matrix[mid//m][mid%m] < target):
        low = mid+1
    else:
        high = mid-1
