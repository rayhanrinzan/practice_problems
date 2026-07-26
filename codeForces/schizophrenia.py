l = list()
for char in input():
    if char == "h":
        for _ in range(5):
            l.append("h")
    elif char == "c":
        for _ in range(2):
            l.append("c")
    elif char == "z":
        for _ in range(12):
            l.append("z")
    else:
        l.append(char)
        
print("".join(l))