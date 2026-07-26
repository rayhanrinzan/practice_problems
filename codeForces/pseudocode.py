import re
varDic = {}

def varOperation(line):
    if "=" in line and "print" not in line:
        return True
    else:
        return False

def varSetter(line):
    line = line.split()
    if "var" in line:
        line.pop(0)
    var = line[0]
    operation = line[line.index("=") + 1:]
    for i in range(len(operation)):
        if operation[i] in varDic:
            operation[i] = str(varDic[operation[i]])
    operation = " ".join(operation)
    varDic[var] = eval(operation)

def needsPrinting(line):
    if "print" in line:
        return True
    else:
        return False

def toString(line):
    line = line.replace("print ", "")
    line = line.replace(")", "(")
    line = line.split("(")
    l = []
    for item in line:
        if len(item) == 3 and item[0] == "+" and item[2] == "+":
                l.append(str(varDic[item[1]]))
        else:
            l.append(item)
                
    print("".join(l))
        

for i in range(int(input())):
    l = input()
    if needsPrinting(l):
        toString(l)
    elif varOperation(l):
        varSetter(l)