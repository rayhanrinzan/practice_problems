import math
for _ in range(int(input())):
    t = float(input())
    s = 70.00
    o = 210.00
    k = (-1/15)*math.log(50/140)
    x = (-1/k)*math.log((t-s)/(o-s))
    print(x)