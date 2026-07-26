l = ["C","C#","D","D#","E","F",'F#','G','G#','A','A#','B']
nl = list()
num = int(input())
notes = input().split()
for note in notes:
    oIndex = l.index(note)
    nIndex = (oIndex + num)%len(l)
    nl.append(l[nIndex])
print(" ".join(nl))