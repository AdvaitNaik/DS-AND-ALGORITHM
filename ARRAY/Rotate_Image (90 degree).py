## BRUTE FORCE
# Time Complexity -> O(n^2)
# Space Complexity -> O(1)

# Approach: Take another dummy matrix of n*n, and then take the first row of the matrix and put it in the last column 
# of the dummy matrix, take the second row of the matrix, and put it in the second last column of the matrix and so.

matrix =  [[1, 2, 3], [4, 5, 6], [7, 8, 9]]

row = len(matrix)
col = len(matrix[0])

rotated = [[-1] * col] * row

print(rotated)

for i in range(row):
    for j in range(col):
        rotated[j][row-i-1] = matrix[i][j]

print(rotated)

# Time Complexity: O(N*N) + O(N*N).One O(N*N) for transposing the matrix and the other for reversing the matrix.
# Space Complexity: O(1).

# Intuition: By observation, we see that the first column of the original matrix is the reverse of the first row of the 
# rotated matrix, so that’s why we transpose the matrix and then reverse each row, and since we are making changes in 
# the matrix itself space complexity gets reduced to O(1).

# Approach:

# Step1: Transpose of the matrix. (transposing means changing columns to rows and rows to columns)
# Step2: Reverse each row of the matrix.


matrix =  [[1, 2, 3], [4, 5, 6], [7, 8, 9]]

row = len(matrix)
col = len(matrix[0])
for i in range(row):
    for j in range(i):
        matrix[i][j], matrix[j][i] = matrix[j][i], matrix[i][j]

for row in matrix:
    row = row.reverse()

for num in matrix:
    print(num)
