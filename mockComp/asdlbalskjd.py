for w in range(int(input())):
    n = int(input())
    rows, cols = n, n
    grid = [[0]* cols for i in range(rows)]
    for i in range(rows):
        row = list(input())
        for j in range(cols):
            grid[i][j] = int(row[j])
    seen = set()
    q = list()
    q.append([0,0])
    target = [n-1,n-1]
    count = 0
    while q:
        print(q)
        node = q.pop()
        seen.add(tuple(node))
        neighbors = getNeighbors(node)
        
        for nei in neighbors:
            if tuple(nei) not in seen:
                if nei == target:
                    count+= 1
                q.append(nei)
                
    print(count)