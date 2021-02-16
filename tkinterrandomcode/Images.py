from tkinter import *
from PIL import ImageTk, Image

root = Tk()
root.title('Learn To Code at Codemy.com')

#Creating an icon
root.iconbitmap('ogbro.ico')

my_img = ImageTk.PhotoImage(Image.open("1999.png"))
my_label = Label(image=my_img)
my_label.pack()





#Creating an exit button
button_quit = Button(root, text="Exit Program", command=root.quit)
button_quit.pack()

root.mainloop()