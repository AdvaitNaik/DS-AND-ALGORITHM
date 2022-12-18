phonebook = {
    "bob": 7387,
    "alice": 3719,
    "jack": 7052,
}

squares = {x: x * x for x in range(6)}


print(len(phonebook))

thisdict = {
  "brand": "Ford",
  "electric": False,
  "year": 1964,
  "colors": ["red", "white", "blue"]
}

print(phonebook.keys())

print(thisdict.get("brand"))

print(thisdict.values())

print(thisdict.items())
# lst.sort(key=lambda x:x[1])

for x in thisdict:
  print(x)

for x in thisdict.values():
  print(x)

for x in thisdict.keys():
  print(x)

for x, y in thisdict.items():
  print(x, y)

## dictionary delete
# thisdict.update({"year": 2020})
# thisdict.pop("model")
# thisdict.popitem()
# del thisdict["model"]
# thisdict.clear()