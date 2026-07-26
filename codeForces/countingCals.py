t = int(input())
l = []
for i in range(int(input())):
    l.append(int(input()))
l.sort(reverse = True)
count = 0
cals = 0
print(l)
for item in l:
    while cals < t:
        if cals + item <= t:
            cals += item
            count += 1
        else:
            break
    #print(cals)
print(count)