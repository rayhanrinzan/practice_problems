def similarity(string):
    tot = 0
    mat = 0
    for char in string:
        for char2 in word:
            if char == char2:
                tot += 1
                mat += 1
            else:
                tot += 1
    return "{:.2f}".format(mat/tot)
    
word = input()
wordDic= {}
for i in range(int(input())):
    string = input()
    wordDic[string] = similarity(string)
    
wordDic = sorted(wordDic.items(), key = lambda x:(x[1], x[0]), reverse = True)
for key,value in wordDic:
    print(key, value)