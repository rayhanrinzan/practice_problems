import math

x1, y1 = map(float, input().split())
x2, y2 = map(float, input().split())
x3, y3 = map(float, input().split())

def distance(point1, point2):
    x1, y1 = point1
    x2, y2 = point2
    return math.sqrt((x2 - x1) ** 2 + (y2 - y1) ** 2)

s1 = distance((x1, y1), (x2, y2))
s2 = distance((x2, y2), (x3, y3))
s3 = distance((x3, y3), (x1, y1))
if math.isclose(s1, s2, rel_tol=1e-9):  
    apex = (x2, y2)
    bp1 = (x3, y3)
    bp2 = (x1, y1)
if math.isclose(s2, s3, rel_tol=1e-9):
    apex = (x3, y3)
    bp1 = (x2, y2)
    bp2 = (x1, y1)
else:  
    apex = (x1, y1)
    bp1 = (x2, y2)
    bp2 = (x3, y3)

mpx = (bp1[0] + bp2[0]) / 2
mpy = (bp1[1] + bp2[1]) / 2
vx = apex[0] - mpx
vy = apex[1] - mpy
angle = math.degrees(math.atan2(vy,vx))

if angle < 0:
    angle += 360

print(angle)