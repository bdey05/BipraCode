from tkinter import *
from PIL import ImageTk, Image
from tkinter import messagebox

root = Tk()
root.title("Learn To Code at Codemy.com")
root.iconbitmap("ogbro.ico")

# showinfo, showwarning, showerror, askquestion, askokcancel, askyesno
# These are all different types of message boxes
# Askyesno- yes=1, no=0
#Askokcancel- ok=1, cancel=0
#askquestion- yes = yes, no = no
#showerror = ok=ok,
#showwarning = ok=ok
#showinfo = ok=ok


#Creating the messagebox
def popup():
    response = messagebox.askyesno("This is my popup", "Hello World")
    Label(root, text=response).pack()

    # Applies to askyesno
    #if response == 1:
        Label(root, text="You clicked yes").pack()
    #else:
        Label(root, text="You clicked no").pack()

Button(root, text="Popup", command=popup).pack()


mainloop()
