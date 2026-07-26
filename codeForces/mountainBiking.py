s = int(input())
l = list(map(int, input().split()))
curr = l[0]
largest = 0
l2 = []
for i in range(s-1):
    i += 1
    if l[i] > curr:
        largest += l[i] - curr
        curr = l[i]
        if i == s-1:
            l2.append(largest)
    else:
        curr = l[i]
        l2.append(largest)
        largest = 0
        

print(max(l2))