dic = {}
for i in range(int(input())):
    l = input().split()
    name, genre = l[0],l[1]
    if genre not in dic:
        dic[genre] = list()
        dic[genre].append(name)
    else:
        dic[genre].append(name)
        dic[genre].sort()
dic = dict(sorted(dic.items()))
for key, value in dic.items():
    print(key + ": " + ", ".join(value))