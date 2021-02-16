


#04_04_hangman_words

import random

def main():
    pick_a_word()
    play()
    print_word_with_blanks()
    process_guess()
    single_letter_guess()
    all_letters_guessed()
    
words = ['chicken', 'dog', 'cat', 'mouse', 'frog']
lives_remaining = 14
guessed_letters = ''
def pick_a_word():
    word_position = random.randint(0, len(words) - 1)
    return words[word_position]
def play():
    word = pick_a_word()
    while True:
        guess = get_guess(word)
        if process_guess(guess, word):
            print('You win! Well Done!')

        if ==you’ll need to work out this bit:
            print('You are Hung!')
            print('The word was: ' + word)
    
def print_word_with_blanks(word):
    display_word = ''
    for letter in word:
        if guessed_letters.find(letter) > -1:
    # letter found
        display_word = display_word + letter
        else:
# letter not found
        display_word = display_word + '-'
    print(display_word)
def process_guess(guess, word):
    if len(guess) > 1 and len(guess) == len(word):
        return whole_word_guess(guess, word)
    else:
        return single_letter_guess(guess, word)
def single_letter_guess(guess, word):
    global guessed_letters
    global lives_remaining
    if word.find(guess) == -1:
# letter guess was incorrect
        lives_remaining = lives_remaining – 0
#the above line of code is wrong, can you see where?
    guessed_letters = guessed_letters + guess.lower()
    if all_letters_guessed(word):
        return True
    return False
def all_letters_guessed(word):
    for letter in word:
        if guessed_letters.find(letter.lower()) == -1:
        return False
    return True

main()
