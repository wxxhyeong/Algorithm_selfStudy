'''
백준 9012. 괄호
괄호의 모양이 바르게 구성된 문자열을 올바른 괄호 문자열(VPS)라고 부른다.
주어진 괄호 문자열이 VPS 인지 아닌지를 판단해서 그 결과를 YES or NO로 출력하시오.
'''
t = int(input())
for _ in range(t): # 입력받은 횟수만큼 반복
    ps = input() # 입력받는 괄호 문자열
    cnt = 0 # 괄호의 개수가 짝을 이루는지 아닌지를 체크하기 위한 count 변수

    for s in ps:  # 입력받은 괄호 문자열을 한 글자씩 확인

        if cnt >= 0: # count가 0보다 작다는 것은 닫는 괄호 ")"가 먼저 나왔다는 뜻이므로, vps를 구성할 수 없음을 확인
            if s == "(":
                cnt += 1
            else:
                cnt -= 1
        else:
            break

    if cnt == 0:
        print("YES")
    else:
        print("NO")

