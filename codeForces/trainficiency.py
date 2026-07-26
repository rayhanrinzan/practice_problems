l = list(map(int, input().split()))
train1,train2,train3,train4 = l[0],l[1],l[2],l[3]
dic = {train1: "Train 1", train2: "Train 2", train3: "Train 3", train4: "Train 4"}
l = [train1, train2, train3, train4]
for i in range(len(l)):
    item = l[i]
    for x in range(len(l)):
        if x == i:
            continue
        else:
            if l[i] + l[x] == 100:
                print(dic[l[i]], "and", dic[l[x]])