n = int(input())
for i in range(n):
    numbers = input().split(",")
    v = (float(numbers[0])*float(numbers[1]) + float(numbers[2])*float(numbers[3]))/(float(numbers[1])+float(numbers[3]))
    answer = f"{v:.2f}"
    print(answer)