from tkinter import *
from PIL import ImageTk, Image

root = Tk()
root.title("Learn To Code at Codemy.com")
root.iconbitmap("ogbro.ico")

# Creating the frame
frame = LabelFrame(root, text="This is my Frame...", padx=5, pady=5)
frame.pack(padx=10, pady=10)

# Placing button in the frame
b = Button(frame, text="Don't Click Here!")
b.grid(row=0, column=0)

root.mainloop()
