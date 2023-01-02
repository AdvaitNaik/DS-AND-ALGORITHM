## BRUTE FORCE
# Time Complexity -> O(n2)
# Space Complexity -> O(1)

# Check the count of occurrences of all elements of the array one by one. 
# Start from the first element of the array and count the number of times it occurs in the array. 
# If the count is greater than the floor of N/2 then return that element as the answer. 
# If not, proceed with the next element in the array and repeat the process.

####################################################################################

## HASH METHOD
# Time Complexity -> O(N)-> Frequency array or O(N log N) -> HashMap 
# Space Complexity -> O(N)

# Intuition: Use a better data structure to reduce the number of look-up operations and 
# hence the time complexity. Moreover, we have been calculating the count of the same element again and 
# again – so we have to reduce that also.

# Approach: 
# 1. Use a hashmap and store as (key, value) pairs. (Can also use frequency array based on the size of nums) 
# 2. Here the key will be the element of the array and the value will be the number of times it occurs. 
# 3. Traverse the array and update the value of the key. Simultaneously check if the value is greater than 
# the floor of N/2. 

# 1. If yes, return the key 
# 2. Else iterate forward.

####################################################################################

## MOORE VOTING ALGORITHM
# Time Complexity -> O(N)
# Space Complexity -> O(1)

# Intuition: The question clearly states that the nums array has a majority element. 
# Since it has a majority element we can say definitely the count is more than N/2.

# Majority element count = N/2 + x;
# Minority/Other elements = N/2 – x;

# Where x is the number of times it occurs after reaching the minimum value N/2.
# Now, we can say that count of minority elements and majority elements are equal up to a certain point 
# of time in the array. So when we traverse through the array we try to keep track of the count of elements
# and which element we are tracking. Since the majority element appears more than N/2 times, 
# we can say that at some point in array traversal we find the majority element. 

# Approach: 
# Initialize 2 variables: 
#     Count –  for tracking the count of element
#     Element – for which element we are counting
# Traverse through nums array.
#     If Count is 0 then initialize the current traversing integer of array as Element 
#     If the traversing integer of array and Element are same increase Count by 1
#     If they are different decrease Count by 1
# The integer present in Element is the result we are expecting 

def majorityElementN2(nums) -> int:
    count = 0
    number = 0

    for num in nums:
        if (count == 0):
            number = num

        if (number == num):
            count = count + 1
        else:
            count = count - 1
    return number


####################################################################################

## BRUTE FORCE N3
# Time Complexity -> O(n2)
# Space Complexity -> O(1)

# Approach: Simply count the no. of appearance for each element using nested loops and 
# whenever you find the count of an element greater than N/3 times, that element will be your answer.

def majorityElementN3BruteForce(nums) -> list:
    ans = []
    for i in range(len(nums)):
        count = 1
        for j in range(i, len(nums)):
            if(nums[j] == nums[i]):
                count += 1

        if (count >= len(nums)//2):
            ans.append(nums[i])
    return set(ans)

####################################################################################

## MAP APPROACH
# Approach: Traverse the whole array and store the count of every element in a map. 
# After that traverse through the map and whenever you find the count of an element greater than N/3 times, 
# store that element in your answer.

# Time Complexity: O(n)
# Space Complexity: O(n)

# Code -> Count Element Frequency
def majorityElementN3Map(nums) -> list:
    num_count = []
    for num in nums:
        flag = 0
        for i in range(len(num_count)):  
            if(num_count[i][0] == num):
                    num_count[i][1] = num_count[i][1] + 1
                    flag = 1
                # else:
                #     num_count.append([num, 1])
        if (flag == 0):
            num_count.append([num, 1])

        print(num_count)
    # set(num_count)
    num_count.sort(key=lambda x:x[1], reverse=True)
    return num_count

####################################################################################

## BOYER MOORE VOTING ALGORITHM

# Approach + Intuition: In our code, we start with declaring a few variables:

# 1. num1 and num2 will store our currently most frequent and second most frequent element.
# 2. c1 and c2 will store their frequency relatively to other numbers.
# 3. We are sure that there will be a max of 2 elements which occurs > N/3 times because there cannot be 
# if you do a simple math addition.

# Let, ele be the element present in the array at any index. 

# if ele == num1, so we increment c1.
# if ele == num2, so we increment c2.
# if c1 is 0, so we assign num1 = ele.
# if c2 is 0, so we assign num2 = ele.
# In all the other cases we decrease both c1 and c2.
# In the last step, we will run a loop to check if num1 or nums2 are the majority elements or not 
# by running a for loop check.

# Intuition: Since it’s guaranteed that a number can be a majority element, hence it will always be 
# present at the last block, hence, in turn, will be on nums1 and nums2. For a more detailed explanation, 
# please watch the video below.


# Time Complexity -> O(n) + O(n)
# Space Complexity -> O(1)
def majorityElementN3(nums) -> int:
    number1 = -1
    number2 = -1
    count1 = 0
    count2 = 0
    for num in nums:
        if (num == number1):
            count1 += 1
        elif (num == number2):
            count2 += 1
        elif (count1 == 0):
            number1 = num
            count1 += 1
        elif (count2 == 0):
            number2 = num
            count2 += 1
        else:
            count1 -= 1
            count2 -= 1
    return number1, number2

####################################################################################

if __name__ == '__main__':
    nums = [2,2,1,1,1,2,2]
    num = majorityElementN2(nums)
    print(num)
    print("Brute Force" ,majorityElementN3BruteForce(nums))
    num = majorityElementN3Map(nums)
    ans = []
    for i in range(len(num)):
        if (num[i][1] > len(nums)//3):
            ans.append(num[i][0])
    print(ans)
    nums = [1,2]
    a,b = majorityElementN3(nums)
    ans = []
    if(nums.count(a) > len(nums)//3):
        ans.append(a)
    if(nums.count(b) > len(nums)//3):
        ans.append(b)
    print(ans)