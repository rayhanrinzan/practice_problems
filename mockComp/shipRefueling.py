def custom_comparator():
    if element[1][0] == "Allied":
        return -1
    else:
        return 1

for w in range(int(input())):
    speed,x,y,n = map(float, input().split())
    dic = {}
    for i in range(int(n)):
        lst = input().split()
        dic[lst[0]] = lst[1:]
        ships = []
        temp = []
        for name, lst in dic.items():
            if lst[0] != "Hostile":
                ships.append(name)
            else:
                temp.append(name)
                
        for item in temp:
            del dic[item]
        
    dic = dict(sorted(dic.items(), key = lambda x: (x[1][0], x[1][3])))
    
    while dic:
        name = next(iter(d))
        lst = dic[name]
        
    print(dic)