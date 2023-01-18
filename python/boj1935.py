'''
백준 1935. 후위표기식
(3+5x(4-6)/2) = -2

5
ABC*+DE/-
1
2
3
4
5
'''
from collections import deque
n = int(input())
text = input()
value = [0 for i in range(26)]
for i in range(n):
    value[i] = int(input())

res = 0
temp = deque()
for i in text:

    if 65 <= ord(i) <= 90:
        temp.append(value[ord(i)-65])
    else:
        y = temp.pop()
        x = temp.pop()

        if i == "*":
            temp.append(x*y)
        elif i == "/":
            temp.append(x/y)
        elif i == "+":
            temp.append(x+y)
        elif i == "-":
            temp.append(x-y)

print("{:.2f}".format(temp.pop()))
