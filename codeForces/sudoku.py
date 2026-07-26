import numpy as np

valid = True
matrix = []

for _ in range(9):
    a = input().split()
    if len(a) != 9 or not all(x.isnumeric() and 1 <= int(x) <= 9 for x in a):
        valid = False
    matrix.append(list(map(int, a)))

if valid:
    for _ in range(9):
        col = list()
        for item in matrix:
            col.append(item[_])
        if len(col) != len(set(col)):
            valid = False
            break

    for box_row in range(0, 9, 3):
        for box_col in range(0, 9, 3):
            l = list()
            for row in range(box_row, box_row + 3):
                for col in range(box_col, box_col + 3):
                    l.append(matrix[row][col])
            if len(l) != len(set(l)):
                valid = False
                break

if valid:
    print("VALID")
else:
    print("INVALID")