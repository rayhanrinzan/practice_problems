word = input()
for i in range(int(input())):
    char = input()
    word = word.replace(char, "")
    
print(word)