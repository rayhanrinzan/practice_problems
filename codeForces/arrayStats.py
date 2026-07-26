import statistics
n = int(input())
l = list(map(int, input().split()))
l.sort()
num = sum(l)
print(num/n)
if n % 2 == 0:
    print((l[n//2-1] + l[n//2])/2)
else:
    print(l[n//2])
print(statistics.mode(l))

print(l[n-1]-l[0])