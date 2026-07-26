def resistance(a,b):
    return((a*b)/(a+b))
num = int(input())
l = list(map(int, input().split()))
for i in range(len(l)-1):
    l[i+1] = resistance(l[i], l[i+1])
print(l[len(l)-1])