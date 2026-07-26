dic = {"0": "o", "1": "i", "3": "e", "4": "a", "5": "s", "7": "t"}
wordList = list()

for i in range(int(input())):
    wordList.append(input())
seqList = list()

for i in range(int(input())):
    seqList.append(input())

charList = list()
for item in seqList:
    word = ""
    for char in item:
        word += dic[char]
    charList.append(word)

for charSeq in charList:
    count = 0
    words = list()
    for word in wordList:
        if charSeq in word:
            index = word.find(charSeq)
            valid = True

            if index > 0 and word[index - 1] in dic.values():
                valid = False

            if index + len(charSeq) < len(word) and word[index + len(charSeq)] in dic.values():
                valid = False

            if valid:
                count += 1
                words.append(word)

    print(count)
    for word in words:
        print(word)