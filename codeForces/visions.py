actual = list(input())
seen = list(input())
totalWrong = 0
right = 0
slightlyWrong = 0
misconceptions = {}

for i in range(len(actual)):
    actualChar = actual[i]
    seenChar = seen[i]
    if seenChar != actualChar:
        totalWrong += 1
        misconceptions[actualChar] = seenChar
        misconceptions[seenChar] = actualChar
    else:
        right += 1

similar = {}
for i in range(int(input())):
    l = input().split()
    if l[0] in similar and l[1] in similar:
        similar[l[0]].append(l[1])
        similar[l[1]].append(l[0])
    elif l[1] in similar:
        similar[l[1]].append(l[0])
        similar[l[0]] = [l[1]]
    elif l[0] in similar:
        similar[l[0]].append(l[1])
        similar[l[1]] = [l[0]]
    else:
        similar[l[0]] = [l[1]]
        similar[l[1]] = [l[0]]


for key,value in misconceptions.items():
    if (value in similar and similar[value] == key) or (key in similar and similar[key] == value):
        totalWrong -= 1
        slightlyWrong += 1
    
print(misconceptions)
print(similar)