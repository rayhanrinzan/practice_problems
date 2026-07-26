for _ in range(int(input())):
    m = []
    for i in range(1000000):
        m.append(0)
    for k in range(int(input())):
        a, b = map(int, input().split())
        place = a - 1
        for j in range(b):
            m[place] += 1
            place += 1
    print(max(m))