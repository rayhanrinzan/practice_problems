for i in range(int(input())):
    agents = input().split(" ")
    key = {}
    names = []
    for item in agents:
        parts = item.split("=")
        name = parts[0]
        score = int(parts[1])
        key.update(name: score)
        names.append(name)
    for item in names: