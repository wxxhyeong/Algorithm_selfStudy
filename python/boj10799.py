'''
백준 10799. 쇠막대기
'''
pipe = input() #입력
res = 0 # 결과
stack = [] # 스택

for i in range(len(pipe)): #입력받은 문자열을 전부 순회
    if pipe[i] == '(': # 여는 괄호이면 스택에 추가
        stack.append(pipe[i])
    else: # 닫는 괄호인 경우
        if pipe[i-1] == "(": # 이전 문자가 여는 괄호이면 레이저로 판단
            stack.pop() # 쇠막대기가 아닌 레이저의 일부이기 때문에 pop
            res += len(stack) # 현재 저장된 스택의 크기만큼을 더해준다.
        else:
            stack.pop() # 이전 문자가 닫는 괄호이면 쇠막대기가 닫힌 것이므로
            res += 1 # 쇠막대기를 pop해주면서 개수를 하나 더해주고 종료

print(res)

