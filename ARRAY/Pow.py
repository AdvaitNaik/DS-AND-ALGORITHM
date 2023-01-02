## BRUTE FORCE
# Time Complexity -> O(n)
# Space Complexity -> O(1)

# Approach:  Looping from 1 to n and keeping a ans(double) variable. Now every time your loop runs, 
# multiply x with ans. At last, we will return the ans.

# Now if n is negative we must check if n is negative, if it is negative divide 1 by the and.


x = 2.00000
n = 10
ans = 1
for i in range(n):
    ans = ans * x

print(ans)

## Binary Exponentiation

# Approach: Initialize ans as 1.0  and store a duplicate copy of n i.e nn using to avoid overflow
# Check if nn is a negative number, in that case, make it a positive number.
# Keep on iterating until nn is greater than zero, now if nn is an odd power then multiply x with ans 
# ans reduce nn by 1. Else multiply x with itself and divide nn by two.
# Now after the entire binary exponentiation is complete and nn becomes zero, check if n is a negative 
# value we know the answer will be 1 by and.


# Time Complexity -> O(logn)
# Space Complexity -> O(1)

# Power -> n
# Number -> x
# [n%2 == 0] -> Even Number -> (x * x) (n/2)
# [n%2 == 1] -> Odd Number -> (answer * x) (n = n-1)

x = 2.00000
n = 10
ans = 1.0
if (n<0):
    n = n*(-1)

while(n>0):
    if(n%2 == 1):
        ans = ans * x 
        n = n-1
    else:
        x=x*x
        n = n/2

if(n<0):
    ans = 1/ans

print(ans)