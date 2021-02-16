# Importing tkinter
from tkinter import *

# Creating the window
root = Tk()

# Creating entry widget
e = Entry(root, width=50)
e.pack()

# Puts a prompt in the entry widget
e.insert(0, "Enter Your Name: ")


def myClick():
    hello = "Hello " + e.get()
    myLabel = Label(root, text=hello)
    myLabel.pack()


# Creating a button widget
myButton = Button(root, text="Enter Your Name", command=myClick)
myButton.pack()

# Creating an event loop
root.mainloop()

