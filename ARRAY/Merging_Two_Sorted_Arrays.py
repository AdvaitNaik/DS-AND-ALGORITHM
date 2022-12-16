# THIRD ARRAY
## Time Complexity -> O(nlogn) + O(n) + O(n)
## Space Complexity -> O(n)

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
# The idea is: We will traverse the first array and compare it with the first element of the second array. If the first element of the second array is smaller than the first array, we will swap and then sort the second array. 

#1 First, we have to traverse array1 and then compare it with the first element of array2. If it is less than array1 then we swap both.
#2 After swapping we are going to sort the array2 again so that the smallest element of the array2 comes at the first position and we can again swap with the array1
#3 To sort the array2 we will store the first element of array2 in a variable and left shift all the elements and store the first element in array2 in the last.

## Time Complexity -> O(n + m)
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


if __name__ == "__main__":
    ThirdArray()
    ar1 = [1, 5, 9, 10, 15, 20]
    ar2 = [2, 3, 8, 13]
    Traverse(ar1,ar2)
