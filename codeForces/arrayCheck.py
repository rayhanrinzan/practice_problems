l1 = list()
l2 = list()
for _ in range(int(input())):
    l1.append(int(input()))

for _ in range(int(input())):
    l2.append(int(input()))
    
l1 = sorted(set(l1))
l2 = sorted(set(l2))

if l1 == l2:
    print("YES")
else:
    print("NO")