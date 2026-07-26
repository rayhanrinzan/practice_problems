num = int(input())
dic = {}
for i in range(num):
    l = input().split()
    dic[l[0]] = [int(l[1]), int(l[2])] 

house = input()
streetNum = dic[house][0]
houseNum = dic[house][1]
del dic[house]

closestDistance = 1000000000000000000000000000000
closestHouse = ""
for key,value in dic.items():
    if streetNum == value[0]:
        if abs(houseNum - value[1]) < closestDistance:
            closestDistance = abs(houseNum - value[1])
            closestHouse = key
    else:
        if abs(houseNum - value[1])*abs(streetNum - value[0]) < closestDistance:
            closestDistance = abs(houseNum - value[1])*abs(streetNum - value[0])
            closestHouse = key
print(closestHouse)