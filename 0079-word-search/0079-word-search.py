class Solution:
    def exist(self, board: List[List[str]], word: str) -> bool:
        def backtrack(i,j,r): #i,j = board_index, r = word_index
            if r == len(word):
                return True
            if i<0 or i>=len(board) or j <0 or j>= len(board[0]) or board[i][j] != word[r]:
                return False

            
            temp = board[i][j]
            board[i][j] = ''

            if backtrack(i+1, j, r+1)or backtrack(i-1,j,r+1) or backtrack(i,j+1,r+1) or backtrack(i,j-1,r+1):
                return True

            board[i][j] = temp
            return False
        
        for i in range(len(board)):
            for j in range(len(board[0])):
                if backtrack(i,j,0):
                    return True
        return False