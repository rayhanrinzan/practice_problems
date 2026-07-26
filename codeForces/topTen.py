def ratingUpdater(n, update):
    if update == "0":
        return userRatings[n]
    elif update[:1] == "-":
        update = int(update[1:])*(-1)
        return update + userRatings[n]
    else:
        update = int(update)
        return update + userRatings[n]
        
l = list(map(int, input().split()))
numUsers, numContests = l[0],l[1]
userList = input().split()
userRatings = list(map(int, input().split()))
ratingsDic = {}
for i in range(len(userList)):
    ratingsDic[userList[i]] = userRatings[i]
for i in range(numContests):
    updatesList = input().split()
    for n in range(len(userList)):
        userRatings[n] = ratingUpdater(n, updatesList[n])
        ratingsDic[userList[n]] = userRatings[n]
    newList = []
    for user,rating in ratingsDic.items():
        newList.append((user, rating))
    newList = sorted(newList, key = lambda x:(-x[1],x[0]))
    newNewList = []
    for user,rating in newList:
        newNewList.append(user)
    print(" ".join(newNewList[:10]))