from itertools import permutations
for i in range(int(input())):
    lst = list(map(int, input().split()))
    perm = permutations(lst)
    maxVal = 0
    for l in perm:
        val = ""
        for num in l:
            val += str(num)
        maxVal = max(int(val), maxVal)
    print(maxVal)