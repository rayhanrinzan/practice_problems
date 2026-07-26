for n in range(int(input())):
    def number(List):
        count = 0
        
        
        for i in List:
            frequency = List.count(i)
            if(frequency> count):
                count = frequency
                
    
        return count
    
    List = list(input().replace(" ",""))
    print(number(List))