def solution(participant, completion):
    cnt={} #참여자 이름의 등장 횟수를 저장하기 위한 딕셔너리
    for i in participant: #참여자 명단 순회
        cnt[i] = cnt.get(i,0) + 1 #참여자 명단에 이름이 등장하므로 +1
    for j in completion: #완주자 명단 순회
        cnt[j] -= 1 #완주자 명단에 이름이 있다면 -1
    for i,cnt in cnt.items():#딕셔너리 순회
        if(cnt != 0): #딕셔너리의 값이 0이 아니라면 완주자 명단에 이름이 없다는 것이므로 0이 아닌 해당 이름을 리턴
            return i
    