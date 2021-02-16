from collections import deque

d = deque('hello')
print(d)
d.append('3')
print(d)
d.appendleft('5')
print(d)
d.pop()
d.popleft()
print(d)
d.append('esees')
print(d)
d.extend("ewaea")
print(d)
d.extendleft("dadsa")
print(d)

d.rotate(3)
print(d)

e = deque('hello', maxlen=5)
print(e)
e.append(1)
print(e)