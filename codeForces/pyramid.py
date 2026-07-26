num = int(input())
if num%2 != 0:
    xCount = 0
    while xCount != num:
        if xCount == 0:
            xCount += 1
        else:
            xCount += 2
        spaces = ""
        for _ in range((num-xCount)//2):
            spaces += " "
        exes = ""
        for _ in range(xCount):
            exes += "X"
        print(spaces + exes + spaces)
else:
    xCount = 0
    while xCount != num:
        xCount += 2
        spaces = ""
        for _ in range((num-xCount)//2):
            spaces += " "
        exes = ""
        for _ in range(xCount):
            exes += "X"
        print(spaces + exes + spaces)