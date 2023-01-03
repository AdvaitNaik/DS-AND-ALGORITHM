## BRUTE FORCE
# Time Complexity -> O(n^2)
# Space Complexity -> O(1)

# Intuition: For each element, we try to find an element such that the sum of both elements is equal to 
# the given target.

# Approach: We traverse through the array, and for each element x, we try to find another element amongst
# the remaining elements, such that the sum of both the elements equals the target. 

# 1. Let, first Element is x. The required second element will be, target – x
# 2. If we find both the elements, we break the loop and return the indices.

def TwoSumProblem(num, target) -> int:
    for i in range(len(num)):
        for j in range(i+1, len(num)):
            if((target-num[i]) == num[j]):
                return i, j

#######################################################################################

### TWO-POINTER APPROACH

# Time Complexity: O(NlogN)
# Space Complexity: O(N)

# Intuition: Think about, what if the array is sorted? If the array is sorted, is it possible to reach 
# a sum by traversing the array from both sides simultaneously?

# We sort the array, use two variables, each will start from one end of the array, and traverse in both 
# directions till we get the required sum.

# Approach: First we create duplicate array and sort that array. Then we traverse through the array, 
# and for each element x, we try to find another element amongst the remaining elements, such that 
# the sum of both the elements equals the target. 

# 1. Let, first Element is x.
# 2. The required second element will be, target – x
# 3. If we find both the elements, we break the loop and return the indices.

# Example -  nums = [2,1,3,4], target = 4

# 1. First we sort the array. So nums after sorting is [1,2,3,4]
# 2. We take two pointers, i and j. i points to index 0 and j points to index 3.
# 3. Now we check if nums[i] + nums[j] == target. In this case, they don’t sum up, and nums[i] + nums[j] > target, so we will reduce j by 1.
# 4. Now, i = 0, j=2
# 5. Here, nums[i] + nums[j] == 1 + 3 == 4, which is the required target, so we store both the elements and break the loop.
# 6. Now, we run another loop to find the indices of the elements in the actual array, i.e [2,1,3,4]
# 7. Then, return the actual indices, [1,2].

def TwoSumProblemTwoPointer(num, target) -> int:
    num1 = num2 = 0
    left = 0
    right = len(num) - 1
    temp = num
    temp.sort()

    while(left < right):
        if (temp[left] + temp[right] == target):
            num1 = temp[left]
            num2 = temp[right]
            break
        elif (temp[left] + temp[right] > target):
            right -= 1

        else:
            left += 1
            
    return num.index(num1), num.index(num2)

#######################################################################################

## HASH MAP
# Time Complexity -> O(n)
# Space Complexity -> O(n)

# Approach: We can solve this problem efficiently by using hashing. 
# We’ll use a hash-map to see if there exists a value target – x for each value x. 
# If target – x is found in the map, can return current element x’s index and (target-x)’s index

# Example - nums = [2,3,1,4], target = 4

# For index 0, x = 2 and currently map is empty.
#     We try to find if target – x = 4 – 2 = 2 is present in the map or not.
#     For now, 2 does not exists in the map.
#     And we store the index of element 2. i.e., mp[2] = 0,
# For index 1, x = 3
#     We try to find if target – x = 4  – 3 = 1 is present in the map or not.
#     For now, 1 does not exists in the map.
#     And we store the index of element 3. i.e., mp[3] = 1,
# For index 2, x = 1 
#     We try to find if target – i = 4  – 1 = 3 is present in the map or not. 
#     3 exits in the map, so we store index 2 and value stored for key 3 in the map, and break the loop. 
#     And return [1,2].

def TwoSumProblemHash(num, target) -> list:
    elements = dict()
    for key, value in enumerate(num):
        ans = target-value
        if ans in elements:
            return [key, elements[ans]]
        elements[value] = key

if __name__ == "__main__":
    num = [2, 5, 6, 8, 11]
    target = 14
    a,b = TwoSumProblem(num, target)
    print(a, b)

    num = [2, 5, 6, 8, 11]
    target = 14
    c,d = TwoSumProblemTwoPointer(num, target)
    print("Two Pointer" ,c, d)

    ans = TwoSumProblemHash(num, target)
    print(ans)