dic = {}
dic2 = {}
for i in range(int(input())):
    l = input().split()
    name, stats = l[0], l[1] + " " + l[2]
    l = stats.split()
    score = int(l[0])*int(l[1])
    dic[name] = score
    dic2[name] = stats
dic = sorted(dic.items(), key = lambda x: (x[1],x[0]))
for i in range(len(dic)):
    print(dic[i][0], dic2[dic[i][0]])