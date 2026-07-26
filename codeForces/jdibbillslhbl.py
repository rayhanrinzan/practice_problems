import math

num_cases = int(input())
for _ in range(num_cases):
    a = float(input())
    N_max = 320000000
    N = 1
    days = 0
    while N < N_max:
        dN_dt = a * (1 - N / N_max) * N
        N += dN_dt
        days += 1
    print(days)