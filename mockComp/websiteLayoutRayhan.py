def canFit(l,r,)
for w in range(int(input())):
    lst = []
    rows = []
    for n in range(int(input())):
        lst.append(list(map(int, input().split())))
    lst = sorted(lst, reverse = True)
    rows.append([lst.pop(0)])
    print(rows)
    print(lst)
    for o, w in lst:
        #print(o,w)
        l,r = o, o + w
        appended = False
        for row in rows:
            canFit = True
            for item in row:
                l2 = item[0]
                r2 = item[0] + item[1]
                #print(l,r)
                #print(l2,r2)
                if l2 < r or l < r2:
                    #print(l2,r,l,r2)
                    canFit = False
            if canFit:
                row.append([o,w])
                appended = True
                break
        if appended == False:
            rows.append([[o,w]])
            break
    print(rows)