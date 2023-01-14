arr = "abcda"
print(arr[1])


# Strings can be unpacked into a list to get a mutable representation
list("abcd")
print("".join(list("abcd")))


print("Count", arr.count('a'))
print("Length", len(arr))
print("Reverse", arr[::-1])
print("Slicing", arr[1:4])


txt = "Welcome to my 2nd world"
print("titlecase", txt.title())
print("Lower", txt.lower())


print(txt.split()[-1])
print(arr.split()[-1])


print(type("abc"))
print(type("abc"[0]))

# -------------------------- Python Multiline String --------------------------
# multiline string 
message = """
Never gonna give you up
Never gonna let you down
"""

print(message)

greet = 'Hello'

# ------------------------- Iterate Through a Python String ----------------------------
# iterating through greet string
for letter in greet:
    print(letter)

# ------------------------- String Membership Test -------------------------------------

print('a' in 'program') # True
print('at' not in 'battle') #False

# ------------------------- Join Two or More Strings -----------------------------------

greet = "Hello, "
name = "Jack"

# using + operator
result = greet + name
print(result)

# Output: Hello, Jack

# ------------------------ Python String Formatting (f-Strings) -----------------------
# Python f-Strings make it really easy to print values and variables. For example,

name = 'Cathy'
country = 'UK'

print(f'{name} is from {country}')

# ----------------------- Methods ---------------------------

# split()	-> splits string from left

# upper()	-> converts the string to uppercase
# lower()	-> converts the string to lowercase
# partition()	-> returns a tuple
# replace() -> replaces substring inside
# find()	-> returns the index of first occurrence of substring
# rstrip() -> removes trailing characters
# startswith() -> checks if string starts with the specified string
# isnumeric()	-> checks numeric characters
# index()	-> returns index of substring