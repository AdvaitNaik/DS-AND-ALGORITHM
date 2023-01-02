nums = [1,1,1,3,3,2,2,2]
elements = dict()

for num in nums:
    if(num in elements):
        elements[num] += 1
    else:
        elements[num] = 1

print(elements)