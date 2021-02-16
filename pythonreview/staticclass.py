class person(object):
    population = 50

    def __init__(self, name, age):
        self.name = name
        self.age = age
    
    @classmethod
    def getPopulation(cls):
        return cls.population

    @staticmethod
    def isAdult(age):
        return age>=18

    def display(self):
        print(self.name, "is", self.age, "years old")

Jim = person("Jim", 40)
print(person.getPopulation())
print(person.isAdult(6))