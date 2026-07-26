x = int(input())
count = 0
key = {}
for char in input():
    count+=1
    key[str(count)] = char
for i in range(x-1):
    message = ""
    words = input().split(" ")
    for item in words:
        letters = item.split("-")
        for item in letters:
            message += key[item]
        message += " "    
    print(message.rstrip())