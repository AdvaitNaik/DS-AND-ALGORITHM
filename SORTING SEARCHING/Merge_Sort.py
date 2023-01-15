## MERGE SORT ALGORITHM

# Time Complexity -> O(NlogN)

# step 1: start
# step 2: declare array and left, right, mid variable
# step 3: perform merge function.
#     if left > right
#         return
#     mid= (left+right)/2
#     mergesort(array, left, mid)
#     mergesort(array, mid+1, right)
#     merge(array, left, mid, right)
# step 4: Stop


# MergeSort(arr[], l,  r)
# If r > l
    # Find the middle point to divide the array into two halves: 
        # middle m = l + (r – l)/2
    # Call mergeSort for first half:   
        # Call mergeSort(arr, l, m)
    # Call mergeSort for second half:
        # Call mergeSort(arr, m + 1, r)
    # Merge the two halves sorted in steps 2 and 3:
        # Call merge(arr, l, m, r)

# Python program for implementation of MergeSort
def mergeSort(arr):
    if len(arr) > 1:
        # Finding the mid of the array
        mid = len(arr)//2
        print(mid)

        # Dividing the array elements
        L = arr[:mid]
        print(L)
 
        # into 2 halves
        R = arr[mid:]
        print(R)

        # Sorting the first half
        mergeSort(L)
 
        # Sorting the second half
        mergeSort(R)

        i = j = k = 0

        while i < len(L) and j < len(R):
            if L[i] <= R[j]:
                arr[k] = L[i]
                i += 1
            else:
                arr[k] = R[j]
                j += 1
            k += 1

        # Checking if any element was left
        while i < len(L):
            arr[k] = L[i]
            i += 1
            k += 1
 
        while j < len(R):
            arr[k] = R[j]
            j += 1
            k += 1

# Print List
def printList(arr):
    for i in range(len(arr)):
        print(arr[i], end=" ")
    print()

# Driver Code
if __name__ == '__main__':
    arr = [12, 11, 13, 5, 6, 7]
    print("Array", end="\n")
    printList(arr)
    mergeSort(arr)
    print("Sorted Array", end="\n")
    printList(arr)