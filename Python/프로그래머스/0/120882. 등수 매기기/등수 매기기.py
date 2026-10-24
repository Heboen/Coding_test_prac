def solution(score):
    aver = []
    answer = []
    for i in range(len(score)):
        aver.append(sum(score[i]) / len(score[i]))
        answer.append(1)
        
    for i in range(len(aver)):
        for j in range(len(aver)):
            if aver[i] < aver[j]:
                answer[i] += 1
    return answer