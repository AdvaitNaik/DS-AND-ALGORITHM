## BRUTE FROCE
# Time Complexity -> O(n3logn + nlogn)
# Reason -> Sorting the array takes N log N and three nested loops will be taking N³ and for binary search, 
# it takes another log N.
# Space Complexity -> O(1)

# The main idea is to sort the array, and then we can think of searching in the array using the 
# binary search technique. Since we need the 4 numbers which sum up to target. 
# So we will fix three numbers as nums[i], nums[j] and nums[k], and search for the remaining 
# (target – (nums[i] + nums[j] + nums[k])) in the array. Since we sorted the array during the start, 
# we can apply binary search to search for this value, and if it occurs we can store them. 
# In order to get the unique quads, we use a set data structure to store them.

def FourSumBruteForce(nums, target) -> list[list[int]]:
    answer = []
    
    for i in range(len(nums)):
        for j in range(i+1, len(nums)):
            for k in range(j+1, len(nums)):
                if ((target - (nums[i]+nums[j]+nums[k])) in nums[k+1:]):
                    temp = [nums[i], nums[j], nums[k], (target - (nums[i]+nums[j]+nums[k]))]
                    temp.sort()
                    answer.append(temp)
    final_ans = []
    for element in answer:
            if (element not in final_ans):
                final_ans.append(element)


    return answer

## FRONT-BACK POINTER
# Time Complexity -> O(n3)
# Space Complexity -> O(1)

def FourSumPointer(nums, target) -> list[list[int]]:
    answer = []
    # if(nums.empty()):
    #     return answer
    print(nums)
    for i in range(len(nums)):
        for j in range(i+1, len(nums)):
            front = j+1
            back = len(nums) - 1
            print(front, back)
            targetn = target - (nums[i] + nums[j])
            while(front < back):
                if ((nums[front] + nums[back]) < targetn):
                    front += 1

                elif (nums[front] + nums[back] > targetn):
                    back -= 1

                else:
                    temp = [nums[i], nums[j], nums[front], nums[back]]
                    temp.sort()
                    answer.append(temp)

    return answer

if __name__ == "__main__":
    nums = [1,0,-1,0,-2,2] 
    nums.sort()
    print(nums)
    target = 0
    ans = FourSumBruteForce(nums, target)
    print(ans)



    nums = [1,0,-1,0,-2,2] 
    nums.sort()
    print(nums)
    target = 0
    ans = FourSumPointer(nums, target)
    print("Pointer", ans)