for _ in range(int(input())):
    nums = []
    word = list(input())
    for i in range(len(word)):
        try:
            m = int(word[i])
        except:
            print("np")