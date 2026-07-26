def factors(n) :
    i = 2
    l = []
    while i <= n :
        if (n % i==0) :
            l.append(i)
        i = i + 1
    return set(l)
    
for t in range(int(input())):
    l = input()
    a = l[1:4]
    b = l[5:8]
    c = l[9:]
    aF = factors(int(a))
    bF = factors(int(b))
    cF = factors(int(c))
    y = (len(aF) + len(bF) + len(cF))
    x = (len(aF.union(bF).union(cF)))
    if x == y:
        print("TRUE")
        
    else:
        print("FALSE")