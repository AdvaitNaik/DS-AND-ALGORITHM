## BRUTE FORCE
# Time Complexity -> O(n)
# Space Complexity -> O(1)


x = 2.00000
n = 10
ans = 1
for i in range(n):
    ans = ans * x

print(ans)

# Time Complexity -> O(log2n)
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