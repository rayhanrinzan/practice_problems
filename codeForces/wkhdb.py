for i in range(int(input())):
    l = list(map(float, input().split()))
    temp, dis = l[0], l[1]
    speed = 331.3+.606*temp
    dis *= 1000
    print(round(dis/speed, 2))