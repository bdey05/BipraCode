from tkinter import *
import sqlite3
import matplotlib.pyplot as plt
import numpy as py

# Creating the initial window
root = Tk()
root.title("Expense Calculator")
root.iconbitmap("icon.ico")
root.geometry("260x300")

def create():
    return

def enter():
    return

# Function that leads user to register window and saves info in database
def register():
    # Create register window
    registerwin = Tk()
    registerwin.title("Register")
    registerwin.geometry("260x200")
    regins = Label(registerwin, text="Welcome! \n Fill out the boxes below to create your account.", bg="light steel blue")
    regins.grid(row=0, column=0)
    usernamelbl = Label(registerwin, text="Enter a username")
    usernamelbl.grid(row=1, column=0)
    usernameentry = Entry(registerwin, width=35)
    usernameentry.grid(row=2, column=0, pady=5)
    passwordlbl = Label(registerwin, text="Enter a secure password")
    passwordlbl.grid(row=3, column=0)
    passwordentry = Entry(registerwin, width=35)
    passwordentry.grid(row=4, column=0,pady=5)
    createbtn = Button(registerwin, text="Create Account", command=create)
    createbtn.grid(row=5, column=0)

# Function that leads user to login window and matches their info to the account database
def login():
    loginwin = Tk()
    loginwin.title("Login")
    loginwin.geometry("268x200")
    loginins = Label(loginwin, text="Welcome Back! \n  Fill out the boxes below to log into your account", bg="powder blue")
    loginins.grid(row=0, column=0)
    usernamelbl2 = Label(loginwin, text="Enter your username")
    usernamelbl2.grid(row=1, column=0)
    usernameentry2 = Entry(loginwin, width=35)
    usernameentry2.grid(row=2, column=0, pady=5)
    passwordlbl2 = Label(loginwin, text="Enter your password")
    passwordlbl2.grid(row=3, column=0)
    passwordentry2 = Entry(loginwin, width=35)
    passwordentry2.grid(row=4, column=0, pady=5)
    enterbtn = Button(loginwin, text="Login", command=enter)
    enterbtn.grid(row=5, column=0)


# Opening message
greetinglbl = Label(root, text="Welcome to the site! \n Click the register button to create an account \n Click the login button to sign into your account", bg="orange")
greetinglbl.grid(row=0, column=0)

Label(root, text="         ").grid(row=1, column=0)
Label(root, text="         ").grid(row=2, column=0)
Label(root, text="         ").grid(row=3, column=0)


registerbtn = Button(root, text="Register", command=register, height=2, width=10)
registerbtn.grid(row=4, column=0)

loginbtn = Button(root, text="Login", command=login, height=2, width=10)
loginbtn.grid(row=5, column=0)


root.mainloop()

