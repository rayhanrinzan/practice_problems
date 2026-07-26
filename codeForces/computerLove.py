import math
l = list(map(int, input().split()))
x = l[0]
y = l[1]

largest = -1
startNum = math.floor(math.log(x, 2))
endNum = 1 + math.floor(math.log(y, 2))
for i in range(startNum, endNum):
    if 2**i <= y and 2**i >= x:
        largest = 2**i
        
print(largest)