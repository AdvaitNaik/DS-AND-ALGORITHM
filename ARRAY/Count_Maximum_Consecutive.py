# BRUTE 

# Time Complexity -> O(N) since the solution involves only a single pass.
# Space Complexity -> O(1) because no extra space is used.

# Approach - We maintain a variable count that keeps a track of the number of consecutive 1’s 
#            while traversing the array. 
# The other variable max_count maintains the maximum number of 1’s, in other words, it maintains the answer.

# We start traversing from the beginning of the array. 
# Since we can encounter either a 1 or 0 there can be two situations -

# 1. If  the value at the current index is equal to 1 we increase the value of count by one. 
#    After updating  the count variable if it becomes more than the max_count  update the max_count.
# 2. If the value at the current index is equal to zero we make the variable count as 0 since 
#     there are no more consecutive ones.

def findMaxConsecutiveOnes(nums) -> int:
    max_cnt = 0
    cnt = 0
    for el in nums:
        if (el == 1):
            cnt += 1
        else:
            cnt = 0
        max_cnt = max(max_cnt, cnt)
    return max_cnt

if __name__ == "__main__":
    nums = [1, 1, 0, 1, 1, 1]
    print(findMaxConsecutiveOnes(nums))
