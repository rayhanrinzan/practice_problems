line = input()
parity = line[:1] 
message = line[1:]
if parity == "0":
    if message.count("1") % 2 != 0:
        print("NO ERROR")
    else:
        print("TRANSMISSION ERROR")
else:
    if message.count("1") % 2 == 0:
        print("NO ERROR")
    else:
        print("TRANSMISSION ERROR")