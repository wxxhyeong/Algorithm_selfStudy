'''
백준 1158. 요세푸스 문제

update
1월 17일 join 사용
deque의 rotate(k)를 이용하여서도 풀이 가능
'''
n, k = map(int, input().split())
people = [i+1 for i in range(n)]
ans = []
idx = k-1
for i in range(n-1):
    ans.append(people.pop(idx))
    idx = (idx + k -1) % len(people)
ans.append(people.pop())

print('<'+', '.join(map(str, ans))+">")

