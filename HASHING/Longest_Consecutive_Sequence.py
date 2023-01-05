## BRUTE FORCE
# We can simply sort the array and run a for loop to find the longest consecutive sequence.

# Time Complexity -> We are first sorting the array which will take O(N * log(N)) time and 
#                    then we are running a for loop which will take O(N) time. 
#                    Hence, the overall time complexity will be O(N * log(N)).
# Space Complexity -> The space complexity for the above approach is O(1) 
#                     because we are not using any auxiliary space

def BruteForce(arr) -> int:
    arr.sort()
    print(arr)
    Len_max = 0
    Len_so_far = 1
    right = 1 
    left = 0
    while(right < len(arr)):
        if (arr[right] == arr[left]+1):
            Len_so_far += 1
            left += 1
            right += 1
            Len_max = max(Len_max, Len_so_far)
        else:
            Len_so_far = 1
            left = right
            right += 1 

    return Len_max

## HASHSET

# Time Complexity -> O(N) because we traverse each consecutive subsequence only once. 
#                    (assuming hashset takes O(1) to search)
# Space Complexity -> O(N) because we are maintaining a HashSet.

# Approach: We will first push all are elements in the HashSet. Then we will run a for loop and 
# check for any number(x) if it is the starting number of the consecutive sequence by checking if 
# the HashSet contains (x-1) or not. If ‘x’ is the starting number of the consecutive sequence 
# we will keep searching for the numbers y = x+1, x+2, x+3, ….. 
# And stop at the first ‘y’ which is not present in the HashSet. Using this we can calculate 
# the length of the longest consecutive subsequence. 

def HashSet(arr) -> int:
    HashSet = []
    HashSet =  arr
    print(HashSet)
    Len_max = 0
    number = 0
    Len_so_far = 1
    for i in range(len(arr)):
        if ((arr[i] - 1) not in HashSet):
            Len_so_far = 1
            number = arr[i]

        while (HashSet.count(number + 1)):
            Len_so_far += 1
            number += 1

        Len_max = max(Len_max, Len_so_far)

    return Len_max

if __name__ == "__main__":
    arr = [100,200,1,2,3,4] 
    print("Brute Force", BruteForce(arr))
    print("Hash Set", HashSet(arr))