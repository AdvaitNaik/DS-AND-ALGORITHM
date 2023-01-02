# METHOD 1 - RECURSION

# METHOD 1 - TIME COMPLEXITY => O(2^nxm)
#            SPACE COMPLEXITY => O(Path Length) -> O(m-1)+(n-1)

def gridUniquePath(i, j):
    if (i == 0 and j == 0):
        return 1
    if (i < 0 or j < 0): 
        return 0
    up = gridUniquePath(i-1, j)
    left = gridUniquePath(i, j-1)
    return up + left

# METHOD 2 - RECURSION + MEMONIZATION
def gridUniquePath(i, j, dp):
    if (i == 0 and j == 0):
        return 1
    if (i < 0 or j < 0): 
        return 0
    up = gridUniquePath(i-1, j, dp)
    left = gridUniquePath(i, j-1, dp)
    dp[i][j] = up + left
    # print(dp)
    return dp[i][j]


if __name__ == "__main__":

    m = 3
    n = 3
    dp = [[-1]*m]*n
    print(gridUniquePath(m-1,n-1, dp))
    # print(dp)
    prev = [0]*n

    # METHOD 3 -  TABULATION
    dpTab = [[-1]*m]*n
    for i in range(m):
        temp=[0]*n
        for j in range(n):
            if (i == 0 and j == 0):
                # dpTab[i][j] = 1
                temp[j] = 1
            else:
                up=0
                left=0
                if(i>0): up = prev[j]
                if(j>0): left = temp[j-1]
                temp[j] = up + left
        print(temp)
        prev = temp
    print(prev[n-1])








# METHOD 2 - TIME COMPLEXITY => O(nxm)
#            SPACE COMPLEXITY => O(Path Length) -> O(m-1)+(n-1) + O(nxm)

# METHOD 3 - TIME COMPLEXITY => O(nxm)
#            SPACE COMPLEXITY => O(Path Length) -> O(nxm)