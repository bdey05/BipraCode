file = open('file.txt.txt', 'r')
f = file.readlines();

newlist = []

for line in f:
    if line[-1] == '\n':
        newlist.append(line[:-1])
    else:
        newlist.append(line)

print(newlist)

file = open('file.txt.txt', 'w')
file.write('python' + '\n' + 'is juul')

file.close()
