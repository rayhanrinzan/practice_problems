def longDivision(a, b, length):
    result = ""
    # while a < b: a *= 10
    for i in range(length):
        result += str(a // b)
        a %= b
        a *= 10
    return result

def idPattern(a):
    for start in range(len(a)):
        for length in range(1, (len(a) - start) // 10):
            isPattern = True
            for i in range(10):
                if (a[start:start + length] != a[start + i * length:start + (i + 1) * length]):
                    isPattern = False
                    break
            
            if isPattern: return(a[start:start + length])

for _ in range(int(input())):
    b = int(input())
    a = 1
    print(idPattern(longDivision(a, b, 5000)))