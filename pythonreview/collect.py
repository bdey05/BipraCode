from collections import Counter

c = Counter('gallad')
print(c)
r = Counter(['a', 'b', 'c'])
print(c)
e = Counter({'a':1, 'b':2})
print(c)
c = Counter(cats = 4, dogs = 7)
print(c)
print(list(c.elements()))

print(c.most_common())
e.subtract(r)
print(e)
e.update(r)
print(e)
c.clear()
print(c)

print(e-r)
print(e+r)
print(e&r)
print(e|r)