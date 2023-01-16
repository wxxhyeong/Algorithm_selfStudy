'''
백준 1158. 요세푸스 문제
'''
n, k = map(int, input().split())
people = [i+1 for i in range(n)]
ans = []
idx = k-1
for i in range(n-1):
    ans.append(people.pop(idx))
    idx = (idx + k -1) % len(people)
ans.append(people.pop())

print("<", end="")
for i in range(len(ans)):
    if i != len(ans)-1:
        print(ans[i], end =", ")
        continue
    print("{}>".format(ans[i]))

