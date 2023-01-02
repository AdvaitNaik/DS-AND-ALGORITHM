# Naive Method
## Time Complexity -> O(nlogn + n)
## Sort -> Merge Sort O(logn)
# NlogN for sorting the array and O(N) for traversing through the array and checking if adjacent elements are equal or not. 
# But this will distort the array.
## Space Complexity -> O(1)

# Approach: Sort the array. After that, if there is any duplicate number they will be adjacent.
# So we simply have to check if arr[i]==arr[i+1] and if it is true,arr[i] is the duplicate number.

def DuplicateNumber(num) -> int:
    num.sort()
    print(num)
    for i in range(len(num)-1):
        if(num[i+1] == num[i]):
            return num[i]

## Hashing Frequency
# Time Complexity -> O(N), as we are traversing through the array only once.
# Space Complexity -> O(N), as we are using extra space for frequency array.

# Approach: Take a frequency array of size N+1 and initialize it to 0. Now traverse through the array and 
# if the frequency of the element is 0 increase it by 1, else if the frequency is not 0 then that element is 
# the required answer.

def DuplicateNumberFrequency(num):
    freq = [0] * (len(num)+1)
    for i in range(len(num)):
        if(freq[num[i]] == 0):
            freq[num[i]] += 1
        else:
            return num[i]

## Linked List Circular Method
# Time complexity: O(N). Since we traversed through the array only once.
# Space complexity: O(1).


if __name__ == '__main__':
    num = [2,5,9,6,9,3,8,9,7,1]
    print(DuplicateNumber(num))
    print(DuplicateNumberFrequency(num))