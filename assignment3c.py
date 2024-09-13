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

def generate_sentence(model, initial_word, length):
    sentence = [initial_word]


    for _ in range(length - 1):
      next_words = model[sentence[-1]]
      if not next_words:
        break
    next_word = random.choice(list(next_words))
    sentence.append(next_word)

    return ' '.join(sentence)

if __name__ == '__main__':
    input_text = "The Republic of Plato is the longest of his works with the exception of the Laws, and is certainly the greatest of them. There are nearer approaches to modern metaphysics in the Philebus and in the Sophist; the Politicus or Statesman is more ideal; the form and institutions of the State are more clearly drawn out in the Laws; as works of art, the Symposium and the Protagoras are of higher excellence."

model = probs_model(input_text)

seed_word = "The"
sentence_length = 10

generated_sentence = generate_sentence(model, seed_word, sentence_length)

print("Input text:", input_text)
print(f"Given seed word: {seed_word}', The generated next word: {generated_sentence}")