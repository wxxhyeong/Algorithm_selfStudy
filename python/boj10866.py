'''
백준 10866. 덱

덱 구현하기
'''
from collections import deque
import sys
input = sys.stdin.readline
n = int(input())
queue = deque()
res = []
for _ in range(n):
    order = input().split()

    if order[0] == "push_back":
        queue.append(order[1])
    elif order[0] == "push_front":
        queue.appendleft(order[1])
    elif order[0] == "pop_front":
        if not queue:
            res.append(-1)
            continue
        res.append(queue.popleft())
    elif order[0] == "pop_back":
        if not queue:
            res.append(-1)
            continue
        res.append(queue.pop())
    elif order[0] == "size":
        res.append(len(queue))
    elif order[0] == "empty":
        if queue:
            res.append(0)
        else:
            res.append(1)
    elif order[0] == "front":
        if not queue:
            res.append(-1)
            continue
        res.append(queue[0])
    elif order[0] == "back":
        if not queue:
            res.append(-1)
            continue
        res.append(queue[-1])

for i in res:
    print(i)