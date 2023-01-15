# Time Complexity -> O(logn)

# Binary search can be implemented only on a sorted list of items. 
# If the elements are not sorted already, we need to sort them first.

# 1. The array in which searching is to be performed
# 2. Set two pointers low and high at the lowest and the highest positions respectively.
# 3. Find the middle element mid of the array ie. arr[(low + high)/2] = 6.
# 4. If x == mid, then return mid. Else, compare the element to be searched with m.
# 5. If x > mid, compare x with the middle element of the elements on the right side of mid. 
#     This is done by setting low to low = mid + 1.
# 6. Else, compare x with the middle element of the elements on the left side of mid. 
#     This is done by setting high to high = mid - 1.

# Iteration Method

# do until the pointers low and high meet each other.
#     mid = (low + high)/2
#     if (x == arr[mid])
#         return mid
#     else if (x > arr[mid]) // x is on the right side
#         low = mid + 1
#     else                   // x is on the left side
#         high = mid - 1



def binarySearchIterative(arr: list[int], target: int) -> int:
    low = 0
    high = len(arr) - 1
    while(low <= high):
        mid = (low+high)//2
        if(arr[mid] == target):
            return mid
        elif (arr[mid] < target):
            low = mid+1
        else:
            high = mid - 1
    return -1

# Recursive Method
# binarySearch(arr, x, low, high)
#     if low > high
#         return False 
#     else
#         mid = (low + high) / 2 
#         if x == arr[mid]
#             return mid
#         else if x > arr[mid]        // x is on the right side
#             return binarySearch(arr, x, mid + 1, high)
#         else                        // x is on the right side
#             return binarySearch(arr, x, low, mid - 1)

def binarySearchRecursive(arr: list[int], target: int, low: int, high: int) -> int:
    if (low > high):
        return -1
    else:
        mid = (low + high)//2

        if (arr[mid] == target):
            return mid

        elif (arr[mid] < target):
            binarySearchRecursive(arr, target, mid+1, high)

        else:
            binarySearchRecursive(arr, target, low, mid-1)

if __name__ == "__main__":
    array = [3, 4, 5, 6, 7, 8, 9]
    x = 6
    # Iterative Method
    print("Binary Search Iterative", binarySearchIterative(array, x))

    # Recusive Method
    print("Binary Search Recursive", binarySearchRecursive(array, x, 0, len(array) - 1))