l = input().split()
a,b = l[0],l[1]
if a in ["J", "Q", "K"]:
    card1 = 10
elif a == "A":
    card1 = 11
else:
    card1 = int(a)
if b in ["J", "Q", "K"]:
    card2 = 10
elif b == "A":
    card2 = 11
else:
    card2 = int(b)
total = card1+card2
if total > 21:
    if card1 == 11:
        total -= 10
    elif card2 == 11:
        total -= 10
needed = 21-total
if total == 21:
    print("BLACKJACK")
elif needed <= 0:
    print("Invalid input")
elif needed == 11:
    print("A") 
elif needed == 10:
    print("FACE CARD/10") 
else:
    print(str(needed))