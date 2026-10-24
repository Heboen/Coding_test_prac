def solution(s):
    answer = ''
    nums = []
    num = ''
    nums = s.split()
    for i in range(len(nums)):
        nums[i] = int(nums[i])
    mx = max(nums)
    mn = min(nums)
    answer += str(mn) + " "+ str(mx)
    return answer