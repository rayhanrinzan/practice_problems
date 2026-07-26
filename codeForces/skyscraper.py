def possiblePositions(i, x):
    l = []
    l.append([i-1, x])
    l.append([i, x-1])
    l.append([i-1, x-1])
    l.append([i-1, x+1])
    l.append([i+1, x-1])
    l.append([i+1, x])
    l.append([i, x+1])
    l.append([i+1, x+1])
    return(l)
    
def isValidPosition(l):
    i,x = l[0], l[1]
    if i >= 0 and x >= 0 and i < rows and x < cols:
        return True
    else:
        return False
        
rows = int(input())
cols = rows

matrix = []

for i in range(rows):
    matrix.append(list(map(int, list(input()))))

for r in range(len(matrix)):
    row = matrix[r]
    newMatrixLine = []
    for c in range(len(row)):
        positions = possiblePositions(r, c)
        skyscraper = True
        for position in positions:
           if isValidPosition(position):
               if matrix[r][c] <= matrix[position[0]][position[1]]:
                    skyscraper = False
        if skyscraper:
            newMatrixLine.append("Y")
        else:
            newMatrixLine.append("N")
    print("".join(newMatrixLine))