from itertools import permutations

def works(arr1, arr2):
    arr = []
    for i in range(len(arr1)):
        arr.append(arr1[i] + arr2[i])
    if len(set(arr)) >= 3:
        return True
    return False

for _ in range(int(input())):
    ans = False
    n = int(input())
    a = list(map(int, input().split()))
    b = list(map(int, input().split()))
    arrangements = list(permutations(a))
    for arrangement in arrangements:
        if works(arrangement, b):
            ans = True
    if ans:
        print("YES")
    else:
        print("NO")