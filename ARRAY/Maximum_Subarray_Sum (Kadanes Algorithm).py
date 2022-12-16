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

def SolutionON2(nums) -> int:
    maxSum = float("-inf")
    sum = 0
    for i in range(len(nums)):
        for j in range(i, len(nums)):
            sum += nums[j]
            maxSum = max(maxSum, sum)
        sum = 0
    return maxSum

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