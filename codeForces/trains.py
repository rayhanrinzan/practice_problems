l = list(map(int, input().split()))
l.sort()
map = {}
pairs = []
for i in range(len(l)):
    map["Train" +" "+ str(i+1)] = l[i]
target = 100
def two_sum(arr):
    n = len(arr)

    for i in range(n):
      
        for j in range(i + 1, n):
          
            if arr[i] + arr[j] == 100:
                return (tuple(arr[i], arr[j]))
            else:
                return

arr = [0, -1, 2, -3, 1]
target = -2

pairs.append(two_sum(l))

print(pairs)