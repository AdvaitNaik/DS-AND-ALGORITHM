## BRUTE FROCE

# Assuming all the elements in the matrix are non-negative. 
# Traverse through the matrix and if you find an element with value 0, then change all the elements in its row 
# and column to -1, except when an element is 0. The reason for not changing other elements to 0, but -1, 
# is because that might affect other columns and rows. Now traverse through the matrix again and if an element is -1 
# change it to 0, which will be the answer.


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
# print(matrix)

for i in range(row):
    for j in range(col):
        if(matrix[i][j] == -1):
            matrix[i][j] = 0

# print(matrix)


## TWO DUMMY ARRAY

# Intuition: Instead of traversing through each row and column, we can use dummy arrays to check if the particular row 
# or column has an element 0 or not, which will improve the time complexity.

# Approach: Take two dummy array one of size of row and other of size of column.
# Now traverse through the array.If matrix[i][j]==0 then set dummy1[i]=0(for row) and dummy2[j]=0(for column).
# Now traverse through the array again and if dummy1[i]==0  || dummy2[j]==0 then arr[i][j]=0,else continue.

# Time Complexity -> O(n x m + m x n)
# Space Complexity -> O(n) + O(m)

matrix = [[0,1,2,0],
          [3,4,5,2],
          [1,3,1,5]]

row = len(matrix)
dummy_row = [-1] * (row)
col = len(matrix[0]) 
dummy_col = [-1] * (col)
for i in range(row):
    for j in range(col):
        if(matrix[i][j] == 0):
            dummy_row[i] = 0
            dummy_col[j] = 0

# for rowp in matrix:
#     print(rowp)

for i in range(row):
    for j in range(col):
        if(dummy_row[i] == 0 or dummy_col[j] == 0):
            matrix[i][j] = 0

# for rowp in matrix:
#     print(rowp)



## TWO DUMMY ARRAY INSIDE MATRIX
# Time Complexity -> O(2 (n x m))
# Space Complexity -> O(1) 

# Intuition: Instead of taking two dummy arrays we can use the first row and column of the matrix for the same work. 
# This will help to reduce the space complexity of the problem. While traversing for the second time the first row and 
# column will be computed first, which will affect the values of further elements that’s why we traversing in the reverse direction.

# Approach:Instead of taking two separate dummy array,take first row and column of the matrix as the array 
# for checking whether the particular column or row has the value 0 or not.Since matrix[0][0] are overlapping.
# Therefore take separate variable col0(say) to check if the 0th column has 0 or not and use matrix[0][0] to check 
# if the 0th row has 0 or not.Now traverse from last element to the first element and check 
# if matrix[i][0]==0 || matrix[0][j]==0 and if true set matrix[i][j]=0,else continue.


matrix = [[0,1,2,0],
          [3,4,5,2],
          [1,3,1,5]]

for rowp in matrix:
    print(rowp)

col0 = 1
row = len(matrix)
col = len(matrix[0]) 

for i in range(row):
    # checking if 0 is present in the 0th column or not
    if(matrix[i][0] == 0):
        col0 = 0
    for j in range(col):
        if(matrix[i][j] == 0):
            matrix[i][0] = 0
            matrix[0][j] = 0

# traversing in the reverse direction and checking if the row or col has 0 or not and 
# setting values of matrix accordingly.
for i in range((row-1), -1, -1):
    for j in range((col-1), -1, -1):
        if (matrix[i][0] == 0 or matrix[0][j] == 0):
            matrix[i][j] = 0

    if (col0 == 0):
        matrix[i][0] = 0

for rowp in matrix:
    print(rowp)