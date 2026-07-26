import math
num = int(input())
for i in range(num):
    income = float(input())
    if income >= 578126:
        tax = income * 0.37
    elif income >= 231251:
        tax = income * 0.35
    elif income >= 182101:
        tax = income * 0.32
    elif income >= 95376:
        tax = income * 0.24
    elif income >= 44726:
        tax = income * 0.22
    elif income >= 11001:
        tax = income * 0.12
    else:
        tax = income * 0.10
        
    print(math.floor(tax + 0.5))