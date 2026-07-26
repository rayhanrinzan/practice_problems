def getNeighbors(node, grid, n):
    x, y = node
    neighbors = []
    for dx, dy in [(0, 1), (1, 0), (-1, 0), (0, -1)]:  # Right, Down, Left, Up
        nx, ny = x + dx, y + dy
        if 0 <= nx < n and 0 <= ny < n and grid[nx][ny] == 1:
            neighbors.append([nx, ny])
    return neighbors

for _ in range(int(input())):
    n = int(input())
    grid = [list(map(int, input().strip())) for _ in range(n)]

    if grid[0][0] == 0 or grid[n-1][n-1] == 0:
        print(0)  # No path if start or end is blocked
        continue

    stack = [([0, 0], set([(0, 0)]))]  # Stack holds (current position, visited set for this path)
    count = 0

    while stack:
        node, visited = stack.pop()

        if node == [n-1, n-1]:  # Reached the destination
            count += 1
            continue
        
        for nei in getNeighbors(node, grid, n):
            if tuple(nei) not in visited:  # Ensure no self-overlap in this path
                new_visited = visited.copy()
                new_visited.add(tuple(nei))
                stack.append((nei, new_visited))  # Push new path with updated visited nodes

    print(count)