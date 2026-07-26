def dfs(node, paths, finalList, target):
    lst = []
    for item in paths:
        lst.append(item)
    lst.append(node)
    if node == target:
        finalList.append(lst)
    for item in flightMap[node]:
        nei = item[0]
        if nei not in seen or nei == target:
            seen.add(nei)
            dfs(nei, lst, finalList, target)
    return(finalList)

dest = input()
numFlights, budget = map(int, input().split())
flightMap = {}
flightList = []
for _ in range(numFlights):
    start, end, price = input().split()
    price = int(price)
    if start not in flightMap:
        flightMap[start] = [(end, price)]
    else:
        flightMap[start].append([end, price])
    flightList.append((start,end))
paths = []
finalList = []
seen = set()
seen.add("Syracuse")
flightPaths = (dfs("Syracuse", paths, finalList, dest))
paths = []
finalList = []
seen = set()
returnPaths = (dfs(dest, paths, finalList, "Syracuse"))

prices = []
for path in flightPaths:
    price = 0
    for i in range(len(path) - 1):
        for item in flightMap[path[i]]:
            if item[0] == path[i+1]:
                price += item[1]
    prices.append([path,price])
prices2 = []
for path in returnPaths:
    price = 0
    for i in range(len(path) - 1):
        for item in flightMap[path[i]]:
            if item[0] == path[i+1]:
                price += item[1]
    prices2.append([path,price])

prices = sorted(prices, key = lambda x: x[1])
prices2 = sorted(prices2, key = lambda x: x[1])
path1 = prices[0][0]
path2 = prices2[0][0]
if(prices[0][1] + prices2[0][1]) <= budget:
    print(len(path1) + len(path2) - 2, prices[0][1] + prices2[0][1])
    for i in range(len(path1)-1):
        print(path1[i], "->", path1[i+1])
    for i in range(len(path2)-1):
        print(path2[i], "->", path2[i+1])
else:
    print("IMPOSSIBLE")