from itertools import permutations
import math
def isPrime(n):
    for j in range(2,int(math.sqrt(n))+1):
        if n%j == 0:
            return False
    return True
def solution(numbers):
    answer = 0
    num = 0
    num_arr = set()
    
    for i in range(1,len(numbers)+1):
        for permutation in permutations(numbers,i):
            num = int("".join(permutation))
            num_arr.add(num)
    for i in list(num_arr):
        if(i==0 or i == 1):
            continue
        if isPrime(i):
            answer+=1
    return answer