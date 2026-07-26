n  = int(input())
b = True
def factors(num):
    factorList = []
    for i in range(1,num+1):
        if num % i == 0:
            factorList.append(i)
    return(factorList)
l = factors(n)
for factor in l:
    if len(factors(factor)) == 2:
        if factor != 3 and factor != 2:
            b = False
            
if b:
    print("YES")
else:
    print("NO")