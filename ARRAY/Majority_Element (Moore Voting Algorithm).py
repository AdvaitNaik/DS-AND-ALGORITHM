## BRUTE FORCE
# Time Complexity -> O(n2)
# Space Complexity -> O(1)

## HASH METHOD
# Time Complexity -> O(nlogn)
# Space Complexity -> O(n)

## MOORE VOTING ALGORITHM
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

## BRUTE FORCE
# Time Complexity -> O(n2)
# Space Complexity -> O(1)
def majorityElementN3BruteForce(nums) -> list:
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

## BOYER MOORE VOTING ALGORITHM
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


if __name__ == '__main__':
    nums = [2,2,1,1,1,2,2]
    num = majorityElementN2(nums)
    print(num)
    nums = [1,1,1,3,3,2,2,2]
    num = majorityElementN3BruteForce(nums)
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