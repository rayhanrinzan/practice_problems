nl = list()
l = input()
for char in l:
    if char.isupper():
        nl.append(char.lower())
    else:
        nl.append(char.upper())
print("".join(nl))