def dec_to_bcd(n):

    if n < 0:
        raise ValueError("Input must be a non-negative integer")

    bcd = []
    while n > 0:
        bcd.insert(0, bin(n % 10)[2:].zfill(4))
        n //= 10
    return ''.join(bcd)

num = int(input())
bcd_result = dec_to_bcd(num)
print(bcd_result)