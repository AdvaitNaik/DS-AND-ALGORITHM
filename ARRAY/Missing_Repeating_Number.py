# COUNT SORT
## Time Complexity -> O(n) + O(n) -> O(2n)
## Space Complexity -> O(n)

# Since the numbers are from 1 to N in the array arr[]

# Take a substitute array of size N+1 and initalize it with 0.
# Traverse the given array and increase the value of substitute[arr[i]] by one .
# Then again traverse the substitute array starting from index 1 to N.
# If you find any index value greater than 1 that is repeating element A.

# If you find any index value = 0 then that is the missing element B.

def repeatedNumberCount(num) -> list:
	freq = [0] * (len(num)+1)
	for i in range(len(num)):
		freq[num[i]] += 1

	arr = []
	for i in range(1,len(freq)):
		if (freq[i] == 2 or freq[i] == 0):
			arr.append(i)

	return arr
	
# TSUM AND SUM SQUARE

# X <- Missing Number
# Y <- Repating Number
# SUM = N(N+1)/2
# SUM-SQUARE = N(N+1)(2N+1)/6
# X-Y
# X^2 - Y^2
# Missing Number (X) = ((SUM + SUM-SQUARE)/ SUM)/ 2
# Repeating Number (Y) = X - SUM

## Time Complexity -> O(n)
## Space Complexity -> O(1)

def repeatedNumber(A):
	length = len(A)
	Sum_N = (length * (length + 1)) // 2
	Sum_NSq = ((length * (length + 1) * (2 * length + 1)) // 6)
	
	missingNumber, repeating = 0, 0
	
	for i in range(len(A)):
		Sum_N -= A[i]
		Sum_NSq -= A[i] * A[i]
		
	missingNumber = (Sum_N + Sum_NSq // Sum_N) // 2
	repeating = missingNumber - Sum_N
	
	ans = []
	ans.append(repeating)
	ans.append(missingNumber)
	
	return ans

# Driver code
v = [ 4, 3, 6, 2, 1, 6, 7 ]
res = repeatedNumberCount(v)
print(res)
res = repeatedNumber(v)

for i in res:
	print(i, end = " ")


## XOR





