lst = [[1,3],[2,6],[8,10],[8,9],[9,11],[15,18],[2,4],[16,17]]
lst.sort(key=lambda x:x[0])
print(lst)

## BRUTE FORCE
# Time Complexity -> O(nlogn) + O(n2)
# Space Compplexity -> O(n)

# lstf = []
# i=1

# while(i != len(lst)):
#     if(lst[i-1][1] > lst[i][0]):
#         lstf.append([lst[i-1][0], max(lst[i][1], lst[i-1][1])])

#     else:
#         lstf.append([lst[i][0], lst[i][1]])
#     i=i+1
# print(lstf)

# Time Complexity -> O(nlogn) + O(n)
# Space Complexity -> O(n)

start = lst[0][0]
end = lst[0][1]
res = []

if (len(lst) == 0):
    # return res
    pass

for x in lst:
    if (end >= x[0]):
        end = max(end,x[1])

    else:
        res.append([start, end])
        start = x[0]
        end = x[1]

res.append([start, end])
print(res)

lst = [[1,3],[2,6],[8,10],[8,9],[9,11],[15,18],[2,4],[16,17]]