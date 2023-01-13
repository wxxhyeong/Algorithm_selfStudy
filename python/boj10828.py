# boj 10828 스택
import sys
input = sys.stdin.readline
n = int(input())

stack = []

for i in range(n):

    order = input().split()

    if order[0] == "push":
        stack.append(int(order[1]))
    elif order[0] == "top":
        if len(stack) == 0:
            print(-1)
            continue
        print(stack[-1])
    elif order[0] == "pop":
        if len(stack) == 0:
            print(-1)
            continue
        top = stack.pop()
        print(top)
    elif order[0] == "size":
        print(len(stack))
    elif order[0] == "empty":
        if len(stack) == 0:
            print(1)
        else:
            print(0)


