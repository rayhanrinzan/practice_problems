l = list(map(int,input().split()))
num, position, finish = l[0], l[1], l[2]
distance = finish - position
dic = {}
for i in range(num):
    l = input().split()
    time = int(l[1]) + (1/int(l[2])*distance)
    dic[l[0]] = time
    
sortedDic = sorted(dic.items(), key = lambda x:x[1])
for item in sortedDic:
    print(item[0])