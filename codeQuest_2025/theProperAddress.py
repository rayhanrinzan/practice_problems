num = int(input())
for i in range(num):
    result = "VALID"
    numbers = input().split(".")
    for item in numbers:
        if item == "" or int(item) < 0 or int(item) > 255:
            result = "INVALID"
    if len(numbers) != 4:
        result = "INVALID"
    print(result)