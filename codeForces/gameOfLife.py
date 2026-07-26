def isntOnEdge(i, x):
    if i != 0 and i != c and x != 0 and x != r:
        return True
    else:
        return False

def adjacentToBarriers(i, x):
    if matrix[i-1][x] == "X" and matrix[i][x-1] == "X" and matrix[i-1][x-1] == "X" and matrix[i-1][x+1] == "X" and matrix[i+1][x-1] == "X" and matrix[i+1][x] == "X" and matrix[i][x+1] == "X" and matrix[i+1][x+1] == "X":
        return True
    else:
        return False
        
def validPositions(i, x):
    ip,im,xp,xm = False,False,False,False
    l = []
    if i+1 < r:
        ip = True
    if i-1 >= 0:
        im = True
    if x+1 < c:
        xp = True
    if x-1 >= 0:
        xm = True
    if ip and xp:
        l.append([i+1,x+1])
    if im and xm:
        l.append([i-1,x-1])
    if ip and xm:
        l.append([i+1,x-1])
    if im and xp:
        l.append([i-1,x+1])
    if ip:
        l.append([i+1,x])
    if im:
        l.append([i-1,x])
    if xp:
        l.append([i,x+1])
    if xm:
        l.append([i,x-1])
    return(l)
    
def adjacentToDead(positions):
    adj = False
    for position in positions:
        i,x = position[0],position[1]
        if matrix[i][x] == ".":
            adj = True
        
    return(adj)
    
l = list(map(int, input().split()))
r,c = l[0],l[1]

matrix = []

for _ in range(r):
    matrix.append(list(input()))

newMatrix = []
for row in matrix:
    newMatrix.append(row)

diff = True
while(diff):
    for row in range(len(matrix)):
        line = matrix[row]
        for col in range(len(line)):
            cell = matrix[row][col]
            if cell != "X":
                positions = validPositions(row, col)
                if adjacentToDead(positions):
                    newMatrix[row][col] = "."
                else:
                    newMatrix[row][col] = matrix[row][col]
            else:
                if isntOnEdge(row, col):
                    if adjacentToBarriers(row, col):
                        newMatrix[row][col] = "."
                    else:
                        #big issue
                        newMatrix[row][col] = "X"
                else:
                    newMatrix[row][col] = "X"    
    if matrix == newMatrix:
        diff = False
    else:
        matrix = newMatrix
                
for row in newMatrix:
    print("".join(row))