from tkinter import *
from PIL import ImageTk, Image
import sqlite3

root = Tk()
root.title("Codemy.com - Learn To Code!")
root.iconbitmap("ogbro.ico")
root.geometry("400x400")

# Databases



# Create table
'''
c.execute("""CREATE TABLE addresses (
            first_name text, 
            last_name text,
            address text,
            city text,
            state,
            zipcode integer
            )""")
'''
def edit():
    # Create a database or connect to one
    conn = sqlite3.connect("address_book.db")
    # Create cursor
    c = conn.cursor()

    c.execute("""UPDATE addresses SET
        first_name = :first,
        last_name = :last,
        address = :address,
        city = :city,
        state = :state,
        zipcode = :zipcode
        
        WHERE oid = :oid""",
              {
                  'first': f_name_editor.get(),
                  'last': l_name_editor.get(),
                  'address': address_editor.get(),
                  'city': city_editor.get(),
                  'state': state_editor.get(),
                  'zipcode': zipcode_editor.get()

              }
        )


    # Commit Changes
    conn.commit()
    # Close Connection
    conn.close()

# Create Update function
def update():
    editor = Tk()
    editor.title("Update Record")
    editor.iconbitmap("ogbro.ico")
    editor.geometry("400x400")
    # Create a database or connect to one
    conn = sqlite3.connect("address_book.db")
    # Create cursor
    c = conn.cursor()
    record_id = delete_box.get()
    # Query the database
    c.execute("SELECT* FROM addresses WHERE oid =" + record_id)
    records = c.fetchall()

    # Commit Changes
    conn.commit()

    # Close Connection
    conn.close()

    # Create Global Variables
    global f_name_editor
    global l_name_editor
    global address_editor
    global city_editor
    global state_editor
    global zipcode_editor

    # Create Text Boxes
    f_name_editor = Entry(editor, width=30)
    f_name_editor.grid(row=0, column=1, padx=20)

    l_name_editor = Entry(editor, width=30)
    l_name_editor.grid(row=1, column=1)

    address_editor = Entry(editor, width=30)
    address_editor.grid(row=2, column=1)

    city_editor = Entry(editor, width=30)
    city_editor.grid(row=3, column=1)

    state_editor = Entry(editor, width=30)
    state_editor.grid(row=4, column=1)

    zipcode_editor = Entry(editor, width=30)
    zipcode_editor.grid(row=5, column=1)


    # Create Text Box Labels
    f_name_editor_label = Label(editor, text="First Name")
    f_name_editor_label.grid(row=0, column=0)

    l_name_editor_label = Label(editor, text="Last Name")
    l_name_editor_label.grid(row=1, column=0)

    address_editor_label = Label(editor, text="Address")
    address_editor_label.grid(row=2, column=0)

    city_editor_label = Label(editor, text="City")
    city_editor_label.grid(row=3, column=0)

    state_editor_label = Label(editor, text="State")
    state_editor_label.grid(row=4, column=0)

    zip_code_editor_label = Label(editor, text="Zip Code")
    zip_code_editor_label.grid(row=5, column=0)

    for record in records:
        f_name_editor.insert(0, record[0])
        l_name_editor.insert(0, record[1])
        address_editor.insert(0, record[2])
        city_editor.insert(0, record[3])
        state_editor.insert(0, record[4])
        zipcode_editor.insert(0, record[5])

    save_editor_btn = Button(editor, text="Save Record", command=update)
    save_editor_btn.grid(row=6, column=0, columnspan=2, pady=10, padx=10, ipadx=145)


# Create Function to Delete A Record
def delete():
    # Create a database or connect to one
    conn = sqlite3.connect("address_book.db")
    # Create cursor
    c = conn.cursor()

    #Delete a record
    c.execute("DELETE from addresses WHERE oid= " + delete_box.get())

    # Commit Changes
    conn.commit()
    # Close Connection
    conn.close()
# Create submit function
def submit():
    # Create a database or connect to one
    conn = sqlite3.connect("address_book.db")
    # Create cursor
    c = conn.cursor()
    # Insert Into Table
    record_id = delete_box.get()
    c.execute("INSERT INTO addresses VALUES (:f_name, :l_name, :address, :city, :state, :zipcode )",
              {
                  'f_name': f_name.get(),
                  'l_name': l_name.get(),
                  'address': address.get(),
                  'city': city.get(),
                  'state': state.get(),
                  'zipcode': zipcode.get(),
                    'oid': record_id
              }
              )
    # Commit Changes
    conn.commit()
    # Close Connection
    conn.close()

    # Clear The Text Boxes
    f_name.delete(0, END)
    l_name.delete(0, END)
    address.delete(0, END)
    city.delete(0, END)
    state.delete(0, END)
    zipcode.delete(0, END)

# Create display function
def display():
    # Create a database or connect to one
    conn = sqlite3.connect("address_book.db")
    # Create cursor
    c = conn.cursor()

    # Query the database
    c.execute("SELECT*, oid FROM addresses")
    records = c.fetchall()
    print_records = ''
    for record in records:
        print_records += str(record[0]) + " " + str(record[1]) +"\t" +" " + str(record[6]) + "\n"
    query_label = Label(root, text=print_records)
    query_label.grid(row=12, column=0, columnspan=2)
    # Commit Changes
    conn.commit()

    # Close Connection
    conn.close()

# Create Text Boxes
f_name = Entry(root, width=30)
f_name.grid(row=0, column=1, padx=20)

l_name = Entry(root, width=30)
l_name.grid(row=1, column=1)

address = Entry(root, width=30)
address.grid(row=2, column=1)

city = Entry(root, width=30)
city.grid(row=3, column=1)

state = Entry(root, width=30)
state.grid(row=4, column=1)

zipcode = Entry(root, width=30)
zipcode.grid(row=5, column=1)

delete_box = Entry(root, width=30)
delete_box.grid(row=9, column=1, pady=5)


# Create Text Box Labels
f_name_label = Label(root, text="First Name")
f_name_label.grid(row=0, column=0)

l_name_label = Label(root, text="Last Name")
l_name_label.grid(row=1, column=0)

address_label = Label(root, text="Address")
address_label.grid(row=2, column=0)

city_label = Label(root, text="City")
city_label.grid(row=3, column=0)

state_label = Label(root, text="State")
state_label.grid(row=4, column=0)

zip_code_label = Label(root, text="Zip Code")
zip_code_label.grid(row=5, column=0)

delete_box_label = Label(root, text="ID number")
delete_box_label.grid(row=9, column=0, pady=5)

# Create Submit Button
submit_btn = Button(root, text="Add record to database", command=submit)
submit_btn.grid(row=6, column=0, columnspan=2, pady=10, padx=10, ipadx=100)

# Create button to display database entry
display_btn = Button(root, text="See info", command=display)
display_btn.grid(row=7, column=0, columnspan=2, pady=10, padx=10, ipadx=137)

# Create a delete button
delete_btn = Button(root, text="Delete Record", command=delete)
delete_btn.grid(row=10, column=0, columnspan=2, pady=10, padx=10, ipadx=136)

# Create a update button
update_btn = Button(root, text="Update Record", command=update)
update_btn.grid(row=11, column=0, columnspan=2, pady=10, padx=10, ipadx=138)


root.mainloop()
