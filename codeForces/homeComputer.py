def isOperation(string):
    if "+" in string or "-" in string:
        return True
    else:
        return False

def hasExponent(string):
    if "^" in string:
        return True
    else:
        return False

def powerRule(string):
    coefficient = string[0:string.index("x")]
    if coefficient == "":
        coefficient = 1
    else:
        coefficient = int(coefficient)
    power = int(string[string.index("^") + 1:])
    coefficient *= power
    power -= 1
    if power != 1:
        return(str(coefficient) + "x^" + str(power))
    else:
        return(str(coefficient) + "x")

def repeatOperations(l):
    for i in range(len(l)-1):
        if isOperation(l[i]) and isOperation(l[i+1]):
            return True
    if isOperation(l[0]):
        return True
    if isOperation(l[len(l)-1]):
        return True
    if "" in l:
        return True
    return False

expression = input().split()
newList = []

for term in expression:
    if isOperation(term):
        newList.append(term)
    else:
        if hasExponent(term):
            newList.append(powerRule(term))
        else:
            if "x" in term:
                if term[:term.index("x")] == "":
                    newList.append("1")
                else:
                    newList.append(term[:term.index("x")])

while len(newList) > 0 and repeatOperations(newList):
    for index, item in enumerate(newList):
        if index != 0 and index != len(newList)-1:
            if isOperation(newList[index]) and isOperation(newList[index-1]):
                newList.pop(index)
            elif isOperation(newList[index]) and isOperation(newList[index+1]):
                newList.pop(index)

        else:
            if index == 0:
                if isOperation(newList[index]):
                    newList.pop(index)
            if index == len(newList)-1:
                if isOperation(newList[index]):
                    newList.pop(index) 
                    
        if item == "":
                newList.pop(index)    

    
print(" ".join(newList))