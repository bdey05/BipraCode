def func(f):
    def wrapper(*args, **kwargs):
        print("Started")
        f(*args, **kwargs)
        print("Ended")
    return wrapper

@func
def func2():
    print("I am func2")

@func
def func3():
    print("I am func3")

func2()
func3()