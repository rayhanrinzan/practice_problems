l = list(map(int, input().split()))
x1, y1, x2, y2 = min(l[0], l[2]), min(l[1], l[3]), max(l[0], l[2]), max(l[1], l[3])
l2 = list(map(int, input().split()))
x3, y3, x4, y4 = min(l2[0], l2[2]), min(l2[1], l2[3]), max(l2[0], l2[3]), max(l2[1], l2[3])

if x1 > x4 or x3 > x2 or y1 > y4 or y3 > y2:
    print("NO")
else:
    print("YES")