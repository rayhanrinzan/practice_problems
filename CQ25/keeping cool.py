def testing(n,l,a,h, nums):
    total = 0.0
    for i in range(len(nums)):
        total += float(nums[i])
        if(float(nums[i]) < l):
            return "TOO COOL"
        elif(float(nums[i]) > h):
            return "TOO HOT"
    if ((total/len(nums)) > a):
        return "WARNING"
    return "OK"

for _ in range(int(input())):
    n, l, a, h = map(float, input().split())
    nums = list(map(float, input().split()))
    nums.sort()
    print(testing(n,l,a,h, nums))