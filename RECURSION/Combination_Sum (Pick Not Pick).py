# Intuition:
# For questions like printing combinations or subsequences, the first thing that should strike your mind is recursion.

# How to think recursively?
# Whenever the problem is related to picking up elements from an array to form a combination, start thinking about the “pick and non-pick” approach.


#                         f(index, target, ds)
#                         pick        not-pick
# f(index, target-a[index], ds)       f(index+1, target, ds)
# if (a[index] <= target)

# Base condition
# If index == size of array and  
# target == 0 include the combination in our answer

# Time Complexity = O(n*2^target)
# Space Complexity = (n)

def recursionSubSequenceSum(index, subarr, arr, length, target, ans):
    if (index == length):
        if (target == 0):
            # ans.append(subarr)
            print(ans)
        return

    if (arr[index] <= target): # with/without repetition
    # if (target >= 0): # with/without repetition
        subarr.append(arr[index])
        # recursionSubSequenceSum(index+1, subarr, arr, length, target-arr[index]) # without repetition
        recursionSubSequenceSum(index, subarr, arr, length, target-arr[index], ans) # with repetition
        subarr.remove(arr[index])

    recursionSubSequenceSum(index+1, subarr, arr, length, target, ans)
    
if __name__ == "__main__":
    arr = [2,3,6,7]
    subarr = []
    Sum = 7
    ans = []
    # recursionSubSequence(0, subarr, arr, len(arr))
    recursionSubSequenceSum(0, subarr, arr, len(arr), Sum, ans)
    print(ans)