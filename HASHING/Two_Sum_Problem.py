## BRUTE FORCE
# Time Complexity -> O(n2)
# Space Complexity -> O(1)
def TwoSumProblem(num, target) -> int:
    for i in range(len(num)):
        for j in range(i+1, len(num)):
            if((target-num[i]) == num[j]):
                return i, j

## HASH MAP
# Time Complexity -> O(n)
# Space Complexity -> O(n)

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
    ans = TwoSumProblemHash(num, target)
    print(ans)