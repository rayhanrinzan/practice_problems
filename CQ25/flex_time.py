for i in range(int(input())):
    s = 0
    for x in range(int(input())):
        s += sum(list(map(int, input().split())))
    
    print(s-40)