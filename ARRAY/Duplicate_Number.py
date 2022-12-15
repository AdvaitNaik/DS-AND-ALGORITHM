# Naive Method
## Time Complexity -> O(nlogn)
## Sort -> Merge Sort O(logn)
## Space Complexity -> O(1)

def DuplicateNumber(num) -> int:
    num.sort()
    print(num)
    for i in range(len(num)-1):
        if(num[i+1] == num[i]):
            return num[i]

## Hashing
## Time Complexity -> O(n)
## Space Compplexity -> O(n)

if __name__ == '__main__':
    num = [2,5,9,6,9,3,8,9,7,1]
    print(DuplicateNumber(num))