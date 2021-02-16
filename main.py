import os
from datetime import datetime

#Prints working directory name
print(os.getcwd())

#Change dir
os.chdir('C:/Users/bipra/BrawlhallaReplays')

print(os.getcwd())

#Prints items in directory
print(os.listdir())


#Makes directory
#os.mkdir('ostest')

#Makes multi level directory
#os.makedirs('ostest/subdir')

#Rename file (rename(ogname, newname))
#os.rename('brawl.replay', 'BrawlhallaMontage.replay')

#getfileinfo
print(os.stat('BrawlhallaMontage.replay'))

print(os.stat('BrawlhallaMontage.replay').st_mtime)
x = os.stat('BrawlhallaMontage.replay').st_mtime

print(datetime.fromtimestamp(x))

#get paths, directories, and file names
'''for dirpaths, dirnames, filenames in os.walk('C:/Users/bipra/'):
    print(dirpaths, dirnames, filenames)'''

#Get environment variables
print(os.environ.get('HOME'))

#Split txt
print(os.path.splitext('/tmp/test.txt'))
