alphabet = ["a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"]
key = input()
pairs = {}
for index in range(len(alphabet)):
    pairs[key[index]] = alphabet[index]

line = input().split()
decrypted = list()
for item in line:
    word = ""
    for char in item:
        word += pairs[char]
    decrypted.append(word)
print("Decrypted text:"," ".join(decrypted))