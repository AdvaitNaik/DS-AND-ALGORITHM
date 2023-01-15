# XOR(^)

# Time Complexity -> O(N)
# Space Complexity -> O(1)

# Every number in the array repeats twice and only one number occurs once, 
# we can take advantage of the XOR(^) operator. 
# These are two properties of the XOR operator which will be helpful.

# If p is a number then,
# p^p=0
# p^0=p
# If we find the XOR of every element of the array, we will get the answer.

def singleElementXOR(nums: list[int]) -> int:
    ans = 0
    for n in nums:
        ans = ans ^ n
    return ans 

# Binary Search

# Time Complexity -> O(log(N))
# Space Complexity -> O(1)

# Now in this left array, 
# the first instance of every element is occurring on the even index and 
# the second instance on the odd index. 

# Similarly in the right array, the first instance of every element is occurring on the odd index 
# and the second index is occurring on the even index. 

# This is summarized below.

# LEFT HALF
# First Instance -> Even Index
# Second Instance -> Odd Index

# RIGHT HALF
# First Instance -> Odd Index
# Second Instance -> Even Index

# The intuition is that when we see an element, 
# if we know its index and whether it is the first instance or the second instance, 
# we can decide whether we are presently in the left array or right array. 
# Moreover, we can decide which direction we need to move to find the breakpoint. 
# We need to find this breakpoint between our left array and the right array.

# We will check our mid element, 
# if it is in the left array, we will shrink our left array to the right of this mid element, 
# if it is in the right array, we will shrink the right array to the left of this mid element. 
# This binary search process will continue till the right array surpasses our left one and 
# the low is pointing towards the breakpoint.


def singleElementBinarySearch(nums: list[int]) -> int:
    low = 0
    high = len(nums)-2
    while(low <= high):
        mid = (low + high)//2
        if (nums[mid] == nums[mid^1]):
            low = mid + 1
        else:
            high = mid - 1

    return nums[low]

if __name__ == "__main__":
    nums = [1,1,2,3,3,4,4,8,8]
    print("Single Element XOR", singleElementXOR(nums))
    print("Single Element Binary Search", singleElementBinarySearch(nums))