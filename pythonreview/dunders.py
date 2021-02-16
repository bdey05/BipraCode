class Person:
    def __init__(self, name):
        self.name = name

    def __repr__(self):
        return f"Person({self.name})"

    def __mul__(self,p):
        if type(p) is not int:
            raise Exception("Invalid Argument. Must be int.")
        self.name = self.name * p

    def __len__(self):
        return len(self.name)

x = Person("Bip")
x*4
print(len(x))