### BRUTE FORCE

# Time Complexity -> O(Nk)

# Intuition: We want to look for a window of size k at a time and then shift to the next window. 
# So why not do exactly what we are asked to! We fix our window of size k at first and 
# then calculate the maximum element in it. 
# We then shift our window to the next position and do the same process until we exhaust all possibilities
# i.e we reach the end of the array.

# Approach: We initially keep a left and right pointer to fix our window to a size of k. 
# We compute the maximum element present in this window using the GetMax function. 
# Further, update the left and right pointer by left++ and right++ every time to get to a new 
# window of size k using a while loop. For every new window we encounter, 
# we add the maximum element using the GetMax function to our data structure.

def maxSlidingWindowBrute(arr, k) -> list[int]:
    ans = []
    left=0
    right=k-1
    for i in range(len(arr)-k+1):
        current_max = arr[i]
        for j in range(i, i+k):
            current_max = max(current_max, arr[j])
        ans.append(current_max)
    return ans

if  __name__ == "__main__":
    arr = [4,0,-1,3,5,3,6,8]
    k = 3
    print(maxSlidingWindowBrute(arr, k))