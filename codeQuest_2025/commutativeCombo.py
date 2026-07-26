import itertools

for i in range(int(input())):
    arr = input().split("=")
    num = int(arr[1])
    numbers = input().split(",")
    results = []  # Use a list to collect results
    
    for L in range(1, len(numbers) + 1):
        for subset in itertools.combinations(numbers, L):
            for perm in itertools.permutations(subset):
                perm = tuple(map(int, perm))  # Convert to integers
                if sum(perm) == num:
                    results.append(perm)  # Add the permutation to results
                    
    # Print the results in the desired format
    for result in results:
        for index, item in enumerate(result):
            print(str(item), end="")
            if index != len(result) - 1:
                print('+', end="")
        print()