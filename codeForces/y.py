x = input()
y = input()
sum = 0
index = len(x)
for char in x:
    index -= 1
    if char == "1":
        sum += 2**(index)
index = len(y)
for char in y:
    index -= 1
    if char == "1":
        sum += 2**(index)

print(bin(sum)[2:])