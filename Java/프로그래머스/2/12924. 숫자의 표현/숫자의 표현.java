import java.util.*;
class Solution {
    public int solution(int n) {
        int cnt = 0; //n을 표현하는 방법 수
        
        for(int i = 1; i <= n; i++){
            int sum = 0; //n이하의 수들의 합
            
            for(int j = i; j <= n; j++){ //i부터 n이하의 수들로
                sum += j;
                
                if (sum == n){ //숫자들의 합이 n일때
                    cnt++; //cnt+=1
                    break; //반복문 탈출
                }
                if(sum > n){ //수들의 합이 n보다 클때 반복문 탈출
                    break;
                }
            }
        }
        return cnt;
        
    }
}