layers = int(input())
nodes = list(map(int, input().split()))
sum = 0
for i in range(layers-1):
    sum += nodes[i]*nodes[i+1]
print(sum)