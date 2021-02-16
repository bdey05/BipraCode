#.strip() remove leading and trailing whitespace

x = input("Enter: ")
print(x)

m = x.strip()

print(m)

#len() length of string
print(len(x))

#.lower() lowercase
x.lower()
print(x)

#.upper uppercase
x.upper()
print(x.upper())

#.split() splits string into list
print(x.split("x"))
list = x.split("x")
print(list[0])