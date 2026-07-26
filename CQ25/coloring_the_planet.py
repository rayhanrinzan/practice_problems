import math
for _ in range(int(input())):
    N, L, H = map(int, input().split())
    controlPoints = []
    for i in range(N):
        t, r, g, b = input().split()
        t = float(t)
        r, g, b = map(int, [r, g, b])
        temp = (H - L) * t + L
        controlPoints.append((temp, r, g, b))
    temp = int(input())
    
    p1 = p2 = 0
    done = False
    for i in range(N):
        if controlPoints[i + 1][0] == temp:
            print(" ".join([str(x) for x in controlPoints[i + 1][1:]]))
            done = True
            break
        if controlPoints[i + 1][0] > temp:
            p1 = i
            p2 = i + 1
            break
    
    if not done:
        t = (temp - controlPoints[p1][0]) / (controlPoints[p2][0] - controlPoints[p1][0])
        
        def lerp(a, b, t):
            return math.floor((1 - t) * a + t * b)
        
        result = []
        for i in range(1, 4):
            result.append(str(lerp(controlPoints[p1][i], controlPoints[p2][i], t)))
        
        print(" ".join(result))