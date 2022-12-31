## Naive Approach 
# Approach: Using three for loops, we will get all possible subarrays in two loops and their sum in another loop, 
# and then return the maximum of them.

# Time Complexity: O(N^3)
# Space Complexity: O(1) 

def SolutionON3(nums) -> int:
    maxSum = float("-inf")
    sum = 0
    for i in range(len(nums)):
        for j in range(i, len(nums)):
            for k in range(i, j):
                sum += nums[k]
                maxSum = max(maxSum, sum)
            sum = 0
    return maxSum


# Approach : We can also do this problem using only two for loops, we will avoid 3rd loop which was used in above approach, 
# instead of that we will create new variable curr_sum, which stores the array sum from ith index to jth index.

# Time Complexity: O(N^2) 
# Space Complexity: O(1)

def SolutionON2(nums) -> int:
    maxSum = float("-inf")
    sum = 0
    for i in range(len(nums)):
        for j in range(i, len(nums)):
            sum += nums[j]
            maxSum = max(maxSum, sum)
        sum = 0
    return maxSum

## Kadane’s Algorithm 

# Intuition: Basically this problem can be done in linear time complexity with Kadane’s algorithm along with that 
# will also get the subarray which is giving the largest positive-sum. 

# Approach: 

# -> We will have the following variables in the beginning : 
# msf – max so far, 
# meh – max sum ending at ith index, 
# start – to get the starting index of ans’s subarray, 
# end – to get the ending index of ans’s subarray. 

# -> Traverse the array from starting and add the ith element to max_end_here(meh), 
# now we will check that adding the ith element gives greater value than max_so_far(msf) or not, 
# if yes then we will update our msf and also update the starting and ending index(initially starting index is zero). 

# for(int i=0;i<nums.size();i++){ 
#     meh+=nums[i]; 

#     if(meh>msf){ msf=meh; start=s; end=i; } 

#     if(meh<0){meh=0; s=i+1;} 
# } 

# -> Now in this step, we will print the answer subarray using the start and end variables.
# -> Return the largest subarray sum that is:- msf. 

## Time Complexity -> O(n)
## Space Complexity -> O(1)
def KadanesAlgorithm(nums):
    maximum = nums[0]
    sum = 0
    for x in range(0,len(nums)):
        sum += nums[x]
        if(sum > maximum):
            maximum = sum
        if(sum < 0):
            sum = 0
    return maximum

if __name__ == "__main__":
    nums = [-2,1,-3,4,-1,2,1,-5,4]
    res1 = SolutionON3(nums)
    res2 = SolutionON2(nums)
    res3 = KadanesAlgorithm(nums)
    print(res3)