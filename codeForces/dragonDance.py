n, maxDiff = map(int, input().split())
lst = list(map(int, input().split()))
newLst = []
lastSplit = 0
for i in range(1,n):
    if abs(lst[i-1]-lst[i])>maxDiff:
        newLst.append(i-lastSplit)
if newLst:
    print(max(newLst))
else:
    print(n)