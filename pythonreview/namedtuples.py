from collections import namedtuple

Point = namedtuple('Point', 'x y z')
newP = Point(3,4,5)

print(newP._fields)
print(newP._asdict())

x = newP._replace(y=6)

print(x)

p2 = Point._make(['a', 'b', 'c'])

print(p2)