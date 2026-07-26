num = int(input())
sum1 = 0
for i in range(1,num):
    if num%i == 0:
        sum1 += i
        
if num == sum1:
    print("PERFECT NUMBER")
else:
    print("NOT A PERFECT NUMBER")

print(sum1)