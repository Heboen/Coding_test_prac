import math
def solution(a, b):
    answer = 0
    b //= math.gcd(a,b)
    
    for p in [2,5]:
        while b % p == 0:
            b //=p
            
        
    return 1 if b == 1 else 2