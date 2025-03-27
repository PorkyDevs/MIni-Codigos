import random as rd

rule = list(range(37))+[7]*10

def girarRule():
    return rule

num7 = 0

for i in range(1000):
    print(girarRule())
    rd.shuffle(rule)
    if rule[0] == 7:
        num7 += 1




print(num7)