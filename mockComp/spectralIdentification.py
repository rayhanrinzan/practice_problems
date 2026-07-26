import copy
elements = [
    ("H", [410.2, 486.1, 656.3]),
    ("He", [587.6]),
    ("O2", [410.2, 486.1, 656.3]),
    ("Na", [588.995, 589.592]),
    ("Mg", [516.733, 517.270, 518.362]),
    ("Ca", [430.774]),
    ("Ca+", [393.368, 396.847]),
    ("Ti+", [336.112]),
    ("Fe", [302.108, 358.121, 382.044, 430.790, 438.355, 466.814, 495.761, 516.891, 527.039]),
    ("Ni", [299.444]),
    ("Hg", [546.073]),
    ]
# copy rest from CQ website

def isSameWavelength(a, b):
    return abs(a - b) < 1

def removeWavelengths(a, emission):
    wavelengths = copy.copy(a)
    for p2 in range(len(emission)):
        p1 = 0
        while p1 < len(wavelengths) and not isSameWavelength(wavelengths[p1], emission[p2]):
            p1 += 1
        
        if p1 < len(wavelengths):
            wavelengths.pop(p1)
        else: return None
        
    return wavelengths # does contain emission wavelengths

global result
def rb(wavelengths, elements, answer, i):
    global result
    if len(wavelengths) == 0:
        answerFound = True
        result = answer
        return
    
    for a in range(i, len(elements)):
        symbol, emission = elements[a]
        
        r = removeWavelengths(wavelengths, emission)
        if r is not None:
            answer = answer + " " + symbol
            rb(r, elements, answer, a)
            if result != "": return
            answer = answer[:-(1 + len(symbol))]
            
        
for _ in range(int(input())):
    global result
    result = ""
    answerFound = False
    wavelengths = list(map(int, input().split()))
    rb(wavelengths, elements, "", 0)
    print(result[1:]) # gets rid of space in front