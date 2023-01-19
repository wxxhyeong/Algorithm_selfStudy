'''
백준 2346. 풍선 터뜨리기
'''
from collections import deque
n = int(input())
queue = deque([_ for _ in range(1,n +1)])
move = list(map(int, input().split()))
ans = []
for i in range(n):
    ans.append(queue.popleft())
    if move[ans[-1]-1] > 0:
        queue.rotate(-(move[ans[-1]-1]-1))
    else:
        queue.rotate(-move[ans[-1]-1])
for j in ans:
    print(j,end = " ")


