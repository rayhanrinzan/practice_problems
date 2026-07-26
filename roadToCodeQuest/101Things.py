from itertools import combinations
def equalsK(subsection):
    minXOR = 100000000000000000
    pairs = list(combinations(subsection, 2))
    for pair in pairs:
        if pair[0] ^ pair[1] < minXOR:
            minXOR = pair[0] ^ pair[1] 
    if minXOR == k:
        return True
    return False
    
n, k = map(int, input().split())
nums = list(map(int, input().split()))
lst = []
for x in range(2, len(nums)):
    for i in range(len(nums) - x + 1):
        lst.append(nums[i:i + x])
count = 0 
for subsection in lst:
    if equalsK(subsection):
        count += 1
print(count)