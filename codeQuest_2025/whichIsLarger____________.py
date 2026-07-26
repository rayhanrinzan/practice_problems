from functools import cmp_to_key

def compare(x, y):
    # Compare concatenated results
    if x + y > y + x:
        return -1
    elif x + y < y + x:
        return 1
    return 0

n = int(input())
for i in range(n):
    parts = input().split(" ")
    # Sort parts using custom comparator
    sorted_parts = sorted(parts, key=cmp_to_key(compare))
    # Join the sorted parts to form the largest concatenation
    result = ''.join(sorted_parts)
    print(result)