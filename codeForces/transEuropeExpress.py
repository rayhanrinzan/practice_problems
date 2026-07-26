l = list(map(int, input().split()))
numCities, lines = l[0],l[1]
cities = []
start = input()
cities.append(start)
fullStationsList = []
for i in range(lines):
    fullStationsList.append(input().split())

for item in fullStationsList:
    if item[0] in cities:
        cities.append(item[1])
    elif item[1] in cities:
        cities.append(item[0])

cities = set(cities)
print(len(cities))