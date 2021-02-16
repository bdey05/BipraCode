from tkinter import *
from PIL import ImageTk, Image
from tkinter import filedialog

root = Tk()
root.title("Learn To Code at Codemy.com")
root.iconbitmap("ogbro.ico")

def file():
    global my_image
    root.filename = filedialog.askopenfilename(initialdir="c:", title="Select A File", filetypes=(("png files", "*.png"),("all files", "*.*")))
    my_label = Label(root, text=root.filename).pack()
    my_image = ImageTk.PhotoImage(Image.open(root.filename))
    my_image_label = Label(image=my_image).pack()

btn = Button(root, text="Open File", command=file).pack()

root.mainloop()

