def solution(dots):
    answer = 0
    x=0
    y=0
    dots.sort()
    x = abs(dots[0][0]-dots[2][0])
    y = abs(dots[0][1]-dots[1][1])
    answer = x*y
    return answer