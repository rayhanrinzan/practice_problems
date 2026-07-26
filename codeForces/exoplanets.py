import math
x, y, z = map(int, input().split())
def d(x2,y2,z2):
    return math.sqrt(math.pow(abs(x2-x),2) + math.pow(abs(y2-y),2) + math.pow(abs(z2-z),2))
n = int(input())
planets = []
for i in range(n):
    x2,y2,z2,name = input().split()
    x2,y2,z2 = map(int, (x2,y2,z2))
    planets.append((name, d(x2,y2,z2)))

planets = sorted(planets, key = lambda x:x[1])
for key,value in planets:
    print(key)