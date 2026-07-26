h = int(input()) - 2
n = int(input())
lst = []
def validSquare(lst,r,c,l):
    try:
        if r != 0 and x != 0 and lst[r+1][c+1] == 'X' and lst[r-1][c-1] == 'X' and lst[r][c-1] == 'X' and lst[r-1][c] == 'X' and lst[r+1][c-1] == 'X' and lst[r-1][c+1] == 'X' and lst[r+1][c] == 'X' and lst[r][c+1] == 'X':
            return True
    except IndexError:
        return False
for i in range(n):
    lst.append(list(input()))

count = 0
for i in range(n):
    line = lst[i]
    for x in range(len(line)):
        if validSquare(lst,i,x,len(line)):
            count += 1
print(count*h)