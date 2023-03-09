# "09:05 10","12:20 5","13:25 6","14:24 5"
# 12:05
# 10
# result = 80


def solution(bakery_schedule, current_time, k):
    answer = 0
    ch, cm = map(int, current_time.split(":"))

    for schedule in bakery_schedule:
        bread = schedule.split()[1]
        h, m = map(int, schedule.split()[0].split(":"))

        if k <= 0:
            break

        if h - ch > 0 or (h - ch == 0 and m - cm >= 0):
            k -= int(bread)
            if k <= 0:
                answer += (h - ch) * 60 + (m - cm)
        # print(schedule," ", k)
        # print("answer = ", answer)

    if k > 0:
        answer = -1
    return answer


# print(solution(["09:05 10", "12:20 5", "13:25 6", "14:24 5"], "12:05", 10))
print(solution(["12:00 10"], "12:00", 10))
