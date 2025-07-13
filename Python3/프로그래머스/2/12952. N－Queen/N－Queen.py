def solution(n):
    def is_valid(queens, row, col):
        for r,c in enumerate(queens):
            if c== col or abs(c-col) == abs(r-row):
                return False
        return True
    
    def tracks(queens):
        if(len(queens) == n) :
            solutions.append(queens[:])
            return
        
        for col in range(n):
            if(is_valid(queens, len(queens), col)):
                queens.append(col)
                tracks(queens)
                queens.pop()
                
    solutions=[]
    tracks([])
    answer = len(solutions)
    return answer