target = int(input())

if target % 3 == 0:
    print("0", str(target // 3))
elif target < 2:
    print("No")
else:
    total = 0
    x = 0
    y = 0
    while total < target-2:
        y += 1
        total += 3
    while (target - total) % 2 != 0:
        y -= 1
        total -= 3
        if y < 0:
            break
    if y < 0:
        print("No")
    else:
        if (target - total) % 2 == 0:
            while total != target:
                x += 1
                total += 2
            print(x,y)
        else:
            print("No")