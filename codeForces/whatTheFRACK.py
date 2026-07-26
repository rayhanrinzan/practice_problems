import math
line = input()
line = line.replace("+ ", "")
expression = line.split()
frac = expression[0]
expression.pop(0)

def addFrac(frac2):
    l1 = frac.split("/")
    l2 = frac2.split("/")
    n1,d1 = int(l1[0]), int(l1[1])
    n2,d2 = int(l2[0]), int(l2[1])
    d = int((d1*d2)/math.gcd(d1,d2))
    n1 = n1*(d//d1)
    n2 = n2*(d//d2)
    n = int(n1 + n2)
    gcd = math.gcd(n, d)
    n //= gcd
    d //= gcd
    return(str(n)+ "/" + str(d))

for item in expression:
    frac = addFrac(item)

test = list(map(int, frac.split("/")))
if test[0]%test[1] == 0:
    print(int(test[0]/test[1]))
else:
    print(frac)