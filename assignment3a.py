#!/usr/bin/env python
import random
import nltk 
from nltk.tokenize import word_tokenize
from nltk import FreqDist 
nltk.download('punkt')

def calc_word_probs(text):
    words = word_tokenize(text)
    word_counts = FreqDist(words)
    total_words = len(words)
    
    probs = {word: count/ total_words for word, count in word_counts.items()}
    return probs

def generate_word(probs):
    possible_outcomes = list(probs.keys())
    likely_usage = list(probs.values())

    generated_word = random.choices(possible_outcomes, likely_usage)[0]
    return generated_word

if  __name__    == '__main__':
    with open('republic.txt', 'r', encoding= 'utf-8') as file:
        input_text = file.read()

    word_probs = calc_word_probs(input_text)
    generated_word = generate_word(word_probs)

    print("Input text:", input_text)
    print("This is the the generated word:", generated_word)




    