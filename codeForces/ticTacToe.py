win = False
x = input()
if(x == "X"):
    opponent = "O"
else:
    opponent = "X"
matrix = []
for _ in range(3):
    matrix.append(input()[:3])
    
for i in range(3):
    line = matrix[i]
    if opponent not in line and line.count(x) == 2:
        win = True

for i in range(3):
    line = [matrix[0][i], matrix[1][i], matrix[2][i]]
    if opponent not in line and line.count(x) == 2:
        win = True

line = [matrix[0][0], matrix[1][1], matrix[2][2]]
if opponent not in line and line.count(x) == 2:
        win = True

line = [matrix[2][0], matrix[1][1], matrix[0][2]]
if opponent not in line and line.count(x) == 2:
        win = True

if win:
    print("Yes you can.")
else:
    print("No you can't.")