def dotProduct(row, col):
    l = []
    for i in range(len(row)):
        l.append(row[i] * col[i])
    
    return(sum(l))
def transpose(matrix):
    rows = len(matrix)
    cols = len(matrix[0])
    transposed = []
    for i in range(cols):
        new_row = []
        for j in range(rows):
            new_row.append(0)
        transposed.append(new_row)
    for i in range(rows):
        for j in range(cols):
            transposed[j][i] = matrix[i][j]
    return transposed

    
l = list(map(int, input().split()))
cols1,rows1,cols2,rows2 = l[0],l[1],l[2],l[3]
matrix1 = []
matrix2 = []

for i in range(rows1):
    matrix1.append(list(map(int,input().split())))
for i in range(rows2):
    matrix2.append(list(map(int,input().split())))

matrix3 = [[None for _ in range(rows1)] for _ in range(cols2)] 

matrix2_new = transpose(matrix2)
for i in range(rows1):
    for x in range(cols2):
        matrix3[i][x] = dotProduct(matrix1[i],matrix2_new[x])


for i in range(rows1):
    matrix3[i] = list(map(str, matrix3[i]))
    print(" ".join(matrix3[i]))