n = int(input())
dic = {}
for i in range(n):
    line = input()
    if line in dic:
        dic[line] = dic[line] + 1
    else:
        dic[line] = 1


dic = sorted(dic.items(), key = lambda x:(-x[1],x[0]))
count = 0
for key,value in dic:
    count+=1
    print(key,value)
    if count == 5:
        break