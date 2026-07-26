numLines = int(input())
stationsList = list()
fullList = list()
for _ in range(numLines):
    l = input().split()
    fullList.append(l)
    for item in l:
        stationsList.append(item)
stationsList = list(set(stationsList))
stationsDic = {}
for item in stationsList:
    stationsDic[item] = set()
for line in fullList:
    for key in line:
        for station in line:
            if key != station:
                stationsDic[key].add(station)

def counter(station, count, visited):
    queue = [(station, count)]
    visited = set([station])
    while queue:
        current, steps = queue.pop(0)
        if current == "Hotel":
            return steps
        for neighbor in stationsDic[current]:
            if neighbor not in visited:
                visited.add(neighbor)
                queue.append((neighbor, steps + 1))
    return None

countList = list()
for item in stationsDic["Airport"]:
    result = counter(item, 1, set(["Airport"]))
    if result is not None:
        countList.append(result)
print(min(countList) if countList else -1)