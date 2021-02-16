import private

from private import NotPrivate

test = NotPrivate('tim')
test.display()
test._display()