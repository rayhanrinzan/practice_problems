x = int(input())
for i in range(x):
    s = input()
    c = 0
    while c < len(s):
        if s[c] == "O":
            print("[###OREO###]")
        elif c + 1 < len(s) and s[c:c+2] == "RE":
            print("[---------]")
            c += 1
        elif s[c] == "&":
            print()
        c += 1