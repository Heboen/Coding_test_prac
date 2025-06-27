import heapq
class Solution:
    def networkDelayTime(self, times: List[List[int]], n: int, k: int) -> int:
        lst = defaultdict(list)
        for x,y,z in times:
            lst[x].append((y,z))

        visited=set()
        heap= [(0,k)]
        while heap:
           trv_time, node = heapq.heappop(heap)
           visited.add(node)

           if len(visited) == n:
            return trv_time
        
           for nxt_node, time in lst[node]:
            if nxt_node not in visited:
                heapq.heappush(heap, (trv_time + time , nxt_node))

        return -1
        
        


        