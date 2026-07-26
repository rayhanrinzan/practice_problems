import math
l = list(map(int, input().split()))
x1,y1 = l[0],l[1]
l = list(map(int, input().split()))
x2,y2 = l[0],l[1]
l = list(map(int, input().split()))
x3,y3 = l[0],l[1]

a = math.sqrt((x2-x1)**2+(y2-y1)**2)
b = math.sqrt((x3-x1)**2+(y3-y1)**2)
c = math.sqrt((x2-x3)**2+(y2-y3)**2)
s = (a+b+c)/2
ans = math.sqrt((s*(s-a)*(s-b)*(s-c)))
print(ans)