import heapq
cqLocation = input()
n, b = map(int, input().split())
graph = {}
flightsList = []
for _ in range(n):
    s, f, p = input().split()
    flightsList.append((s,f))
    if s not in graph:
        graph[s] = list()
        graph[s].append((f, int(p)))
    else:
        graph[s].append((f, int(p)))
    

def dijkstra(graph, source, target):
    pq = [(0, source, [])]  # (current_distance, current_node, path)
    distances = {node: float('inf') for node in graph}  # Initialize distances
    distances[source] = 0  
    visited = set()  

    while pq:
        current_distance, current_node, path = heapq.heappop(pq)

        if current_node in visited:
            continue
        visited.add(current_node)

        # Add current node to the path
        path = path + [current_node]

        # If we reach the target node, return the distance and path
        if current_node == target:
            return current_distance, path

        # Relaxation: Explore neighbors
        for neighbor, weight in graph.get(current_node, []):
            if neighbor not in visited:
                new_distance = current_distance + weight
                if new_distance < distances[neighbor]:
                    distances[neighbor] = new_distance
                    heapq.heappush(pq, (new_distance, neighbor, path))

    # If the target is unreachable
    return float('inf'), []