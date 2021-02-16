from tkinter import *
from PIL import ImageTk, Image

root = Tk()
root.title("Learn To Code at Codemy.com")
root.iconbitmap("ogbro.ico")
root.geometry("400x400")

vertical = Scale(root, from_=0, to=400)
vertical.pack()

def slide(var):
    label = Label(root, text=horizontal.get()).pack()
    root.geometry(str(horizontal.get()) + "x" + str(vertical.get()))

horizontal = Scale(root, from_=0, to=400, orient=HORIZONTAL, command=slide)
horizontal.pack()



btn = Button(root, text="click me", command=slide).pack()

root.mainloop()
