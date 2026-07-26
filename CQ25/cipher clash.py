for _ in range(int(input())):
    words = input().split(' "')
    m = words[0].split(",")
    x = int(m[0][1:len(m[0])])
    y = int(m[1][0:len(m[1]) - 1])
    line1 = (words[1][0:len(words[1]) - 1]).split()
    line2 = (words[2][0:len(words[2]) - 1]).split()
    let1 = list(line1[x-1])
    let2 = list(line2[y-1])
    let1.sort()
    let2.sort()
    if (let1 == let2):
        print("Verified")
    else:
        print("Intercepted")