from tkinter import *
from PIL import ImageTk, Image

root = Tk()
root.title("Learn To Code at Codemy.com")
root.iconbitmap("ogbro.ico")

def surprise():
    global my_img
    top = Toplevel()
    top.title("I am a god")
    my_img = ImageTk.PhotoImage(Image.open("color1.png"))
    my_label = Label(top, image=my_img).pack()
    button2 = Button(top, text="close window", command=top.destroy).pack()

button1 = Button(root, text = "Click me", command=surprise)
button1.pack()




mainloop()
