def solution(nums):
    answer = 0
    cnt = 0
    dic = {}
    
    for num in nums:
        dic[hash(num)] = nums.count(num)
        
    if len(dic) > len(nums)/2 :
        answer = len(nums)/2
    else:
        answer = len(dic)
    return answer