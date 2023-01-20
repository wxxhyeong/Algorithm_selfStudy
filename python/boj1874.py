'''
백준 1874. 스택 수열
'''
from collections import deque
import sys
input = sys.stdin.readline

n = int(input())
num = deque([i for i in range(1,n+1)]) # temp를 채우기 위한 수의 나열을 큐로 선언 (하나씩 pop되도록 하기 위해)
stack = [] # 사용자로부터 입력 받는 수열을 저장할 스택
cnt = 1 # 큐에 수가 어디까지 저장되었는 지를 가르키는 count 변수
ans ="" #결과

for i in range(n): #사용자한테 입력 받는 수만큼 반복
    k = int(input()) # 사용자 입력

    for j in range(cnt, k+1): # count부터 현재 입력 받은 수까지를 stack에 저장 반복
        stack.append(num.popleft()) # num의 오른쪽(작은 수)부터 pop하여서 스택에 저장
        ans += "+\n"
        cnt += 1

    if stack[-1] == k: # 입력 받은 값과 스택의 탑의 값이 같으면 스택의 값을 pop
        stack.pop()
        ans += "-\n"
        continue


if not stack: # 정상적으로 수행하였을 경우 stack이 비게 되므로 결과를 반환
    print(ans)
else: # temp에 저장하면서 수열을 이룰 수 없었던 경우 stack의 값이 남아있으므로 "NO"를 출력
    print("NO")
