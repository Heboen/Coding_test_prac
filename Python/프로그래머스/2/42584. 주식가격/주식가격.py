from collections import deque

def solution(prices):
    que = deque(prices)
    answer = []
    
    while que:
        price = que.popleft()
        sec = 0
        for q in que:
            sec += 1
            if price > q:
                break
        answer.append(sec)
    return answer