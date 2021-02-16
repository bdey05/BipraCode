age = int(input("Enter your age"))
name = input("Enter your name")
if age < 18 and name == "Joey":
    print("Woah you underaged")
elif 18<age<21 or name == "Steez":
    print("Fat man")
elif age == 33 or not(name == "Randy"):
    print("wooo")
else:
    print("Yooo")