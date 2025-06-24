import heapq

def solution(scoville, K):
#     heap_scoville = []
#     answer = 0
#     for i in scoville:
#         heapq.heappush(heap_scoville, i)
#     while(heap_scoville[0] < K):
#         if(len(heap_scoville) < 2):
#             return -1
#         else:
#             min_val1 = heapq.heappop(heap_scoville)
#             min_val2 = heapq.heappop(heap_scoville)
#             scov = min_val1 + (min_val2*2)
#             heapq.heappush(heap_scoville, scov)
#             answer += 1
    answer = 0
    heapq.heapify(scoville) #현재 가진 음식들의 스코빌 지수를 힙트리로 바꿈으로써, 최소힙 정렬이 됨
    scov = heapq.heappop(scoville)#현재 음식들중 가장 낮은 스코빌 지수를 선택
    while(scov < K): #가장 낮은 스코빌 지수가 K보다 커질때 까지 무한 루프
        if(len(scoville) < 1):
#모든 음식의 스코빌 지수를 K이상으로 만들 수 없는 경우 => 더 이상 섞을 음식이 없다는 얘기
            return -1
        else:
            new_scov = scov + (heapq.heappop(scoville) * 2)
            #음식을 섞어 새로운 스코빌 지수 생성
            
            heapq.heappush(scoville,new_scov)
            #새로운 스코빌 지수를 힙트리에 삽입(자동으로 최소힙 정렬)
            
            answer += 1 #음식을 섞은 횟수 +1
            
            scov = heapq.heappop(scoville)
            #새롭게 가장 낮은 스코빌 지수를 선택하여 처음으로 돌아감
    return answer