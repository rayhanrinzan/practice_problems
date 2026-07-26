from itertools import combinations
for i in range(int(input())):
    l = list(map(int,input().split()))
    l1 = [l[0],l[1],l[2]]
    l2 = [l[3],l[4],l[5]]
    coms1 = list(combinations(l1,2))
    for x in range(len(coms1)):
        coms1[x] = int(str(coms1[x][0] + coms1[x][1]))
    coms2 = list(combinations(l2,2))
    for x in range(len(coms2)):
        coms2[x] = int(str(coms2[x][0] + coms2[x][1]))

    m1 = max(coms1)
    m2 = max(coms2)
    if m1 > m2:
        print("PLAYER 1")
    elif m2 > m1:
        print("PLAYER 2")
    else:
        print("WAR!")