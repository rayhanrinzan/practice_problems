from collections import deque
def transport(cars):
    finalList = deque()
    waitingList = deque()
    needed = 1
    for car in cars:
        #greatestforloopofalltime
        carAppended = False
        while(car == needed or (len(waitingList) > 0  and waitingList[0] == needed)):
            if car == needed:
                finalList.append(car)
                needed += 1
                carAppended = True
            if len(waitingList) > 0 :
                while len(waitingList) > 0 and waitingList[0] == needed:
                    finalList.append(waitingList.popleft())
                    needed += 1
        if carAppended == False:
            waitingList.appendleft(car)
    finalList = sorted(finalList)
    cars = sorted(cars)
    if cars == finalList:
        return "Y"
    return "N"

        
for _ in range(int(input())):
    cars = deque()
    for i in range(int(input())):
        car = int(input())
        cars.append(car)
    cars.reverse()
    print(transport(cars))

#sooooooofuckigngoodatcoding