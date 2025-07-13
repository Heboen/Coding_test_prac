import heapq
def solution(n, edge):
#     answer = 0
#     graph = [[] for _ in range(n+1)]#빈 리스트 생성
#     distance = [-1] * (n+1) #노드별 거리를 나타내는 배열 생성
#     for e in edge:
#         graph[e[0]].append(e[1])
#         graph[e[1]].append(e[0])
#     queue = deque([1])
#     distance[1]=0
#     while queue:
#         v = queue.popleft()
        
#         for i in graph[v]:
#             if distance[i] == -1:
#                 queue.append(i)
#                 distance[i] = distance[v] + 1
                
#     for d in distance:
#         if d == max(distance):
#             answer += 1
#     return answer
    inf = int(1e9)
    answer = 0
    dist = [inf] * (n+1)
    graph = [[] for _ in range(n+1)]
    
    for a, b in edge :
        graph[a].append((b,1))
        graph[b].append((a,1))
        
    def dijkstra(start):
        dist[start] = 0
        queue = []
        heapq.heappush(queue, (0,start))
        
        while queue:
            curdis, curnode = heapq.heappop(queue)
            
            if curdis > dist[curnode]:
                continue
            for neighbor, weight in graph[curnode]:
                distance = curdis + weight
                
                if distance < dist[neighbor]:
                    dist[neighbor] = distance
                    heapq.heappush(queue, (distance, neighbor))
    dijkstra(1)
    
    mx = max(dist[1:])
    answer = dist.count(mx)
    return answer
    