for _ in range(int(input())):
    lst = list(map(int, input().split()))
    i = len(lst)//2
    j = len(lst)//2
    fullList = []
    count = 1
    while i >= 0 and j <= len(lst) -1:
        fullList.append(set(lst[i], lst[j]))
        count += 1
        i = i 
        
    print(fullList)