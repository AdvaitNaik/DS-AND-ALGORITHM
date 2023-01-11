# Approach:
# This problem can be solved easily and efficiently by using the stack data structure as it is based 
# on the Last in First out (LIFO) principle.

# Time Complexity -> O(2n + 2n) -> O(N)
# Space Complexity -> O(N)

def NextGreaterElement(arr) -> list[int]:
    
    stack = []
    n = len(arr)
    nge = [0] * n
    for i in range((2*n-1), -1, -1):
        print(i)
        while((len(stack) != 0) and (stack[len(stack)-1] <= arr[i % n])):
            stack.pop()
        if(i < n):
            if(len(stack) != 0):
                # print(stack[len(stack)-1])
                nge[i] = stack[len(stack)-1]
            else:
                nge[i] = -1

        stack.append(arr[i % n])
    return nge

if __name__ == "__main__":
    arr = [5,7,1,2,6,0]
    print(NextGreaterElement(arr))