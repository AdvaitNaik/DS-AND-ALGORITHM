# Intuition:
# For questions like printing combinations or subsequences, the first thing that should strike your mind is recursion.

# How to think recursively?
# Whenever the problem is related to picking up elements from an array to form a combination, start thinking about the “pick and non-pick” approach.

# Initially, We start with the index 0, At index 0 we have n – 1 way to pick the first element of our subsequence.

# Loop (index -> n-1)
# if (arr[index] > target): Break

# Base condition
# If index== size of array and  
# target == 0 include the combination in our answer

# Time Complexity = O(2^n*target)
# Space Complexity = (n*target)

def recursionSubSequenceSum(index, subarr, arr, target, ans):
    if (target == 0):
        ans.append(list(subarr))
        print(subarr)
        return

    for i in range(index, len(arr)):
        if (i > index and arr[i] == arr[i-1]): continue
        if (arr[i] > target): break # without repetition
        subarr.append(arr[i])
        recursionSubSequenceSum(i+1, subarr, arr, target-arr[i], ans) # without repetition
        # recursionSubSequenceSum(index, subarr, arr, length, target-arr[index], ans) # with repetition
        subarr.remove(arr[i])
    
if __name__ == "__main__":
    arr = [10,1,2,7,6,1,5]
    arr.sort()
    subarr = []
    Sum = 8
    ans = []
    # recursionSubSequence(0, subarr, arr, len(arr))
    recursionSubSequenceSum(0, subarr, arr, Sum, ans)
    print(ans)