def p(num):
    return str(num) == str(num)[::-1]

n,k = map(int, input().split())
a = []
curr = 0
while len(a) < k:
    if p(n-curr) and curr < n:
        a.append(str(n-curr))
    if p(n+curr) and curr != 0 and len(a) < k:
        a.append(str(n+curr))
    curr += 1
print('\n'.join(a))