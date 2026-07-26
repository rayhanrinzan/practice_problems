for i in range(int(input())):
    n = int(input())
    numbers = input().split(" ")
    model = numbers[0]
    score = int(numbers[1]) + int(numbers[2]) + int(numbers[3]) + int(numbers[4])
    best_model = model
    best_score = score
    for x in range(n):
        numbers_2 = input().split(" ")
        model_2 = numbers_2[0]
        score_2 = int(numbers_2[1]) + int(numbers_2[2]) + int(numbers_2[3]) + int(numbers_2[4])
        if score_2 <= score * 0.8:
            if score_2 < best_score:
                best_model = model_2
                best_score = score_2
    print(best_model + " " + str(best_score))