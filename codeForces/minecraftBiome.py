from collections import deque
def getNeighbors(x,y):
    lst = []
    if x < 19:
        if grid[x+1][y] == ".":
            if tuple([x+1,y]) not in seen:
                lst.append([x+1,y])
    if y < 19:
        if grid[x][y+1] == ".":
            if tuple([x,y+1]) not in seen:
                lst.append([x,y+1])
    if x > 0:
        if grid[x-1][y] == ".":
            if tuple([x-1,y]) not in seen:
                lst.append([x-1,y])
    if y > 0:
        if grid[x][y-1] == ".":
            if tuple([x,y-1]) not in seen:
                lst.append([x,y-1])
    return lst

rows = 20
cols = 20
grid = [[0]*cols for i in range(rows)]
for i in range(rows):
    line = list(input())
    for j in range(cols):
        grid[i][j] = line[j]

x,y = -1,-1
for i in range(rows):
    for j in range(cols):
        if grid[i][j] == 'T':
            x,y = i,j
            break
    if x != -1:
        break
seen = set()
seen.add(tuple([x,y]))
q = deque()
q.append([x,y])

while q:
    node = q.popleft()
    x,y = node[0],node[1]
    neighbors = getNeighbors(x,y)
    for nei in neighbors:
        q.append(nei)
        seen.add(tuple(nei))
        grid[nei[0]][nei[1]] = 'T'

for i in range(rows):
    l = ""
    for j in range(cols):
        l += grid[i][j]
    print(l)