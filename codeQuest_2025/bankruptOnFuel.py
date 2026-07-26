for i in range(int(input())):
    fuel, n = map(int, input().split(" "))
    tanks = input().split(" ")
    tanks = [int(x) for x in tanks]
    count = n
    for y in range(len(tanks)):
        rationForThisTank = fuel/count
        count-=1
        if tanks[y] - rationForThisTank <= 0:
            fuel = fuel + (rationForThisTank - tanks[y])
        else:
            fuel -= rationForThisTank
            tanks[y] = rationForThisTank
            
    print(tanks)