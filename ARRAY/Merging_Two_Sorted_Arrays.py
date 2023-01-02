# THIRD ARRAY
## Time Complexity -> O(nlogn) + O(n) + O(n)
## Space Complexity -> O(n)

# Intuition: We can use a new array of size n+m and put all elements of arr1 and arr2 in it, and sort it. 
# After sorting it, but all the elements in arr1 and arr2.

# Approach:

# Make an arr3 of size n+m.
# Put elements arr1 and arr2 in arr3.
# Sort the arr3.
# Now first fill the arr1 and then fill remaining elements in arr2. 


def ThirdArray():
    ar1 = [1, 5, 9, 10, 15, 20]
    ar2 = [2, 3, 8, 13]

    ar3 = []
    for i in range(len(ar1)):
        ar3.append(ar1[i])

    for i in range(len(ar2)):
        ar3.append(ar2[i])

    print(ar3)
    ar3.sort()
    print(ar3)

    for i in range(len(ar1)):
        ar1[i] = ar3[i]

    for i in range(len(ar2)):
        ar2[i] = ar3[len(ar1)+i]

    print(ar1)
    print(ar2)

## TRAVERSE
# Intuition: We can think of Iterating in arr1 and whenever we encounter an element that is greater than the first 
# element of arr2, just swap it. Now rearrange the arr2 in a sorted manner, after completion of the loop we will get 
# elements of both the arrays in non-decreasing order.

# Approach:

# Use a for loop in arr1.
# Whenever we get any element in arr1 which is greater than the first element of arr2,swap it.
# Rearrange arr2.
# Repeat the process.

## Time Complexity -> O(n*m)
## Space Complexity -> O(1)

def Traverse(ar1,ar2):
    n = len(ar1)
    m = len(ar2)
    for i in range(n):
        if(ar1[i] > ar2[0]):
            ar1[i],ar2[0] = ar2[0],ar1[i]
            ar2.sort()

    print(ar1)
    print(ar2)


## GAP METHOD 
## Time Complexity -> O(nlogn)
## Space Complexity -> O(1)

# Approach:

# Initially take the gap as (m+n)/2;
# Take as a pointer1 = 0 and pointer2 = gap.
# Run a oop from pointer1 &  pointer2 to  m+n and whenever arr[pointer2]<arr[pointer1], just swap those.
# After completion of the loop reduce the gap as gap=gap/2.
# Repeat the process until gap>0.


if __name__ == "__main__":
    ThirdArray()
    ar1 = [1, 5, 9, 10, 15, 20]
    ar2 = [2, 3, 8, 13]
    Traverse(ar1,ar2)
