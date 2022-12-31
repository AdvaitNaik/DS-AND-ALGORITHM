# Intuition: We can simply use 2 loops and track every transaction and maintain a variable maxPro to contain the 
# max value among all transactions.

# Approach: 

# Use a for loop of ‘i’ from 0 to n.
# Use another for loop of j from ‘i+1’ to n.
# If arr[j] > arr[i] , take the difference and compare  and store it in the maxPro variable.
# Return maxPro.

# Time Complexity -> O(n^2)
# Space Complexity -> O(1)

price = [7, 1, 5, 3, 6, 4]
max_profit = float('-inf')
for i in range(len(price)):
    for j in range(i, len(price)):
        if(price[i] < price[j]):
            max_profit = max(max_profit, (price[j] - price[i]))
        
print(max_profit)

## 

# Intuition: We will linearly travel the array. We can maintain a minimum from the starting of the array and 
# compare it with every element of the array, if it is greater than the minimum then take the difference and 
# maintain it in max, otherwise update the minimum.

# Approach:

# Create a variable maxPro and store 0 initially.
# Create a variable minPrice and store some larger value(ex: MAX_VALUE) value initially.
# Run a for loop from 0 to n.
# Update the minPrice if it is greater than the current element of the array
# Take the difference of the minPrice with the current element of the array and compare and maintain it in maxPro.
# Return the maxPro.


# Time Complexity -> O(n)
# Space Complexity -> O(1)

price = [7, 1, 5, 3, 6, 4]
max_profit = float('-inf')
min_buy = float('inf')

for i in range(len(price)):
    min_buy = min(min_buy, price[i])
    max_profit = max(max_profit, (price[i] - min_buy))

print(max_profit)                 