numbers = [1, 2, 6, 3, 1, 1, 5] 

unique_nums = set(numbers)
print(unique_nums)


artist = {'Chagall', 'Kandinskij', 'Dalí', 'da Vinci', 'Picasso', 'Warhol', 'Basquiat'}


# check if there is Turner in the set artist
print('Turner' in artist) 
artist.add('Turner')

#remove the last item
print(artist.pop()) 

#remove duplicate Entry
HashSet = set()
lst = [1,1,2,2,2,3,3]
for el in lst:
    HashSet.add(el)

print(HashSet)