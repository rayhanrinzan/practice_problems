n = int(input())
people = {}
for i in range(n):
    person, spreader = input().split()
    if spreader in people and spreader != "OTHER":
        people[spreader] += 1
    else:
        people[spreader] = 1
l = []
for key, value in people.items():
    if value >= 3:
        l.append(key)
if len(l) > 0:
    print('\n'.join(l))
else:
    print("NONE")