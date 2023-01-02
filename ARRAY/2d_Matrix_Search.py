# Matrix has the following properties:

# Integers in each row are sorted from left to right.
# The first integer of each row is greater than the last integer of the previous row

## BRUTE FORCE

# Approach: We can traverse through every element that is present in the matrix and return true if 
# we found any element in the matrix is equal to the target integer. If the traversal is finished 
# we can directly return false as we did not find any element in the matrix to be equal to the target integer.

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

# Intuition: As it is clearly mentioned that the given matrix will be row-wise and column-wise sorted, 
# we can see that the elements in the matrix will be in a monotonically increasing order. 
# So we can apply binary search to search the matrix. 
# Consider the 2D matrix as a 1D matrix having indices from 0 to (m*n)-1 and apply binary search.

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


# i) Initially have a low index as the first index of the considered 1D matrix(i.e: 0) and 
# high index as the last index of the considered 1D matrix(i.e: (m*n)-1).

### int low = 0;
### int  high = (m*n)-1;

# ii) Now apply binary search. Run a while loop with the condition low<=high. 
# Get the middle index as (low+high)/2.We can get the element at middle index using 
# matrix[middle/m][middle%m].

### while(low<=high)
###     int middle = (low+high)/2;

# iii) If the element present at the middle index is greater than the target, then it is obvious that 
# the target element will not exist beyond the middle index. So shrink the search space by updating 
# the high index to middle-1. 

### if(matrix[middle/m][middle%m]<target)
###     high = middle-1;

# iv) If the middle index element is lesser than the target, shrink the search space by updating the 
# low index to middle+1.

### if(matrix[middle/m][middle%m]>target)
###     low = middle+1;

# v) If the middle index element is equal to the target integer, return true.

### if(matrix[middle/m][middle%m]==target)
###     return true;

# vi) Once the loop terminates we can directly return false as we did not find the target element


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
    if(matrix[mid//m][mid%m] == target): # -> Important
        print(True)

    if(matrix[mid//m][mid%m] < target):
        low = mid+1
    else:
        high = mid-1
