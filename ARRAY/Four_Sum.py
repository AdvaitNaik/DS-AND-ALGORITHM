## BRUTE FROCE
# Time Complexity -> O(n3logn + nlogn)
# Space Complexity -> O(1)
def FourSumBruteForce(nums, target) -> list[list[int]]:
    answer = []
    for i in range(len(nums)):
        for j in range(i+1, len(nums)):
            for k in range(j+1, len(nums)):
                if ((target - (nums[i]+nums[j]+nums[k])) in nums[k:]):
                    temp = [nums[i], nums[j], nums[k], (target - (nums[i]+nums[j]+nums[k]))]
                    temp.sort()
                    answer.append(temp)


                if(nums[k] == temp[2] and nums[k] == temp[2]):
                    k = k+1
            if(nums[j] == temp[1]):
                j = j+1
        if(nums[i] == temp[0]):
            i = i+1    



    return answer

## LEFT-RIGHT FROCE
# Time Complexity -> O(n3)
# Space Complexity -> O(1)


if __name__ == "__main__":
    nums = [1,0,-1,0,-2,2] 
    target = 0
    ans = FourSumBruteForce(nums, target)
    print(ans)