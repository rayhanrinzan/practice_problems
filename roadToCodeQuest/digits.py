def factorial(n):
    x = 1
    for i in range(1,n):
        x *= (n + 1)
    return(x)
for _ in range(int(input())):
    n,d = map(int, input().split())
    strNum = ""
    for i in range(factorial(n)):
        strNum += str(d)
    num = int(strNum)
    print(n)
    print(factorial(n))
    l = []
    for i in range(1,10,2):
        if num % i == 0:
            l.append(i)
    l = map(str, l)
    print(" ".join(l))