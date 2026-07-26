import math
l = list()
x = input()

if x != "0":
    seconds = int(x)
    if seconds >= 31536000:
        if math.floor(seconds/31536000) == 1:
            l.append(str(math.floor(seconds/31536000)) + " year")
        else:
            l.append(str(math.floor(seconds/31536000)) + " years")
    seconds = seconds%31536000
    
    if seconds >= 60*60*24:
        if math.floor(seconds/(60*60*24)) == 1:
            l.append(str(math.floor(seconds/(60*60*24))) + " day")
        else:
            l.append(str(math.floor(seconds/(60*60*24))) + " days")
    seconds = seconds%(60*60*24)
    
    if seconds >= 60*60:
        if math.floor(seconds/(60*60)) == 1:
            l.append(str(math.floor(seconds/(60*60))) + " hour")
        else:
            l.append(str(math.floor(seconds/(60*60))) + " hours")
    seconds = seconds%(60*60)
    
    if seconds >= 60:
        if math.floor(seconds/(60)) == 1:
            l.append(str(math.floor(seconds/(60))) + " minute")
        else:
            l.append(str(math.floor(seconds/(60))) + " minutes")
    seconds = seconds%(60)
    if seconds >= 1:
        if math.floor(seconds/(1)) == 1:
            l.append(str(math.floor(seconds/(1))) + " second")
        else:
            l.append(str(math.floor(seconds/(1))) + " seconds")
            
    if len(l) > 1:
        print(", ".join(l[:-1]) + " and " + l[-1])
    else:
        print(l[0])
else:
    print("now")