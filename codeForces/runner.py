line = input().split()
sum = int(line[0])
index = 1
for index in range(1, len(line), 2):
    operation = line[index]
    if operation == "=":
        print(" ".join(line), sum)
        break
    num = int(line[index+1])
    if operation == "+":
        sum += num
    elif operation == "-":
        sum -= num