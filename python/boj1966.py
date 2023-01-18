'''
백준 1966. 프린터 큐

4 2
1 2 3 4
2
'''
from collections import deque
t = int(input())
for i in range(t):
    n, m = map(int, input().split()) # n은 문서의 개수, m은 순서가 궁금한 문서
    seq = list(map(int,input().split())) # 문서들의 중요도
    queue = deque(seq)

    count = 0
    while queue:
        if queue[0] == max(queue):
            queue.popleft()
            count += 1

            if m == 0:
                print(count)
                break
            m -= 1

        else:
            queue.rotate(-1)
            if m == 0:
                m = len(queue) - 1
            else:
                m -= 1





