def isMovable(i, x):
    knight = False
    if i+2 < 8 and x+1 < 8:
        if matrix[i+2][x+1] == 'K':
            knight = True
    if i+1 < 8 and x+2 < 8:
        if matrix[i+1][x+2] == 'K':
            knight = True
    if i-2 >= 0 and x-1 >=0:
        if matrix[i-2][x-1] == 'K':
            knight = True
    if i-1 >= 0 and x-2 >=0:
        if matrix[i-1][x-2] == 'K':
            knight = True
    if i+2 < 8 and x-1 >=0:
        if matrix[i+2][x-1] == 'K':
            knight = True
    if i-2 >= 0 and x+1 < 8:
        if matrix[i-2][x+1] == 'K':
            knight = True    
    if i+1 < 8 and x-2 >=0:
        if matrix[i+1][x-2] == 'K':
            knight = True
    if i-1 >= 0 and x+2 < 8:
        if matrix[i-1][x+2] == 'K':
            knight = True             
    return(knight)

matrix = []
for _ in range(8):
    matrix.append(list(input()))
    
for r in range(len(matrix)):
    row = matrix[r]
    for c in range(len(row)):
        square = matrix[r][c]
        if square == '.' and isMovable(r,c):
            matrix[r][c] = '*'
            
for row in matrix:
    print("".join(row))