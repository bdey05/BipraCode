import numpy as np

a = np.array([1, 2, 3], dtype = "int16")
print(a)

b = np.array([[9.0, 8.0, 7.0], [6, 5, 4]])
print(b)

#Dimensions
print(a.ndim)
print(b.ndim)
#Shape (x by y by z etc..)
print(a.shape)
print(b.shape)
#Data type
print(a.dtype)
print(b.dtype)
#How much data each item stores
print(a.itemsize)
print(b.itemsize)
#How many elements in array
print(a.size)
print(b.size)