def isValidPos(i, j, n, m):
    if (i < 0 or j < 0 or i > n - 1 or j > m - 1):
        return 0
    return 1
 
def getNeighbors(arr, i, j, index):
 
    n = len(arr)
    m = len(arr[0])
 
    v = []
 
    if (isValidPos(i - 1, j - 1, n, m)):
        if arr[i - 1][j - 1] == word[index]:
            v.append([i - 1,j - 1])
            
    if (isValidPos(i - 1, j, n, m)):
        if arr[i - 1][j] == word[index]:
            v.append([i - 1,j])
        
    if (isValidPos(i - 1, j + 1, n, m)):
        if arr[i - 1][j + 1] == word[index]:
            v.append([i - 1,j + 1])
        
    if (isValidPos(i, j - 1, n, m)):
        if arr[i][j - 1] == word[index]:
            v.append([i,j - 1])
        
    if (isValidPos(i, j + 1, n, m)):
        if arr[i][j + 1] == word[index]:
            v.append([i,j + 1])
        
    if (isValidPos(i + 1, j - 1, n, m)):
        if arr[i + 1][j - 1] == word[index]:
            v.append([i + 1,j - 1])
        
    if (isValidPos(i + 1, j, n, m)):
        if arr[i + 1][j] == word[index]:
            v.append([i + 1,j])
        
    if (isValidPos(i + 1, j + 1, n, m)):
        if arr[i + 1][j + 1] == word[index]:
            v.append([i + 1,j + 1])
 
    return v

def dfs(word, node, index, l, seen):
    #print(l)
    #print(index)
    index += 1
    x,y = node[0],node[1]
    l.append(node)
    if index == len(word): #didnt need this, if this was the problem im ending it
        return l
    seen.add(tuple(node))
    neighbors = getNeighbors(grid, x, y, index)
    for nei in neighbors:
        if tuple(nei) not in seen:
            newL = l.copy()
            a = dfs(word, nei, index, newL, seen)
            if a is not None:
                return a
    
    
for t in range(int(input())):
    n, cols, rows = map(int, input().split())
    grid = [[0]*cols for i in range(rows)]
    for i in range(rows):
        row = input()
        for j in range(cols):
            grid[i][j] = row[j]
            
    for w in range(n):
        word = input()
        q = []
        coords = []
        for i in range(rows):
            for j in range(cols):
                if grid[i][j] == word[0]:
                    coords.append([i,j])
        while coords:
            seen = set()
            start = coords.pop()
            l = []
            #print(start)
            x = (dfs(word,start,0,l, seen))
            if x is not None:
                print(" ".join([str(a) + "," + str(b) for a,b in x]))