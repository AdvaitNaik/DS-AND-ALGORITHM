lst = [[1,4],[0,4]]
lst.sort(key=lambda x:x[0])
print(lst)

## BRUTE FORCE
# Time Complexity -> O(nlogn) + O(n^2)
# O(NlogN) for sorting the array, and 
# O(N*N) because we are checking to the right for each index which is a nested loop.

# Space Compplexity -> O(n)

# Approach: First check whether the array is sorted or not.If not sort the array. 
# Now linearly iterate over the array and then check for all of its next intervals whether they are overlapping 
# with the interval at the current index. Take a new data structure and insert the overlapped interval. 
# If while iterating if the interval lies in the interval present in the data structure simply continue and 
# move to the next interval.

# lstf = []
# i=1

# while(i != len(lst)):
#     if(lst[i-1][1] > lst[i][0]):
#         lstf.append([lst[i-1][0], max(lst[i][1], lst[i-1][1])])

#     else:
#         lstf.append([lst[i][0], lst[i][1]])
#     i=i+1
# print(lstf)


## OPTIMAL

# Time Complexity -> O(nlogn) + O(n)
# O(NlogN) for sorting and O(N) for traversing through the array.
# Space Complexity -> O(N) to return the answer of the merged intervals.

# Approach: Linearly iterate over the array if the data structure is empty insert the interval in the data structure. 
# If the last element in the data structure overlaps with the current interval we merge the intervals by updating the 
# last element in the data structure, and if the current interval does not overlap with the last element in the 
# data structure simply insert it into the data structure.

# Intuition: Since we have sorted the intervals, the intervals which will be merging are bound to be adjacent. 
# We kept on merging simultaneously as we were traversing through the array and when the element was non-overlapping 
# we simply inserted the element in our data structure.


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