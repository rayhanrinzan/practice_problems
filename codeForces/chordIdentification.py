notes = ["C","C#","D","D#","E","F",'F#','G','G#','A','A#','B']
l = input().split()
n1,n2,n3 = l[0],l[1],l[2]
index1,index2,index3 = notes.index(n1),notes.index(n2),notes.index(n3)
if abs(index1-index2)%(len(notes)) == 4 and abs(index2-index3)%(len(notes)) == 3:
    print(n1)
elif abs(index1-index3)%(len(notes)) == 4 and abs(index2-index3)%(len(notes)) == 3:
    print(n1)
elif abs(index3-index2)%(len(notes)) == 4 and abs(index3-index1)%(len(notes)) == 3:
    print(n2)
elif abs(index2-index1)%(len(notes)) == 4 and abs(index3-index1)%(len(notes)) == 3:
    print(n2)
elif abs(index3-index1)%(len(notes)) == 4 and abs(index2-index1)%(len(notes)) == 3:
    print(n3)
elif abs(index3-index2)%(len(notes)) == 4 and abs(index2-index1)%(len(notes)) == 3:
    print(n3)