l = []
for i in range(int(input())):
    num = int(input())
    l.pop() if num == 0 else l.append(num)
print(sum(l))