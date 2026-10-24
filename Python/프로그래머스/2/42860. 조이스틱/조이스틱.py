def solution(name):
    answer = 0
    n = len(name)

	# 아스키코드 번호 차이로 이동 횟수 구하기
    for ch in name:
        answer += min(ord(ch) - ord('A'), ord('Z') - ord(ch) + 1)

    move = n - 1
    for left in range(n):
        idx = left + 1
        while (idx < n) and (name[idx] == 'A'):
            idx += 1
            
        right = n - idx
        distance = min(left, right)
        
        move = min(move, left + right + distance)
        
    answer += move
    return answer