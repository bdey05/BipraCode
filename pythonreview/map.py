li = [1,2,3,4,5,6,7,8,9,10]

def func(x):
    return x**2

#Map function
print(list(map(func,li)))

#List comprehension
print([func(x) for x in li if x%2 == 0])