cars = []

for _ in range(int(input())):
    l = input().split()
    name = l[0]
    mpg = int(l[1])
    speed = int(l[2])
    score = mpg * speed
    cars.append((name, mpg, speed, score))

cars.sort(key=lambda x: (x[3], x[0]))

for car in cars:
    print(car[0], car[1], car[2])