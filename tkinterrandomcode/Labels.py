#Importing tkinter
from tkinter import *

#Creating the window
root = Tk()

#Creating label widget
myLabel1 = Label(root,text="Hello World!")
myLabel2 = Label(root,text="My Name is John Elder")
myLabel3 = Label(root,text=" ")


#The following shows two ways to display text onto GUIs (The grid system is the optimal way)
#Shoving it on screen using pack method
myLabel1.pack()

#Shoving it on screen using grid system
myLabel1.grid(row=0, column=0)
myLabel2.grid(row=1, column=5)
myLabel3.grid(row=1, column=1)
