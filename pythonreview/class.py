class Dog:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def speak(self):
        print("Hi I am", self.name, "and I am", self.age, "years old")

    def talk(self):
        print("Bark")

class Cat(Dog):
    def __init__(self, name, age, color):
        super().__init__(name,age)
        self.color = color
    def talk(self):
        print("Meow")

Jimbo = Cat('Jimbo', 5, 'Red')
Jimbo.speak()
Jimbo.talk()

Bimbo = Dog('Bimbo', 5)
Bimbo.speak()
Bimbo.talk()