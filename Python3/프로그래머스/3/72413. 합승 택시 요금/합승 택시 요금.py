def solution(n, s, a, b, fares):
    answer = 100001 * n
    M = 100001*n
    graph = [[M for _ in range(n+1)] for _ in range(n+1)]#간선 정보 저장할 2차원 배열
    for i, j, c in fares: # 인접리스트 만들기
        graph[i][j] = c
        graph[j][i] = c
        
    for i in range(1,n+1):
        for j in range(1,n+1):
            if i == j:
                graph[i][j] = 0 #출발지와 도착지가 같으면 이동할 필요가 없으므로 비용 0
                
    for k in range(1,n+1):
        for i in range(1,n+1):
            for j in range(1,n+1):
                if graph[i][j] > graph[i][k]+graph[k][j]:
                    #그래프 배열에 저장되어 있는 비용이 다른 지점을 거쳐 간것 보다 크다면
                    graph[i][j] = graph[i][k]+graph[k][j]
                    #거쳐간 비용으로 교체
    
    for i in range(1,n+1):
        answer = min(answer, graph[i][s]+graph[i][a]+graph[i][b])
    #answer의 값과 택시 요금의 합을 비교하여 더 작은 값을 answer에 저장
    return answer