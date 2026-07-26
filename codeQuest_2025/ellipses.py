import math

for i in range(int(input())):
    temp = input().split(" ")
    List = [float(x) for x in temp]  
    x1 = List[0]
    y1 = List[1]
    x2 = List[2]
    y2 = List[3]
    maxWidth = List[4]
    r = int(List[5])  
    
    for n in range(r):
        nums = input().split(" ")
        nums = [float(x) for x in nums]

        point_x = nums[0]
        point_y = nums[1]
        
        
        d1 = math.sqrt((point_x - x1) ** 2 + (point_y - y1) ** 2)
        d2 = math.sqrt((point_x - x2) ** 2 + (point_y - y2) ** 2)

        if d1 + d2 <= maxWidth:
            print(1)  
        else:
            print(0)