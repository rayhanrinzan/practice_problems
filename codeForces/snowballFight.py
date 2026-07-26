num  = int(input())
l1 = input().split()
l2 = input().split()
l = []
for i in range(len(l1)):
    l.append((l1[i],l2[i]))

count = 0
for i in range(len(l)):
    guy = l[i]
    guyCoat = guy[0]
    guyBoots = guy[1]
    for x in range(len(l)):
        otherCoat = l[x][0]
        otherBoots = l[x][1]
        if otherCoat != guyCoat and otherBoots != guyBoots:
            count += 1
print(count)