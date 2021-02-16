'''class Cool:
    def fune(self):
        print("Hi")

    def getAtt(self):
        self.x = 9

Test = type('Test', (Cool,), {"x":5})

t = Test()
t.wy = "hello"
print(t.wy)
t.fune()'''

class Meta(type):
    def __new__(self, class_name, bases, attrs):
        print(attrs)
        return type(class_name, bases, attrs)


class Dog(metaclass=Meta):
    x = 5
    y = 8

    def hello(self):
        print("hi")

d = Dog()

