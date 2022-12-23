# Time Complexity -> O(n2)
# Space Complexity -> O(1)

price = [7, 1, 5, 3, 6, 4]
max_profit = float('-inf')
for i in range(len(price)):
    for j in range(i, len(price)):
        if(price[i] < price[j]):
            max_profit = max(max_profit, (price[j] - price[i]))
        
print(max_profit)

###
# Time Complexity -> O(n)
# Space Complexity -> O(1)

price = [7, 1, 5, 3, 6, 4]
max_profit = float('-inf')
min_buy = float('inf')

for i in range(len(price)):
    min_buy = min(min_buy, price[i])
    max_profit = max(max_profit, (price[i] - min_buy))

print(max_profit)