from itertools import combinations


def solution(numbers):
    answer = []
    result = list(combinations(numbers,2))
    for i in range(len(result)):
        answer.append(sum(result[i]))
    
    answer=list(set(answer))
    answer.sort()

    return answer