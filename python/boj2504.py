'''
백준 2504. 괄호의 값
'''
str = input()
stack = []
tmp = 1
ans = 0

for i in range(len(str)):
    if str[i] == "(":
        tmp *= 2
        stack.append("(")
    elif str[i] == "[":
        tmp *= 3
        stack.append("[")

    elif str[i] == ")":
        if not stack or stack[-1] == "[": # 스택이 비어있는 상태이거나 stack의 top이 "[" 이 아닌경우, 잘못된 입력
            ans = 0
            break
        if str[i-1] == "(":
            ans += tmp
        tmp //= 2
        stack.pop()

    else:
        if not stack or stack[-1] == "(":
            ans = 0
            break

        if str[i-1] == "[":
            ans += tmp
        tmp //= 3
        stack.pop()

if stack:
    print(0)
else:
    print(ans)