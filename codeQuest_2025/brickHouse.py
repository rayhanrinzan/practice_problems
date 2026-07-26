def canBuild(small, large, target):
    maxLarge = min(large, target // 5)  
    remaining = target - (maxLarge * 5)  
    return remaining <= small  

t = int(input())  

for _ in range(t):
    small, large, target = map(int, input().split())  
    print("true" if canBuild(small, large, target) else "false")