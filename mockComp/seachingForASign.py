from collections import Counter
for z in range(int(input())):
    paragraph = []
    lineLst = []
    for w in range(int(input())):
        lst = input().split()
        for item in lst:
            paragraph.append(item)
    l = []
    for word in paragraph:
        l.append(word)
        if "." in list(word):
            lineLst.append(l)
            l = []
        elif "?" in list(word):
            lineLst.append(l)
            l = []
            
        
    c = Counter(paragraph).most_common()
    keyword = c[0][0]
    print(" ".join(lineLst[0]))
    for i in range(0,len(lineLst)):
        line = lineLst[i]
        index = line.index(keyword)
        string = "..."
        if index-3  >= 0:
            for x in range((index-3), index):
                string += (line[x] + " ")
        else:
            for x in range(index):
                string += line[x]
        string += "* " + keyword + " *"
        if index + 5 <= len(line)-1:
            for x in range(index, index+6):
                if x != index:
                    string += (" " + line[x])
            string += "..."
        else:
            for x in range(index, len(line)):
                string += (" " + line[x])
        print(string)