#!/usr/bin/env python
import random
import nltk 
from nltk.tokenize import word_tokenize
from nltk import ConditionalFreqDist 
nltk.download('punkt')

def probs_model(text):
    words = word_tokenize(text)
    bigrams = list(nltk.bigrams(words))
    cond_freq_dist = ConditionalFreqDist(bigrams)
    return cond_freq_dist

def generate_next_word(model, initial_word):
    next_words = model[initial_word]
    if not next_words:
        return None
    next_word = random.choices(list(next_words))[0]
    return next_word

if __name__ == '__main__':
    input_text = "The Republic of Plato is the longest of his works with the exception of the Laws, and is certainly the greatest of them. There are nearerapproaches to modern metaphysics in the Philebus and in the Sophist;the Politicus or Statesman is more ideal; the form and institutions ofthe State are more clearly drawn out in the Laws; as works of art, theSymposium and the Protagoras are of higher excellence. "

    
    model = probs_model(input_text)
    initial_word = "Plato"
    generated_next_word = generate_next_word(model, initial_word)

    print("Input text:", input_text)
    print(f"Given seed word: {initial_word}', The generated next word: {generated_next_word}")
    




