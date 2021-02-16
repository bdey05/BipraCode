text = input("Username: ")
try:
    number = int(text)
    print(number)
except:
    print('Invalid Username')
finally:
    print("nice")

global var
var = 0

def func():
    print(var)

func()