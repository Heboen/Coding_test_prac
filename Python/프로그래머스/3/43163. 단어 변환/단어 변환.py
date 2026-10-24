from collections import deque
def solution(begin, target, words):
    answer = 0
    visited=[False] * len(words)
    queue = deque()
    queue.append((begin,0))
    while queue:
        word,cnt = queue.popleft()
        if word == target:
            answer = cnt
            break
        for i in range(len(words)):
            tmp = 0
            if not visited[i]:
                for j in range(len(word)):
                    if word[j] != words[i][j]:
                        tmp += 1
                if tmp == 1:
                    queue.append((words[i], cnt+1))
                    visited[i] = True
    return answer