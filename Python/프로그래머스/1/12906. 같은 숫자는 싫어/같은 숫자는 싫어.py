def solution(arr):
    #현재 문제에는 arr에서 연속적으로 등장하는 숫자를 제거하고 남은 수들을 리턴
    #하는것을 요구함
    answer = list() #answer를 리스트로 만들고
    for i in arr:#arr를 반복문으로 순회하면서
        if not answer: #만약 answer가 비어있다면 i를 삽입
            answer.append(i)
        if answer[-1] != i:# answer의 제일 마지막 원소와 arr의 현재 원소와 비교했을때 다르면 연속적이지 않으므로 삽입
            answer.append(i)
               
#문제에서 연속적으로 등장하는 원소를 제거하라 하였으므로, arr의 원소를 answer에 삽입하면서 answer의 가장 마지막 원소 즉, 가장 최근에 삽입된 원소와 arr의 원소를 비교하면서 순회하면 연속적인지 아닌지 판별 가능 
    return answer