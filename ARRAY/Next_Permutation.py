## BRUTE FORCE - Finding all possible permutations. 
# Time Complexity -> O(N!xN).
# Space Complexity -> O(1)

### Approach :
# Step 1: Find all possible permutations of elements present and store them.
# Step 2: Search input from all possible permutations.
# Step 3: Print the next permutation present right after it.


## Lexicographical Ordering

### Intuition :

# Intuition lies behind the lexicographical ordering of all possible permutations of a given array. 
# There will always be an increasing sequence of all possible permutations when observed.

# Thus, we can see every sequence has increasing order. 
# Hence, our approach aims to get a peak from where the increasing sequence starts. 
# This is what we achieve from our first step of the approach. 

# Then, we need to get just a larger value than the point where the peak occurs. 
# To make rank as few as possible but greater than input array, just perverse array from breakpoint achieved 
# from the first step of the approach. We achieve these from all remaining steps of our approach.

### Approach :


## Step 1: Linearly traverse array from backward such that ith index value of the array is less than (i+1)th index value.
# Store that index in a variable.

## Step 2: If the index value received from step 1 is less than 0. This means the given input array is the largest 
# lexicographical permutation. Hence, we will reverse the input array to get the minimum or starting permutation. 
# Linearly traverse array from backward. Find an index that has a value greater than the previously found index. 
# Store index is another variable.

## Step 3: Swap values present in indices found in the above two steps.

## Step 4: Reverse array from index+1 where the index is found at step 1 till the end of the array.


# Time Complexity -> O(n) + O(n) + O(n) -> O(3n)
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