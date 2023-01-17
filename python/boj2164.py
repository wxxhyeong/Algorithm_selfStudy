'''
백준 2164. 카드2
'''
from collections import deque

n = int(input())
queue = deque([_ for _ in range(1,n+1)])

while len(queue) != 1:
    queue.popleft()
    queue.append(queue.popleft())

print(queue.pop())