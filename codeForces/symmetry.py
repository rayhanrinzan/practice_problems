import math

symmetrical = False

l = list(map(int, input().split()))
r, c = l[0],l[1]

oddRows = True
if r % 2 == 0:
    oddRows = False
oddCols = True
if c % 2 == 0:
    oddCols = False
    
matrix = []
for i in range(r):
    matrix.append(input())
    
tophalf = []
halfRows = math.floor(r/2)
for i in range(halfRows):
    tophalf.append(matrix[i])

bottomhalf = []
fullRows = r - math.floor(r/2)
for i in range(fullRows, len(matrix)):
    bottomhalf.append(matrix[i])

if oddCols:
    for x in range(len(tophalf)):
        line = tophalf[x].split()
        index = len(line)//2
        line.pop(index)
        tophalf[x] = " ".join(line)
    for x in range(len(bottomhalf)):
        line = bottomhalf[x].split()
        index = len(line)//2
        line.pop(index)
        bottomhalf[x] = " ".join(line)

bottomhalf.reverse()

lefthalf = []
halfCols = c//2
for x in range(halfCols):
    line = []
    for i in range(len(matrix)):
        line.append(matrix[i].split()[x])
    lefthalf.append(line)

righthalf = []
fullCols = c - c//2
for x in range(fullCols, c):
    line = []
    for i in range(len(matrix)):
        line.append(matrix[i].split()[x])
    righthalf.append(line)


if oddRows:
    for x in range(len(righthalf)):
        line = righthalf[x]
        index = len(line)//2
        line.pop(index)
        righthalf[x] = " ".join(line)
    for x in range(len(lefthalf)):
        line = lefthalf[x]
        index = len(line)//2
        line.pop(index)
        lefthalf[x] = " ".join(line)

lefthalf.reverse()

if bottomhalf == tophalf and righthalf == lefthalf:
    symmetrical = True   

print(symmetrical)