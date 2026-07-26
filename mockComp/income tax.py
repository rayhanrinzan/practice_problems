for i in range(int(input())):
    inc = int(input())
    if(inc > -1 and inc < 11001):
        print(int(inc * 0.1 + .5))
    elif(inc > 11000 and inc < 44726):
        print(int(inc * 0.12 + .5))
    elif(inc > 44725 and inc < 95376):
        print(int(inc * 0.22 + .5))
    elif(inc > 95375 and inc < 182101):
        print(int(inc * 0.24 + .5))
    elif(inc > 182100 and inc < 231251):
        print(int(inc * 0.32 + .5))
    elif(inc > 231250 and inc < 578126):
        print(int(inc * 0.35 + .5))
    else:
        print(int(inc * 0.37 + .5))