def pattern(s):
    n = len(s)
    for l in range(2, n // 2 + 1):  
        substring = s[:l]  
        repeats = n // l + 1  
        if substring * 2 in s:  
            return True
    return False

string = input()

print(pattern(string))