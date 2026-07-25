# def solution(n, computers):
#     answer = 0
#     def dfs_recur(adj_list, i, visited):
#         visited[i] = 1
#         for neighbor in adj_list[i]:
#             if not visited[neighbor]:
#                 dfs_recur(adj_list, neighbor, visited)
#     adj_list = {}
    
    
#     for i in range(n):
#         adj_list[i]=[]
#         for j in range(n):
#             if computers[i][j] == 1:
#                 adj_list[i].append(j)
                
#     visited = [0 for i in range(len(computers))]
    
#     for i in range(n):
#         if not visited[i]:
#             dfs_recur(adj_list, i, visited)
#             answer += 1
    
    
            
#     return answer

def solution(n, computers):
    def dfs(i):
        visited[i] = 1
        for j in range(n):
            if computers[i][j] == 1 and not visited[j]:
                dfs(j)
                
    visited = [0]*n
    answer = 0
    
    for i in range(n):
        if not visited[i]:
            dfs(i)
            answer += 1
            
    return answer
        