def func(x):
    func2 = lambda x: x + 5
    return func2(x) +5

print(func(9))

a = [1,2,3,4,5,6,7,8,9]

print(list(map(lambda x:x+5,a)))

