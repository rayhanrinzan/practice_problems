import itertools

n = int(input())
for i in range(n):
    parts = input().split(" ")
    all_permutations = [''.join(p) for p in itertools.permutations(parts)]
    result = max(all_permutations)
    print(result)