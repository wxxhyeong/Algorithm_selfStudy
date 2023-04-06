n = int(input())
numbers = list(map(int, input().split()))

m = max(numbers)
avg = 0
sum = 0

for k in numbers:
    sum += k/m * 100

print(sum/n)