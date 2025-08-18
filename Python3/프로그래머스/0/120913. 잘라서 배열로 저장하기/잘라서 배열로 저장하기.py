def solution(my_str, n):
    answer = []
    st = ''
    for i, s in enumerate(my_str):
        st+= s
        if(len(st) > 0):
            if(len(st) == n):
                answer.append(st)
                st = ''
    if st:  # 마지막 남은 문자열이 있을 경우에만 추가
        answer.append(st)

    return answer