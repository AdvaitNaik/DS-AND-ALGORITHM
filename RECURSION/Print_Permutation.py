# Time Complexity:  N! x N
# Space Complexity:  O(N)

def swap(i, j, nums):
    nums[i], nums[j] = nums[j], nums[i]

def recursionPermutation(index, nums, ans):
    if(index == len(nums)):
        temp = []
        for i in range(len(nums)):
            temp.append(nums[i])
        ans.append(temp)
        return
    for i in range(index, len(nums)):
        swap(i, index, nums)
        recursionPermutation(index+1, nums, ans)
        swap(i, index, nums)

if __name__ == "__main__":
    nums = [1, 2, 3]
    ans = []
    recursionPermutation(0, nums, ans)
    print(ans)
