arr = "abcda"
print(arr[1])


# Strings can be unpacked into a list to get a mutable representation
list("abcd")
print("".join(list("abcd")))


print("Count", arr.count('a'))
print("Length", len(arr))
print("Reverse", arr[::-1])


txt = "Welcome to my 2nd world"
print("titlecase", txt.title())
print("Lower", txt.lower())


print(txt.split()[-1])
print(arr.split()[-1])


print(type("abc"))
print(type("abc"[0]))

