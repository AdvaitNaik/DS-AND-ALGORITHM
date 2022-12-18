artist = ['Chagall', 'Kandinskij', 'Dalí', 'da Vinci', 'Picasso', 'Warhol']

# append method permits us to add Basquiat in our list of artists
artist.append('Basquiat') 
print(artist)

# remove method permits us to delete da Vinci in our list of artists
artist.remove('da Vinci') 
print(artist)

del artist[1]
print(artist)



# sort and lambda
lst = [('candy','30','100'), ('apple','10','200'), ('baby','20','300')]
lst.sort(key=lambda x:x[1])
print(lst)




months = ['january','february','march', 'april', 'may', 'june', 'july', 'august','september','october','november','december']
print(months)

# print the elemment with index 0
print(months[0])
# all the elements from index 0 to 6.
print(months[0:7]) 
# exchange the value in index 0 with the word birthday
months[0] = 'birthday' 
print(months)




# List reverse
print(months[::-1]) 
print(months.reverse()) 


# Join is a string method that takes a list of strings as an argument, and returns a string consisting of the list elements joined by a separator string.

first_str = "\n".join(["What","is","your","favourite","painting","?"])
second_str = "-".join(["Who","is","your","favourite","artist","?"])

print(first_str)
print(second_str)


