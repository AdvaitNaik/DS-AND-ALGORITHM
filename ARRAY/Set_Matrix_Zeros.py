## BRUTE FROCE
# Time Complexity -> O(n x m) + O(m x n)
# Space Complexity -> O(1)

matrix = [[0,1,2,0],
          [3,4,5,2],
          [1,3,1,5]]

row = len(matrix)
col = len(matrix[0]) 
for i in range(row):
    for j in range(col):
        if(matrix[i][j] == 0):
            for k in range(row):
                if (matrix[k][j] != 0):  matrix[k][j] = -1
            for k in range(col):
                if (matrix[i][k] != 0): matrix[i][k] = -1
print(matrix)

for i in range(row):
    for j in range(col):
        if(matrix[i][j] == -1):
            matrix[i][j] = 0

print(matrix)


## TWO DUMMY ARRAY
# Time Complexity -> O(n x m + m x n)
# Space Complexity -> O(n) + O(m)



## TWO DUMMY ARRAY INSIDE MATRIX
# Time Complexity -> O(2 (n x m))
# Space Complexity -> O(1) 