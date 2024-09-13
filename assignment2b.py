#!/usr/bin/env python
import random
from letters import file2pairs
import sys

def main():
    file = sys.argv[1]
    prev_letter = sys.argv[2]
    letters_dict = file2pairs(file)  
    prob  = letters_dict[prev_letter]
    p_value = prob.values()
    support = 'abcdefghijklmnopqrstuvwxyz '
    answer = random.choices(support, p_value)
    print(answer[0])
    
main()
    

    
