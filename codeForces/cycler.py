cycler = {
    'a': 'b', 'b': 'c', 'c': 'd', 'd': 'e', 'e': 'f', 'f': 'g', 
    'g': 'h', 'h': 'i', 'i': 'j', 'j': 'k', 'k': 'l', 'l': 'm', 
    'm': 'n', 'n': 'o', 'o': 'p', 'p': 'q', 'q': 'r', 'r': 's', 
    's': 't', 't': 'u', 'u': 'v', 'v': 'w', 'w': 'x', 'x': 'y', 
    'y': 'z', 'z': 'a', ' ': ' '  
}


def cycle(string):
    s = ""
    for char in string:
        s += cycler[char]
    return(s)


def fun(string):
    original = string
    fun = 0
    newString = string
    
    while True:
        currfun = 0
        for char in newString:
            if char == 'f' or char == 'u' or char == 'n':
                currfun += 1
        fun = max(fun, currfun)
        
        
        newString = cycle(newString)
        

        if newString == original:
            break
    
    return fun


string = input()
print(fun(string))