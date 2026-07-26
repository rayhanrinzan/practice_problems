Nm = 328.2e6  
Nt = 320e6  

def days(a, delta_t=0.1):
    N = 1  
    t = 0 
    
    while N < Nt:
        dNdt = a * (1 - N / Nm) * N
        N += delta_t * dNdt
        t += delta_t
    
    return int(t)  

n = int(input())
results = []

for _ in range(n):
    a = float(input())
    results.append(days(a))

for result in results:
    print(result)