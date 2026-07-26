line = input()
pattern = False
for i in range(2, len(line) // 2 + 1): 
    l = []
    for x in range(0, len(line) - i, i):
        l.append(line[x:x + i])
    if len(l) > 1 and l[0] == l[1]: 
        pattern = True
        break

print(pattern)