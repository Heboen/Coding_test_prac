import math

def solution(nums):
    answer = 0
    def isPrime(num):
        cnt = 0
        for i in range(2,int(math.sqrt(num))):
            if num%i == 0:
                cnt+=1
        if cnt < 1:
            return True
        return False
    
    for i in range(len(nums)-2):
        for j in range(i+1,len(nums)-1):
            for r in range(j+1,len(nums)):
                sum = nums[i] + nums[j] + nums[r]
                if isPrime(sum):
                    answer += 1
                
    return answer