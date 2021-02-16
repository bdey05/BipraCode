class Point():
    def __init__(self, x=0, y=0):
        self.x = x
        self.y = y
        self.coords = (self.x, self.y)

    def move(self, x, y):
        self.x += x
        self.y += y

    def __add__(self, p):
        return Point(self.x + p.x, self.y + p.y)

    def __sub__(self, p):
        return Point(self.x - p.x, self.y - p.y)

    def __mul__(self, p):
        return self.x * p.x + self.y * p.y

    def __str__(self):
        return "(" + str(self.x) + "," + str(self.y) + ")"

p1 = Point(3,4)
p2 =  Point(1,3)
p3 = Point(8,7)
p4 = Point(6,5)
p5 = p1 + p2
p6 = p3 - p4
p7 = p3 * p4

print(p5, p6, p7)