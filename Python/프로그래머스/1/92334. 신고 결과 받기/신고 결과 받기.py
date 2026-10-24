def solution(id_list, report, k):
    report = list(set(report))
    cnt = [0] * len(id_list)
    answer = [0] * len(id_list)
    
    for i in report:
        cnt[id_list.index(i.split()[1])]+=1
        
    for i in report:
        c_idx = id_list.index(i.split()[0])
        r_idx = id_list.index(i.split()[1])
        if cnt[r_idx] >= k:
            answer[c_idx] += 1
    return answer